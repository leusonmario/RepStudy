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
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream3 = random1.ints((long) (short) 100);
        java.util.stream.IntStream intStream4 = random1.ints();
        float float5 = random1.nextFloat();
        java.util.stream.IntStream intStream6 = random1.ints();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.73096776f + "'", float5 == 0.73096776f);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder7.clear();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setUnicodeLocaleKeyword("anglais (Etats-Unis)", "it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: anglais (Etats-Unis) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinesisch Taiwan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch taiwan");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.util.Locale locale2 = new java.util.Locale("Chinese (China)", "fra");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FR", (double) (-469336362));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-4.69336362E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.util.Random random1 = new java.util.Random((long) (-388136581));
        int int3 = random1.nextInt(1593272353);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1296812279 + "'", int3 == 1296812279);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.util.Locale locale3 = new java.util.Locale("zh-tw_CHINE", "chinese (china)", "zh_CN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zh-tw_chine_CHINESE (CHINA)_zh_CN");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        double double5 = random0.nextGaussian();
        java.util.Random random7 = new java.util.Random((long) 1);
        java.util.Random random9 = new java.util.Random((long) (short) 1);
        int int10 = random9.nextInt();
        java.util.stream.LongStream longStream14 = random9.longs(10L, 0L, (long) (short) 100);
        java.util.Random random16 = new java.util.Random(1L);
        java.util.Random random18 = new java.util.Random((long) (short) 1);
        java.util.Random random20 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream22 = random20.doubles((long) 10);
        int int23 = random20.nextInt();
        java.util.stream.DoubleStream doubleStream24 = random20.doubles();
        java.util.stream.IntStream intStream25 = random20.ints();
        java.util.Random random27 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream29 = random27.doubles((long) 10);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random27.nextBytes(byteArray33);
        random20.nextBytes(byteArray33);
        random18.nextBytes(byteArray33);
        random16.nextBytes(byteArray33);
        random9.nextBytes(byteArray33);
        random7.nextBytes(byteArray33);
        random0.nextBytes(byteArray33);
        java.util.stream.IntStream intStream41 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream45 = random0.ints((long) (-1557280266), 1557051528, (-1157793070));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1432178244) + "'", int4 == (-1432178244));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.41362782750482846d) + "'", double5 == (-0.41362782750482846d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1155869325) + "'", int10 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1157793070) + "'", int23 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-110, 124, 51]");
        org.junit.Assert.assertNotNull(intStream41);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str9 = locale5.getExtension('a');
        boolean boolean10 = locale5.hasExtensions();
        java.util.Set<java.lang.Character> charSet11 = locale5.getExtensionKeys();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.lang.String str15 = locale5.getDisplayName(locale13);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Englisch (Kanada)" + "'", str14, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italienisch" + "'", str15, "Italienisch");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream7 = random1.ints();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5367670326698742d + "'", double5 == 0.5367670326698742d);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream3 = random1.ints((long) (short) 100);
        java.util.stream.IntStream intStream5 = random1.ints((long) (short) 10);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random1.longs((long) (-833381869), (long) (-1914897239));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("und_FRA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und_FRA [at index 0]");
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale.Builder builder15 = builder11.setLanguage("French");
        java.util.Locale locale16 = builder15.build();
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale23.getExtension('x');
        java.lang.String str26 = locale19.getDisplayVariant(locale23);
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.lang.String str28 = locale27.getLanguage();
        java.lang.String str29 = locale23.getDisplayScript(locale27);
        java.lang.String str30 = locale18.getDisplayScript(locale23);
        java.util.Locale locale33 = new java.util.Locale("de", "FRA");
        java.lang.String str34 = locale23.getDisplayVariant(locale33);
        java.lang.String str35 = locale16.getDisplayVariant(locale23);
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder38 = builder36.setVariant("");
        java.util.Locale.Builder builder39 = builder36.clear();
        java.util.Locale.Builder builder41 = builder36.setScript("");
        java.util.Locale.Builder builder43 = builder41.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder46 = builder41.setExtension('u', "");
        java.util.Locale.Builder builder49 = builder46.setExtension('u', "");
        java.util.Locale locale50 = builder46.build();
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder52 = builder46.setLocale(locale51);
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder55 = builder53.setVariant("");
        java.util.Locale.Builder builder57 = builder55.setVariant("");
        java.util.Locale locale58 = java.util.Locale.PRC;
        java.lang.String str59 = locale58.getVariant();
        java.util.Locale.Builder builder60 = builder55.setLocale(locale58);
        java.lang.String str61 = locale51.getDisplayLanguage(locale58);
        java.lang.String str62 = locale51.getCountry();
        java.lang.String str63 = locale23.getDisplayName(locale51);
        java.util.Locale.Builder builder64 = builder0.setLocale(locale23);
        java.util.Locale.Builder builder66 = builder64.setLanguageTag("x-lvariant-JPN");
        java.util.Locale.Builder builder67 = builder66.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder70 = builder67.setUnicodeLocaleKeyword("en-GB", "japan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "french");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "french" + "'", str17, "french");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr" + "'", str28, "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale33.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u4e2d\u6587" + "'", str61, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "TW" + "'", str62, "TW");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.util.Locale locale3 = new java.util.Locale("TW", "English", "ITA");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("Korean");
        java.lang.String str6 = locale3.getDisplayLanguage(locale5);
        java.lang.String str7 = locale5.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "tw_ENGLISH_ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "korean");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Twi" + "'", str6, "Twi");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setVariant("french");
        java.util.Locale.Builder builder9 = builder5.setRegion("US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setScript("JPN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: JPN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getExtension('x');
        java.util.Locale locale4 = locale0.stripExtensions();
        java.lang.String str5 = locale4.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = random1.longs((long) (-266083962));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale locale10 = builder9.build();
        java.util.Random random12 = new java.util.Random((long) (-144180575));
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        double double14 = random12.nextDouble();
        long long15 = random12.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale10, random12);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.24234200672919726d + "'", double14 == 0.24234200672919726d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1501966224973652799L) + "'", long15 == (-1501966224973652799L));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.util.Locale locale3 = new java.util.Locale("fra (FRA,fr)", "fra (FRA,fr)", "x-lvariant-fr");
        java.util.Locale locale6 = new java.util.Locale("Japon", "fra (FRA,fr)");
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.lang.String str12 = locale10.getExtension('x');
        java.util.Locale.setDefault(locale10);
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.lang.String str15 = locale10.getDisplayLanguage(locale14);
        java.lang.String str16 = locale10.getISO3Language();
        java.util.Locale locale20 = new java.util.Locale("", "", "");
        java.lang.String str22 = locale20.getExtension('x');
        java.util.Locale.setDefault(locale20);
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.lang.String str25 = locale20.getDisplayLanguage(locale24);
        java.lang.String str26 = locale10.getDisplayVariant(locale20);
        java.util.Locale locale27 = locale10.stripExtensions();
        java.lang.String str28 = locale6.getDisplayVariant(locale27);
        java.lang.String str29 = locale3.getDisplayVariant(locale27);
        org.junit.Assert.assertEquals(locale3.toString(), "fra (fra,fr)_FRA (FRA,FR)_x-lvariant-fr");
        org.junit.Assert.assertEquals(locale6.toString(), "japon_FRA (FRA,FR)");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "x-lvariant-fr" + "'", str29, "x-lvariant-fr");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale3.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale3.getDisplayName(locale10);
        java.util.Random random13 = new java.util.Random((long) 27);
        long long14 = random13.nextLong();
        int int16 = random13.nextInt(33);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale10, random13);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = random13.nextInt((-575696796));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4947896108136290151L) + "'", long14 == (-4947896108136290151L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = null;
        java.lang.String str3 = null; // flaky: locale1.getDisplayScript(locale2);
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet7 = locale5.getExtensionKeys();
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale locale9 = java.util.Locale.getDefault(category4);
        java.lang.String str11 = locale9.getExtension('a');
        java.lang.String str12 = locale9.getCountry();
        boolean boolean13 = locale9.hasExtensions();
        java.lang.String str14 = locale1.getDisplayScript(locale9);
        java.lang.String str15 = locale1.getDisplayLanguage();
        java.lang.String str16 = locale1.getDisplayName();
        java.lang.String str17 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.util.Random random1 = new java.util.Random(1L);
        int int2 = random1.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = random1.longs((long) (-267994359));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.Random random4 = new java.util.Random((long) 1);
        java.util.Random random6 = new java.util.Random((long) (short) 1);
        int int7 = random6.nextInt();
        java.util.stream.LongStream longStream11 = random6.longs(10L, 0L, (long) (short) 100);
        java.util.Random random13 = new java.util.Random(1L);
        java.util.Random random15 = new java.util.Random((long) (short) 1);
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
        random15.nextBytes(byteArray30);
        random13.nextBytes(byteArray30);
        random6.nextBytes(byteArray30);
        random4.nextBytes(byteArray30);
        random1.nextBytes(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream40 = random1.doubles((double) 1067097704, 0.4836592629141512d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1155869325) + "'", int7 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1157793070) + "'", int20 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-40, -100, -72]");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Japan");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale3.getISO3Country();
        java.util.Locale locale10 = locale3.stripExtensions();
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale10.toLanguageTag();
        java.lang.String str13 = locale10.getDisplayScript();
        java.lang.String str14 = locale10.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "und" + "'", str12, "und");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream12 = random1.longs((long) (-1528827163), (long) 1);
        java.util.stream.IntStream intStream15 = random1.ints(591553211, 2002825273);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random1);
        java.lang.String str18 = faker16.regexify("GB");
        com.github.javafaker.PhoneNumber phoneNumber19 = faker16.phoneNumber();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GB" + "'", str18, "GB");
        org.junit.Assert.assertNotNull(phoneNumber19);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("de");
        java.util.Locale.Builder builder11 = builder8.setExtension('x', "Italian");
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("fra");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.lang.String str10 = locale6.getExtension('a');
        java.util.Set<java.lang.String> strSet11 = locale6.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet12 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale6.getVariant();
        java.util.Set<java.lang.String> strSet14 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale0.getDisplayVariant(locale6);
        java.lang.String str16 = locale6.getLanguage();
        java.util.Random random17 = new java.util.Random();
        java.util.stream.LongStream longStream20 = random17.longs((long) (-1), (long) (short) 10);
        int int21 = random17.nextInt();
        double double22 = random17.nextGaussian();
        java.util.Random random24 = new java.util.Random((long) 1);
        java.util.Random random26 = new java.util.Random((long) (short) 1);
        int int27 = random26.nextInt();
        java.util.stream.LongStream longStream31 = random26.longs(10L, 0L, (long) (short) 100);
        java.util.Random random33 = new java.util.Random(1L);
        java.util.Random random35 = new java.util.Random((long) (short) 1);
        java.util.Random random37 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream39 = random37.doubles((long) 10);
        int int40 = random37.nextInt();
        java.util.stream.DoubleStream doubleStream41 = random37.doubles();
        java.util.stream.IntStream intStream42 = random37.ints();
        java.util.Random random44 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream46 = random44.doubles((long) 10);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random44.nextBytes(byteArray50);
        random37.nextBytes(byteArray50);
        random35.nextBytes(byteArray50);
        random33.nextBytes(byteArray50);
        random26.nextBytes(byteArray50);
        random24.nextBytes(byteArray50);
        random17.nextBytes(byteArray50);
        java.util.stream.IntStream intStream58 = random17.ints();
        long long59 = random17.nextLong();
        com.github.javafaker.Faker faker60 = new com.github.javafaker.Faker(locale6, random17);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it" + "'", str16, "it");
        org.junit.Assert.assertNotNull(longStream20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1480440092 + "'", int21 == 1480440092);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.17797025273803205d + "'", double22 == 0.17797025273803205d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1155869325) + "'", int27 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertNotNull(doubleStream39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1157793070) + "'", int40 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertNotNull(intStream42);
        org.junit.Assert.assertNotNull(doubleStream46);
        org.junit.Assert.assertNotNull(byteArray50);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-21, 10, 90]");
        org.junit.Assert.assertNotNull(intStream58);
// flaky:         org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-915266803216671509L) + "'", long59 == (-915266803216671509L));
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        com.github.javafaker.Code code20 = faker18.code();
        com.github.javafaker.App app21 = faker18.app();
        com.github.javafaker.Name name22 = faker18.name();
        com.github.javafaker.Finance finance23 = faker18.finance();
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
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertNotNull(app21);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(finance23);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        java.util.Random random18 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles((long) 10);
        int int21 = random18.nextInt();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random18);
        java.util.stream.LongStream longStream23 = random18.longs();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale15, random18);
        com.github.javafaker.Name name25 = faker24.name();
        com.github.javafaker.Internet internet26 = faker24.internet();
        com.github.javafaker.App app27 = faker24.app();
        com.github.javafaker.Address address28 = faker24.address();
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
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1157793070) + "'", int21 == (-1157793070));
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(internet26);
        org.junit.Assert.assertNotNull(app27);
        org.junit.Assert.assertNotNull(address28);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        double double5 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random1.longs((long) (-1192810430));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7220096548596434d + "'", double5 == 0.7220096548596434d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr", strMap1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode5 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList6 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet4, filteringMode5);
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet8);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.Locale locale15 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str16 = locale10.getDisplayName(locale15);
        java.util.Set<java.lang.String> strSet17 = locale10.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet18 = locale10.getUnicodeLocaleAttributes();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.parse("und", strMap20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder25.setVariant("");
        java.util.Locale locale28 = builder25.build();
        java.util.Locale locale32 = new java.util.Locale("", "", "");
        java.util.Locale locale36 = new java.util.Locale("", "", "");
        java.lang.String str37 = locale32.getDisplayLanguage(locale36);
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Locale locale42 = new java.util.Locale("", "", "");
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.lang.String str47 = locale42.getDisplayLanguage(locale46);
        java.util.Locale locale51 = new java.util.Locale("", "", "");
        java.lang.String str53 = locale51.getExtension('x');
        java.util.Locale.setDefault(locale51);
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale57 = locale56.stripExtensions();
        java.lang.String str58 = locale57.getISO3Country();
        java.util.Locale locale62 = new java.util.Locale("", "", "");
        java.util.Locale locale66 = new java.util.Locale("", "", "");
        java.lang.String str67 = locale62.getDisplayLanguage(locale66);
        java.util.Locale locale69 = new java.util.Locale("hi!");
        java.util.Locale locale70 = locale69.stripExtensions();
        java.util.Locale locale72 = new java.util.Locale("hi!");
        java.util.Locale locale74 = new java.util.Locale("hi!");
        java.util.Locale locale76 = new java.util.Locale("hi!");
        java.util.Locale locale77 = locale76.stripExtensions();
        java.util.Locale[] localeArray78 = new java.util.Locale[] { locale28, locale32, locale38, locale46, locale51, locale57, locale66, locale69, locale72, locale74, locale76 };
        java.util.ArrayList<java.util.Locale> localeList79 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList79, localeArray78);
        java.util.Locale.FilteringMode filteringMode81 = null;
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList79, filteringMode81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap84 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList85 = java.util.Locale.LanguageRange.parse("fr", strMap84);
        java.util.Locale locale86 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet87 = locale86.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode88 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags(languageRangeList85, (java.util.Collection<java.lang.String>) strSet87, filteringMode88);
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter(languageRangeList21, (java.util.Collection<java.util.Locale>) localeList79, filteringMode88);
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet18, filteringMode88);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + filteringMode5 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode5.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals(locale15.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English (United Kingdom)" + "'", str16, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals(locale69.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "hi!");
        org.junit.Assert.assertEquals(locale72.toString(), "hi!");
        org.junit.Assert.assertEquals(locale74.toString(), "hi!");
        org.junit.Assert.assertEquals(locale76.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNotNull(languageRangeList85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertTrue("'" + filteringMode88 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode88.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertNotNull(strList91);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "FRA");
        java.lang.Object obj4 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__FRA");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "hi!__FRA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "hi!__FRA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "hi!__FRA");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.util.Locale locale0 = null;
        java.util.Random random2 = new java.util.Random(100L);
        double double3 = random2.nextGaussian();
        long long4 = random2.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6246292191371761d + "'", double3 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-6139822020582680716L) + "'", long4 == (-6139822020582680716L));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.util.Locale locale45 = new java.util.Locale("", "", "");
        java.lang.String str47 = locale45.getExtension('x');
        java.lang.String str48 = locale41.getDisplayVariant(locale45);
        java.util.Locale locale49 = java.util.Locale.FRENCH;
        java.lang.String str50 = locale49.getLanguage();
        java.lang.String str51 = locale45.getDisplayScript(locale49);
        java.lang.String str52 = locale40.getDisplayCountry(locale45);
        java.lang.String str53 = locale40.getCountry();
        java.util.Locale.Builder builder54 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder56 = builder54.setVariant("");
        java.util.Locale.Builder builder57 = builder56.clearExtensions();
        java.util.Locale locale58 = builder56.build();
        java.lang.String str59 = locale40.getDisplayCountry(locale58);
        boolean boolean60 = locale58.hasExtensions();
        java.util.Locale.setDefault(category0, locale58);
        java.util.Locale locale62 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
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
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "fr" + "'", str50, "fr");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "China" + "'", str52, "China");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "CN" + "'", str53, "CN");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "China" + "'", str59, "China");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.util.Locale locale3 = new java.util.Locale("CN", "hi! ITALIEN ITALIE,fr", "English");
        org.junit.Assert.assertEquals(locale3.toString(), "cn_HI! ITALIEN ITALIE,FR_English");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.util.Random random1 = new java.util.Random((long) (-144180575));
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (-925427400), (double) 0.38235575f);
        double double5 = random1.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.13708991759788094d) + "'", double5 == (-0.13708991759788094d));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("jpn_HI! CHINESE CHINA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=jpn_hi! chinese china");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.util.Locale locale3 = new java.util.Locale("Japan", "coreano", "ita");
        org.junit.Assert.assertEquals(locale3.toString(), "japan_COREANO_ita");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.util.Locale locale3 = new java.util.Locale("TW", "English", "ITA");
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale4.getDisplayScript();
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.lang.String str12 = locale10.getExtension('x');
        java.util.Locale.setDefault(locale10);
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.lang.String str15 = locale10.getDisplayLanguage(locale14);
        java.lang.String str16 = locale14.getDisplayVariant();
        java.lang.String str17 = locale4.getDisplayCountry(locale14);
        java.lang.String str18 = locale3.getDisplayName(locale4);
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleKeys();
        java.lang.String str22 = locale19.getExtension('x');
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder23.setVariant("");
        java.util.Locale.Builder builder26 = builder23.clear();
        java.util.Locale.Builder builder28 = builder23.setScript("");
        java.util.Locale locale29 = builder23.build();
        java.lang.String str30 = locale19.getDisplayLanguage(locale29);
        java.lang.String str31 = locale4.getDisplayCountry(locale19);
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("");
        java.lang.String str34 = locale33.getLanguage();
        java.util.Locale locale35 = locale33.stripExtensions();
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale4.getDisplayCountry(locale35);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(locale4);
        org.junit.Assert.assertEquals(locale3.toString(), "tw_ENGLISH_ITA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japon" + "'", str17, "Japon");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)" + "'", str18, "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u65e5\u672c" + "'", str31, "\u65e5\u672c");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Japan" + "'", str37, "Japan");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random1.doubles(4332063390427078244L, (double) 1447301737, (double) 0.822216f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4129126974821382d + "'", double7 == 0.4129126974821382d);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-cn");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-cn" + "'", str2, "zh-cn");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("cinese (Cina)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: cinese (Cina) [at index 0]");
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
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.lang.String str13 = locale11.getExtension('x');
        java.lang.String str14 = locale7.getDisplayVariant(locale11);
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str16 = locale11.getDisplayScript(locale15);
        java.util.Locale locale17 = locale15.stripExtensions();
        java.util.Locale locale21 = new java.util.Locale("", "", "");
        java.lang.String str23 = locale21.getExtension('x');
        java.util.Locale.setDefault(locale21);
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.lang.String str26 = locale21.getDisplayLanguage(locale25);
        boolean boolean27 = locale25.hasExtensions();
        java.lang.String str28 = locale25.getDisplayVariant();
        java.lang.String str29 = locale15.getDisplayCountry(locale25);
        java.util.Locale.setDefault(category0, locale15);
        java.lang.String str31 = locale15.toLanguageTag();
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
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chine" + "'", str29, "Chine");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Business business7 = faker0.business();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        java.util.Random random3 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream5 = random3.doubles((long) 10);
        int int6 = random3.nextInt();
        java.util.stream.DoubleStream doubleStream7 = random3.doubles();
        java.util.stream.IntStream intStream8 = random3.ints();
        java.util.Random random10 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream12 = random10.doubles((long) 10);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random10.nextBytes(byteArray16);
        random3.nextBytes(byteArray16);
        random1.nextBytes(byteArray16);
        int int20 = random1.nextInt();
        float float21 = random1.nextFloat();
        java.util.stream.DoubleStream doubleStream22 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1157793070) + "'", int6 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[115, -43, 26]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 431529176 + "'", int20 == 431529176);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.4100808f + "'", float21 == 0.4100808f);
        org.junit.Assert.assertNotNull(doubleStream22);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.Number number8 = faker0.number();
        com.github.javafaker.Code code9 = faker0.code();
        java.lang.String str11 = faker0.regexify("hi! (ITALIEN (ITALIE),fr)");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! ITALIEN ITALIE,fr" + "'", str11, "hi! ITALIEN ITALIE,fr");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("JPN", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Locale locale6 = new java.util.Locale("und");
        java.lang.String str8 = locale6.getExtension('x');
        java.util.Set<java.lang.String> strSet9 = locale6.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet9);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertEquals(locale6.toString(), "und");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale1.getVariant();
        java.lang.String str6 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.util.Locale locale3 = new java.util.Locale("en,CA", "English United Kingdom", "\u4e2d\u6587\u4e2d\u56fd)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str7 = locale4.getCountry();
        java.lang.String str8 = locale4.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setRegion("de");
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.removeUnicodeLocaleAttribute("tw");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: tw [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\ud504\ub791\uc2a4\uc5b4", (double) (-1042906082));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.042906082E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("deu", (double) 0.2124942f);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
        boolean boolean5 = languageRange2.equals((java.lang.Object) locale3);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("chinese china");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesechina");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        java.lang.String str12 = locale10.getDisplayVariant();
        java.lang.String str13 = locale0.getDisplayCountry(locale10);
        java.util.Set<java.lang.String> strSet14 = locale10.getUnicodeLocaleKeys();
        java.lang.String str15 = locale10.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Japon" + "'", str13, "Japon");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayScript(locale5);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream18 = random9.ints((long) (-539800044));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.6697446f + "'", float11 == 0.6697446f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-663064139) + "'", int13 == (-663064139));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        java.util.Random random18 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles((long) 10);
        int int21 = random18.nextInt();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random18);
        java.util.stream.LongStream longStream23 = random18.longs();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale15, random18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream28 = random18.ints((long) (-1631681497), (-509927405), 1600337857);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1157793070) + "'", int21 == (-1157793070));
        org.junit.Assert.assertNotNull(longStream23);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setRegion("");
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("CA");
        java.util.Locale.Builder builder8 = builder3.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale4.getDisplayScript(locale8);
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale10.toLanguageTag();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 1);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4972683369271453960L) + "'", long2 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.util.Random random1 = new java.util.Random(0L);
        java.util.stream.IntStream intStream2 = random1.ints();
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.util.Random random1 = new java.util.Random((long) (-268554284));
        float float2 = random1.nextFloat();
        boolean boolean3 = random1.nextBoolean();
        float float4 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.24406683f + "'", float2 == 0.24406683f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.34229845f + "'", float4 == 0.34229845f);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        java.util.stream.IntStream intStream6 = random1.ints((-303169301), 0);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem8 = faker7.lorem();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Options options6 = faker1.options();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale3.getISO3Language();
        java.lang.String str10 = locale3.getDisplayLanguage();
        java.lang.String str11 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("hi!__hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hi!__hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.util.Locale locale2 = new java.util.Locale("chine", "hi! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals(locale2.toString(), "chine_HI! (CHINESE (CHINA))");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-CN");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale10.getLanguage();
        java.util.Locale.Builder builder12 = builder8.setLocale(locale10);
        java.lang.String str13 = locale10.getScript();
        boolean boolean14 = languageRange1.equals((java.lang.Object) str13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-cn" + "'", str4, "zh-cn");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.util.Locale locale3 = new java.util.Locale("japan", "us (CHINESE)", "italien (italie)");
        org.junit.Assert.assertEquals(locale3.toString(), "japan_US (CHINESE)_italien (italie)");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CN");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = null;
        java.lang.String str3 = null; // flaky: locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale1.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        java.util.Locale locale21 = new java.util.Locale("hi!");
        java.util.Locale locale22 = locale21.stripExtensions();
        java.lang.String str23 = locale21.getISO3Country();
        java.lang.String str24 = locale21.toLanguageTag();
        java.lang.String str25 = locale21.getVariant();
        java.lang.String str26 = locale21.toLanguageTag();
        java.lang.String str27 = locale19.getDisplayName(locale21);
        java.lang.String str28 = locale21.getDisplayName();
        java.lang.String str29 = locale21.getDisplayLanguage();
        java.lang.String str30 = locale21.getLanguage();
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
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "und" + "'", str24, "und");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "und" + "'", str26, "und");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "French" + "'", str27, "French");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder11 = builder8.clearExtensions();
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("US");
        java.util.Locale.Builder builder14 = builder8.clear();
        java.util.Locale locale18 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str19 = locale18.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder8.setLocale(locale18);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CHINA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals(locale18.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fra" + "'", str19, "fra");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder0.addUnicodeLocaleAttribute("de");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: de [at index 0]");
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
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        double double5 = random1.nextGaussian();
        boolean boolean6 = random1.nextBoolean();
        long long7 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09760425216810112d + "'", double5 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-2715671396927575112L) + "'", long7 == (-2715671396927575112L));
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.util.Locale locale2 = new java.util.Locale("GB", "\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)");
        java.lang.String str3 = locale2.getVariant();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,FR)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.util.Locale locale2 = new java.util.Locale("italian", "french");
        java.lang.Object obj3 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "italian_FRENCH");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "italian_FRENCH");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "italian_FRENCH");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "italian_FRENCH");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet10 = locale7.getExtensionKeys();
        java.util.Locale locale11 = null;
        java.lang.String str12 = null; // flaky: locale7.getDisplayCountry(locale11);
        java.lang.String str13 = locale7.getDisplayName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "french" + "'", str9, "french");
        org.junit.Assert.assertNotNull(charSet10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "french" + "'", str13, "french");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale.Builder builder15 = builder12.setExtension('u', "und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.setExtension(' ', "x-lvariant-FRA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        double double5 = random0.nextGaussian();
        java.util.Random random7 = new java.util.Random((long) 1);
        java.util.Random random9 = new java.util.Random((long) (short) 1);
        int int10 = random9.nextInt();
        java.util.stream.LongStream longStream14 = random9.longs(10L, 0L, (long) (short) 100);
        java.util.Random random16 = new java.util.Random(1L);
        java.util.Random random18 = new java.util.Random((long) (short) 1);
        java.util.Random random20 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream22 = random20.doubles((long) 10);
        int int23 = random20.nextInt();
        java.util.stream.DoubleStream doubleStream24 = random20.doubles();
        java.util.stream.IntStream intStream25 = random20.ints();
        java.util.Random random27 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream29 = random27.doubles((long) 10);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random27.nextBytes(byteArray33);
        random20.nextBytes(byteArray33);
        random18.nextBytes(byteArray33);
        random16.nextBytes(byteArray33);
        random9.nextBytes(byteArray33);
        random7.nextBytes(byteArray33);
        random0.nextBytes(byteArray33);
        java.util.stream.IntStream intStream41 = random0.ints();
        java.util.stream.IntStream intStream45 = random0.ints((long) (byte) 10, (-1764305998), 1791901469);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1509809876) + "'", int4 == (-1509809876));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.47000348883266796d) + "'", double5 == (-0.47000348883266796d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1155869325) + "'", int10 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1157793070) + "'", int23 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[123, -1, -55]");
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertNotNull(intStream45);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream12 = random1.longs((long) (-1528827163), (long) 1);
        java.util.stream.IntStream intStream15 = random1.ints(591553211, 2002825273);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream17 = random1.longs();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(longStream17);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.setRegion("zh-cn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh-cn [at index 0]");
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
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet3);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strSet8);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet8);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale.Builder builder15 = builder13.setVariant("");
        java.util.Locale.Builder builder17 = builder13.setLanguage("French");
        java.util.Locale locale18 = builder17.build();
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet19, filteringMode20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap22);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.parse("deu");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("und");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Locale.Builder builder33 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder33.setVariant("");
        java.util.Locale locale36 = builder33.build();
        java.util.Locale locale40 = new java.util.Locale("", "", "");
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.lang.String str45 = locale40.getDisplayLanguage(locale44);
        java.util.Locale locale46 = java.util.Locale.FRENCH;
        java.util.Locale locale50 = new java.util.Locale("", "", "");
        java.util.Locale locale54 = new java.util.Locale("", "", "");
        java.lang.String str55 = locale50.getDisplayLanguage(locale54);
        java.util.Locale locale59 = new java.util.Locale("", "", "");
        java.lang.String str61 = locale59.getExtension('x');
        java.util.Locale.setDefault(locale59);
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.util.Locale locale65 = locale64.stripExtensions();
        java.lang.String str66 = locale65.getISO3Country();
        java.util.Locale locale70 = new java.util.Locale("", "", "");
        java.util.Locale locale74 = new java.util.Locale("", "", "");
        java.lang.String str75 = locale70.getDisplayLanguage(locale74);
        java.util.Locale locale77 = new java.util.Locale("hi!");
        java.util.Locale locale78 = locale77.stripExtensions();
        java.util.Locale locale80 = new java.util.Locale("hi!");
        java.util.Locale locale82 = new java.util.Locale("hi!");
        java.util.Locale locale84 = new java.util.Locale("hi!");
        java.util.Locale locale85 = locale84.stripExtensions();
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale36, locale40, locale46, locale54, locale59, locale65, locale74, locale77, locale80, locale82, locale84 };
        java.util.ArrayList<java.util.Locale> localeList87 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList87, localeArray86);
        java.util.Locale.FilteringMode filteringMode89 = null;
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList87, filteringMode89);
        java.util.Locale locale91 = java.util.Locale.lookup(languageRangeList29, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList27, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter(languageRangeList25, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter(languageRangeList23, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap95 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList96 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList23, strMap95);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "french");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertEquals(locale80.toString(), "hi!");
        org.junit.Assert.assertEquals(locale82.toString(), "hi!");
        org.junit.Assert.assertEquals(locale84.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "");
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNotNull(languageRangeList96);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("tw");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Internet internet5 = faker0.internet();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(internet5);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("French");
        java.util.Locale locale11 = new java.util.Locale("", "zh-CN", "jpn_HI! (CHINESE (CHINA))");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder0.setLocale(locale11);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ZH-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale11.toString(), "_ZH-CN_jpn_HI! (CHINESE (CHINA))");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setScript("");
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setScript("ITA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ITA [at index 0]");
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
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.util.Random random1 = new java.util.Random((long) (-290302496));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) (-1155869325), (long) (-1082863525), (long) 1802692291);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder11 = builder5.setLanguage("ita");
        java.util.Locale locale14 = new java.util.Locale("und", "FRA");
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder5.setLocale(locale14);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRA [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals(locale14.toString(), "und_FRA");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertNotNull(charSet16);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder9 = builder5.setLanguage("French");
        java.util.Locale locale10 = builder9.build();
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.lang.String str19 = locale17.getExtension('x');
        java.lang.String str20 = locale13.getDisplayVariant(locale17);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getLanguage();
        java.lang.String str23 = locale17.getDisplayScript(locale21);
        java.lang.String str24 = locale12.getDisplayScript(locale17);
        java.util.Locale locale27 = new java.util.Locale("de", "FRA");
        java.lang.String str28 = locale17.getDisplayVariant(locale27);
        java.lang.String str29 = locale10.getDisplayVariant(locale17);
        java.lang.String str30 = locale1.getDisplayLanguage(locale17);
        java.lang.String str31 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "french");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "french" + "'", str11, "french");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr" + "'", str22, "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale27.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinesisch (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch(china)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.util.Locale locale2 = new java.util.Locale("en_GB", "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("Italian", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.parse("French", strMap9);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.lang.String str15 = java.util.Locale.lookupTag(languageRangeList12, (java.util.Collection<java.lang.String>) strSet14);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleKeys();
        java.lang.String str20 = java.util.Locale.lookupTag(languageRangeList17, (java.util.Collection<java.lang.String>) strSet19);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags(languageRangeList12, (java.util.Collection<java.lang.String>) strSet19);
        java.lang.String str22 = java.util.Locale.lookupTag(languageRangeList10, (java.util.Collection<java.lang.String>) strList21);
        java.lang.String str23 = java.util.Locale.lookupTag(languageRangeList7, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder27.setVariant("");
        java.util.Locale locale30 = builder27.build();
        java.util.Locale locale34 = new java.util.Locale("", "", "");
        java.util.Locale locale38 = new java.util.Locale("", "", "");
        java.lang.String str39 = locale34.getDisplayLanguage(locale38);
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.lang.String str49 = locale44.getDisplayLanguage(locale48);
        java.util.Locale locale53 = new java.util.Locale("", "", "");
        java.lang.String str55 = locale53.getExtension('x');
        java.util.Locale.setDefault(locale53);
        java.util.Locale locale58 = new java.util.Locale("hi!");
        java.util.Locale locale59 = locale58.stripExtensions();
        java.lang.String str60 = locale59.getISO3Country();
        java.util.Locale locale64 = new java.util.Locale("", "", "");
        java.util.Locale locale68 = new java.util.Locale("", "", "");
        java.lang.String str69 = locale64.getDisplayLanguage(locale68);
        java.util.Locale locale71 = new java.util.Locale("hi!");
        java.util.Locale locale72 = locale71.stripExtensions();
        java.util.Locale locale74 = new java.util.Locale("hi!");
        java.util.Locale locale76 = new java.util.Locale("hi!");
        java.util.Locale locale78 = new java.util.Locale("hi!");
        java.util.Locale locale79 = locale78.stripExtensions();
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale30, locale34, locale40, locale48, locale53, locale59, locale68, locale71, locale74, locale76, locale78 };
        java.util.ArrayList<java.util.Locale> localeList81 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList81, localeArray80);
        java.util.Locale.FilteringMode filteringMode83 = null;
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList81, filteringMode83);
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList84);
        boolean boolean86 = locale2.equals((java.lang.Object) localeList84);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals(locale71.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "hi!");
        org.junit.Assert.assertEquals(locale74.toString(), "hi!");
        org.junit.Assert.assertEquals(locale76.toString(), "hi!");
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getExtension('x');
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale.Builder builder9 = builder4.setScript("");
        java.util.Locale locale10 = builder4.build();
        java.lang.String str11 = locale0.getDisplayLanguage(locale10);
        java.lang.String str12 = locale10.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale10.getUnicodeLocaleType("und-DE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: und-DE");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.util.Locale locale3 = new java.util.Locale("ita", "", "und");
        java.util.Locale locale7 = new java.util.Locale("English (United Kingdom)", "italien Italie", "de");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale3.getUnicodeLocaleType("jpn_HI! CHINESE CHINA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: jpn_HI! CHINESE CHINA");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "ita__und");
        org.junit.Assert.assertEquals(locale7.toString(), "english (united kingdom)_ITALIEN ITALIE_de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("us");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        float float23 = random1.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1157793070) + "'", int8 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[115, -43, 26]");
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.100473166f + "'", float23 == 0.100473166f);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Options options6 = faker0.options();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        java.lang.String str25 = locale0.getScript();
        java.util.Locale locale29 = new java.util.Locale("x-lvariant-JPN", "jpn", "\u6cd5\u56fd");
        java.lang.String str30 = locale0.getDisplayName(locale29);
        java.util.Locale locale34 = new java.util.Locale("", "", "");
        java.lang.String str36 = locale34.getExtension('x');
        java.util.Locale.setDefault(locale34);
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.lang.String str39 = locale34.getDisplayLanguage(locale38);
        java.lang.String str40 = locale34.getISO3Language();
        java.lang.String str41 = locale34.getDisplayLanguage();
        java.lang.String str42 = locale0.getDisplayScript(locale34);
        java.lang.String str44 = locale34.getExtension('x');
        java.lang.String str45 = locale34.getDisplayCountry();
        java.util.Locale locale49 = new java.util.Locale("hi!", "de", "Korean (South Korea)");
        java.lang.String str50 = locale34.getDisplayCountry(locale49);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese (China)" + "'", str30, "Chinese (China)");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals(locale49.toString(), "hi!_DE_Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getDisplayVariant();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
        java.lang.String str11 = locale7.getDisplayScript();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7);
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        boolean boolean22 = locale20.hasExtensions();
        java.lang.String str23 = locale20.getDisplayLanguage();
        java.lang.String str24 = locale7.getDisplayLanguage(locale20);
        java.util.Locale locale28 = new java.util.Locale("", "", "");
        java.lang.String str30 = locale28.getExtension('x');
        java.util.Locale.setDefault(locale28);
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale28.getDisplayLanguage(locale32);
        java.lang.String str34 = locale28.getISO3Language();
        java.util.Locale locale38 = new java.util.Locale("", "", "");
        java.lang.String str40 = locale38.getExtension('x');
        java.util.Locale.setDefault(locale38);
        java.util.Locale locale42 = java.util.Locale.FRENCH;
        java.lang.String str43 = locale38.getDisplayLanguage(locale42);
        java.lang.String str44 = locale28.getDisplayVariant(locale38);
        java.util.Locale locale45 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale45);
        java.lang.String str47 = locale38.getDisplayVariant(locale45);
        java.lang.String str48 = locale7.getDisplayScript(locale45);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "French" + "'", str23, "French");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fran\347ais" + "'", str24, "fran\347ais");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        java.util.Locale.setDefault(category7, locale8);
        java.util.Locale locale12 = java.util.Locale.getDefault(category7);
        java.util.Locale locale13 = java.util.Locale.getDefault(category7);
        java.util.Locale locale14 = java.util.Locale.getDefault(category7);
        java.util.Locale locale15 = java.util.Locale.getDefault(category7);
        java.lang.String str16 = locale0.getDisplayCountry(locale15);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem18 = faker17.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.17287004f + "'", float3 == 0.17287004f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1983847734 + "'", int5 == 1983847734);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "France" + "'", str16, "France");
        org.junit.Assert.assertNotNull(lorem18);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Hacker hacker2 = faker1.hacker();
        com.github.javafaker.Business business3 = faker1.business();
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(business3);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.util.Random random1 = new java.util.Random((long) (-910502427));
        int int2 = random1.nextInt();
        float float3 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = random1.nextInt((-1914897239));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-196947104) + "'", int2 == (-196947104));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.90741676f + "'", float3 == 0.90741676f);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        java.lang.String str7 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.18413717f + "'", float3 == 0.18413717f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1715556003 + "'", int5 == 1715556003);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Number number11 = faker10.number();
        com.github.javafaker.Internet internet12 = faker10.internet();
        java.lang.String str14 = faker10.regexify("");
        com.github.javafaker.Book book15 = faker10.book();
        com.github.javafaker.Lorem lorem16 = faker10.lorem();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(lorem16);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        boolean boolean8 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4129126974821382d + "'", double7 == 0.4129126974821382d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale.Builder builder16 = builder14.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale.Builder builder19 = builder16.setLocale(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder22.setVariant("");
        java.util.Locale.Builder builder25 = builder24.clearExtensions();
        java.util.Locale locale26 = builder24.build();
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        java.util.Locale locale28 = java.util.Locale.PRC;
        java.lang.String str29 = locale28.getISO3Language();
        java.util.Locale.setDefault(locale28);
        java.lang.String str31 = locale26.getDisplayVariant(locale28);
        java.lang.String str32 = locale26.getCountry();
        java.util.Locale.setDefault(category0, locale26);
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zho" + "'", str29, "zho");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.util.Locale locale3 = new java.util.Locale("TW", "italien", "chinese (china)");
        org.junit.Assert.assertEquals(locale3.toString(), "tw_ITALIEN_chinese (china)");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.util.Locale locale3 = new java.util.Locale("de", "FRA", "English (United Kingdom)");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder10 = builder6.setLanguage("French");
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale3.getDisplayLanguage(locale11);
        boolean boolean13 = locale3.hasExtensions();
        java.lang.String str14 = locale3.getDisplayLanguage();
        java.lang.String str16 = locale3.getExtension('x');
        java.util.Random random18 = new java.util.Random(100L);
        double double19 = random18.nextGaussian();
        java.util.stream.DoubleStream doubleStream20 = random18.doubles();
        java.util.stream.IntStream intStream22 = random18.ints((long) (short) 1);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale3, random18);
        org.junit.Assert.assertEquals(locale3.toString(), "de_FRA_English (United Kingdom)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "french");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "German" + "'", str12, "German");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u5fb7\u6587" + "'", str14, "\u5fb7\u6587");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6246292191371761d + "'", double19 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(intStream22);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("gb__Englisch (Kanada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=gb__englisch (kanada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.util.Locale locale3 = new java.util.Locale("hi! (ITALIEN (ITALIE),fr)", "und-FR", "coreano");
        org.junit.Assert.assertEquals(locale3.toString(), "hi! (italien (italie),fr)_UND-FR_coreano");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream6 = random1.longs(0L, 7676145377811632764L);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        java.lang.String str5 = faker0.letterify("fr");
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Book book7 = faker0.book();
        java.lang.String str9 = faker0.numerify("\u82f1\u8a9e");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u8a9e" + "'", str9, "\u82f1\u8a9e");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        boolean boolean7 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.util.Random random1 = new java.util.Random((-4797905507370029140L));
        double double2 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random1.ints((long) (-539800044), (-469336362), (-1152021836));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8745976545831446d + "'", double2 == 0.8745976545831446d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale.Builder builder9 = builder6.setExtension('x', "FRA");
        java.util.Locale.Builder builder10 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("us", "hi! (hi!)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: hi! (hi!) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        java.lang.String str14 = locale1.getDisplayLanguage();
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
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italian" + "'", str12, "Italian");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French" + "'", str14, "French");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.App app6 = faker5.app();
        com.github.javafaker.Finance finance7 = faker5.finance();
        com.github.javafaker.Internet internet8 = faker5.internet();
        com.github.javafaker.Internet internet9 = faker5.internet();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(internet9);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("DE", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("und", strMap6);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList9, strMap10);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.parse("und");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder19.setVariant("");
        java.util.Locale locale22 = builder19.build();
        java.util.Locale locale26 = new java.util.Locale("", "", "");
        java.util.Locale locale30 = new java.util.Locale("", "", "");
        java.lang.String str31 = locale26.getDisplayLanguage(locale30);
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Locale locale36 = new java.util.Locale("", "", "");
        java.util.Locale locale40 = new java.util.Locale("", "", "");
        java.lang.String str41 = locale36.getDisplayLanguage(locale40);
        java.util.Locale locale45 = new java.util.Locale("", "", "");
        java.lang.String str47 = locale45.getExtension('x');
        java.util.Locale.setDefault(locale45);
        java.util.Locale locale50 = new java.util.Locale("hi!");
        java.util.Locale locale51 = locale50.stripExtensions();
        java.lang.String str52 = locale51.getISO3Country();
        java.util.Locale locale56 = new java.util.Locale("", "", "");
        java.util.Locale locale60 = new java.util.Locale("", "", "");
        java.lang.String str61 = locale56.getDisplayLanguage(locale60);
        java.util.Locale locale63 = new java.util.Locale("hi!");
        java.util.Locale locale64 = locale63.stripExtensions();
        java.util.Locale locale66 = new java.util.Locale("hi!");
        java.util.Locale locale68 = new java.util.Locale("hi!");
        java.util.Locale locale70 = new java.util.Locale("hi!");
        java.util.Locale locale71 = locale70.stripExtensions();
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale22, locale26, locale32, locale40, locale45, locale51, locale60, locale63, locale66, locale68, locale70 };
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale.FilteringMode filteringMode75 = null;
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList73, filteringMode75);
        java.util.Locale locale77 = java.util.Locale.lookup(languageRangeList15, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter(languageRangeList13, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale79 = java.util.Locale.lookup(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList73);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertEquals(locale66.toString(), "hi!");
        org.junit.Assert.assertEquals(locale68.toString(), "hi!");
        org.junit.Assert.assertEquals(locale70.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "");
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNotNull(localeList81);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder9 = builder0.setLanguage("French");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder14 = builder12.setLanguageTag("Japanese");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        java.lang.String str26 = locale15.getLanguage();
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder27.setVariant("");
        java.util.Locale.Builder builder31 = builder29.setVariant("");
        java.util.Locale.Builder builder33 = builder29.setLanguage("French");
        java.util.Locale locale34 = builder33.build();
        java.util.Locale.Builder builder35 = builder33.clear();
        java.util.Locale locale36 = builder33.build();
        java.lang.String str37 = locale36.getCountry();
        java.lang.String str38 = locale15.getDisplayVariant(locale36);
        java.util.Set<java.lang.Character> charSet39 = locale36.getExtensionKeys();
        java.lang.String str40 = locale36.getDisplayCountry();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh" + "'", str26, "zh");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "french");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Address address6 = faker0.address();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setVariant("french");
        java.util.Locale.Builder builder9 = builder5.setRegion("US");
        java.util.Locale locale10 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.removeUnicodeLocaleAttribute("en_ca");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en_ca [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "_US_french");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.util.Locale locale1 = new java.util.Locale("\u6cd5\u56fd");
        java.lang.String str2 = locale1.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("chinese (china)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: chinese (china)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.util.Locale locale3 = new java.util.Locale("CA", "\u4e2d\u56fd", "fr_CA");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd_fr_CA");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayCountry();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Japan" + "'", str1, "Japan");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream12 = random1.longs((long) (-1528827163), (long) 1);
        java.util.stream.IntStream intStream15 = random1.ints(591553211, 2002825273);
        java.util.stream.IntStream intStream18 = random1.ints((-1279776254), 27);
        java.util.stream.DoubleStream doubleStream22 = random1.doubles((long) 1699180332, (double) 0.113836765f, (double) 0.8958401f);
        java.util.stream.LongStream longStream23 = random1.longs();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(longStream23);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chinese (China)");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.lang.String str9 = locale2.getDisplayVariant(locale6);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale6.getDisplayScript(locale10);
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        java.lang.String str22 = locale6.getDisplayCountry(locale20);
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale6.getDisplayScript(locale23);
        java.lang.String str25 = locale23.getDisplayScript();
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str27 = locale1.getDisplayScript(locale23);
        java.lang.String str28 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.Random random7 = new java.util.Random((long) 0);
        random7.setSeed((long) (byte) 100);
        java.util.stream.IntStream intStream12 = random7.ints((-1193959466), 78707950);
        java.util.stream.DoubleStream doubleStream15 = random7.doubles((double) 74589158, (double) 591553211);
        java.util.stream.IntStream intStream18 = random7.ints((-1192805220), (-1176865220));
        java.util.Random random19 = new java.util.Random();
        java.util.stream.LongStream longStream22 = random19.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream24 = random19.doubles((long) '#');
        java.util.Random random26 = new java.util.Random(1L);
        java.util.Random random28 = new java.util.Random((long) (short) 1);
        java.util.Random random30 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream32 = random30.doubles((long) 10);
        int int33 = random30.nextInt();
        java.util.stream.DoubleStream doubleStream34 = random30.doubles();
        java.util.stream.IntStream intStream35 = random30.ints();
        java.util.Random random37 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream39 = random37.doubles((long) 10);
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random37.nextBytes(byteArray43);
        random30.nextBytes(byteArray43);
        random28.nextBytes(byteArray43);
        random26.nextBytes(byteArray43);
        random19.nextBytes(byteArray43);
        random7.nextBytes(byteArray43);
        random0.nextBytes(byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream53 = random0.doubles((double) 0.5752375f, (double) (-389258033));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1157793070) + "'", int33 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream34);
        org.junit.Assert.assertNotNull(intStream35);
        org.junit.Assert.assertNotNull(doubleStream39);
        org.junit.Assert.assertNotNull(byteArray43);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-88, 108, -80]");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        java.util.stream.IntStream intStream4 = random1.ints((-1337057767), (-843734));
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.util.Random random5 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random5);
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((long) 1789706084);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clear();
        java.util.Locale.Builder builder8 = builder0.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.setDefault(category0, locale7);
        java.lang.String str9 = locale7.getISO3Language();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.util.Random random1 = new java.util.Random((long) '4');
        java.util.stream.LongStream longStream2 = random1.longs();
        int int3 = random1.nextInt();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1163179554) + "'", int3 == (-1163179554));
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.util.Locale locale2 = new java.util.Locale("Twi", "Chinese");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: twi_CHINESE could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "twi_CHINESE");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", (double) 1715556003);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.715556003E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str8 = locale4.getUnicodeLocaleType("fr");
        java.util.Locale locale9 = locale4.stripExtensions();
        java.lang.String str10 = locale9.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "zh-CN");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! (HI!,zh-CN)" + "'", str5, "hi! (HI!,zh-CN)");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayCountry(locale5);
        java.lang.String str13 = locale0.getCountry();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder14.setVariant("");
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = builder16.build();
        java.lang.String str19 = locale0.getDisplayCountry(locale18);
        java.lang.String str20 = locale0.getDisplayCountry();
        java.util.Random random22 = new java.util.Random((long) (short) 0);
        int int23 = random22.nextInt();
        java.util.stream.LongStream longStream25 = random22.longs((long) '4');
        java.util.stream.DoubleStream doubleStream26 = random22.doubles();
        double double27 = random22.nextGaussian();
        java.util.stream.LongStream longStream29 = random22.longs((long) 0);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale0, random22);
        java.util.stream.LongStream longStream34 = random22.longs((long) 2125213127, (long) (-1764305998), (long) 1791901469);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CN" + "'", str13, "CN");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "China" + "'", str20, "China");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1155484576) + "'", int23 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.1460540722898627d + "'", double27 == 1.1460540722898627d);
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertNotNull(longStream34);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder14 = builder10.setLanguage("French");
        java.util.Locale locale15 = builder14.build();
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.lang.String str24 = locale22.getExtension('x');
        java.lang.String str25 = locale18.getDisplayVariant(locale22);
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.lang.String str27 = locale26.getLanguage();
        java.lang.String str28 = locale22.getDisplayScript(locale26);
        java.lang.String str29 = locale17.getDisplayScript(locale22);
        java.util.Locale locale32 = new java.util.Locale("de", "FRA");
        java.lang.String str33 = locale22.getDisplayVariant(locale32);
        java.lang.String str34 = locale15.getDisplayVariant(locale22);
        java.lang.String str35 = locale6.getDisplayLanguage(locale22);
        java.util.Locale.Builder builder36 = builder0.setLocale(locale6);
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder37.setVariant("");
        java.util.Locale.Builder builder41 = builder37.setVariant("");
        java.util.Locale.Builder builder42 = builder37.clear();
        java.util.Locale.Builder builder44 = builder37.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder45 = builder44.clearExtensions();
        java.util.Locale.Builder builder47 = builder44.setLanguage("it");
        java.util.Locale.Builder builder48 = builder44.clearExtensions();
        boolean boolean49 = locale6.equals((java.lang.Object) builder44);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "french");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "french" + "'", str16, "french");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fr" + "'", str27, "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale32.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.Object obj7 = locale5.clone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale.setDefault(locale0);
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "fr_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "fr_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "fr_CA");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("tw");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("anglais (Etats-Unis)", (double) 1799323198);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.799323198E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.util.Locale locale1 = new java.util.Locale("Italian");
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.util.Random random1 = new java.util.Random((-2624381280174885044L));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.util.Locale locale3 = new java.util.Locale("", "x-lvariant-fr", "English (United Kingdom)");
        java.util.Random random5 = new java.util.Random((long) 0);
        int int7 = random5.nextInt((int) '4');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random5);
        java.util.stream.IntStream intStream10 = random5.ints((long) 1947844456);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random5);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale3, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: _X-LVARIANT-FR_English (United Kingdom) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "_X-LVARIANT-FR_English (United Kingdom)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 44 + "'", int7 == 44);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale4.getDisplayLanguage(locale8);
        java.lang.String str10 = locale8.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale12 = java.util.Locale.getDefault(category0);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder14.setVariant("");
        java.util.Locale.Builder builder17 = builder14.clear();
        java.util.Locale locale18 = builder17.build();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale18.getDisplayName(locale19);
        java.lang.String str21 = locale18.getISO3Language();
        java.lang.String str22 = locale18.getScript();
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale24 = java.util.Locale.getDefault(category0);
        java.util.Locale locale25 = java.util.Locale.getDefault(category0);
        java.lang.String str26 = locale25.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder0.setLanguage("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: HI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.util.Locale locale2 = new java.util.Locale("zh-cn", "");
        java.lang.String str4 = locale2.getExtension('x');
        java.util.Locale.setDefault(locale2);
        java.lang.String str6 = locale2.getISO3Country();
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cn");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh_CN");
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber();
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Business business9 = faker0.business();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_CN" + "'", str6, "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        double double32 = random1.nextDouble();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream36 = random1.doubles((double) 0.9636359f, (double) (-1501435335));
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.4123569817688534d) + "'", double31 == (-0.4123569817688534d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.3327170559595112d + "'", double32 == 0.3327170559595112d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.lang.String str3 = languageRange2.getRange();
        java.lang.String str4 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.util.Random random1 = new java.util.Random((long) 2088989465);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.07480401f, (double) 1202383774);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        java.util.Locale.Builder builder18 = builder13.setLanguage("und");
        java.util.Locale.Builder builder19 = builder13.clearExtensions();
        java.util.Locale.Builder builder21 = builder13.removeUnicodeLocaleAttribute("English");
        boolean boolean22 = locale0.equals((java.lang.Object) builder13);
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder10 = builder0.setVariant("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.util.Locale locale3 = new java.util.Locale("", "fr", "");
        java.lang.String str4 = locale3.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale5.getExtension('x');
        java.lang.String str9 = locale3.getDisplayName(locale5);
        java.lang.String str10 = locale3.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA" + "'", str4, "FRA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u56fd" + "'", str9, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale3.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale3.getDisplayName(locale10);
        java.util.Random random13 = new java.util.Random((long) 27);
        long long14 = random13.nextLong();
        int int16 = random13.nextInt(33);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale10, random13);
        com.github.javafaker.Name name18 = faker17.name();
        com.github.javafaker.PhoneNumber phoneNumber19 = faker17.phoneNumber();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4947896108136290151L) + "'", long14 == (-4947896108136290151L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(phoneNumber19);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        java.lang.String str13 = locale2.getLanguage();
        java.lang.String str14 = locale2.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cn");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6246292191371761d + "'", double6 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.09760425216810112d + "'", double9 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CN" + "'", str14, "CN");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.lang.String str5 = locale2.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra" + "'", str5, "fra");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        double double5 = languageRange2.getWeight();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        com.github.javafaker.Business business9 = faker5.business();
        com.github.javafaker.Company company10 = faker5.company();
        com.github.javafaker.Color color11 = faker5.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Code code5 = faker0.code();
        java.lang.String str7 = faker0.regexify("\u6cd5\u6587");
        com.github.javafaker.Hacker hacker8 = faker0.hacker();
        com.github.javafaker.Company company9 = faker0.company();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587" + "'", str7, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(company9);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("China");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "china" + "'", str2, "china");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("china", 0.0d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        java.lang.String str26 = locale15.getLanguage();
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder27.setVariant("");
        java.util.Locale.Builder builder31 = builder29.setVariant("");
        java.util.Locale.Builder builder33 = builder29.setLanguage("French");
        java.util.Locale locale34 = builder33.build();
        java.util.Locale.Builder builder35 = builder33.clear();
        java.util.Locale locale36 = builder33.build();
        java.lang.String str37 = locale36.getCountry();
        java.lang.String str38 = locale15.getDisplayVariant(locale36);
        java.util.Set<java.lang.Character> charSet39 = locale36.getExtensionKeys();
        java.lang.String str41 = locale36.getExtension('u');
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh" + "'", str26, "zh");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "french");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charSet39);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("chinois");
        java.util.Locale.Builder builder10 = builder8.setVariant("France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("GBR", "zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: GBR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.util.Locale.setDefault(category9, locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category9);
        java.util.Locale locale15 = java.util.Locale.getDefault(category9);
        java.util.Locale locale16 = java.util.Locale.getDefault(category9);
        java.util.Random random17 = new java.util.Random();
        java.util.stream.LongStream longStream18 = random17.longs();
        float float19 = random17.nextFloat();
        java.util.stream.IntStream intStream20 = random17.ints();
        int int21 = random17.nextInt();
        random17.setSeed((long) (-1155869325));
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale16, random17);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale5, random17);
        java.lang.String str26 = locale5.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
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
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.61359507f + "'", float19 == 0.61359507f);
        org.junit.Assert.assertNotNull(intStream20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1463422709 + "'", int21 == 1463422709);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fr" + "'", str26, "fr");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.IntStream intStream6 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (-266361440), (double) (-630219714), (double) (-1855441849));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Book book6 = faker0.book();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale locale9 = new java.util.Locale("hi!", "hi!", "zh-CN");
        java.lang.String str10 = locale9.getDisplayVariant();
        java.lang.String str11 = locale3.getDisplayCountry(locale9);
        boolean boolean12 = locale3.hasExtensions();
        java.util.Set<java.lang.String> strSet13 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0L);
        java.util.stream.IntStream intStream7 = random0.ints();
        double double8 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random0.ints((long) (-1189342480), 1408303951, 78707950);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1176776822) + "'", int4 == (-1176776822));
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.668135366031319d + "'", double8 == 0.668135366031319d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.setScript("zh-cn (JPN)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh-cn (JPN) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        java.lang.String str12 = locale10.getDisplayVariant();
        java.lang.String str13 = locale0.getDisplayCountry(locale10);
        java.util.Random random15 = new java.util.Random((long) (byte) 10);
        long long16 = random15.nextLong();
        java.util.stream.LongStream longStream18 = random15.longs((long) (short) 1);
        int int19 = random15.nextInt();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0, random15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = locale0.getUnicodeLocaleType("hi! (ITALIEN (ITALIE),fr)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi! (ITALIEN (ITALIE),fr)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Japon" + "'", str13, "Japon");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-4972683369271453960L) + "'", long16 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1107254586 + "'", int19 == 1107254586);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.util.Locale locale1 = new java.util.Locale("chinese (china)");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "chinese (china)");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
        com.github.javafaker.Company company21 = faker18.company();
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
        org.junit.Assert.assertNotNull(company21);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.util.Locale locale2 = new java.util.Locale("English (United Kingdom)", "Italian");
        java.util.Locale locale4 = new java.util.Locale("zh");
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale7 = null;
        java.lang.String str8 = null; // flaky: locale6.getDisplayScript(locale7);
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.util.Locale.setDefault(category9, locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category9);
        java.lang.String str16 = locale14.getExtension('a');
        java.lang.String str17 = locale14.getCountry();
        boolean boolean18 = locale14.hasExtensions();
        java.lang.String str19 = locale6.getDisplayScript(locale14);
        java.lang.String str20 = locale4.getDisplayLanguage(locale6);
        java.lang.String str21 = locale6.getISO3Language();
        java.lang.String str22 = locale2.getDisplayScript(locale6);
        org.junit.Assert.assertEquals(locale2.toString(), "english (united kingdom)_ITALIAN");
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Chinese" + "'", str20, "Chinese");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        random1.setSeed((long) 100);
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
        java.util.stream.IntStream intStream33 = random1.ints((-1501435335), 1155099827);
        int int34 = random1.nextInt();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1157793070) + "'", int15 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-42, -97, -43]");
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1139614796) + "'", int34 == (-1139614796));
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-gb", 0.7496515211299728d);
        java.util.Random random4 = new java.util.Random((long) 1296812279);
        boolean boolean5 = languageRange2.equals((java.lang.Object) 1296812279);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str8 = locale4.getUnicodeLocaleType("fr");
        java.lang.String str9 = locale4.getISO3Language();
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale13.getExtension('x');
        java.util.Locale.setDefault(locale13);
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale13.getDisplayLanguage(locale17);
        java.lang.String str19 = locale13.getISO3Language();
        java.lang.String str20 = locale4.getDisplayCountry(locale13);
        java.lang.String str21 = locale4.getLanguage();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.util.Locale locale1 = new java.util.Locale("\u97d3\u6587");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "\u97d3\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Company company2 = faker0.company();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(company2);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.util.Locale locale2 = new java.util.Locale("us", "zh-cn (JPN)");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.lang.String str5 = locale4.getLanguage();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.util.Locale locale14 = builder9.build();
        java.lang.String str15 = locale4.getDisplayName(locale14);
        java.lang.String str16 = locale2.getDisplayLanguage(locale4);
        java.lang.String str17 = locale4.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "us_ZH-CN (JPN)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "us" + "'", str16, "us");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Code code5 = faker0.code();
        java.lang.String str7 = faker0.regexify("\u6cd5\u6587");
        com.github.javafaker.App app8 = faker0.app();
        com.github.javafaker.DateAndTime dateAndTime9 = faker0.date();
        com.github.javafaker.Finance finance10 = faker0.finance();
        com.github.javafaker.Book book11 = faker0.book();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587" + "'", str7, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(app8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Finance finance4 = faker0.finance();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setRegion("CHINESISCH (TAIWAN)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CHINESISCH (TAIWAN) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Cina");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.util.Locale locale1 = new java.util.Locale("chinese");
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder2.build();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale4.getCountry();
        java.util.Random random8 = new java.util.Random(100L);
        java.util.stream.LongStream longStream10 = random8.longs((long) (short) 0);
        random8.setSeed((long) 'x');
        java.util.stream.LongStream longStream16 = random8.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream19 = random8.longs((long) 78707950, (long) 2002825273);
        long long20 = random8.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale4, random8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-5108187057464061899L) + "'", long20 == (-5108187057464061899L));
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("und-DE", (double) 0.44563425f);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.util.Locale locale2 = new java.util.Locale("\u65e5\u672c", "und-FR");
        org.junit.Assert.assertEquals(locale2.toString(), "\u65e5\u672c_UND-FR");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("und");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale locale14 = builder11.build();
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.lang.String str23 = locale18.getDisplayLanguage(locale22);
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Locale locale28 = new java.util.Locale("", "", "");
        java.util.Locale locale32 = new java.util.Locale("", "", "");
        java.lang.String str33 = locale28.getDisplayLanguage(locale32);
        java.util.Locale locale37 = new java.util.Locale("", "", "");
        java.lang.String str39 = locale37.getExtension('x');
        java.util.Locale.setDefault(locale37);
        java.util.Locale locale42 = new java.util.Locale("hi!");
        java.util.Locale locale43 = locale42.stripExtensions();
        java.lang.String str44 = locale43.getISO3Country();
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.util.Locale locale52 = new java.util.Locale("", "", "");
        java.lang.String str53 = locale48.getDisplayLanguage(locale52);
        java.util.Locale locale55 = new java.util.Locale("hi!");
        java.util.Locale locale56 = locale55.stripExtensions();
        java.util.Locale locale58 = new java.util.Locale("hi!");
        java.util.Locale locale60 = new java.util.Locale("hi!");
        java.util.Locale locale62 = new java.util.Locale("hi!");
        java.util.Locale locale63 = locale62.stripExtensions();
        java.util.Locale[] localeArray64 = new java.util.Locale[] { locale14, locale18, locale24, locale32, locale37, locale43, locale52, locale55, locale58, locale60, locale62 };
        java.util.ArrayList<java.util.Locale> localeList65 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList65, localeArray64);
        java.util.Locale.FilteringMode filteringMode67 = null;
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList65, filteringMode67);
        java.util.Locale locale69 = java.util.Locale.lookup(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.Locale locale71 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList65);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker72 = new com.github.javafaker.Faker(locale71);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals(locale42.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals(locale55.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(localeList68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder7 = builder5.setLanguage("italien");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u53f0\u6e7e");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Random random7 = new java.util.Random(100L);
        java.util.stream.LongStream longStream9 = random7.longs((long) (short) 0);
        java.util.Random random11 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream13 = random11.doubles((long) 10);
        int int14 = random11.nextInt();
        java.util.stream.DoubleStream doubleStream15 = random11.doubles();
        java.util.stream.IntStream intStream16 = random11.ints();
        java.util.Random random18 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles((long) 10);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random18.nextBytes(byteArray24);
        random11.nextBytes(byteArray24);
        random7.nextBytes(byteArray24);
        random1.nextBytes(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream30 = random1.ints((long) (-1082863525));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1157793070) + "'", int14 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[103, -4, 112]");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.util.Locale locale2 = new java.util.Locale("fra FRA,fr", "DE");
        org.junit.Assert.assertEquals(locale2.toString(), "fra fra,fr_DE");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.util.Locale locale3 = new java.util.Locale("Cina", "JPN", "");
        org.junit.Assert.assertEquals(locale3.toString(), "cina_JPN");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        java.util.Locale.setDefault(category7, locale8);
        java.util.Locale locale12 = java.util.Locale.getDefault(category7);
        java.util.Locale locale13 = java.util.Locale.getDefault(category7);
        java.util.Locale locale14 = java.util.Locale.getDefault(category7);
        java.util.Locale locale15 = java.util.Locale.getDefault(category7);
        java.lang.String str16 = locale0.getDisplayCountry(locale15);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker18 = faker17.hacker();
        com.github.javafaker.Address address19 = faker17.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.30434567f + "'", float3 == 0.30434567f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1656932537) + "'", int5 == (-1656932537));
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "France" + "'", str16, "France");
        org.junit.Assert.assertNotNull(hacker18);
        org.junit.Assert.assertNotNull(address19);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale4.getDisplayLanguage(locale8);
        java.lang.String str10 = locale8.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale12 = java.util.Locale.getDefault(category0);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder14.setVariant("");
        java.util.Locale.Builder builder17 = builder14.clear();
        java.util.Locale locale18 = builder17.build();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale18.getDisplayName(locale19);
        java.lang.String str21 = locale18.getISO3Language();
        java.lang.String str22 = locale18.getScript();
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale24 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale24);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Italian");
        java.util.Locale locale9 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setUnicodeLocaleKeyword("zh,cn (ITALIENISCH)", "und_FRA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zh,cn (ITALIENISCH) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) (byte) 0);
        int int5 = random1.nextInt(795965107);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = random1.nextInt((-833381869));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 773776253 + "'", int5 == 773776253);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.bothify("English (United Kingdom)");
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Hacker hacker9 = faker0.hacker();
        java.lang.String str11 = faker0.bothify("Chinesisch (Taiwan)");
        java.lang.String str13 = faker0.regexify("\u97d3\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English (United Kingdom)" + "'", str7, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinesisch (Taiwan)" + "'", str11, "Chinesisch (Taiwan)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u97d3\u6587" + "'", str13, "\u97d3\u6587");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        java.lang.String str20 = locale0.getDisplayScript();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setLanguage("Chinese");
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setUnicodeLocaleKeyword("us (CHINESE)", "FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: us (CHINESE) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt();
        java.lang.Class<?> wildcardClass5 = random1.getClass();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1155484576) + "'", int4 == (-1155484576));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.util.Locale locale3 = new java.util.Locale("Italian", "en_CA", "fra FRA,fr");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("hi! (ITALIEN (ITALIE),fr)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi! (ITALIEN (ITALIE),fr)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "italian_EN_CA_fra FRA,fr");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        java.lang.String str18 = locale3.toLanguageTag();
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder19.setVariant("");
        java.util.Locale.Builder builder23 = builder19.setVariant("");
        java.util.Locale locale24 = builder23.build();
        java.util.Locale locale27 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str28 = locale24.getDisplayCountry(locale27);
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Category category30 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale34 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category30, locale34);
        java.util.Locale.Builder builder36 = builder29.setLocale(locale34);
        java.lang.String str37 = locale34.getScript();
        java.lang.String str38 = locale24.getDisplayCountry(locale34);
        java.lang.String str39 = locale3.getDisplayLanguage(locale24);
        java.lang.String str40 = locale24.getISO3Language();
        java.lang.String str41 = locale24.getISO3Language();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ja-JP" + "'", str18, "ja-JP");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals(locale27.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.FORMAT + "'", category30.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Japanese" + "'", str39, "Japanese");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream7 = random1.ints(0L, (int) '#', (int) (byte) 100);
        double double8 = random1.nextDouble();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.730967787376657d + "'", double8 == 0.730967787376657d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        random1.setSeed((-4757019160717151369L));
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream11 = random1.ints((-144180575), 10846315);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getExtension('x');
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet5 = locale0.getExtensionKeys();
        java.util.Random random7 = new java.util.Random((long) (-1950768727));
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random7);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        java.util.Locale locale20 = locale3.stripExtensions();
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str23 = locale20.getExtension('a');
        java.lang.String str24 = locale20.getLanguage();
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale12 = new java.util.Locale("", "", "");
        java.lang.String str14 = locale12.getExtension('x');
        java.lang.String str15 = locale8.getDisplayVariant(locale12);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.lang.String str17 = locale16.getLanguage();
        java.lang.String str18 = locale12.getDisplayScript(locale16);
        java.lang.String str19 = locale7.getDisplayCountry(locale12);
        java.lang.String str20 = locale7.getCountry();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder21.setVariant("");
        java.util.Locale.Builder builder24 = builder23.clearExtensions();
        java.util.Locale locale25 = builder23.build();
        java.lang.String str26 = locale7.getDisplayCountry(locale25);
        java.lang.String str27 = locale7.getDisplayLanguage();
        java.util.Locale.Builder builder28 = builder3.setLocale(locale7);
        java.lang.String str29 = locale7.getDisplayLanguage();
        java.lang.String str30 = locale7.getISO3Country();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr" + "'", str17, "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CN" + "'", str20, "CN");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "China" + "'", str26, "China");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese" + "'", str27, "Chinese");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinese" + "'", str29, "Chinese");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "CHN" + "'", str30, "CHN");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("French");
        java.lang.String str2 = locale1.getScript();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setVariant("");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.lang.String str16 = locale15.getLanguage();
        java.util.Locale.Builder builder17 = builder13.setLocale(locale15);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.util.Random random19 = new java.util.Random();
        java.util.stream.LongStream longStream20 = random19.longs();
        float float21 = random19.nextFloat();
        java.util.stream.IntStream intStream22 = random19.ints();
        int int23 = random19.nextInt();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale18, random19);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale15, random19);
        java.lang.String str26 = locale15.getDisplayName();
        java.util.Locale.Builder builder27 = builder9.setLocale(locale15);
        java.lang.String str28 = locale15.getLanguage();
        java.lang.String str29 = locale1.getDisplayName(locale15);
        java.lang.String str30 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fr" + "'", str16, "fr");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream20);
// flaky:         org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.6237308f + "'", float21 == 0.6237308f);
        org.junit.Assert.assertNotNull(intStream22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 974857242 + "'", int23 == 974857242);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "French" + "'", str26, "French");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr" + "'", str28, "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "french" + "'", str29, "french");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        java.util.Locale locale20 = locale3.stripExtensions();
        java.lang.Object obj21 = locale3.clone();
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.setLanguage("JPN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setScript("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hi! [at index 0]");
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
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder34 = builder32.setVariant("");
        java.util.Locale.Builder builder35 = builder32.clear();
        java.util.Locale locale36 = builder35.build();
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        java.lang.String str38 = locale36.getDisplayName(locale37);
        java.util.Set<java.lang.String> strSet39 = locale37.getUnicodeLocaleKeys();
        java.lang.String str40 = locale27.getDisplayName(locale37);
        java.lang.String str41 = locale27.getCountry();
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
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "francese" + "'", str40, "francese");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder10 = builder5.addUnicodeLocaleAttribute("italien");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguageTag("cinese (Cina)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: cinese (Cina) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = locale21.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        double double3 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8025330637390305d + "'", double3 == 0.8025330637390305d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Color color5 = faker0.color();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Number number8 = faker0.number();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.lang.Class<?> wildcardClass5 = languageRangeList2.getClass();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CN", 0.9114582547571894d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cn" + "'", str3, "cn");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder7.clear();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.removeUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.addUnicodeLocaleAttribute("ko");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ko [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.util.Locale locale2 = new java.util.Locale("en_GB", "French");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.setScript("");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder13 = builder8.setExtension('u', "");
        java.util.Locale.Builder builder16 = builder13.setExtension('u', "");
        java.util.Locale locale17 = builder13.build();
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder19 = builder13.setLocale(locale18);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder20.setVariant("");
        java.util.Locale.Builder builder24 = builder22.setVariant("");
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale25.getVariant();
        java.util.Locale.Builder builder27 = builder22.setLocale(locale25);
        java.lang.String str28 = locale18.getDisplayLanguage(locale25);
        java.lang.String str29 = locale18.getLanguage();
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder32 = builder30.setVariant("");
        java.util.Locale.Builder builder34 = builder32.setVariant("");
        java.util.Locale.Builder builder36 = builder32.setLanguage("French");
        java.util.Locale locale37 = builder36.build();
        java.util.Locale.Builder builder38 = builder36.clear();
        java.util.Locale locale39 = builder36.build();
        java.lang.String str40 = locale39.getCountry();
        java.lang.String str41 = locale18.getDisplayVariant(locale39);
        java.util.Set<java.lang.Character> charSet42 = locale39.getExtensionKeys();
        java.lang.String str43 = locale2.getDisplayScript(locale39);
        java.lang.String str44 = locale39.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "en_gb_FRENCH");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh" + "'", str29, "zh");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "french");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh_CN");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker3.resolve("Chinesisch (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("CN", "zh-TW", "en_CA");
        java.lang.String str7 = locale0.getDisplayVariant(locale6);
        java.lang.Object obj8 = locale6.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale6.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "cn_ZH-TW_en_CA");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chine", 0.6271618247171438d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.util.Locale locale3 = new java.util.Locale("anglais (Royaume-Uni)", "US", "\u82f1\u6587\u82f1\u56fd)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u6587\u82f1\u56fd)");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.util.Locale locale1 = new java.util.Locale("italien (Italie)");
        java.util.Random random3 = new java.util.Random(100L);
        java.util.stream.LongStream longStream5 = random3.longs((long) (short) 0);
        random3.setSeed((long) 'x');
        java.util.stream.LongStream longStream11 = random3.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream14 = random3.longs((long) (-1528827163), (long) 1);
        java.util.stream.IntStream intStream17 = random3.ints(591553211, 2002825273);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random3);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: italien (italie) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "italien (italie)");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        java.util.Locale locale3 = new java.util.Locale("en_GB", "Japan", "Undetermined");
        org.junit.Assert.assertEquals(locale3.toString(), "en_gb_JAPAN_Undetermined");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.util.Random random1 = new java.util.Random((long) (-1332689415));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.util.Locale locale2 = new java.util.Locale("_FR", "ita");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: _fr_ITA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "_fr_ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u5fb7\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        java.util.Random random14 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream15 = random14.ints();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale2, random14);
        com.github.javafaker.Book book18 = faker17.book();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6246292191371761d + "'", double6 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.09760425216810112d + "'", double9 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        java.lang.String str18 = faker15.bothify("en_GB");
        com.github.javafaker.Lorem lorem19 = faker15.lorem();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.3098324f + "'", float11 == 0.3098324f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1686023285 + "'", int13 == 1686023285);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en_GB" + "'", str18, "en_GB");
        org.junit.Assert.assertNotNull(lorem19);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setRegion("de");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setScript("ja-JP");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ja-JP [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        java.util.Locale locale2 = new java.util.Locale("en-gb", "Undetermined");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker4.phoneNumber();
        com.github.javafaker.Finance finance6 = faker4.finance();
        com.github.javafaker.Number number7 = faker4.number();
        com.github.javafaker.Number number8 = faker4.number();
        com.github.javafaker.Business business9 = faker4.business();
        boolean boolean10 = locale2.equals((java.lang.Object) business9);
        org.junit.Assert.assertEquals(locale2.toString(), "en-gb_UNDETERMINED");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale locale11 = builder10.build();
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale12.getLanguage();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.util.Random random16 = new java.util.Random();
        java.util.stream.LongStream longStream17 = random16.longs();
        float float18 = random16.nextFloat();
        java.util.stream.IntStream intStream19 = random16.ints();
        int int20 = random16.nextInt();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale15, random16);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale12, random16);
        java.lang.String str23 = locale12.getDisplayName();
        java.util.Locale.Builder builder24 = builder6.setLocale(locale12);
        java.util.Locale locale28 = new java.util.Locale("CN", "zh-TW", "en_CA");
        java.lang.String str29 = locale12.getDisplayLanguage(locale28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = locale28.getUnicodeLocaleType("italien (Italie)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italien (Italie)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr" + "'", str13, "fr");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream17);
// flaky:         org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.6650381f + "'", float18 == 0.6650381f);
        org.junit.Assert.assertNotNull(intStream19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2120934000 + "'", int20 == 2120934000);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u6587" + "'", str23, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals(locale28.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "French" + "'", str29, "French");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setLanguage("ja");
        java.util.Locale.Builder builder6 = builder5.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream6 = random0.ints((long) 1);
        java.util.stream.IntStream intStream7 = random0.ints();
        boolean boolean8 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.6124941f + "'", float2 == 0.6124941f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Business business6 = faker4.business();
        com.github.javafaker.Company company7 = faker4.company();
        com.github.javafaker.Options options8 = faker4.options();
        com.github.javafaker.Color color9 = faker4.color();
        com.github.javafaker.Options options10 = faker4.options();
        java.lang.String str12 = faker4.regexify("x-lvariant-JPN");
        com.github.javafaker.Name name13 = faker4.name();
        com.github.javafaker.Book book14 = faker4.book();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "x-lvariant-JPN" + "'", str12, "x-lvariant-JPN");
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(book14);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet9 = locale3.getUnicodeLocaleKeys();
        java.lang.String str10 = locale3.getDisplayVariant();
        java.lang.String str12 = locale3.getExtension('x');
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.util.Locale locale3 = new java.util.Locale("", "\u6cd5\u56fd)", "de");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.lang.String str10 = locale8.getExtension('x');
        java.util.Locale.setDefault(locale8);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale8.getDisplayLanguage(locale12);
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayVariant();
        java.lang.String str16 = locale3.getDisplayCountry(locale12);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u56fd)_de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u56fd)" + "'", str4, "\u6cd5\u56fd)");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u6cd5\u56fd)" + "'", str16, "\u6cd5\u56fd)");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale1.getDisplayCountry();
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet7 = locale5.getExtensionKeys();
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale locale9 = java.util.Locale.getDefault(category4);
        java.lang.String str11 = locale9.getExtension('a');
        java.lang.String str12 = locale9.getCountry();
        java.lang.String str13 = locale1.getDisplayCountry(locale9);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale1);
        java.lang.String str15 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "German" + "'", str15, "German");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        java.util.stream.LongStream longStream3 = random0.longs(0L);
        java.util.stream.IntStream intStream5 = random0.ints((long) (byte) 1);
        java.util.stream.LongStream longStream6 = random0.longs();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles();
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.43266338f, 0.6246292191371761d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (-1631086829), (double) 1552812408, (double) (-5015647950085110473L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.Number number6 = faker0.number();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber();
        com.github.javafaker.Book book8 = faker0.book();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.util.Random random1 = new java.util.Random(8849569814870478533L);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.util.Random random1 = new java.util.Random((long) (-910502427));
        int int2 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(6875854121430089799L, 0.2227720902128787d, (double) 0.9816493f);
        java.util.stream.LongStream longStream8 = random1.longs((long) 2043360656);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-196947104) + "'", int2 == (-196947104));
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        java.util.Locale locale2 = new java.util.Locale("Chinese (China)", "TW");
        java.lang.String str3 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese (china)_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        java.util.Random random1 = new java.util.Random((long) 583837061);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) (-722350264));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        long long4 = random1.nextLong();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-4972683369271453960L) + "'", long4 == (-4972683369271453960L));
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream8 = random0.ints(100L, (int) (byte) -1, (int) ' ');
        java.util.stream.LongStream longStream10 = random0.longs((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random0.longs((long) (-2058711394), (long) 1552812408, (-6139822020582680716L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.6350137f + "'", float2 == 0.6350137f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh-CN", (double) 0.55340016f);
        double double3 = languageRange2.getWeight();
        java.util.Random random5 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((-0.4996932076353699d), 0.7924908613121775d);
        double double9 = random5.nextGaussian();
        double double10 = random5.nextGaussian();
        boolean boolean11 = languageRange2.equals((java.lang.Object) double10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5534001588821411d + "'", double3 == 0.5534001588821411d);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8746788966462123d + "'", double9 == 0.8746788966462123d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.9193443348656242d) + "'", double10 == (-0.9193443348656242d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder11 = builder0.setExtension('a', "China");
        java.util.Locale.Builder builder14 = builder0.setExtension('x', "JPN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        double double32 = random1.nextDouble();
        java.util.Random random34 = new java.util.Random((long) 1);
        java.util.Random random36 = new java.util.Random((long) (short) 1);
        int int37 = random36.nextInt();
        java.util.stream.LongStream longStream41 = random36.longs(10L, 0L, (long) (short) 100);
        java.util.Random random43 = new java.util.Random(1L);
        java.util.Random random45 = new java.util.Random((long) (short) 1);
        java.util.Random random47 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream49 = random47.doubles((long) 10);
        int int50 = random47.nextInt();
        java.util.stream.DoubleStream doubleStream51 = random47.doubles();
        java.util.stream.IntStream intStream52 = random47.ints();
        java.util.Random random54 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream56 = random54.doubles((long) 10);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random54.nextBytes(byteArray60);
        random47.nextBytes(byteArray60);
        random45.nextBytes(byteArray60);
        random43.nextBytes(byteArray60);
        random36.nextBytes(byteArray60);
        random34.nextBytes(byteArray60);
        random1.nextBytes(byteArray60);
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.3327170559595112d + "'", double32 == 0.3327170559595112d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1155869325) + "'", int37 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertNotNull(doubleStream49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1157793070) + "'", int50 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream51);
        org.junit.Assert.assertNotNull(intStream52);
        org.junit.Assert.assertNotNull(doubleStream56);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-43, -39, -66]");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("it");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = builder12.build();
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Locale locale20 = new java.util.Locale("", "", "");
        java.lang.String str22 = locale20.getExtension('x');
        java.lang.String str23 = locale16.getDisplayVariant(locale20);
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.lang.String str25 = locale24.getLanguage();
        java.lang.String str26 = locale20.getDisplayScript(locale24);
        java.lang.String str27 = locale15.getDisplayCountry(locale20);
        java.lang.String str28 = locale15.getCountry();
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder29.setVariant("");
        java.util.Locale.Builder builder32 = builder31.clearExtensions();
        java.util.Locale locale33 = builder31.build();
        java.lang.String str34 = locale15.getDisplayCountry(locale33);
        java.util.Locale locale35 = locale33.stripExtensions();
        java.lang.String str36 = locale14.getDisplayScript(locale35);
        java.lang.String str37 = locale35.getCountry();
        java.lang.String str38 = locale35.getVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "fr" + "'", str25, "fr");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CN" + "'", str28, "CN");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "China" + "'", str34, "China");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.util.Locale locale1 = new java.util.Locale("Chine");
        java.lang.String str2 = locale1.getDisplayScript();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "chine");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English (Canada)", 0.4261748790740967d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (canada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        long long8 = random1.nextLong();
        java.util.stream.LongStream longStream10 = random1.longs((long) 583837061);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4129126974821382d + "'", double7 == 0.4129126974821382d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-6047590478893910070L) + "'", long8 == (-6047590478893910070L));
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        java.lang.String str4 = faker0.numerify("ITA");
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Color color6 = faker0.color();
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Company company8 = faker0.company();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.util.Random random1 = new java.util.Random((long) 27);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int3 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1152021836) + "'", int3 == (-1152021836));
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        java.lang.String str26 = locale24.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = locale24.getUnicodeLocaleType("chinese china");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: chinese china");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setExtension('x', "Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Korean (South Korea) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("english (_FR)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (_fr)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("deu", (double) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=9.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        java.util.Random random1 = new java.util.Random((long) 2002825273);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.util.Locale locale2 = new java.util.Locale("cinese (Cina)", "English");
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet6 = locale4.getExtensionKeys();
        java.util.Locale.setDefault(category3, locale4);
        java.util.Locale locale8 = java.util.Locale.getDefault(category3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale8);
        java.lang.String str10 = locale2.getDisplayCountry(locale8);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale8);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale8);
        org.junit.Assert.assertEquals(locale2.toString(), "cinese (cina)_ENGLISH");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ENGLISH" + "'", str10, "ENGLISH");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        java.util.Locale locale3 = new java.util.Locale("", "zh,CN", "CHN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: X-LVARIANT-JPN (JPN,??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "_ZH,CN_CHN");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber();
        com.github.javafaker.Options options8 = faker0.options();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setRegion("Chinesisch (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinesisch (China) [at index 0]");
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
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.App app9 = faker0.app();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(app9);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Business business7 = faker0.business();
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Book book9 = faker0.book();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.DateAndTime dateAndTime6 = faker5.date();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        com.github.javafaker.Color color8 = faker5.color();
        com.github.javafaker.Code code9 = faker5.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("CN", "zh-TW", "en_CA");
        java.lang.String str7 = locale0.getDisplayVariant(locale6);
        java.util.Random random8 = new java.util.Random();
        java.util.stream.LongStream longStream9 = random8.longs();
        float float10 = random8.nextFloat();
        java.util.stream.IntStream intStream11 = random8.ints();
        java.util.stream.LongStream longStream15 = random8.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.LongStream longStream18 = random8.longs((long) (-266083962), (long) 'a');
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale0, random8);
        com.github.javafaker.Code code20 = faker19.code();
        com.github.javafaker.Options options21 = faker19.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale6.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.508363f + "'", float10 == 0.508363f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertNotNull(options21);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Business business7 = faker0.business();
        com.github.javafaker.Finance finance8 = faker0.finance();
        java.lang.String str10 = faker0.numerify("Japan");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Japan" + "'", str10, "Japan");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        com.github.javafaker.Company company8 = faker5.company();
        com.github.javafaker.Color color9 = faker5.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale locale7 = new java.util.Locale("English United Kingdom", "zh-CN", "JPN");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale0.getDisplayVariant(locale11);
        java.lang.String str14 = locale11.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertEquals(locale7.toString(), "english united kingdom_ZH-CN_JPN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JPN" + "'", str8, "JPN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "und" + "'", str14, "und");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        double double7 = random1.nextDouble();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random1.ints((long) (-1855441849), (-1557280266), 757477532);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9526929361031337d + "'", double7 == 0.9526929361031337d);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.util.Locale locale3 = new java.util.Locale("fra (FRA,fr)", "German", "Italian");
        java.lang.String str4 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "fra (fra,fr)_GERMAN_Italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder9.addUnicodeLocaleAttribute("TWN");
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.lang.String str20 = locale18.getExtension('x');
        java.lang.String str21 = locale14.getDisplayVariant(locale18);
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.lang.String str23 = locale22.getLanguage();
        java.lang.String str24 = locale18.getDisplayScript(locale22);
        java.lang.String str25 = locale13.getDisplayScript(locale18);
        java.util.Locale locale28 = new java.util.Locale("de", "FRA");
        java.lang.String str29 = locale18.getDisplayVariant(locale28);
        java.util.Locale locale30 = locale18.stripExtensions();
        java.util.Locale.Builder builder31 = builder12.setLocale(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder34 = builder31.setUnicodeLocaleKeyword("x-lvariant-jpn", "us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: x-lvariant-jpn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fr" + "'", str23, "fr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale28.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)");
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.setDefault(locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Set<java.lang.Character> charSet6 = locale2.getExtensionKeys();
        boolean boolean7 = locale1.equals((java.lang.Object) locale2);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        double double19 = random14.nextGaussian();
        java.util.stream.DoubleStream doubleStream21 = random14.doubles((long) 1692529656);
        double double22 = random14.nextGaussian();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.1460540722898627d + "'", double19 == 1.1460540722898627d);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.36771966046909416d + "'", double22 == 0.36771966046909416d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.util.Random random1 = new java.util.Random((long) (-1800157150));
        boolean boolean2 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = random1.longs((long) (-267994359), (long) 41663098, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        java.util.Random random1 = new java.util.Random((-1501966224973652799L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) 2002825273, (long) 2027332310, (long) (-469336362));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
        java.lang.String str18 = locale3.toLanguageTag();
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder19.setVariant("");
        java.util.Locale.Builder builder23 = builder19.setVariant("");
        java.util.Locale locale24 = builder23.build();
        java.util.Locale locale27 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str28 = locale24.getDisplayCountry(locale27);
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Category category30 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale34 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category30, locale34);
        java.util.Locale.Builder builder36 = builder29.setLocale(locale34);
        java.lang.String str37 = locale34.getScript();
        java.lang.String str38 = locale24.getDisplayCountry(locale34);
        java.lang.String str39 = locale3.getDisplayLanguage(locale24);
        java.util.Locale.Builder builder40 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder40.setVariant("");
        java.util.Locale.Builder builder44 = builder42.setVariant("");
        java.util.Locale locale45 = builder44.build();
        java.lang.String str46 = locale45.getDisplayCountry();
        java.lang.String str47 = locale3.getDisplayScript(locale45);
        java.util.Locale locale49 = new java.util.Locale("zh");
        java.util.Locale locale51 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale52 = null;
        java.lang.String str53 = null; // flaky: locale51.getDisplayScript(locale52);
        java.util.Locale.Category category54 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale55 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet57 = locale55.getExtensionKeys();
        java.util.Locale.setDefault(category54, locale55);
        java.util.Locale locale59 = java.util.Locale.getDefault(category54);
        java.lang.String str61 = locale59.getExtension('a');
        java.lang.String str62 = locale59.getCountry();
        boolean boolean63 = locale59.hasExtensions();
        java.lang.String str64 = locale51.getDisplayScript(locale59);
        java.lang.String str65 = locale49.getDisplayLanguage(locale51);
        java.lang.String str66 = locale49.getCountry();
        java.lang.String str67 = locale45.getDisplayVariant(locale49);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ja-JP" + "'", str18, "ja-JP");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals(locale27.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.FORMAT + "'", category30.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Japanese" + "'", str39, "Japanese");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale49.toString(), "zh");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + category54 + "' != '" + java.util.Locale.Category.FORMAT + "'", category54.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "fr");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Chinese" + "'", str65, "Chinese");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Address address6 = faker1.address();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.util.Random random1 = new java.util.Random((long) (-910502427));
        double double2 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) (-1082863525), 0.7482923799143263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9541446850808977d + "'", double2 == 0.9541446850808977d);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream3 = random1.ints((long) (short) 100);
        java.util.stream.IntStream intStream4 = random1.ints();
        float float5 = random1.nextFloat();
        double double6 = random1.nextGaussian();
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            random1.nextBytes(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.73096776f + "'", float5 == 0.73096776f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.1460540722898627d + "'", double6 == 1.1460540722898627d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder9.addUnicodeLocaleAttribute("TWN");
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.lang.String str20 = locale18.getExtension('x');
        java.lang.String str21 = locale14.getDisplayVariant(locale18);
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.lang.String str23 = locale22.getLanguage();
        java.lang.String str24 = locale18.getDisplayScript(locale22);
        java.lang.String str25 = locale13.getDisplayScript(locale18);
        java.util.Locale locale28 = new java.util.Locale("de", "FRA");
        java.lang.String str29 = locale18.getDisplayVariant(locale28);
        java.util.Locale locale30 = locale18.stripExtensions();
        java.util.Locale.Builder builder31 = builder12.setLocale(locale18);
        java.lang.String str32 = locale18.getVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fr" + "'", str23, "fr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale28.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Number number11 = faker10.number();
        com.github.javafaker.Internet internet12 = faker10.internet();
        java.lang.String str14 = faker10.regexify("");
        com.github.javafaker.Address address15 = faker10.address();
        com.github.javafaker.Hacker hacker16 = faker10.hacker();
        com.github.javafaker.Finance finance17 = faker10.finance();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertNotNull(hacker16);
        org.junit.Assert.assertNotNull(finance17);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder8.setVariant("German");
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.util.Random random1 = new java.util.Random((long) 190001823);
        java.util.stream.LongStream longStream3 = random1.longs((long) 1180466361);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.util.Locale locale2 = new java.util.Locale("und_FRA", "English (United Kingdom)");
        java.lang.String str3 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "und_fra_ENGLISH (UNITED KINGDOM)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und_fra (ENGLISH (UNITED KINGDOM))" + "'", str3, "und_fra (ENGLISH (UNITED KINGDOM))");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Random random7 = new java.util.Random(100L);
        java.util.stream.LongStream longStream9 = random7.longs((long) (short) 0);
        java.util.Random random11 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream13 = random11.doubles((long) 10);
        int int14 = random11.nextInt();
        java.util.stream.DoubleStream doubleStream15 = random11.doubles();
        java.util.stream.IntStream intStream16 = random11.ints();
        java.util.Random random18 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles((long) 10);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random18.nextBytes(byteArray24);
        random11.nextBytes(byteArray24);
        random7.nextBytes(byteArray24);
        random1.nextBytes(byteArray24);
        int int29 = random1.nextInt();
        java.util.Random random30 = new java.util.Random();
        java.util.stream.LongStream longStream31 = random30.longs();
        float float32 = random30.nextFloat();
        java.util.stream.IntStream intStream33 = random30.ints();
        int int34 = random30.nextInt();
        random30.setSeed((long) (-1155869325));
        java.util.stream.IntStream intStream37 = random30.ints();
        java.util.stream.DoubleStream doubleStream40 = random30.doubles((double) (-682588711), (double) 0.113836765f);
        java.util.stream.IntStream intStream43 = random30.ints((-509927405), 2088989465);
        java.util.Random random45 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream47 = random45.doubles((long) 10);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random45.nextBytes(byteArray51);
        random30.nextBytes(byteArray51);
        random1.nextBytes(byteArray51);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1157793070) + "'", int14 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[20, -65, 1]");
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-820187910) + "'", int29 == (-820187910));
        org.junit.Assert.assertNotNull(longStream31);
// flaky:         org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.89178556f + "'", float32 == 0.89178556f);
        org.junit.Assert.assertNotNull(intStream33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-3446641) + "'", int34 == (-3446641));
        org.junit.Assert.assertNotNull(intStream37);
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertNotNull(intStream43);
        org.junit.Assert.assertNotNull(doubleStream47);
        org.junit.Assert.assertNotNull(byteArray51);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[2, 101, 89]");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder11 = builder8.clearExtensions();
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("US");
        java.util.Locale.Builder builder14 = builder8.clear();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setLocale(locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        java.lang.String str26 = locale15.toLanguageTag();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-TW" + "'", str26, "zh-TW");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.util.Locale locale3 = new java.util.Locale("Japon", "und-DE", "\u6cd5\u6587");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.lang.String str10 = locale8.getExtension('x');
        java.lang.String str11 = locale4.getDisplayVariant(locale8);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale8.getDisplayScript(locale12);
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.lang.String str20 = locale18.getExtension('x');
        java.util.Locale.setDefault(locale18);
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.lang.String str23 = locale18.getDisplayLanguage(locale22);
        java.lang.String str24 = locale8.getDisplayCountry(locale22);
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale8.getDisplayScript(locale25);
        java.lang.String str27 = locale25.getISO3Country();
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        java.lang.String str29 = locale28.getDisplayScript();
        java.lang.String str30 = locale28.getDisplayScript();
        java.lang.String str31 = locale28.getVariant();
        java.lang.String str32 = locale28.getISO3Language();
        java.lang.String str33 = locale25.getDisplayName(locale28);
        java.util.Set<java.lang.Character> charSet34 = locale28.getExtensionKeys();
        java.util.Locale locale35 = locale28.stripExtensions();
        java.lang.String str36 = locale3.getDisplayScript(locale35);
        java.util.Locale locale37 = java.util.Locale.FRENCH;
        java.lang.String str38 = locale37.getDisplayName();
        java.lang.String str40 = locale37.getUnicodeLocaleType("TW");
        java.lang.String str41 = locale35.getDisplayName(locale37);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr" + "'", str13, "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "jpn" + "'", str32, "jpn");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u82f1\u8a9e" + "'", str33, "\u82f1\u8a9e");
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "French" + "'", str38, "French");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "japonais (Japon)" + "'", str41, "japonais (Japon)");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("gb");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        java.util.Locale.Builder builder21 = builder8.clearExtensions();
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
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("TW", (double) 0.7651849f);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        java.util.Random random1 = new java.util.Random((long) 723195425);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("");
        java.lang.String str27 = locale26.getLanguage();
        java.lang.String str28 = locale22.getDisplayScript(locale26);
        java.lang.String str29 = locale22.getISO3Country();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale22);
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
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en_CA", 0.19287644510085045d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_ca");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Address address3 = faker0.address();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker0.resolve("\u82f1\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(address3);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getDisplayVariant();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
        java.lang.String str11 = locale7.getDisplayScript();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7);
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        boolean boolean22 = locale20.hasExtensions();
        java.lang.String str23 = locale20.getDisplayLanguage();
        java.lang.String str24 = locale7.getDisplayLanguage(locale20);
        java.lang.String str25 = locale20.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "French" + "'", str23, "French");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fran\347ais" + "'", str24, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "fr" + "'", str25, "fr");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.util.Locale.setDefault(category9, locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category9);
        java.util.Locale locale15 = java.util.Locale.getDefault(category9);
        java.util.Locale locale16 = java.util.Locale.getDefault(category9);
        java.util.Random random17 = new java.util.Random();
        java.util.stream.LongStream longStream18 = random17.longs();
        float float19 = random17.nextFloat();
        java.util.stream.IntStream intStream20 = random17.ints();
        int int21 = random17.nextInt();
        random17.setSeed((long) (-1155869325));
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale16, random17);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale5, random17);
        java.util.stream.DoubleStream doubleStream26 = random17.doubles();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
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
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.14334232f + "'", float19 == 0.14334232f);
        org.junit.Assert.assertNotNull(intStream20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1292805293) + "'", int21 == (-1292805293));
        org.junit.Assert.assertNotNull(doubleStream26);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        java.util.Random random1 = new java.util.Random((long) 1947844456);
        long long2 = random1.nextLong();
        java.util.stream.IntStream intStream5 = random1.ints((-1030689906), (-266083962));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3781791188705226281L + "'", long2 == 3781791188705226281L);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale3.getDisplayLanguage();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category11, locale15);
        java.util.Locale.Builder builder17 = builder10.setLocale(locale15);
        java.util.Locale.Builder builder19 = builder17.setScript("");
        java.util.Locale.Builder builder22 = builder17.setExtension('u', "Japan");
        java.util.Locale locale23 = builder22.build();
        java.lang.String str24 = locale3.getDisplayName(locale23);
        java.lang.String str25 = locale23.getISO3Country();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.App app7 = faker0.app();
        com.github.javafaker.Address address8 = faker0.address();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.util.Locale locale3 = new java.util.Locale("TW", "English", "ITA");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("Korean");
        java.lang.String str6 = locale3.getDisplayLanguage(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale5.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "tw_ENGLISH_ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "korean");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Twi" + "'", str6, "Twi");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("CN", "zh-TW", "en_CA");
        java.lang.String str7 = locale0.getDisplayVariant(locale6);
        java.util.Random random8 = new java.util.Random();
        java.util.stream.LongStream longStream9 = random8.longs();
        float float10 = random8.nextFloat();
        java.util.stream.IntStream intStream11 = random8.ints();
        java.util.stream.LongStream longStream15 = random8.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.LongStream longStream18 = random8.longs((long) (-266083962), (long) 'a');
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale0, random8);
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale6.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5866872f + "'", float10 == 0.5866872f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream18);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.util.Random random1 = new java.util.Random((long) (-910502427));
        long long2 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-845881371119552628L) + "'", long2 == (-845881371119552628L));
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
        java.util.Locale locale36 = new java.util.Locale("und", "French", "italien (Italie)");
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder38 = builder13.setLocale(locale36);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRENCH [at index 0]");
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
        org.junit.Assert.assertEquals(locale36.toString(), "und_FRENCH_italien (Italie)");
        org.junit.Assert.assertNotNull(charSet37);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        java.lang.String str6 = faker0.regexify("\u6cd5\u6587");
        java.lang.String str8 = faker0.letterify("zh");
        com.github.javafaker.Code code9 = faker0.code();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        java.util.Random random1 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream6 = random1.ints((-1332689415), 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random1.longs((long) 1686023285, (long) (-290302496), (-6274663997757565653L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.regexify("italien (italie)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italien italie" + "'", str7, "italien italie");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        java.util.Random random1 = new java.util.Random((long) '4');
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 0, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random1.doubles((long) (-125456132));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet29 = locale27.getExtensionKeys();
        java.util.Locale.setDefault(category26, locale27);
        java.util.Locale locale31 = java.util.Locale.getDefault(category26);
        java.util.Locale locale32 = java.util.Locale.getDefault(category26);
        java.util.Locale locale33 = java.util.Locale.getDefault(category26);
        java.util.Locale locale34 = java.util.Locale.getDefault(category26);
        java.util.Locale locale35 = java.util.Locale.getDefault(category26);
        java.lang.String str36 = locale24.getDisplayScript(locale35);
        java.util.Random random38 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream41 = random38.doubles((-0.4996932076353699d), 0.7924908613121775d);
        double double42 = random38.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(locale24, random38);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.8746788966462123d + "'", double42 == 0.8746788966462123d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        java.util.stream.IntStream intStream6 = random1.ints();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.lang.String str13 = locale11.getExtension('x');
        java.lang.String str14 = locale7.getDisplayVariant(locale11);
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str16 = locale11.getDisplayScript(locale15);
        java.util.Locale locale17 = locale15.stripExtensions();
        java.util.Locale locale21 = new java.util.Locale("", "", "");
        java.lang.String str23 = locale21.getExtension('x');
        java.util.Locale.setDefault(locale21);
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.lang.String str26 = locale21.getDisplayLanguage(locale25);
        boolean boolean27 = locale25.hasExtensions();
        java.lang.String str28 = locale25.getDisplayVariant();
        java.lang.String str29 = locale15.getDisplayCountry(locale25);
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale31 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleAttributes();
        java.util.Locale locale33 = locale31.stripExtensions();
        java.lang.String str34 = locale31.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale31);
        java.util.Locale locale36 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chine" + "'", str29, "Chine");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ja");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Color color9 = faker0.color();
        java.lang.String str11 = faker0.letterify("zh");
        com.github.javafaker.Hacker hacker12 = faker0.hacker();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
        org.junit.Assert.assertNotNull(hacker12);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setRegion("\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: X-LVARIANT-JPN (JPN,??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale.Builder builder14 = builder9.setScript("");
        java.util.Locale.Builder builder16 = builder14.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder19 = builder14.setExtension('u', "");
        java.util.Locale.Builder builder22 = builder19.setExtension('u', "");
        java.util.Locale locale23 = builder19.build();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.setVariant("");
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        java.util.Locale locale28 = builder26.build();
        java.lang.String str29 = locale23.getDisplayVariant(locale28);
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.lang.String str34 = locale28.getDisplayLanguage(locale33);
        java.util.Locale locale37 = new java.util.Locale("zh-cn", "");
        java.lang.String str39 = locale37.getExtension('x');
        java.lang.String str40 = locale33.getDisplayName(locale37);
        java.util.Set<java.lang.String> strSet41 = locale37.getUnicodeLocaleKeys();
        java.lang.String str42 = locale7.getDisplayVariant(locale37);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale37.toString(), "zh-cn");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        com.github.javafaker.Business business7 = faker0.business();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setUnicodeLocaleKeyword("en_ca", "Chinook jargon (KOREAN)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: en_ca [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
        boolean boolean14 = locale1.hasExtensions();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
        java.util.Locale locale27 = locale14.stripExtensions();
        java.lang.String str28 = locale14.getDisplayName();
        java.util.Set<java.lang.Character> charSet29 = locale14.getExtensionKeys();
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
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charSet29);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream5 = random0.ints();
        double double6 = random0.nextDouble();
        int int7 = random0.nextInt();
        boolean boolean8 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9917709f + "'", float2 == 0.9917709f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9330642462683457d + "'", double6 == 0.9330642462683457d);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-215001265) + "'", int7 == (-215001265));
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale locale11 = builder5.build();
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = locale11.toLanguageTag();
        java.util.Random random15 = new java.util.Random(100L);
        double double16 = random15.nextGaussian();
        double double17 = random15.nextDouble();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random15);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale11, random15);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "und-a-chinese-u-china" + "'", str13, "und-a-chinese-u-china");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6246292191371761d + "'", double16 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6671595726539502d + "'", double17 == 0.6671595726539502d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        random1.setSeed((long) (byte) 100);
        double double6 = random1.nextDouble();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7220096548596434d + "'", double6 == 0.7220096548596434d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        java.util.Random random1 = new java.util.Random((long) (-1258941448));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.lang.String str8 = locale4.getDisplayName();
        java.lang.Object obj9 = locale4.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream12 = random1.longs((long) 78707950, (long) 2002825273);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.util.Locale locale3 = new java.util.Locale("de", "FRA", "English (United Kingdom)");
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale3.getLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "de_FRA_English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        java.util.Locale locale2 = new java.util.Locale("\u672a\u5b9a\u8bed\u79cd", "Japan");
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "\u672a\u5b9a\u8bed\u79cd_JAPAN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JAPAN" + "'", str4, "JAPAN");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.App app6 = faker0.app();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Englisch (Kanada)", (double) 0.59456676f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=englisch (kanada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        java.util.Locale locale3 = new java.util.Locale("jpn_HI! CHINESE CHINA", "GB", "ita");
        org.junit.Assert.assertEquals(locale3.toString(), "jpn_hi! chinese china_GB_ita");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        java.util.Random random1 = new java.util.Random(7616895062557318172L);
        java.util.stream.IntStream intStream3 = random1.ints((long) 9);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale locale11 = builder5.build();
        java.util.Locale.Builder builder12 = builder5.clear();
        java.util.Locale.Builder builder14 = builder5.setVariant("Japon");
        java.util.Locale.Builder builder16 = builder14.addUnicodeLocaleAttribute("FRA");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        int int7 = random1.nextInt();
        double double8 = random1.nextDouble();
        int int9 = random1.nextInt();
        java.util.stream.LongStream longStream10 = random1.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.3325983427023256d) + "'", double6 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1408064384) + "'", int7 == (-1408064384));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.24411725056425315d + "'", double8 == 0.24411725056425315d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-778209333) + "'", int9 == (-778209333));
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Options options3 = faker0.options();
        java.lang.String str5 = faker0.numerify("zh");
        java.lang.String str7 = faker0.letterify("us_ZH-CN (JPN)");
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us_ZH-CN (JPN)" + "'", str7, "us_ZH-CN (JPN)");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", 0.0d);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        double double6 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Code code3 = faker0.code();
        com.github.javafaker.Number number4 = faker0.number();
        java.lang.String str6 = faker0.regexify("Korean (South Korea)");
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Korean South Korea" + "'", str6, "Korean South Korea");
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zho");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        java.lang.String str19 = faker16.letterify("CA");
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.24270266f + "'", float11 == 0.24270266f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1362084231) + "'", int13 == (-1362084231));
        org.junit.Assert.assertNotNull(hacker17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CA" + "'", str19, "CA");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.util.Random random1 = new java.util.Random((-4071542935431320084L));
        float float2 = random1.nextFloat();
        float float3 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.91447496f + "'", float2 == 0.91447496f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.4530453f + "'", float3 == 0.4530453f);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("hi! (hi!)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! (hi!) [at index 0]");
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
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder9 = builder5.setLanguage("French");
        java.util.Locale locale10 = builder9.build();
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.lang.String str19 = locale17.getExtension('x');
        java.lang.String str20 = locale13.getDisplayVariant(locale17);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getLanguage();
        java.lang.String str23 = locale17.getDisplayScript(locale21);
        java.lang.String str24 = locale12.getDisplayScript(locale17);
        java.util.Locale locale27 = new java.util.Locale("de", "FRA");
        java.lang.String str28 = locale17.getDisplayVariant(locale27);
        java.lang.String str29 = locale10.getDisplayVariant(locale17);
        java.lang.String str30 = locale1.getDisplayLanguage(locale17);
        java.util.Set<java.lang.String> strSet31 = locale17.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "french");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "french" + "'", str11, "french");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr" + "'", str22, "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale27.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.DateAndTime dateAndTime6 = faker5.date();
        java.lang.String str8 = faker5.numerify("_FR");
        com.github.javafaker.Options options9 = faker5.options();
        com.github.javafaker.Lorem lorem10 = faker5.lorem();
        com.github.javafaker.Internet internet11 = faker5.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_FR" + "'", str8, "_FR");
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(internet11);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 0.57631266f);
        boolean boolean4 = languageRange2.equals((java.lang.Object) (-1641365002));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u610f\u5927\u5229\u6587", (double) 0.110840976f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
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
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder34 = builder32.setVariant("");
        java.util.Locale.Builder builder35 = builder32.clear();
        java.util.Locale locale36 = builder35.build();
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        java.lang.String str38 = locale36.getDisplayName(locale37);
        java.util.Set<java.lang.String> strSet39 = locale37.getUnicodeLocaleKeys();
        java.lang.String str40 = locale27.getDisplayName(locale37);
        java.lang.String str41 = locale37.getScript();
        java.lang.String str42 = locale37.getVariant();
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
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "francese" + "'", str40, "francese");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        java.util.Locale locale2 = new java.util.Locale("jpn", "\ud504\ub791\uc2a4\uc5b4");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\ud504\ub791\uc2a4\uc5b4");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        java.util.stream.LongStream longStream7 = random1.longs(1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 431529176 + "'", int5 == 431529176);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getDisplayScript();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("und");
        java.lang.String str9 = locale7.getExtension('u');
        java.lang.String str10 = locale0.getDisplayScript(locale7);
        java.lang.String str11 = locale0.getCountry();
        java.util.Set<java.lang.Character> charSet12 = locale0.getExtensionKeys();
        boolean boolean14 = locale0.equals((java.lang.Object) 795965107);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale7.toString(), "und");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setVariant("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: English (United Kingdom) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet9 = locale3.getUnicodeLocaleKeys();
        java.lang.String str10 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        java.lang.String str8 = faker0.bothify("France");
        java.lang.String str10 = faker0.letterify("china");
        com.github.javafaker.Lorem lorem11 = faker0.lorem();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "France" + "'", str8, "France");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "china" + "'", str10, "china");
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale.Builder builder9 = builder6.setExtension('x', "FRA");
        java.util.Locale.Builder builder11 = builder6.setLanguage("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        java.util.Random random1 = new java.util.Random((long) (-1900217354));
        long long2 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-483325962133783470L) + "'", long2 == (-483325962133783470L));
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("JPN", 0.8058952358350092d);
        java.util.Random random4 = new java.util.Random(100L);
        java.util.stream.LongStream longStream6 = random4.longs((long) (short) 0);
        java.util.Random random8 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream10 = random8.doubles((long) 10);
        int int11 = random8.nextInt();
        java.util.stream.DoubleStream doubleStream12 = random8.doubles();
        java.util.stream.IntStream intStream13 = random8.ints();
        java.util.Random random15 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream17 = random15.doubles((long) 10);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random15.nextBytes(byteArray21);
        random8.nextBytes(byteArray21);
        random4.nextBytes(byteArray21);
        boolean boolean25 = languageRange2.equals((java.lang.Object) byteArray21);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1157793070) + "'", int11 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-42, -97, -43]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        com.github.javafaker.Book book6 = faker0.book();
        com.github.javafaker.Finance finance7 = faker0.finance();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italienisch", (double) 540195050);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.4019505E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        java.util.Locale locale2 = new java.util.Locale("zh,CN", "Italienisch");
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String str4 = locale2.getDisplayName();
        java.util.Random random5 = new java.util.Random();
        java.util.stream.LongStream longStream8 = random5.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream10 = random5.doubles((long) '#');
        boolean boolean11 = random5.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale2, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh,cn_ITALIENISCH could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "zh,cn_ITALIENISCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh,cn (ITALIENISCH)" + "'", str4, "zh,cn (ITALIENISCH)");
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        java.util.stream.LongStream longStream6 = random1.longs();
        java.util.stream.DoubleStream doubleStream7 = random1.doubles();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 431529176 + "'", int5 == 431529176);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder10 = builder7.setExtension('u', "chinois");
        java.util.Locale.Builder builder12 = builder7.setScript("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinese (China)", (double) (-1296110853));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.296110853E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        java.util.Locale locale2 = new java.util.Locale("x-lvariant-jpn", "Italian");
        org.junit.Assert.assertEquals(locale2.toString(), "x-lvariant-jpn_ITALIAN");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale8 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str9 = locale5.getDisplayCountry(locale8);
        java.util.Random random10 = new java.util.Random();
        java.util.stream.LongStream longStream13 = random10.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream15 = random10.doubles((long) '#');
        boolean boolean16 = random10.nextBoolean();
        int int17 = random10.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale5, random10);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale8.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 340535829 + "'", int17 == 340535829);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.util.Locale locale1 = new java.util.Locale("zh,cn (ITALIENISCH)");
        org.junit.Assert.assertEquals(locale1.toString(), "zh,cn (italienisch)");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setVariant("french");
        java.util.Locale.Builder builder9 = builder5.setRegion("US");
        java.util.Locale locale10 = builder9.build();
        java.lang.String str11 = locale10.getVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "_US_french");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "french" + "'", str11, "french");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.bothify("English (United Kingdom)");
        com.github.javafaker.Finance finance8 = faker0.finance();
        java.lang.String str10 = faker0.regexify("\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English (United Kingdom)" + "'", str7, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
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
        java.util.Locale.Builder builder25 = builder10.setLanguageTag("French");
        java.util.Locale.Builder builder27 = builder25.setLanguage("China");
        java.util.Locale.Builder builder29 = builder25.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder31 = builder25.setRegion("CHN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CHN [at index 0]");
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("de");
        java.util.Locale.Builder builder11 = builder8.setExtension('x', "Italian");
        java.util.Locale.Builder builder13 = builder11.setRegion("tw");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        java.util.Locale locale3 = new java.util.Locale("Japon", "und-DE", "\u6cd5\u6587");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.lang.String str10 = locale8.getExtension('x');
        java.lang.String str11 = locale4.getDisplayVariant(locale8);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale8.getDisplayScript(locale12);
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.lang.String str20 = locale18.getExtension('x');
        java.util.Locale.setDefault(locale18);
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.lang.String str23 = locale18.getDisplayLanguage(locale22);
        java.lang.String str24 = locale8.getDisplayCountry(locale22);
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale8.getDisplayScript(locale25);
        java.lang.String str27 = locale25.getISO3Country();
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        java.lang.String str29 = locale28.getDisplayScript();
        java.lang.String str30 = locale28.getDisplayScript();
        java.lang.String str31 = locale28.getVariant();
        java.lang.String str32 = locale28.getISO3Language();
        java.lang.String str33 = locale25.getDisplayName(locale28);
        java.util.Set<java.lang.Character> charSet34 = locale28.getExtensionKeys();
        java.util.Locale locale35 = locale28.stripExtensions();
        java.lang.String str36 = locale3.getDisplayScript(locale35);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.lang.String str43 = locale41.getExtension('x');
        java.lang.String str44 = locale37.getDisplayVariant(locale41);
        java.util.Locale locale45 = java.util.Locale.FRENCH;
        java.lang.String str46 = locale45.getLanguage();
        java.lang.String str47 = locale41.getDisplayScript(locale45);
        java.util.Locale locale51 = new java.util.Locale("", "", "");
        java.lang.String str53 = locale51.getExtension('x');
        java.util.Locale.setDefault(locale51);
        java.util.Locale locale55 = java.util.Locale.FRENCH;
        java.lang.String str56 = locale51.getDisplayLanguage(locale55);
        java.lang.String str57 = locale41.getDisplayCountry(locale55);
        java.util.Locale locale58 = java.util.Locale.ENGLISH;
        java.lang.String str59 = locale41.getDisplayScript(locale58);
        java.lang.String str60 = locale58.getDisplayScript();
        java.util.Random random62 = new java.util.Random((long) (short) 100);
        com.github.javafaker.Faker faker63 = new com.github.javafaker.Faker(locale58, random62);
        java.util.Random random65 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream67 = random65.doubles((long) 10);
        int int68 = random65.nextInt();
        long long69 = random65.nextLong();
        com.github.javafaker.Faker faker70 = new com.github.javafaker.Faker(locale58, random65);
        com.github.javafaker.Name name71 = faker70.name();
        com.github.javafaker.Code code72 = faker70.code();
        boolean boolean73 = locale35.equals((java.lang.Object) faker70);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr" + "'", str13, "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "jpn" + "'", str32, "jpn");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u82f1\u8a9e" + "'", str33, "\u82f1\u8a9e");
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "fr" + "'", str46, "fr");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(doubleStream67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1157793070) + "'", int68 == (-1157793070));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 8220501950349663546L + "'", long69 == 8220501950349663546L);
        org.junit.Assert.assertNotNull(name71);
        org.junit.Assert.assertNotNull(code72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        java.lang.String str5 = faker0.letterify("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker0.resolve("\u82f1\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale.Builder builder15 = builder11.setLanguage("French");
        java.util.Locale locale16 = builder15.build();
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale23.getExtension('x');
        java.lang.String str26 = locale19.getDisplayVariant(locale23);
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.lang.String str28 = locale27.getLanguage();
        java.lang.String str29 = locale23.getDisplayScript(locale27);
        java.lang.String str30 = locale18.getDisplayScript(locale23);
        java.util.Locale locale33 = new java.util.Locale("de", "FRA");
        java.lang.String str34 = locale23.getDisplayVariant(locale33);
        java.lang.String str35 = locale16.getDisplayVariant(locale23);
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder38 = builder36.setVariant("");
        java.util.Locale.Builder builder39 = builder36.clear();
        java.util.Locale.Builder builder41 = builder36.setScript("");
        java.util.Locale.Builder builder43 = builder41.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder46 = builder41.setExtension('u', "");
        java.util.Locale.Builder builder49 = builder46.setExtension('u', "");
        java.util.Locale locale50 = builder46.build();
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder52 = builder46.setLocale(locale51);
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder55 = builder53.setVariant("");
        java.util.Locale.Builder builder57 = builder55.setVariant("");
        java.util.Locale locale58 = java.util.Locale.PRC;
        java.lang.String str59 = locale58.getVariant();
        java.util.Locale.Builder builder60 = builder55.setLocale(locale58);
        java.lang.String str61 = locale51.getDisplayLanguage(locale58);
        java.lang.String str62 = locale51.getCountry();
        java.lang.String str63 = locale23.getDisplayName(locale51);
        java.util.Locale.Builder builder64 = builder0.setLocale(locale23);
        java.util.Locale.Builder builder66 = builder64.setLanguageTag("x-lvariant-JPN");
        java.util.Locale.Builder builder67 = builder66.clear();
        java.util.Locale.Builder builder68 = builder67.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder70 = builder67.removeUnicodeLocaleAttribute("chinois (Chine)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: chinois (Chine) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "french");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "french" + "'", str17, "french");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr" + "'", str28, "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale33.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u4e2d\u6587" + "'", str61, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "TW" + "'", str62, "TW");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.lang.String str4 = locale1.getDisplayVariant();
        java.lang.String str5 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        java.util.Locale locale3 = new java.util.Locale("de", "FRA", "English (United Kingdom)");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder10 = builder6.setLanguage("French");
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale3.getDisplayLanguage(locale11);
        java.lang.String str13 = locale11.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "de_FRA_English (United Kingdom)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "french");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "German" + "'", str12, "German");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        float float7 = random1.nextFloat();
        random1.setSeed((long) 1358566768);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.44563425f + "'", float7 == 0.44563425f);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale4.getDisplayLanguage(locale8);
        java.lang.String str10 = locale8.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale15 = new java.util.Locale("FRA", "China", "zh_CN");
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("ITA");
        java.util.Locale.setDefault(category0, locale18);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale15.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ita");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
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
        java.util.Locale locale66 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet67);
        java.util.Locale locale69 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet70 = locale69.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet70);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap72 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap72);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList73, strMap74);
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
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(languageRangeList73);
        org.junit.Assert.assertNotNull(languageRangeList75);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        boolean boolean5 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        java.util.Random random1 = new java.util.Random((long) 977291951);
        java.util.stream.IntStream intStream4 = random1.ints((-1429538713), 2043360656);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((double) (-1408064384), (double) (-1382879107));
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "us");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Internet internet3 = faker0.internet();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Book book5 = faker0.book();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker0.resolve("japan");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(book5);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        java.util.Locale locale3 = new java.util.Locale("CAN", "\u6cd5\u56fd)", "zh_CN");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u56fd)_zh_CN");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        java.util.Locale.Builder builder25 = builder10.setLanguageTag("French");
        java.util.Locale.Builder builder27 = builder25.setLanguage("China");
        java.util.Locale.Builder builder29 = builder25.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder31 = builder25.setRegion("\u97d3\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream12 = random1.longs((long) (-1528827163), (long) 1);
        java.util.stream.IntStream intStream15 = random1.ints(591553211, 2002825273);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random1);
        java.lang.String str18 = faker16.regexify("GB");
        com.github.javafaker.Business business19 = faker16.business();
        com.github.javafaker.Hacker hacker20 = faker16.hacker();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GB" + "'", str18, "GB");
        org.junit.Assert.assertNotNull(business19);
        org.junit.Assert.assertNotNull(hacker20);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random1.longs((long) (-1165217776), (long) 100, (long) 1284755126);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
        double double32 = random1.nextDouble();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream34 = random1.doubles();
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.3327170559595112d + "'", double32 == 0.3327170559595112d);
        org.junit.Assert.assertNotNull(doubleStream34);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        java.lang.String str12 = locale10.getDisplayVariant();
        java.lang.String str13 = locale0.getDisplayCountry(locale10);
        java.util.Random random15 = new java.util.Random((long) (byte) 10);
        long long16 = random15.nextLong();
        java.util.stream.LongStream longStream18 = random15.longs((long) (short) 1);
        int int19 = random15.nextInt();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0, random15);
        boolean boolean21 = random15.nextBoolean();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Japon" + "'", str13, "Japon");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-4972683369271453960L) + "'", long16 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1107254586 + "'", int19 == 1107254586);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.util.Locale locale3 = new java.util.Locale("italien (Italie)", "ITA", "zh_CN");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale locale9 = new java.util.Locale("", "", "");
        java.lang.String str11 = locale9.getExtension('x');
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.lang.String str14 = locale9.getDisplayLanguage(locale13);
        java.lang.String str15 = locale9.getISO3Language();
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.lang.String str21 = locale19.getExtension('x');
        java.util.Locale.setDefault(locale19);
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.lang.String str24 = locale19.getDisplayLanguage(locale23);
        java.lang.String str25 = locale9.getDisplayVariant(locale19);
        java.util.Locale locale26 = locale9.stripExtensions();
        java.lang.String str27 = locale26.getLanguage();
        java.lang.String str28 = locale26.getDisplayCountry();
        java.lang.String str29 = locale3.getDisplayVariant(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ITA");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "italien (italie)_ITA_zh_CN");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh,CN" + "'", str29, "zh,CN");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Italian", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Locale locale5 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode7 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet6, filteringMode7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.parse("Korean", strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder15.setVariant("");
        java.util.Locale locale18 = builder15.build();
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.util.Locale locale26 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale22.getDisplayLanguage(locale26);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.util.Locale locale32 = new java.util.Locale("", "", "");
        java.util.Locale locale36 = new java.util.Locale("", "", "");
        java.lang.String str37 = locale32.getDisplayLanguage(locale36);
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.lang.String str43 = locale41.getExtension('x');
        java.util.Locale.setDefault(locale41);
        java.util.Locale locale46 = new java.util.Locale("hi!");
        java.util.Locale locale47 = locale46.stripExtensions();
        java.lang.String str48 = locale47.getISO3Country();
        java.util.Locale locale52 = new java.util.Locale("", "", "");
        java.util.Locale locale56 = new java.util.Locale("", "", "");
        java.lang.String str57 = locale52.getDisplayLanguage(locale56);
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.util.Locale locale60 = locale59.stripExtensions();
        java.util.Locale locale62 = new java.util.Locale("hi!");
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.util.Locale locale66 = new java.util.Locale("hi!");
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale18, locale22, locale28, locale36, locale41, locale47, locale56, locale59, locale62, locale64, locale66 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.Locale.FilteringMode filteringMode71 = null;
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList69, filteringMode71);
        java.util.Locale locale73 = java.util.Locale.lookup(languageRangeList11, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList75 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList69, filteringMode74);
        java.util.Locale locale78 = new java.util.Locale("Korean (South Korea)", "French");
        java.util.Set<java.lang.String> strSet79 = locale78.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet79);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + filteringMode7 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode7.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals(locale46.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertEquals(locale66.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNull(locale73);
        org.junit.Assert.assertTrue("'" + filteringMode74 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode74.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList75);
        org.junit.Assert.assertEquals(locale78.toString(), "korean (south korea)_FRENCH");
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(strList80);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.lang.String str10 = locale6.getExtension('a');
        java.util.Set<java.lang.String> strSet11 = locale6.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet12 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale6.getVariant();
        java.util.Set<java.lang.String> strSet14 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale0.getDisplayVariant(locale6);
        java.lang.String str16 = locale6.getLanguage();
        java.lang.String str17 = locale6.getISO3Language();
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale6, random18);
        java.util.Set<java.lang.String> strSet20 = locale6.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it" + "'", str16, "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ita" + "'", str17, "ita");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        int int8 = random0.nextInt();
        double double9 = random0.nextDouble();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.66708755f + "'", float2 == 0.66708755f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 763927369 + "'", int8 == 763927369);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5748828704555514d + "'", double9 == 0.5748828704555514d);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str3 = languageRange2.getRange();
        java.lang.String str4 = languageRange2.getRange();
        java.lang.String str5 = languageRange2.getRange();
        java.lang.String str6 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        java.util.Locale locale3 = new java.util.Locale("hi! (hi!)", "\u4e2d\u56fd", "\u97d3\u6587");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd\u97d3\u6587");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        java.util.Random random1 = new java.util.Random((long) 27);
        long long2 = random1.nextLong();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        random1.setSeed((long) 241694613);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4947896108136290151L) + "'", long2 == (-4947896108136290151L));
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
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
        java.util.Set<java.lang.String> strSet24 = locale21.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale21);
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
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.IntStream intStream5 = random0.ints((long) (byte) 100);
        double double6 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random0.longs((long) 1894354479, (-5108187057464061899L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7999955f + "'", float2 == 0.7999955f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.40089191764634036d + "'", double6 == 0.40089191764634036d);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale locale14 = builder11.build();
        java.util.Locale.Builder builder16 = builder11.setLanguage("fr");
        java.util.Locale.Builder builder19 = builder11.setExtension('x', "fr");
        java.util.Locale.Builder builder21 = builder19.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder24 = builder19.setExtension('a', "italien");
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.LongStream longStream27 = random26.longs();
        java.util.stream.LongStream longStream29 = random26.longs(0L);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale25, random26);
        java.util.Locale locale34 = new java.util.Locale("", "", "");
        java.lang.String str36 = locale34.getExtension('x');
        java.util.Locale.setDefault(locale34);
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.lang.String str39 = locale34.getDisplayLanguage(locale38);
        java.lang.String str40 = locale38.getDisplayVariant();
        java.lang.String str41 = locale25.getDisplayCountry(locale38);
        java.util.Locale.Builder builder42 = builder24.setLocale(locale38);
        java.util.Locale.setDefault(category0, locale38);
        java.util.Locale locale47 = new java.util.Locale("", "", "");
        java.util.Locale locale51 = new java.util.Locale("", "", "");
        java.lang.String str52 = locale47.getDisplayLanguage(locale51);
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.util.Locale locale55 = locale54.stripExtensions();
        java.util.Set<java.lang.Character> charSet56 = locale54.getExtensionKeys();
        java.lang.String str57 = locale54.toLanguageTag();
        java.lang.String str58 = locale51.getDisplayName(locale54);
        java.lang.String str59 = locale38.getDisplayName(locale51);
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Chine" + "'", str41, "Chine");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "und" + "'", str57, "und");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "French" + "'", str59, "French");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        java.util.Locale locale2 = new java.util.Locale("us", "zh-cn (JPN)");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.lang.String str5 = locale4.getLanguage();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.util.Locale locale14 = builder9.build();
        java.lang.String str15 = locale4.getDisplayName(locale14);
        java.lang.String str16 = locale2.getDisplayLanguage(locale4);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: us_ZH-CN (JPN) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "us_ZH-CN (JPN)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "us" + "'", str16, "us");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("HI!", (double) 0.113836765f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        java.util.Locale locale3 = new java.util.Locale("", "chinese (china) (ITALIEN (ITALIE),Chinese)", "fr-FR");
        org.junit.Assert.assertEquals(locale3.toString(), "_CHINESE (CHINA) (ITALIEN (ITALIE),CHINESE)_fr-FR");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Company company6 = faker5.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Code code5 = faker0.code();
        java.lang.String str7 = faker0.regexify("\u6cd5\u6587");
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Internet internet9 = faker0.internet();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587" + "'", str7, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(internet9);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("x-lvariant-zh-CN", (double) 0.5973975f);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream5 = random1.ints((long) (short) 1);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles(7778920967000952751L, (double) 0.3526249f, 0.5892154926473774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.util.Locale locale2 = new java.util.Locale("french", "fr");
        java.util.Locale locale5 = new java.util.Locale("hi!", "Chinese (China)");
        java.util.Locale locale7 = new java.util.Locale("\u6cd5\u6587");
        java.lang.String str8 = locale5.getDisplayName(locale7);
        java.lang.String str9 = locale7.getDisplayName();
        java.lang.String str10 = locale2.getDisplayVariant(locale7);
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = locale11.getDisplayLanguage();
        java.util.Locale locale16 = locale11.stripExtensions();
        java.util.Locale locale18 = new java.util.Locale("und");
        java.lang.String str20 = locale18.getExtension('u');
        java.lang.String str21 = locale11.getDisplayScript(locale18);
        java.lang.String str22 = locale11.getCountry();
        java.lang.String str23 = locale7.getDisplayLanguage(locale11);
        org.junit.Assert.assertEquals(locale2.toString(), "french_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_CHINESE (CHINA)");
        org.junit.Assert.assertEquals(locale7.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (CHINESE (CHINA))" + "'", str8, "hi! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587" + "'", str9, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Englisch (Kanada)" + "'", str13, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale18.toString(), "und");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CA" + "'", str22, "CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u6587" + "'", str23, "\u6cd5\u6587");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', (long) (-572239868), (long) 'u');
        java.util.stream.DoubleStream doubleStream13 = random1.doubles(736442293137335911L, 0.0d, (double) 0.57876664f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream15 = random1.longs((long) (-257547732));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-GB", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        boolean boolean6 = random0.nextBoolean();
        int int7 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random0.longs((long) (-99702794), 6875854121430089799L, 4437113781045784766L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1789017745) + "'", int7 == (-1789017745));
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setLanguage("\u65e5\u672c");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
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
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        java.util.Locale locale2 = new java.util.Locale("English", "_FR");
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale2.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "english__FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english (_FR)" + "'", str3, "english (_FR)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) 1957295020, (double) 0.32781136f, (double) 3);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        boolean boolean9 = locale7.hasExtensions();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale.Builder builder16 = builder12.setLanguage("French");
        java.util.Locale locale17 = builder16.build();
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.lang.String str19 = locale17.getDisplayScript();
        java.lang.String str20 = locale7.getDisplayLanguage(locale17);
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("");
        java.lang.String str25 = locale22.getDisplayLanguage(locale24);
        java.lang.String str26 = locale22.getDisplayLanguage();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Random random28 = new java.util.Random();
        java.util.stream.LongStream longStream29 = random28.longs();
        java.util.stream.LongStream longStream31 = random28.longs(0L);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale27, random28);
        java.lang.String str33 = locale27.getDisplayName();
        java.lang.String str34 = locale22.getDisplayVariant(locale27);
        java.util.Locale locale35 = java.util.Locale.CHINESE;
        java.util.Locale locale39 = new java.util.Locale("", "", "");
        java.lang.String str41 = locale39.getExtension('x');
        java.lang.String str42 = locale35.getDisplayVariant(locale39);
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.lang.String str44 = locale43.getLanguage();
        java.lang.String str45 = locale39.getDisplayScript(locale43);
        java.lang.String str46 = locale27.getDisplayLanguage(locale43);
        java.lang.String str47 = locale7.getDisplayScript(locale27);
        boolean boolean48 = locale7.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "french");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "French" + "'", str20, "French");
        org.junit.Assert.assertEquals(locale22.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Chinese (China)" + "'", str33, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "fr" + "'", str44, "fr");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "chinois" + "'", str46, "chinois");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale.setDefault(category6, locale13);
        java.util.Locale locale15 = java.util.Locale.getDefault(category6);
        java.lang.String str16 = locale1.getDisplayName(locale15);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        java.util.Locale locale3 = new java.util.Locale("zh-cn", "Korean South Korea", "");
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cn_KOREAN SOUTH KOREA");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder0.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
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
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
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
        java.lang.String str13 = locale2.getLanguage();
        java.util.Locale locale17 = new java.util.Locale("und", "de", "fr");
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.lang.String str24 = locale22.getExtension('x');
        java.lang.String str25 = locale18.getDisplayVariant(locale22);
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str27 = locale22.getDisplayScript(locale26);
        java.util.Locale locale28 = locale26.stripExtensions();
        java.lang.String str29 = locale17.getDisplayLanguage(locale28);
        java.lang.String str30 = locale2.getDisplayCountry(locale28);
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Locale locale35 = new java.util.Locale("", "", "");
        java.lang.String str37 = locale35.getExtension('x');
        java.lang.String str38 = locale31.getDisplayName(locale35);
        java.lang.String str39 = locale35.getDisplayVariant();
        java.lang.String str40 = locale28.getDisplayName(locale35);
        java.util.Locale locale44 = new java.util.Locale("ita", "", "und");
        java.lang.String str45 = locale44.getDisplayScript();
        java.lang.String str46 = locale35.getDisplayScript(locale44);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6246292191371761d + "'", double6 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.09760425216810112d + "'", double9 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertEquals(locale17.toString(), "und_DE_fr");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u672a\u5b9a\u8bed\u79cd" + "'", str29, "\u672a\u5b9a\u8bed\u79cd");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u56fd" + "'", str30, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "French" + "'", str38, "French");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Chinese (China)" + "'", str40, "Chinese (China)");
        org.junit.Assert.assertEquals(locale44.toString(), "ita__und");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Business business6 = faker0.business();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.Number number8 = faker0.number();
        com.github.javafaker.Book book9 = faker0.book();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = faker0.resolve("fr-FR");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        java.util.Locale locale1 = new java.util.Locale("chinese (china)");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "chinese (china)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinese (china)" + "'", str2, "chinese (china)");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Locale locale8 = new java.util.Locale("GB", "", "Englisch (Kanada)");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet9);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertEquals(locale8.toString(), "gb__Englisch (Kanada)");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
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
        java.lang.String str83 = null; // flaky: faker81.letterify("ja-JP");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = null; // flaky: faker81.resolve("GBR");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "ja-JP" + "'", str83, "ja-JP");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        com.github.javafaker.Business business7 = faker0.business();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.util.Locale locale1 = new java.util.Locale("us_ZH-CN (JPN)");
        org.junit.Assert.assertEquals(locale1.toString(), "us_zh-cn (jpn)");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-TW");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("zh-TW");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str9 = languageRange8.getRange();
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] { languageRange8, languageRange12, languageRange15, languageRange18, languageRange21 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        java.util.Locale locale31 = builder28.build();
        java.util.Locale locale35 = new java.util.Locale("", "", "");
        java.util.Locale locale39 = new java.util.Locale("", "", "");
        java.lang.String str40 = locale35.getDisplayLanguage(locale39);
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.util.Locale locale45 = new java.util.Locale("", "", "");
        java.util.Locale locale49 = new java.util.Locale("", "", "");
        java.lang.String str50 = locale45.getDisplayLanguage(locale49);
        java.util.Locale locale54 = new java.util.Locale("", "", "");
        java.lang.String str56 = locale54.getExtension('x');
        java.util.Locale.setDefault(locale54);
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.util.Locale locale60 = locale59.stripExtensions();
        java.lang.String str61 = locale60.getISO3Country();
        java.util.Locale locale65 = new java.util.Locale("", "", "");
        java.util.Locale locale69 = new java.util.Locale("", "", "");
        java.lang.String str70 = locale65.getDisplayLanguage(locale69);
        java.util.Locale locale72 = new java.util.Locale("hi!");
        java.util.Locale locale73 = locale72.stripExtensions();
        java.util.Locale locale75 = new java.util.Locale("hi!");
        java.util.Locale locale77 = new java.util.Locale("hi!");
        java.util.Locale locale79 = new java.util.Locale("hi!");
        java.util.Locale locale80 = locale79.stripExtensions();
        java.util.Locale[] localeArray81 = new java.util.Locale[] { locale31, locale35, locale41, locale49, locale54, locale60, locale69, locale72, locale75, locale77, locale79 };
        java.util.ArrayList<java.util.Locale> localeList82 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList82, localeArray81);
        java.util.Locale.FilteringMode filteringMode84 = null;
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList82, filteringMode84);
        java.util.Locale locale86 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList82, filteringMode87);
        java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale locale90 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList88);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals(locale72.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertEquals(locale75.toString(), "hi!");
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(localeList85);
// flaky:         org.junit.Assert.assertNotNull(locale86);
// flaky:         org.junit.Assert.assertEquals(locale86.toString(), "fr");
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode87.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNull(locale89);
        org.junit.Assert.assertNull(locale90);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Internet internet3 = faker0.internet();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.Color color6 = faker0.color();
        com.github.javafaker.Name name7 = faker0.name();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random1.nextBytes(byteArray7);
        long long9 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream13 = random1.doubles((long) 1715556003, (double) 0.49201488f, (double) 0.8449292f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random1.longs((long) 1408303951, (long) 1067097704, (long) (-196947104));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8220501950349663546L + "'", long9 == 8220501950349663546L);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        java.util.Locale locale2 = new java.util.Locale("cinese (Cina)", "English");
        java.lang.String str3 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "cinese (cina)_ENGLISH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        java.util.Locale locale3 = new java.util.Locale("ita", "", "und");
        java.util.Locale locale7 = new java.util.Locale("English (United Kingdom)", "italien Italie", "de");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = locale9.getDisplayLanguage(locale10);
        java.lang.String str12 = locale9.getVariant();
        java.lang.String str13 = locale9.getDisplayName();
        java.lang.String str14 = locale9.getDisplayName();
        java.lang.String str15 = locale3.getDisplayCountry(locale9);
        java.util.Locale locale19 = new java.util.Locale("TW", "English", "ITA");
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        java.lang.String str21 = locale20.getDisplayScript();
        java.lang.String str22 = locale20.getDisplayScript();
        java.util.Locale locale26 = new java.util.Locale("", "", "");
        java.lang.String str28 = locale26.getExtension('x');
        java.util.Locale.setDefault(locale26);
        java.util.Locale locale30 = java.util.Locale.FRENCH;
        java.lang.String str31 = locale26.getDisplayLanguage(locale30);
        java.lang.String str32 = locale30.getDisplayVariant();
        java.lang.String str33 = locale20.getDisplayCountry(locale30);
        java.lang.String str34 = locale19.getDisplayName(locale20);
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleKeys();
        java.lang.String str38 = locale35.getExtension('x');
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder41 = builder39.setVariant("");
        java.util.Locale.Builder builder42 = builder39.clear();
        java.util.Locale.Builder builder44 = builder39.setScript("");
        java.util.Locale locale45 = builder39.build();
        java.lang.String str46 = locale35.getDisplayLanguage(locale45);
        java.lang.String str47 = locale20.getDisplayCountry(locale35);
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("");
        java.lang.String str50 = locale49.getLanguage();
        java.util.Locale locale51 = locale49.stripExtensions();
        java.lang.String str52 = locale51.getLanguage();
        java.lang.String str53 = locale20.getDisplayCountry(locale51);
        java.lang.String str54 = locale9.getDisplayVariant(locale20);
        org.junit.Assert.assertEquals(locale3.toString(), "ita__und");
        org.junit.Assert.assertEquals(locale7.toString(), "english (united kingdom)_ITALIEN ITALIE_de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u97d3\u6587" + "'", str11, "\u97d3\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Korean" + "'", str13, "Korean");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Korean" + "'", str14, "Korean");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale19.toString(), "tw_ENGLISH_ITA");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Japon" + "'", str33, "Japon");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)" + "'", str34, "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Chinese" + "'", str46, "Chinese");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u65e5\u672c" + "'", str47, "\u65e5\u672c");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Japan" + "'", str53, "Japan");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
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
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.lang.String str23 = locale20.getExtension('x');
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.setVariant("");
        java.util.Locale.Builder builder27 = builder24.clear();
        java.util.Locale.Builder builder29 = builder24.setScript("");
        java.util.Locale locale30 = builder24.build();
        java.lang.String str31 = locale20.getDisplayLanguage(locale30);
        java.util.Locale.setDefault(category0, locale30);
        java.util.Locale locale36 = new java.util.Locale("FRA", "FRA", "fr");
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        java.lang.String str38 = locale36.getDisplayName(locale37);
        java.util.Locale.setDefault(category0, locale36);
        java.lang.Class<?> wildcardClass40 = locale36.getClass();
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chinese" + "'", str31, "Chinese");
        org.junit.Assert.assertEquals(locale36.toString(), "fra_FRA_fr");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fra (FRA,fr)" + "'", str38, "fra (FRA,fr)");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = new java.util.Locale("\u82f1\u8a9e", "ja");
        java.util.Locale.setDefault(category0, locale12);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fra_FRA_fr");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "\u82f1\u8a9e_JA");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        java.util.Locale locale1 = new java.util.Locale("\u82f1\u6587\u82f1\u56fd)");
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.lang.String str12 = locale8.getUnicodeLocaleType("fr");
        java.util.Locale locale13 = locale8.stripExtensions();
        java.lang.String str14 = locale2.getDisplayVariant(locale13);
        java.lang.String str15 = locale1.getDisplayScript(locale2);
        java.lang.String str16 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        java.util.Locale locale3 = new java.util.Locale("TW", "English", "ITA");
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale4.getDisplayScript();
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.lang.String str12 = locale10.getExtension('x');
        java.util.Locale.setDefault(locale10);
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.lang.String str15 = locale10.getDisplayLanguage(locale14);
        java.lang.String str16 = locale14.getDisplayVariant();
        java.lang.String str17 = locale4.getDisplayCountry(locale14);
        java.lang.String str18 = locale3.getDisplayName(locale4);
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleKeys();
        java.lang.String str22 = locale19.getExtension('x');
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder23.setVariant("");
        java.util.Locale.Builder builder26 = builder23.clear();
        java.util.Locale.Builder builder28 = builder23.setScript("");
        java.util.Locale locale29 = builder23.build();
        java.lang.String str30 = locale19.getDisplayLanguage(locale29);
        java.lang.String str31 = locale4.getDisplayCountry(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = locale19.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "tw_ENGLISH_ITA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japon" + "'", str17, "Japon");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)" + "'", str18, "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u65e5\u672c" + "'", str31, "\u65e5\u672c");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi! ITALIEN ITALIE,fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        java.util.Locale locale3 = new java.util.Locale("", "fr", "");
        java.lang.String str4 = locale3.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale5.getExtension('x');
        java.lang.String str9 = locale3.getDisplayName(locale5);
        java.lang.String str10 = locale5.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA" + "'", str4, "FRA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u56fd" + "'", str9, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("japonais (Japon)", (double) 0.37170017f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=japonais (japon)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        java.util.Locale locale3 = new java.util.Locale("zh-cn (JPN)", "ja-JP", "en_GB");
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cn (jpn)_JA-JP_en_GB");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.util.Random random1 = new java.util.Random((long) 336522226);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("jpn_HI! (CHINESE (CHINA))", (double) (-290302496));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-2.90302496E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Locale.setDefault(locale7);
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.lang.String str17 = locale10.getDisplayVariant(locale14);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale18.getLanguage();
        java.lang.String str20 = locale14.getDisplayScript(locale18);
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.lang.String str26 = locale24.getExtension('x');
        java.util.Locale.setDefault(locale24);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale24.getDisplayLanguage(locale28);
        java.lang.String str30 = locale14.getDisplayCountry(locale28);
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.lang.String str32 = locale14.getDisplayScript(locale31);
        java.lang.String str33 = locale31.getDisplayScript();
        java.util.Random random35 = new java.util.Random((long) (short) 100);
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale31, random35);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(locale7, random35);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr" + "'", str19, "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.Code code7 = faker0.code();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.util.Locale locale2 = new java.util.Locale("de", "Japan");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str6 = locale3.getExtension('x');
        java.util.Locale locale7 = locale3.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale3.getExtensionKeys();
        java.lang.String str9 = locale2.getDisplayCountry(locale3);
        boolean boolean10 = locale2.hasExtensions();
        java.lang.String str11 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "de_JAPAN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JAPAN" + "'", str9, "JAPAN");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) 977291951, (double) 0.7289627f, (double) 'a');
        java.util.stream.LongStream longStream6 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (-1292805293), (double) 32, (double) 0.7904554f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        java.util.stream.IntStream intStream9 = random1.ints(0, 1833922823);
        java.util.stream.IntStream intStream13 = random1.ints((long) (byte) 1, (-685475890), (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.3325983427023256d) + "'", double6 == (-1.3325983427023256d));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet9 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet13 = locale11.getExtensionKeys();
        java.util.Locale.setDefault(category10, locale11);
        java.lang.String str15 = locale3.getDisplayName(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = locale3.getUnicodeLocaleType("deu");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: deu");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale8.getDisplayVariant();
        java.util.Locale.Builder builder10 = builder0.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setExtension('4', "Italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getDisplayVariant();
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str19 = languageRange18.getRange();
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] { languageRange6, languageRange9, languageRange12, languageRange15, languageRange18, languageRange22 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder29.setVariant("");
        java.util.Locale locale32 = builder29.build();
        java.util.Locale locale36 = new java.util.Locale("", "", "");
        java.util.Locale locale40 = new java.util.Locale("", "", "");
        java.lang.String str41 = locale36.getDisplayLanguage(locale40);
        java.util.Locale locale42 = java.util.Locale.FRENCH;
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.util.Locale locale50 = new java.util.Locale("", "", "");
        java.lang.String str51 = locale46.getDisplayLanguage(locale50);
        java.util.Locale locale55 = new java.util.Locale("", "", "");
        java.lang.String str57 = locale55.getExtension('x');
        java.util.Locale.setDefault(locale55);
        java.util.Locale locale60 = new java.util.Locale("hi!");
        java.util.Locale locale61 = locale60.stripExtensions();
        java.lang.String str62 = locale61.getISO3Country();
        java.util.Locale locale66 = new java.util.Locale("", "", "");
        java.util.Locale locale70 = new java.util.Locale("", "", "");
        java.lang.String str71 = locale66.getDisplayLanguage(locale70);
        java.util.Locale locale73 = new java.util.Locale("hi!");
        java.util.Locale locale74 = locale73.stripExtensions();
        java.util.Locale locale76 = new java.util.Locale("hi!");
        java.util.Locale locale78 = new java.util.Locale("hi!");
        java.util.Locale locale80 = new java.util.Locale("hi!");
        java.util.Locale locale81 = locale80.stripExtensions();
        java.util.Locale[] localeArray82 = new java.util.Locale[] { locale32, locale36, locale42, locale50, locale55, locale61, locale70, locale73, locale76, locale78, locale80 };
        java.util.ArrayList<java.util.Locale> localeList83 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList83, localeArray82);
        java.util.Locale.FilteringMode filteringMode85 = null;
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList83, filteringMode85);
        java.util.Locale locale87 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList83);
        java.lang.String str88 = null; // flaky: locale87.getDisplayCountry();
        java.lang.String str90 = null; // flaky: locale87.getExtension('a');
        com.github.javafaker.Faker faker91 = null; // flaky: new com.github.javafaker.Faker(locale87);
        java.lang.String str92 = locale2.getDisplayVariant(locale87);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr" + "'", str19, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "hi!");
        org.junit.Assert.assertEquals(locale76.toString(), "hi!");
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertEquals(locale80.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(localeList86);
// flaky:         org.junit.Assert.assertNotNull(locale87);
// flaky:         org.junit.Assert.assertEquals(locale87.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
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
        com.github.javafaker.Faker faker83 = null; // flaky: new com.github.javafaker.Faker(locale80);
        java.lang.String str84 = null; // flaky: locale80.getDisplayLanguage();
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
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "French" + "'", str84, "French");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Business business6 = faker4.business();
        com.github.javafaker.Book book7 = faker4.book();
        java.lang.String str9 = faker4.bothify("chinese (JPN)");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chinese (JPN)" + "'", str9, "chinese (JPN)");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.lang.String str12 = locale10.getExtension('x');
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str15 = locale10.getDisplayScript(locale14);
        java.util.Locale locale16 = locale14.stripExtensions();
        java.util.Locale.Builder builder17 = builder5.setLocale(locale14);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder18.setVariant("");
        java.util.Locale.Builder builder21 = builder18.clear();
        java.util.Locale locale22 = builder21.build();
        java.util.Locale.Builder builder24 = builder21.setVariant("");
        java.util.Locale locale25 = builder21.build();
        java.lang.String str26 = locale25.getVariant();
        java.util.Locale locale27 = locale25.stripExtensions();
        java.util.Locale.Builder builder28 = builder17.setLocale(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder28.setLanguage("en_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: en_CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        java.util.Random random1 = new java.util.Random((long) 1284755126);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) 1900068223, (long) (-787311256));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.util.Locale locale1 = new java.util.Locale("zh-cn");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category6, locale10);
        java.util.Locale.Builder builder12 = builder5.setLocale(locale10);
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale22 = new java.util.Locale("de", "\u6cd5\u6587");
        java.lang.String str23 = locale16.getDisplayLanguage(locale22);
        java.lang.String str24 = locale10.getDisplayVariant(locale16);
        java.lang.String str25 = locale2.getDisplayScript(locale16);
        java.lang.String str26 = locale16.getLanguage();
        java.lang.String str27 = locale1.getDisplayScript(locale16);
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cn");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ita", (double) 0.5463555f);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        double double6 = languageRange2.getWeight();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5463554859161377d + "'", double4 == 0.5463554859161377d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ita" + "'", str5, "ita");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5463554859161377d + "'", double6 == 0.5463554859161377d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) (short) 1);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.Address address4 = faker0.address();
        java.lang.String str6 = faker0.numerify("ja");
        java.lang.String str8 = faker0.letterify("chinese china");
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ja" + "'", str6, "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chinese china" + "'", str8, "chinese china");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        java.util.Random random1 = new java.util.Random((long) 591553211);
        java.util.stream.LongStream longStream4 = random1.longs((long) (-1192805220), (long) (-682588711));
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        java.util.Locale locale3 = new java.util.Locale("zh", "", "und-DE");
        java.lang.String str4 = locale3.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "zh__und-DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese" + "'", str4, "Chinese");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayScript(locale5);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.lang.String str14 = locale13.getISO3Country();
        java.lang.String str15 = locale13.getDisplayVariant();
        java.lang.String str16 = locale0.getDisplayScript(locale13);
        java.util.Set<java.lang.String> strSet17 = locale13.getUnicodeLocaleAttributes();
        java.util.Locale locale18 = locale13.stripExtensions();
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHINA", (double) 0.8449292f);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8449292182922363d + "'", double3 == 0.8449292182922363d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder13.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder13.setUnicodeLocaleKeyword("\u53f0\u6e7e", "China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-CN");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        double double3 = random1.nextGaussian();
        java.util.stream.IntStream intStream4 = random1.ints();
        java.util.stream.IntStream intStream5 = random1.ints();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        java.util.stream.LongStream longStream10 = random1.longs((long) 2, (long) (-1385411462), (long) (-370182532));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8673886034754649d) + "'", double3 == (-0.8673886034754649d));
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh_CN");
        com.github.javafaker.Options options7 = faker0.options();
        java.lang.String str9 = faker0.bothify("italien");
        com.github.javafaker.Lorem lorem10 = faker0.lorem();
        com.github.javafaker.App app11 = faker0.app();
        com.github.javafaker.App app12 = faker0.app();
        com.github.javafaker.Internet internet13 = faker0.internet();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_CN" + "'", str6, "zh_CN");
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italien" + "'", str9, "italien");
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(app11);
        org.junit.Assert.assertNotNull(app12);
        org.junit.Assert.assertNotNull(internet13);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
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
        java.util.Locale locale40 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleKeys();
        java.lang.String str43 = locale21.getDisplayName(locale40);
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
        org.junit.Assert.assertEquals(locale40.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u53f0\u6e7e", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        java.util.stream.IntStream intStream12 = random1.ints((-1752065703), 0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        java.util.Locale locale3 = new java.util.Locale("", "zh-CN", "fr");
        java.util.Locale locale7 = new java.util.Locale("hi!", "hi!", "zh-CN");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.util.Locale.setDefault(locale7);
        java.lang.String str10 = locale7.getScript();
        java.lang.String str11 = locale3.getDisplayScript(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale3.getUnicodeLocaleType("hi!__hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!__hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "_ZH-CN_fr");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getISO3Country();
        java.lang.String str3 = locale0.getDisplayVariant();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-TW" + "'", str1, "zh-TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TWN" + "'", str2, "TWN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.util.Locale locale1 = new java.util.Locale("hi! (hi!)");
        org.junit.Assert.assertEquals(locale1.toString(), "hi! (hi!)");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ENGLISH", (double) 0.99127567f);
        java.util.Locale locale4 = new java.util.Locale("fra (FRA,fr)");
        boolean boolean5 = languageRange2.equals((java.lang.Object) "fra (FRA,fr)");
        org.junit.Assert.assertEquals(locale4.toString(), "fra (fra,fr)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }
}
