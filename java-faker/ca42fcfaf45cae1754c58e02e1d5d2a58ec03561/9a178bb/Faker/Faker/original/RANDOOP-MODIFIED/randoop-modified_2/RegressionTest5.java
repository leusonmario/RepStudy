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
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder8 = builder4.setLanguage("");
        java.util.Locale.Builder builder9 = builder4.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguage("chinook jargon");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: chinook jargon [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getLanguage();
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale6.getISO3Language();
        java.lang.String str8 = locale6.getDisplayLanguage();
        java.lang.String str9 = locale0.getDisplayName(locale6);
        java.lang.String str10 = locale6.getDisplayLanguage();
        java.lang.String str11 = locale6.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)" + "'", str3, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fra" + "'", str7, "fra");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "French" + "'", str8, "French");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French" + "'", str10, "French");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr-CA" + "'", str11, "fr-CA");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 'u');
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 1, (double) 6, (double) 553627293);
        double double11 = random1.nextGaussian();
        java.util.stream.IntStream intStream15 = random1.ints((long) 1891812663, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.2235660632835625d + "'", double11 == 1.2235660632835625d);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.util.Random random1 = new java.util.Random((long) (short) 100);
        int int2 = random1.nextInt();
        java.util.stream.IntStream intStream3 = random1.ints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1193959466) + "'", int2 == (-1193959466));
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("french_FRENCH");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french_french");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.util.Locale locale3 = new java.util.Locale("German", "ko_KR", "HI!");
        org.junit.Assert.assertEquals(locale3.toString(), "german_KO_KR_HI!");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.IntStream intStream8 = random1.ints(100L);
        float float9 = random1.nextFloat();
        java.util.stream.LongStream longStream12 = random1.longs((-4972683369271453960L), (long) 0);
        java.util.stream.LongStream longStream15 = random1.longs((long) 17, (long) '4');
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.72810113f + "'", float9 == 0.72810113f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRA-X-LVARIANT-KOR");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.util.Locale locale2 = new java.util.Locale("German", "zh-cn");
        org.junit.Assert.assertEquals(locale2.toString(), "german_ZH-CN");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.util.Locale locale2 = new java.util.Locale("French", "French");
        java.lang.String str3 = locale2.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRENCH could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french" + "'", str3, "french");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.util.Random random1 = new java.util.Random((long) 'a');
        int int3 = random1.nextInt((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random1.longs((long) (short) 0, (long) 1359947704, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 38 + "'", int3 == 38);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getVariant();
        java.lang.String str4 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str2, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TWN" + "'", str4, "TWN");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Company company5 = faker1.company();
        com.github.javafaker.Color color6 = faker1.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        java.util.stream.LongStream longStream10 = random1.longs();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random1.doubles((double) 10L, (double) 0.059201956f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getISO3Language();
        java.util.Locale.Builder builder25 = builder21.setLocale(locale23);
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale locale28 = new java.util.Locale("");
        java.lang.String str29 = locale28.getISO3Language();
        java.util.Locale.Builder builder30 = builder26.setLocale(locale28);
        java.lang.String str31 = locale23.getDisplayCountry(locale28);
        java.lang.String str32 = locale23.getLanguage();
        java.lang.String str33 = locale17.getDisplayCountry(locale23);
        java.lang.String str34 = locale17.getDisplayCountry();
        java.lang.String str36 = locale17.getExtension('x');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
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
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "FRA" + "'", str33, "FRA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "FRA" + "'", str34, "FRA");
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder7 = builder2.clear();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder13 = builder8.setLocale(locale11);
        java.util.Locale.Builder builder15 = builder13.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale locale16 = builder13.build();
        java.util.Locale.Builder builder17 = builder2.setLocale(locale16);
        java.util.Locale.setDefault(locale16);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.util.Locale locale2 = new java.util.Locale("und", "zh");
        java.lang.String str3 = locale2.getScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale13);
        java.util.Locale.setDefault(category10, locale13);
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category10, locale16);
        java.lang.String str18 = locale9.getDisplayCountry(locale16);
        java.lang.String str19 = locale5.getDisplayLanguage(locale9);
        java.lang.String str20 = locale5.getScript();
        java.lang.String str21 = locale5.toLanguageTag();
        java.lang.String str22 = locale5.getDisplayName();
        java.lang.String str23 = locale2.getDisplayCountry(locale5);
        org.junit.Assert.assertEquals(locale2.toString(), "und_ZH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals(locale9.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale13.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "German" + "'", str19, "German");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "de" + "'", str21, "de");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "tedesco" + "'", str22, "tedesco");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ZH" + "'", str23, "ZH");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.util.Random random1 = new java.util.Random((long) 32);
        int int3 = random1.nextInt(431529176);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 268997849 + "'", int3 == 268997849);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale3.getDisplayCountry(locale7);
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.lang.String str15 = locale12.getScript();
        java.lang.String str16 = locale12.getVariant();
        java.util.Set<java.lang.String> strSet17 = locale12.getUnicodeLocaleKeys();
        java.lang.String str18 = locale0.getDisplayName(locale12);
        java.lang.String str19 = locale0.getDisplayCountry();
        java.lang.String str20 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "coreano" + "'", str2, "coreano");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Korean (South Korea)" + "'", str18, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Corea del Sud" + "'", str19, "Corea del Sud");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder10 = builder5.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)", "cinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ???????? (???????????) [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder10 = builder4.setExtension('u', "Chinese");
        java.util.Locale.Builder builder11 = builder4.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "kor");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder5.setRegion("");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        int int11 = random1.nextInt((int) (short) 100);
        java.util.stream.LongStream longStream12 = random1.longs();
        boolean boolean13 = random1.nextBoolean();
        java.util.stream.LongStream longStream15 = random1.longs(5840930912313687631L);
        int int17 = random1.nextInt(37);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 85 + "'", int11 == 85);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random5 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream7 = random5.ints(1L);
        long long8 = random5.nextLong();
        int int10 = random5.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random5);
        java.lang.String str13 = faker11.letterify("zh-CN");
        com.github.javafaker.Internet internet14 = faker11.internet();
        com.github.javafaker.Number number15 = faker11.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "coreano (Corea del Sud)" + "'", str2, "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertNotNull(number15);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "ko-KR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("\u82f1\u8a9e", "Japan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.util.Locale locale3 = new java.util.Locale("Korean (FRENCH (FRENCH))", "German", "fran\347ais");
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("francese", (double) 0.22278214f);
        boolean boolean7 = locale3.equals((java.lang.Object) languageRange6);
        org.junit.Assert.assertEquals(locale3.toString(), "korean (french (french))_GERMAN_fran\347ais");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.LongStream longStream5 = random1.longs();
        boolean boolean6 = random1.nextBoolean();
        int int8 = random1.nextInt(1036684082);
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) 1890976351);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 393447903 + "'", int8 == 393447903);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.util.Locale.Builder builder8 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder10 = builder2.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder13 = builder10.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder10.setUnicodeLocaleKeyword("France", "ja");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: France [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coreano (Corea del Sud)" + "'", str6, "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.util.Locale locale2 = new java.util.Locale("chinese", "\u82f1\u8a9e\u30ab\u30ca\u30c0)");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u8a9e\u30ab\u30ca\u30c0)");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("zh", "");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder13 = builder10.removeUnicodeLocaleAttribute("FRENCH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setExtension('4', "fra-France");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "english__#u-zh");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Color color7 = faker0.color();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.lang.String str7 = locale3.getVariant();
        java.util.Set<java.lang.String> strSet8 = locale3.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getDisplayVariant(locale3);
        boolean boolean10 = locale3.hasExtensions();
        java.util.Locale locale13 = new java.util.Locale("kor", "french (FRENCH)");
        java.lang.String str14 = locale13.getCountry();
        java.util.Locale locale17 = new java.util.Locale("France", "fra");
        java.lang.String str18 = locale13.getDisplayLanguage(locale17);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale locale21 = locale19.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.TAIWAN;
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        java.lang.String str24 = locale22.getDisplayName(locale23);
        java.lang.String str25 = locale19.getDisplayName(locale23);
        java.util.Set<java.lang.Character> charSet26 = locale19.getExtensionKeys();
        java.lang.String str27 = locale19.getDisplayLanguage();
        java.lang.String str28 = locale13.getDisplayCountry(locale19);
        java.lang.String str29 = locale3.getDisplayCountry(locale19);
        java.lang.String str30 = locale19.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals(locale13.toString(), "kor_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FRENCH (FRENCH)" + "'", str14, "FRENCH (FRENCH)");
        org.junit.Assert.assertEquals(locale17.toString(), "france_FRA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Korean" + "'", str18, "Korean");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "kor" + "'", str20, "kor");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str24, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str25, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "coreano" + "'", str27, "coreano");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FRENCH (FRENCH)" + "'", str28, "FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-CN");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("fra");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getISO3Language();
        java.util.Locale.Builder builder17 = builder13.setLocale(locale15);
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale locale25 = new java.util.Locale("");
        java.lang.String str26 = locale25.getISO3Language();
        java.util.Locale.Builder builder27 = builder23.setLocale(locale25);
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getISO3Language();
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale15, locale19, locale22, locale25, locale29 };
        java.util.ArrayList<java.util.Locale> localeList32 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList32, localeArray31);
        java.util.Locale locale34 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList32);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList37);
        java.lang.String str40 = java.util.Locale.lookupTag(languageRangeList7, (java.util.Collection<java.lang.String>) strList39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList7, strMap41);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap46);
        java.util.Locale.Builder builder48 = new java.util.Locale.Builder();
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getISO3Language();
        java.util.Locale.Builder builder52 = builder48.setLocale(locale50);
        java.util.Locale locale54 = new java.util.Locale("");
        java.lang.String str55 = locale54.getISO3Language();
        java.util.Locale locale57 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder58 = new java.util.Locale.Builder();
        java.util.Locale locale60 = new java.util.Locale("");
        java.lang.String str61 = locale60.getISO3Language();
        java.util.Locale.Builder builder62 = builder58.setLocale(locale60);
        java.util.Locale locale64 = new java.util.Locale("");
        java.lang.String str65 = locale64.getISO3Language();
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale50, locale54, locale57, locale60, locale64 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.Locale locale69 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap70 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap70);
        java.util.Locale locale74 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet75 = locale74.getUnicodeLocaleKeys();
        java.lang.String str76 = java.util.Locale.lookupTag(languageRangeList71, (java.util.Collection<java.lang.String>) strSet75);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags(languageRangeList42, (java.util.Collection<java.lang.String>) strSet75);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strList77);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale22.toString(), "hi!");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(localeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNotNull(languageRangeList71);
        org.junit.Assert.assertEquals(locale74.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.lang.String str9 = locale0.getDisplayLanguage(locale6);
        java.lang.String str10 = locale0.getDisplayVariant();
        java.lang.String str11 = locale0.getISO3Country();
        java.lang.String str12 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CHN" + "'", str11, "CHN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.util.Random random1 = new java.util.Random((long) 85);
        java.util.stream.IntStream intStream4 = random1.ints(17, (int) '4');
        java.util.Random random6 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        float float8 = random6.nextFloat();
        int int10 = random6.nextInt((int) '#');
        java.util.Random random12 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream13 = random12.ints();
        java.util.stream.LongStream longStream14 = random12.longs();
        java.util.Random random16 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        int int19 = random16.nextInt(10);
        java.util.Random random21 = new java.util.Random(10L);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random21.nextBytes(byteArray27);
        random16.nextBytes(byteArray27);
        random12.nextBytes(byteArray27);
        random6.nextBytes(byteArray27);
        random1.nextBytes(byteArray27);
        int int34 = random1.nextInt((int) 'x');
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.72810113f + "'", float8 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[84, -115, -23, -71, 86]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 63 + "'", int34 == 63);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints(1L);
        int int5 = random1.nextInt((int) '#');
        double double6 = random1.nextDouble();
        int int7 = random1.nextInt();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream9 = random1.ints();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.44047195711667986d + "'", double6 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1036684082 + "'", int7 == 1036684082);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.util.Random random1 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt((int) '4');
        java.util.stream.IntStream intStream5 = random1.ints();
        java.util.stream.LongStream longStream6 = random1.longs();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.setVariant("");
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "CA");
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "kor");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.IntStream intStream3 = random1.ints((long) 100);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.DateAndTime dateAndTime5 = faker4.date();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        java.util.Random random3 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream4 = random3.ints();
        java.util.stream.LongStream longStream5 = random3.longs();
        java.util.Random random7 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        int int10 = random7.nextInt(10);
        java.util.Random random12 = new java.util.Random(10L);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random12.nextBytes(byteArray18);
        random7.nextBytes(byteArray18);
        random3.nextBytes(byteArray18);
        random1.nextBytes(byteArray18);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random1);
        int int25 = random1.nextInt(38);
        java.util.stream.LongStream longStream28 = random1.longs((long) (-1167796541), (long) 6);
        java.util.stream.LongStream longStream29 = random1.longs();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-42, -97, -43, -72, -76]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertNotNull(longStream29);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Color color4 = faker1.color();
        com.github.javafaker.Company company5 = faker1.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.util.Locale locale2 = new java.util.Locale("\uc911\uad6d\uc5b4\ub300\ub9cc)", "");
        java.lang.String str3 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "\uc911\uad6d\uc5b4\ub300\ub9cc)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.util.Locale locale2 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.lang.String str15 = locale7.getDisplayCountry(locale12);
        java.lang.String str16 = locale7.getLanguage();
        java.lang.String str17 = locale2.getDisplayVariant(locale7);
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.util.Random random20 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        int int23 = random20.nextInt(10);
        java.util.stream.DoubleStream doubleStream24 = random20.doubles();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale18, random20);
        java.util.Locale locale29 = new java.util.Locale("fra-x-lvariant-kor", "hi!");
        java.lang.String str30 = locale18.getDisplayLanguage(locale29);
        java.lang.String str31 = locale7.getDisplayScript(locale18);
        java.util.Random random33 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random33);
        float float35 = random33.nextFloat();
        java.util.stream.IntStream intStream39 = random33.ints((long) 10, 10, (int) '4');
        random33.setSeed((long) (short) 10);
        java.util.stream.LongStream longStream45 = random33.longs((long) '#', (long) (-1167796541), 1L);
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker(locale18, random33);
        com.github.javafaker.Business business47 = faker46.business();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertEquals(locale29.toString(), "fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "English" + "'", str30, "English");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.72810113f + "'", float35 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream39);
        org.junit.Assert.assertNotNull(longStream45);
        org.junit.Assert.assertNotNull(business47);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        int int5 = random1.nextInt((int) '#');
        java.util.Random random7 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream8 = random7.ints();
        java.util.stream.LongStream longStream9 = random7.longs();
        java.util.Random random11 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        int int14 = random11.nextInt(10);
        java.util.Random random16 = new java.util.Random(10L);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random16.nextBytes(byteArray22);
        random11.nextBytes(byteArray22);
        random7.nextBytes(byteArray22);
        random1.nextBytes(byteArray22);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Number number28 = faker27.number();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[34, 42, 124, -86, 50]");
        org.junit.Assert.assertNotNull(number28);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.util.Locale locale3 = new java.util.Locale("FRENCH (FRANCE) (France)", "CN", "");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale7);
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category4, locale10);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        boolean boolean13 = locale12.hasExtensions();
        java.lang.String str14 = locale12.getDisplayLanguage();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale12);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("coreano (Corea del Sud)");
        java.lang.String str18 = locale17.toLanguageTag();
        java.lang.String str19 = locale12.getDisplayCountry(locale17);
        java.util.Locale locale23 = new java.util.Locale("fra-x-lvariant-kor", "fra", "kor");
        java.lang.String str24 = locale12.getDisplayName(locale23);
        java.util.Locale locale25 = locale23.stripExtensions();
        java.util.Locale.setDefault(category4, locale23);
        java.util.Locale locale27 = java.util.Locale.getDefault(category4);
        java.lang.String str28 = locale3.getDisplayScript(locale27);
        java.lang.String str30 = locale27.getExtension('x');
        org.junit.Assert.assertEquals(locale3.toString(), "french (france) (france)_CN");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale7.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "francese" + "'", str14, "francese");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "und" + "'", str18, "und");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertEquals(locale23.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "French (France)" + "'", str24, "French (France)");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getDisplayScript();
        java.lang.String str5 = locale1.getDisplayScript();
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)" + "'", str3, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category0, locale6);
        java.lang.String str8 = locale6.getDisplayVariant();
        java.util.Random random10 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        int int13 = random10.nextInt(10);
        java.util.stream.DoubleStream doubleStream14 = random10.doubles();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale6, random10);
        int int17 = random10.nextInt(1359947704);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 945906331 + "'", int17 == 945906331);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.util.Locale locale2 = new java.util.Locale("eng", "zh-TW");
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.Object obj4 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "eng_ZH-TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "eng_ZH-TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "eng_ZH-TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "eng_ZH-TW");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.lang.String str12 = locale4.getDisplayCountry(locale9);
        java.lang.String str13 = locale4.getLanguage();
        java.lang.String str14 = locale0.getDisplayVariant(locale4);
        java.lang.String str15 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh_CN" + "'", str15, "zh_CN");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.lang.Class<?> wildcardClass6 = random1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        java.util.Locale locale22 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.LongStream longStream10 = random1.longs((long) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.PhoneNumber phoneNumber12 = faker11.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker11.phoneNumber();
        java.lang.String str15 = faker11.bothify("France");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "France" + "'", str15, "France");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
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
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale20.getISO3Language();
        java.lang.String str22 = locale3.getDisplayCountry(locale20);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale3);
        java.lang.String str24 = locale1.getDisplayVariant(locale3);
        java.util.Locale locale25 = locale1.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "eng" + "'", str21, "eng");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "South Korea" + "'", str22, "South Korea");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra_KOR_France");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fra_kor_france");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.util.Locale locale2 = new java.util.Locale("\u97d3\u6587", "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u97d3\u6587\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.util.Random random0 = new java.util.Random();
        random0.setSeed((long) 10);
        double double3 = random0.nextGaussian();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8746788966462123d + "'", double3 == 0.8746788966462123d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))", (double) 1359947704);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.359947704E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.util.Locale locale3 = new java.util.Locale("\u65e5\u672c", "\ud55c\uad6d\uc5b4", "chinese_KOR");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u65e5\u672c\ud55c\uad6d\uc5b4_chinese_KOR");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("CA");
        java.lang.String str9 = locale0.getDisplayVariant(locale8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francese (Francia)" + "'", str2, "francese (Francia)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ca");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.Set<java.lang.String> strSet9 = locale1.getUnicodeLocaleAttributes();
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Random random5 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((long) (byte) 1);
        long long9 = random5.nextLong();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random5);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random5);
        java.util.stream.LongStream longStream13 = random5.longs(0L);
        java.util.Random random15 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((double) 0.24137181f, (double) (short) 1);
        long long19 = random15.nextLong();
        java.util.Random random21 = new java.util.Random(10L);
        java.util.stream.LongStream longStream23 = random21.longs((long) 0);
        java.util.Random random25 = new java.util.Random(10L);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random25.nextBytes(byteArray31);
        random21.nextBytes(byteArray31);
        random15.nextBytes(byteArray31);
        random5.nextBytes(byteArray31);
        java.util.Random random37 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        float float39 = random37.nextFloat();
        java.util.stream.IntStream intStream43 = random37.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream44 = random37.ints();
        java.util.stream.IntStream intStream45 = random37.ints();
        java.util.stream.DoubleStream doubleStream46 = random37.doubles();
        java.util.Random random48 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(random48);
        int int51 = random48.nextInt((int) '4');
        java.util.stream.IntStream intStream52 = random48.ints();
        java.util.Random random54 = new java.util.Random((long) (byte) 100);
        java.util.Random random56 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream57 = random56.ints();
        java.util.stream.LongStream longStream58 = random56.longs();
        java.util.Random random60 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker61 = new com.github.javafaker.Faker(random60);
        int int63 = random60.nextInt(10);
        java.util.Random random65 = new java.util.Random(10L);
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random65.nextBytes(byteArray71);
        random60.nextBytes(byteArray71);
        random56.nextBytes(byteArray71);
        random54.nextBytes(byteArray71);
        random48.nextBytes(byteArray71);
        random37.nextBytes(byteArray71);
        random5.nextBytes(byteArray71);
        random1.nextBytes(byteArray71);
        com.github.javafaker.Faker faker80 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-5015647950085110473L) + "'", long9 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-4972683369271453960L) + "'", long19 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[34, 42, 124, -86, 50]");
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.72810113f + "'", float39 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream43);
        org.junit.Assert.assertNotNull(intStream44);
        org.junit.Assert.assertNotNull(intStream45);
        org.junit.Assert.assertNotNull(doubleStream46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 31 + "'", int51 == 31);
        org.junit.Assert.assertNotNull(intStream52);
        org.junit.Assert.assertNotNull(intStream57);
        org.junit.Assert.assertNotNull(longStream58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 7 + "'", int63 == 7);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[115, -43, 26, -69, -40]");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        int int11 = random1.nextInt((int) (short) 100);
        java.util.stream.LongStream longStream12 = random1.longs();
        boolean boolean13 = random1.nextBoolean();
        java.util.stream.LongStream longStream15 = random1.longs(5840930912313687631L);
        java.util.stream.DoubleStream doubleStream19 = random1.doubles((long) 1359947704, 0.6991794951529816d, 1.2235660632835625d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 85 + "'", int11 == 85);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(doubleStream19);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale1.getDisplayCountry(locale4);
        java.lang.String str8 = locale1.toLanguageTag();
        java.util.Locale locale11 = new java.util.Locale("chinese_KOR", "ENGLISH");
        java.lang.String str12 = locale1.getDisplayCountry(locale11);
        java.lang.String str13 = locale11.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
        org.junit.Assert.assertEquals(locale11.toString(), "chinese_kor_ENGLISH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chinese_kor_ENGLISH" + "'", str13, "chinese_kor_ENGLISH");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        double double7 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.44047195711667986d + "'", double7 == 0.44047195711667986d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale9);
        java.util.Locale.setDefault(category6, locale9);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category6, locale12);
        java.lang.String str14 = locale5.getDisplayCountry(locale12);
        java.lang.String str15 = locale1.getDisplayLanguage(locale5);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getISO3Language();
        java.util.Locale.Builder builder20 = builder16.setLocale(locale18);
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getISO3Language();
        java.util.Locale.Builder builder25 = builder21.setLocale(locale23);
        java.lang.String str26 = locale18.getDisplayCountry(locale23);
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale27.getDisplayCountry();
        java.lang.String str30 = locale18.getDisplayName(locale27);
        java.util.Set<java.lang.Character> charSet31 = locale27.getExtensionKeys();
        java.lang.String str32 = locale1.getDisplayCountry(locale27);
        java.lang.String str33 = locale27.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale27);
        java.util.Locale locale35 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals(locale5.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale9.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "German" + "'", str15, "German");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "cinese" + "'", str33, "cinese");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale locale8 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setLanguage("fra_KOR_France");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fra_KOR_France [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra", 0.0d);
        java.lang.String str3 = languageRange2.getRange();
        java.lang.String str4 = languageRange2.getRange();
        java.lang.String str5 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra" + "'", str4, "fra");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra" + "'", str5, "fra");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        boolean boolean7 = random3.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random3.doubles((double) (short) 0, (double) 10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str2, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getISO3Language();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale10.getDisplayLanguage(locale12);
        java.util.Locale.setDefault(category0, locale10);
        java.lang.String str15 = locale10.getDisplayVariant();
        boolean boolean16 = locale10.hasExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.util.Random random1 = new java.util.Random((long) 7);
        random1.setSeed((long) (byte) 0);
        double double4 = random1.nextDouble();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.730967787376657d + "'", double4 == 0.730967787376657d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.util.Locale locale3 = new java.util.Locale("France", "", "\u30d5\u30e9\u30f3\u30b9");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u30d5\u30e9\u30f3\u30b9");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getCountry();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale3);
        java.lang.String str7 = locale3.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        double double7 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random1.longs((long) '4', (long) 1708368258, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7281011855672591d + "'", double7 == 0.7281011855672591d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.util.Locale locale3 = new java.util.Locale("fra", "allemand", "fr-FR");
        org.junit.Assert.assertEquals(locale3.toString(), "fra_ALLEMAND_fr-FR");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Color color11 = faker9.color();
        com.github.javafaker.Company company12 = faker9.company();
        com.github.javafaker.Lorem lorem13 = faker9.lorem();
        com.github.javafaker.Business business14 = faker9.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(company12);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(business14);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale1.getCountry();
        java.lang.String str6 = locale1.getCountry();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale1);
        java.lang.String str8 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)" + "'", str3, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KR" + "'", str5, "KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KR" + "'", str6, "KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("french_FRENCH", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french_french");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 100);
        boolean boolean7 = random1.nextBoolean();
        boolean boolean8 = random1.nextBoolean();
        long long9 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random1.ints((long) 7, 1430131985, 1430131985);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-6162003863595742414L) + "'", long9 == (-6162003863595742414L));
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.util.Locale locale2 = new java.util.Locale("chinese_KOR", "Canada");
        java.util.Locale locale5 = new java.util.Locale("hi!", "zh-CN");
        java.lang.String str6 = locale2.getDisplayName(locale5);
        java.util.Locale locale7 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale7);
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayVariant();
        java.lang.String str11 = locale7.toLanguageTag();
        java.lang.String str12 = locale7.getISO3Country();
        java.lang.String str13 = locale5.getDisplayVariant(locale7);
        java.lang.String str14 = locale7.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_kor_CANADA");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_ZH-CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinese_kor (CANADA)" + "'", str6, "chinese_kor (CANADA)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CHN" + "'", str12, "CHN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh_CN" + "'", str14, "zh_CN");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        java.util.Locale locale5 = builder4.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.util.Locale locale3 = new java.util.Locale("ko", "", "");
        java.util.Locale locale5 = new java.util.Locale("Korean");
        java.util.Locale locale9 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale9.getDisplayScript(locale11);
        java.lang.String str14 = locale5.getDisplayScript(locale11);
        java.lang.String str15 = locale3.getDisplayName(locale11);
        boolean boolean16 = locale3.hasExtensions();
        java.util.Set<java.lang.String> strSet17 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals(locale5.toString(), "korean");
        org.junit.Assert.assertEquals(locale9.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Korean" + "'", str15, "Korean");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        java.util.Locale.Builder builder25 = builder0.setVariant("Japanese");
        java.util.Locale.Builder builder28 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder30 = builder28.setLanguage("china");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder32 = builder28.setRegion("und-France");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: und-France [at index 0]");
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.parse("France");
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] { languageRange33 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray42 = new java.lang.String[] { "kor", "fra", "kor", "French", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.Locale.FilteringMode filteringMode45 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList43, filteringMode45);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strMap50);
        java.util.Locale locale52 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strMap57);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, strMap62);
        java.util.Locale.Builder builder64 = new java.util.Locale.Builder();
        java.util.Locale locale66 = new java.util.Locale("");
        java.lang.String str67 = locale66.getISO3Language();
        java.util.Locale.Builder builder68 = builder64.setLocale(locale66);
        java.util.Locale locale70 = new java.util.Locale("");
        java.lang.String str71 = locale70.getISO3Language();
        java.util.Locale locale73 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder74 = new java.util.Locale.Builder();
        java.util.Locale locale76 = new java.util.Locale("");
        java.lang.String str77 = locale76.getISO3Language();
        java.util.Locale.Builder builder78 = builder74.setLocale(locale76);
        java.util.Locale locale80 = new java.util.Locale("");
        java.lang.String str81 = locale80.getISO3Language();
        java.util.Locale[] localeArray82 = new java.util.Locale[] { locale66, locale70, locale73, locale76, locale80 };
        java.util.ArrayList<java.util.Locale> localeList83 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList83, localeArray82);
        java.util.Locale locale85 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.util.Locale>) localeList83, filteringMode86);
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strSet53, filteringMode86);
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags(languageRangeList31, (java.util.Collection<java.lang.String>) strList46, filteringMode86);
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList27, filteringMode86);
        java.util.Collection<java.lang.String> strCollection91 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags(languageRangeList2, strCollection91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + filteringMode45 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode45.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(localeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNull(locale85);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode86.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNotNull(localeList90);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.util.Random random1 = new java.util.Random((-1L));
        double double2 = random1.nextDouble();
        java.util.stream.LongStream longStream6 = random1.longs((long) 23, (long) 37, (long) 1913984760);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26894263088050496d + "'", double2 == 0.26894263088050496d);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Book book5 = faker2.book();
        com.github.javafaker.Internet internet6 = faker2.internet();
        com.github.javafaker.Name name7 = faker2.name();
        com.github.javafaker.Finance finance8 = faker2.finance();
        com.github.javafaker.Number number9 = faker2.number();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream7 = random1.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        long long8 = random1.nextLong();
        int int9 = random1.nextInt();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1434703326) + "'", int9 == (-1434703326));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random5 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream7 = random5.ints(1L);
        long long8 = random5.nextLong();
        int int10 = random5.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random5);
        java.lang.String str12 = locale0.getLanguage();
        java.lang.String str13 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ko" + "'", str12, "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Internet internet7 = faker0.internet();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.util.Random random1 = new java.util.Random((long) 23);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale2 = new java.util.Locale("");
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.lang.String str6 = locale0.getDisplayVariant(locale3);
        java.util.Locale locale8 = new java.util.Locale("coreano (Corea del Sud)");
        java.lang.String str9 = locale8.getCountry();
        java.lang.String str10 = locale0.getDisplayCountry(locale8);
        java.lang.String str11 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale8.toString(), "coreano (corea del sud)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Germany" + "'", str10, "Germany");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DEU" + "'", str11, "DEU");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Name name3 = faker2.name();
        com.github.javafaker.Name name4 = faker2.name();
        com.github.javafaker.Code code5 = faker2.code();
        java.lang.String str7 = faker2.bothify("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        com.github.javafaker.Options options8 = faker2.options();
        com.github.javafaker.Number number9 = faker2.number();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker2.phoneNumber();
        com.github.javafaker.Lorem lorem11 = faker2.lorem();
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str7, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale locale8 = builder0.build();
        java.util.Locale.Builder builder10 = builder0.setLanguage("eng");
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale13.getISO3Language();
        java.lang.String str15 = locale13.getDisplayName();
        java.lang.String str16 = locale13.getDisplayScript();
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.util.Random random19 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        int int22 = random19.nextInt(10);
        java.util.stream.DoubleStream doubleStream23 = random19.doubles();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale17, random19);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale13, random19);
        java.lang.String str27 = locale11.getDisplayLanguage(locale13);
        java.lang.String str28 = locale11.getDisplayCountry();
        java.lang.String str29 = locale11.getISO3Language();
        java.lang.String str30 = locale11.getDisplayScript();
        java.lang.String str31 = locale11.toLanguageTag();
        java.util.Locale.Builder builder32 = builder0.setLocale(locale11);
        java.util.Locale.Builder builder34 = builder32.setLanguageTag("zh-CN");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese" + "'", str12, "Chinese");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "kor" + "'", str14, "kor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Korean (South Korea)" + "'", str15, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str27, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zho" + "'", str29, "zho");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh" + "'", str31, "zh");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Code code6 = faker1.code();
        java.lang.String str8 = faker1.letterify("fra_KOR_France");
        com.github.javafaker.Address address9 = faker1.address();
        com.github.javafaker.Business business10 = faker1.business();
        com.github.javafaker.Lorem lorem11 = faker1.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra_KOR_France" + "'", str8, "fra_KOR_France");
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        boolean boolean10 = random1.nextBoolean();
        double double11 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream15 = random1.doubles((long) 7, (-0.14158131146144248d), (double) 31);
        int int16 = random1.nextInt();
        double double17 = random1.nextGaussian();
        double double18 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8869349148715235d + "'", double11 == 0.8869349148715235d);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1789290896) + "'", int16 == (-1789290896));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.8925344103631203d) + "'", double17 == (-2.8925344103631203d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.051497055555718596d + "'", double18 == 0.051497055555718596d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Address address5 = faker0.address();
        java.lang.String str7 = faker0.bothify("\u30d5\u30e9\u30f3\u30b9");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u30d5\u30e9\u30f3\u30b9" + "'", str7, "\u30d5\u30e9\u30f3\u30b9");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.util.Locale locale2 = new java.util.Locale("fra", "fra");
        java.util.Locale locale5 = new java.util.Locale("French (France)", "Canada");
        java.lang.String str6 = locale2.getDisplayScript(locale5);
        java.util.Set<java.lang.Character> charSet7 = locale2.getExtensionKeys();
        java.lang.String str8 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "fra_FRA");
        org.junit.Assert.assertEquals(locale5.toString(), "french (france)_CANADA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italia", 0.8452060657049847d);
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        int int7 = random4.nextInt(10);
        float float8 = random4.nextFloat();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime10 = faker9.date();
        boolean boolean11 = languageRange2.equals((java.lang.Object) faker9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.44047195f + "'", float8 == 0.44047195f);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguage("Canada");
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.lang.String str12 = locale9.getDisplayScript();
        java.util.Locale.Builder builder13 = builder8.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder8.addUnicodeLocaleAttribute("cinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: cinese (Taiwan) [at index 0]");
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "kor" + "'", str10, "kor");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.numerify("French");
        com.github.javafaker.Options options8 = faker1.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.util.Random random1 = new java.util.Random((long) 7);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        java.util.stream.IntStream intStream7 = random1.ints((long) '#', (int) (short) 1, (int) (byte) 10);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        java.util.Random random10 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream12 = random10.ints(1L);
        long long13 = random10.nextLong();
        java.util.Random random15 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        int int18 = random15.nextInt(10);
        java.util.Random random20 = new java.util.Random(10L);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random20.nextBytes(byteArray26);
        random15.nextBytes(byteArray26);
        random10.nextBytes(byteArray26);
        random1.nextBytes(byteArray26);
        java.util.stream.LongStream longStream31 = random1.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-5015647950085110473L) + "'", long13 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-103, 23, 15, -69, 24]");
        org.junit.Assert.assertNotNull(longStream31);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("TW", (double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=3.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.util.Locale locale3 = new java.util.Locale("it_IT", "cinese (Taiwan)", "\ud55c\uad6d\uc5b4");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        java.lang.String str12 = locale6.getISO3Language();
        java.util.Random random14 = new java.util.Random((long) 7);
        java.util.stream.DoubleStream doubleStream16 = random14.doubles((long) 10);
        java.util.stream.IntStream intStream20 = random14.ints((long) '#', (int) (short) 1, (int) (byte) 10);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale6, random14);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zho" + "'", str12, "zho");
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream20);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Taiwan", 0.0d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.util.Locale locale3 = new java.util.Locale("fra", "Coreano (FRENCH (FRENCH))", "ko_KR");
        org.junit.Assert.assertEquals(locale3.toString(), "fra_COREANO (FRENCH (FRENCH))_ko_KR");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.util.Locale locale2 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.lang.String str15 = locale7.getDisplayCountry(locale12);
        java.lang.String str16 = locale7.getLanguage();
        java.lang.String str17 = locale2.getDisplayVariant(locale7);
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.util.Random random20 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        int int23 = random20.nextInt(10);
        java.util.stream.DoubleStream doubleStream24 = random20.doubles();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale18, random20);
        java.util.Locale locale29 = new java.util.Locale("fra-x-lvariant-kor", "hi!");
        java.lang.String str30 = locale18.getDisplayLanguage(locale29);
        java.lang.String str31 = locale7.getDisplayScript(locale18);
        java.util.Locale locale34 = new java.util.Locale("eng", "zh-TW");
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleAttributes();
        java.lang.String str36 = locale7.getDisplayScript(locale34);
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertEquals(locale29.toString(), "fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "English" + "'", str30, "English");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals(locale34.toString(), "eng_ZH-TW");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.util.Locale locale1 = new java.util.Locale("coreano (Corea del Sud)");
        java.lang.String str2 = locale1.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "coreano (corea del sud)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        com.github.javafaker.Internet internet8 = faker2.internet();
        com.github.javafaker.Name name9 = faker2.name();
        com.github.javafaker.Code code10 = faker2.code();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.lang.String str10 = locale2.getDisplayCountry(locale7);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale11.getDisplayCountry();
        java.lang.String str14 = locale2.getDisplayName(locale11);
        java.util.Set<java.lang.Character> charSet15 = locale11.getExtensionKeys();
        java.util.Set<java.lang.String> strSet16 = locale11.getUnicodeLocaleKeys();
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("ita");
        java.lang.String str19 = locale11.getDisplayLanguage(locale18);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese" + "'", str19, "Chinese");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.setExtension('4', "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.util.Random random6 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        int int9 = random6.nextInt(10);
        java.util.stream.DoubleStream doubleStream10 = random6.doubles();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale4, random6);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale0, random6);
        float float14 = random6.nextFloat();
        java.util.stream.IntStream intStream15 = random6.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream18 = random6.ints(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.44047195f + "'", float14 == 0.44047195f);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        com.github.javafaker.Address address5 = faker2.address();
        com.github.javafaker.DateAndTime dateAndTime6 = faker2.date();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.util.Locale locale1 = new java.util.Locale("Chinook jargon");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "chinook jargon");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinook jargon" + "'", str2, "chinook jargon");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setScript("");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("Canada");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setScript("france");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: france [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color3 = faker2.color();
        com.github.javafaker.Options options4 = faker2.options();
        java.lang.String str6 = faker2.numerify("SOUTH KOREA (SOUTH KOREA)");
        java.lang.String str8 = faker2.bothify("cinese (Taiwan)");
        com.github.javafaker.Company company9 = faker2.company();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SOUTH KOREA (SOUTH KOREA)" + "'", str6, "SOUTH KOREA (SOUTH KOREA)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cinese (Taiwan)" + "'", str8, "cinese (Taiwan)");
        org.junit.Assert.assertNotNull(company9);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Address address4 = faker2.address();
        com.github.javafaker.Name name5 = faker2.name();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker2.phoneNumber();
        com.github.javafaker.Color color7 = faker2.color();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.Random random5 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        int int8 = random5.nextInt(10);
        java.util.Random random10 = new java.util.Random(10L);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random10.nextBytes(byteArray16);
        random5.nextBytes(byteArray16);
        random1.nextBytes(byteArray16);
        java.util.stream.IntStream intStream20 = random1.ints();
        double double21 = random1.nextGaussian();
        java.util.stream.IntStream intStream22 = random1.ints();
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale23.getDisplayScript();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale23);
        java.util.Random random27 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream28 = random27.ints();
        java.util.stream.LongStream longStream29 = random27.longs();
        java.util.Random random31 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        int int34 = random31.nextInt(10);
        java.util.Random random36 = new java.util.Random(10L);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random36.nextBytes(byteArray42);
        random31.nextBytes(byteArray42);
        random27.nextBytes(byteArray42);
        java.util.stream.IntStream intStream46 = random27.ints();
        int int47 = random27.nextInt();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(locale23, random27);
        java.util.Random random50 = new java.util.Random((long) '#');
        java.util.stream.DoubleStream doubleStream52 = random50.doubles((long) (short) 100);
        java.util.Random random54 = new java.util.Random(10L);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random54.nextBytes(byteArray60);
        random50.nextBytes(byteArray60);
        random27.nextBytes(byteArray60);
        random1.nextBytes(byteArray60);
        random1.setSeed((long) (-1192805220));
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.14158131146144248d) + "'", double21 == (-0.14158131146144248d));
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(intStream28);
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7 + "'", int34 == 7);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1708368258 + "'", int47 == 1708368258);
        org.junit.Assert.assertNotNull(doubleStream52);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[114, 38, -2, -10, -124]");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Address address4 = faker1.address();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker1.phoneNumber();
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Code code7 = faker1.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.util.Random random1 = new java.util.Random(4452524227988171454L);
        double double2 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.48032853120316416d + "'", double2 == 0.48032853120316416d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setUnicodeLocaleKeyword("Gergo chinook", "CHINESE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Gergo chinook [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.util.Locale locale3 = new java.util.Locale("de_DE", "Chinese (Taiwan)", "ENGLISH");
        java.lang.String str4 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "de_de_CHINESE (TAIWAN)_ENGLISH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = locale10.getVariant();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale13.getDisplayScript();
        java.lang.String str15 = locale13.getDisplayLanguage();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        java.util.Locale locale20 = new java.util.Locale("hi!");
        java.lang.String str21 = locale16.getDisplayCountry(locale20);
        java.lang.String str22 = locale13.getDisplayScript(locale20);
        java.util.Locale.setDefault(category0, locale13);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Korean" + "'", str15, "Korean");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = random1.doubles((-2085682583702141179L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        java.lang.String str10 = faker8.bothify("FRENCH");
        com.github.javafaker.Number number11 = faker8.number();
        com.github.javafaker.Company company12 = faker8.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FRENCH" + "'", str10, "FRENCH");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(company12);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        java.util.Set<java.lang.String> strSet21 = locale17.getUnicodeLocaleAttributes();
        boolean boolean22 = locale17.hasExtensions();
        java.util.Random random24 = new java.util.Random((-5785953002346952466L));
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale17, random24);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
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
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        java.lang.String str24 = locale12.getCountry();
        java.util.Locale locale25 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale25);
        java.lang.String str27 = locale25.getDisplayCountry();
        java.lang.String str28 = locale25.getDisplayVariant();
        java.lang.String str29 = locale25.toLanguageTag();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale25);
        java.util.Random random32 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random32);
        int int35 = random32.nextInt(10);
        java.util.stream.DoubleStream doubleStream36 = random32.doubles();
        double double37 = random32.nextGaussian();
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(locale25, random32);
        java.lang.String str39 = locale25.getDisplayCountry();
        boolean boolean40 = locale12.equals((java.lang.Object) locale25);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh-CN" + "'", str29, "zh-CN");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 7 + "'", int35 == 7);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-0.35703205834598994d) + "'", double37 == (-0.35703205834598994d));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.util.Locale.Builder builder8 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("kor");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("KOR", "south korea (SOUTH KOREA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: KOR [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream7 = random1.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        java.util.Random random9 = new java.util.Random(10L);
        java.util.stream.LongStream longStream11 = random9.longs((long) 0);
        java.util.Random random13 = new java.util.Random(10L);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random13.nextBytes(byteArray19);
        random9.nextBytes(byteArray19);
        random1.nextBytes(byteArray19);
        float float23 = random1.nextFloat();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-61, -42, 100, -70, 55]");
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.6659571f + "'", float23 == 0.6659571f);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.DateAndTime dateAndTime7 = faker6.date();
        com.github.javafaker.Color color8 = faker6.color();
        com.github.javafaker.Company company9 = faker6.company();
        java.lang.String str11 = faker6.numerify("ja");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ja" + "'", str11, "ja");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fra__#x-lvariant");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("France");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Internet internet5 = faker4.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
        org.junit.Assert.assertNotNull(internet5);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getExtension('x');
        java.util.Locale locale6 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getISO3Language();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getISO3Language();
        java.util.Locale.Builder builder18 = builder14.setLocale(locale16);
        java.lang.String str19 = locale11.getDisplayCountry(locale16);
        java.lang.String str20 = locale11.getLanguage();
        java.lang.String str21 = locale6.getDisplayVariant(locale11);
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Random random24 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        int int27 = random24.nextInt(10);
        java.util.stream.DoubleStream doubleStream28 = random24.doubles();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale22, random24);
        java.util.Locale locale33 = new java.util.Locale("fra-x-lvariant-kor", "hi!");
        java.lang.String str34 = locale22.getDisplayLanguage(locale33);
        java.lang.String str35 = locale11.getDisplayScript(locale22);
        java.util.Random random37 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        float float39 = random37.nextFloat();
        java.util.stream.IntStream intStream43 = random37.ints((long) 10, 10, (int) '4');
        random37.setSeed((long) (short) 10);
        java.util.stream.LongStream longStream49 = random37.longs((long) '#', (long) (-1167796541), 1L);
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker(locale22, random37);
        com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(locale0, random37);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals(locale6.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertEquals(locale33.toString(), "fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "English" + "'", str34, "English");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.72810113f + "'", float39 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream43);
        org.junit.Assert.assertNotNull(longStream49);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getISO3Country();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder11 = builder5.setExtension('u', "chn");
        java.util.Locale.Builder builder13 = builder11.setLanguage("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setRegion("FRA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRA [at index 0]");
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
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        com.github.javafaker.Address address12 = faker11.address();
        java.lang.String str14 = faker11.bothify("JP");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JP" + "'", str14, "JP");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random5 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream7 = random5.ints(1L);
        long long8 = random5.nextLong();
        int int10 = random5.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Options options12 = faker11.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        java.lang.String str6 = faker0.bothify("coreano");
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Address address8 = faker0.address();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coreano" + "'", str6, "coreano");
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getDisplayScript();
        java.lang.String str5 = locale0.getDisplayScript(locale1);
        java.util.Locale locale6 = locale1.stripExtensions();
        boolean boolean7 = locale6.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)" + "'", str3, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.util.Random random1 = new java.util.Random((long) 1066038166);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.util.Locale locale1 = new java.util.Locale("Korean");
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "korean");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
            java.lang.String str11 = locale9.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.util.Locale locale1 = new java.util.Locale("eng");
        java.lang.String str2 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.LongStream longStream10 = random1.longs((long) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem12 = faker11.lorem();
        com.github.javafaker.Color color13 = faker11.color();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale locale13 = builder12.build();
        java.lang.String str14 = locale13.getDisplayName();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale17 = java.util.Locale.getDefault(category0);
        java.util.Locale locale18 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.util.Locale locale2 = new java.util.Locale("french", "DEU");
        org.junit.Assert.assertEquals(locale2.toString(), "french_DEU");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u8a9e\u30ab\u30ca\u30c0)", "French (Canada)", "\u30d5\u30e9\u30f3\u30b9\u8a9e");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30ab\u30ca\u30c0\u30d5\u30e9\u30f3\u30b9\u8a9e");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.setVariant("");
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "chn");
        java.util.Locale.Builder builder15 = builder9.setExtension('a', "GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "kor");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        java.util.stream.DoubleStream doubleStream10 = random2.doubles((long) 'u');
        double double11 = random2.nextDouble();
        double double12 = random2.nextDouble();
        java.util.stream.DoubleStream doubleStream14 = random2.doubles((long) 10);
        random2.setSeed((-6162003863595742414L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream20 = random2.doubles(0L, (double) 393447903, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.44047195711667986d + "'", double11 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2413718236526089d + "'", double12 == 0.2413718236526089d);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.util.Set<java.lang.Character> charSet9 = locale7.getExtensionKeys();
        java.lang.String str10 = locale4.getDisplayVariant(locale7);
        java.lang.String str11 = locale3.getDisplayName(locale7);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        java.util.Locale.Builder builder25 = builder0.setVariant("Japanese");
        java.util.Locale.Builder builder27 = builder0.setRegion("ja");
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream9 = random1.ints((long) 'x');
        boolean boolean10 = random1.nextBoolean();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = random1.ints((long) (-1), (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.util.Random random1 = new java.util.Random((long) 100);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        double double3 = random1.nextGaussian();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.lang.String str6 = locale4.getDisplayName();
        java.util.Random random7 = new java.util.Random();
        random7.setSeed((long) 10);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale4, random7);
        random7.setSeed((long) 'x');
        java.util.stream.IntStream intStream13 = random7.ints();
        float float14 = random7.nextFloat();
        java.util.Random random16 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        int int19 = random16.nextInt((int) '4');
        java.util.stream.IntStream intStream20 = random16.ints();
        java.util.Random random22 = new java.util.Random((long) (byte) 100);
        java.util.Random random24 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream25 = random24.ints();
        java.util.stream.LongStream longStream26 = random24.longs();
        java.util.Random random28 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        int int31 = random28.nextInt(10);
        java.util.Random random33 = new java.util.Random(10L);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random33.nextBytes(byteArray39);
        random28.nextBytes(byteArray39);
        random24.nextBytes(byteArray39);
        random22.nextBytes(byteArray39);
        random16.nextBytes(byteArray39);
        java.util.Locale locale45 = java.util.Locale.GERMANY;
        java.util.Random random47 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        float float49 = random47.nextFloat();
        java.util.stream.IntStream intStream53 = random47.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream55 = random47.ints((long) 'x');
        com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker(locale45, random47);
        boolean boolean57 = random47.nextBoolean();
        java.util.Locale locale58 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale59 = locale58.stripExtensions();
        java.util.Random random61 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker62 = new com.github.javafaker.Faker(random61);
        java.util.stream.DoubleStream doubleStream64 = random61.doubles((long) (byte) 1);
        long long65 = random61.nextLong();
        com.github.javafaker.Faker faker66 = new com.github.javafaker.Faker(locale59, random61);
        com.github.javafaker.Faker faker67 = new com.github.javafaker.Faker(random61);
        java.util.stream.LongStream longStream69 = random61.longs(0L);
        java.util.Random random71 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream74 = random71.doubles((double) 0.24137181f, (double) (short) 1);
        long long75 = random71.nextLong();
        java.util.Random random77 = new java.util.Random(10L);
        java.util.stream.LongStream longStream79 = random77.longs((long) 0);
        java.util.Random random81 = new java.util.Random(10L);
        byte[] byteArray87 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random81.nextBytes(byteArray87);
        random77.nextBytes(byteArray87);
        random71.nextBytes(byteArray87);
        random61.nextBytes(byteArray87);
        random47.nextBytes(byteArray87);
        random16.nextBytes(byteArray87);
        random7.nextBytes(byteArray87);
        random1.nextBytes(byteArray87);
        java.util.stream.DoubleStream doubleStream97 = random1.doubles((long) 100);
        int int98 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6246292191371761d + "'", double3 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French (France)" + "'", str6, "French (France)");
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.72308457f + "'", float14 == 0.72308457f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[85, 109, -3, -78, -25]");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.72810113f + "'", float49 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream53);
        org.junit.Assert.assertNotNull(intStream55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-5015647950085110473L) + "'", long65 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream69);
        org.junit.Assert.assertNotNull(doubleStream74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-4972683369271453960L) + "'", long75 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream79);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[103, -8, -54, -86, 116]");
        org.junit.Assert.assertNotNull(doubleStream97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-951589224) + "'", int98 == (-951589224));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setScript("");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("Canada");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setLanguage("french_FRENCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: french_FRENCH [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.util.Locale locale3 = new java.util.Locale("de_DE", "fra", "de_DE");
        java.util.Locale locale6 = new java.util.Locale("fra_KOR_France", "Korean (South Korea)");
        java.lang.String str7 = locale3.getDisplayName(locale6);
        org.junit.Assert.assertEquals(locale3.toString(), "de_de_FRA_de_DE");
        org.junit.Assert.assertEquals(locale6.toString(), "fra_kor_france_KOREAN (SOUTH KOREA)");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "de_de (FRA,de,DE)" + "'", str7, "de_de (FRA,de,DE)");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.lang.String str6 = locale5.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Lorem lorem2 = faker0.lorem();
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        java.lang.String str5 = faker0.numerify("zh_CN");
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.Company company7 = faker0.company();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_CN" + "'", str5, "zh_CN");
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KOR" + "'", str3, "KOR");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints(1L);
        int int5 = random1.nextInt((int) '#');
        double double6 = random1.nextDouble();
        int int7 = random1.nextInt();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        double double9 = random1.nextDouble();
        java.util.Random random11 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream12 = random11.ints();
        random11.setSeed((long) 7);
        double double15 = random11.nextGaussian();
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.util.Random random19 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        java.util.stream.DoubleStream doubleStream22 = random19.doubles((long) (byte) 1);
        long long23 = random19.nextLong();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale17, random19);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random19);
        java.util.stream.LongStream longStream27 = random19.longs(0L);
        java.util.Random random29 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream32 = random29.doubles((double) 0.24137181f, (double) (short) 1);
        long long33 = random29.nextLong();
        java.util.Random random35 = new java.util.Random(10L);
        java.util.stream.LongStream longStream37 = random35.longs((long) 0);
        java.util.Random random39 = new java.util.Random(10L);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random39.nextBytes(byteArray45);
        random35.nextBytes(byteArray45);
        random29.nextBytes(byteArray45);
        random19.nextBytes(byteArray45);
        random11.nextBytes(byteArray45);
        random1.nextBytes(byteArray45);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.44047195711667986d + "'", double6 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1036684082 + "'", int7 == 1036684082);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8869349148715235d + "'", double9 == 0.8869349148715235d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8452060657049847d + "'", double15 == 0.8452060657049847d);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-5015647950085110473L) + "'", long23 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-4972683369271453960L) + "'", long33 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream37);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[112, -106, 89, -107, 79]");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        int int11 = random1.nextInt((int) (short) 100);
        java.util.stream.LongStream longStream12 = random1.longs();
        boolean boolean13 = random1.nextBoolean();
        java.util.stream.LongStream longStream16 = random1.longs((-5123059410709186348L), (long) (byte) 0);
        java.util.stream.DoubleStream doubleStream18 = random1.doubles(0L);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 85 + "'", int11 == 85);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getExtension('x');
        java.lang.String str3 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Finance finance5 = faker4.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-TW" + "'", str3, "zh-TW");
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.setVariant("French");
        java.util.Locale.Builder builder8 = builder3.setExtension('x', "");
        java.util.Locale locale9 = builder8.build();
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale9.getUnicodeLocaleType("CAN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: CAN");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.LongStream longStream9 = random3.longs();
        java.util.Random random11 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        int int14 = random11.nextInt(10);
        java.util.Random random16 = new java.util.Random(10L);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random16.nextBytes(byteArray22);
        random11.nextBytes(byteArray22);
        random3.nextBytes(byteArray22);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Company company27 = faker26.company();
        com.github.javafaker.Color color28 = faker26.color();
        com.github.javafaker.Address address29 = faker26.address();
        com.github.javafaker.Name name30 = faker26.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[34, 42, 124, -86, 50]");
        org.junit.Assert.assertNotNull(company27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(address29);
        org.junit.Assert.assertNotNull(name30);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.util.Locale locale3 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.lang.String str6 = locale3.getScript();
        java.util.Locale locale10 = new java.util.Locale("hi!", "french (FRENCH)", "hi!");
        java.lang.String str11 = locale3.getDisplayVariant(locale10);
        org.junit.Assert.assertEquals(locale3.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!_FRENCH (FRENCH)_hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "France" + "'", str11, "France");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("French");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Options options5 = faker0.options();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.lang.String str4 = locale0.getLanguage();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale5.getVariant();
        java.lang.String str9 = locale0.getDisplayName(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str7, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str9, "\u4e2d\u6587\u4e2d\u570b)");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fra");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale.Builder builder21 = builder17.setLocale(locale19);
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getISO3Language();
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale9, locale13, locale16, locale19, locale23 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.parse("fra", strMap32);
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
        java.util.Locale locale68 = java.util.Locale.lookup(languageRangeList33, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter(languageRangeList30, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Locale locale71 = java.util.Locale.TAIWAN;
        java.lang.String str72 = locale71.getDisplayVariant();
        java.util.Locale.Category category73 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder74 = new java.util.Locale.Builder();
        java.util.Locale locale76 = new java.util.Locale("");
        java.lang.String str77 = locale76.getISO3Language();
        java.util.Locale.Builder builder78 = builder74.setLocale(locale76);
        java.lang.String str79 = locale76.getScript();
        java.util.Locale.setDefault(category73, locale76);
        java.util.Locale locale81 = java.util.Locale.getDefault(category73);
        java.util.Locale locale82 = java.util.Locale.getDefault(category73);
        java.util.Locale.setDefault(locale82);
        java.lang.String str84 = locale71.getDisplayLanguage(locale82);
        java.util.Set<java.lang.String> strSet85 = locale71.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet85);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeList33);
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
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + category73 + "' != '" + java.util.Locale.Category.FORMAT + "'", category73.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Chinese" + "'", str84, "Chinese");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(strList86);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Internet internet6 = faker0.internet();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(internet6);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Company company7 = faker6.company();
        com.github.javafaker.Number number8 = faker6.number();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints(1L);
        long long4 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((-5785953002346952466L), 0.8452060657049847d, (-0.35703205834598994d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-5015647950085110473L) + "'", long4 == (-5015647950085110473L));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.lang.String str6 = locale3.getDisplayVariant();
        java.util.Locale locale7 = locale3.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRENCH could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french_FRENCH");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        java.lang.String str21 = locale0.getISO3Language();
        java.lang.Object obj22 = locale0.clone();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zho" + "'", str21, "zho");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "zh");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en");
        java.util.Locale locale2 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant();
        java.lang.String str6 = locale2.toLanguageTag();
        java.lang.String str7 = locale2.getISO3Country();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale2);
        java.util.Locale locale9 = null;
        java.lang.String str10 = null; // flaky: locale2.getDisplayScript(locale9);
        java.lang.String str11 = locale2.getScript();
        boolean boolean12 = languageRange1.equals((java.lang.Object) locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CHN" + "'", str7, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.util.Locale locale3 = new java.util.Locale("chn", "Chinese (Taiwan)", "ko_KR");
        java.util.Locale locale6 = new java.util.Locale("it", "zh-TW");
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale3.getDisplayLanguage(locale6);
        java.lang.String str9 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "chn_CHINESE (TAIWAN)_ko_KR");
        org.junit.Assert.assertEquals(locale6.toString(), "it_ZH-TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Gergo chinook" + "'", str8, "Gergo chinook");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chn-x-lvariant-ko-KR" + "'", str9, "chn-x-lvariant-ko-KR");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("coreano (Corea del Sud)");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale3.getDisplayScript();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
        java.util.Random random7 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream8 = random7.ints();
        java.util.stream.LongStream longStream9 = random7.longs();
        java.util.Random random11 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        int int14 = random11.nextInt(10);
        java.util.Random random16 = new java.util.Random(10L);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random16.nextBytes(byteArray22);
        random11.nextBytes(byteArray22);
        random7.nextBytes(byteArray22);
        java.util.stream.IntStream intStream26 = random7.ints();
        int int27 = random7.nextInt();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale3, random7);
        java.lang.String str29 = locale3.getScript();
        java.lang.String str30 = locale1.getDisplayScript(locale3);
        java.lang.Object obj31 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1708368258 + "'", int27 == 1708368258);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.setRegion("");
        java.util.Locale.Builder builder9 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: GB [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Business business8 = faker2.business();
        com.github.javafaker.Color color9 = faker2.color();
        java.lang.String str11 = faker2.bothify("Canada");
        java.lang.String str13 = faker2.bothify("French (France)");
        com.github.javafaker.Code code14 = faker2.code();
        com.github.javafaker.Lorem lorem15 = faker2.lorem();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Canada" + "'", str11, "Canada");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "French (France)" + "'", str13, "French (France)");
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(lorem15);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getISO3Language();
        java.util.Random random6 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        float float8 = random6.nextFloat();
        java.util.stream.IntStream intStream12 = random6.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream13 = random6.ints();
        double double14 = random6.nextDouble();
        float float15 = random6.nextFloat();
        java.util.stream.IntStream intStream16 = random6.ints();
        random6.setSeed((long) 553627293);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale0, random6);
        java.lang.String str21 = faker19.numerify("\u65e5\u672c");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese (Taiwan)" + "'", str3, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.72810113f + "'", float8 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.44047195711667986d + "'", double14 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.24137181f + "'", float15 == 0.24137181f);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u65e5\u672c" + "'", str21, "\u65e5\u672c");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh-cn", 1.2235660632835625d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.2235660632835625");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Options options8 = faker2.options();
        com.github.javafaker.Options options9 = faker2.options();
        com.github.javafaker.Options options10 = faker2.options();
        com.github.javafaker.Internet internet11 = faker2.internet();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(internet11);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        boolean boolean7 = random1.nextBoolean();
        java.util.stream.LongStream longStream11 = random1.longs(4452524227988171454L, 100L, (long) 'x');
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Business business8 = faker2.business();
        com.github.javafaker.Color color9 = faker2.color();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker2.phoneNumber();
        com.github.javafaker.Color color11 = faker2.color();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.util.Random random1 = new java.util.Random(10L);
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet4 = faker3.internet();
        com.github.javafaker.Finance finance5 = faker3.finance();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker3.phoneNumber();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73043025f + "'", float2 == 0.73043025f);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.util.Random random1 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random1.longs((long) 393447903, (long) 945906331, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        java.lang.String str21 = locale0.getISO3Language();
        java.lang.String str22 = locale0.getISO3Language();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zho" + "'", str21, "zho");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zho" + "'", str22, "zho");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream7 = random1.longs();
        java.util.stream.IntStream intStream8 = random1.ints();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.DateAndTime dateAndTime10 = faker9.date();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.util.Random random1 = new java.util.Random(10L);
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code4 = faker3.code();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker3.phoneNumber();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73043025f + "'", float2 == 0.73043025f);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("coreano");
        java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("TW", "french");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        java.util.Locale locale2 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = locale2.getCountry();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale5.getDisplayScript();
        java.lang.String str9 = locale2.getDisplayLanguage(locale5);
        java.util.Locale locale13 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category14 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale17);
        java.util.Locale.setDefault(category14, locale17);
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category14, locale20);
        java.lang.String str22 = locale13.getDisplayCountry(locale20);
        java.util.Locale locale25 = new java.util.Locale("french", "fra");
        java.lang.String str26 = locale13.getDisplayCountry(locale25);
        java.lang.String str27 = locale25.getCountry();
        java.lang.String str28 = locale5.getDisplayCountry(locale25);
        java.lang.String str29 = locale5.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA" + "'", str4, "FRA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "kor" + "'", str6, "kor");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "french" + "'", str9, "french");
        org.junit.Assert.assertEquals(locale13.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category14.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale17.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HI!" + "'", str22, "HI!");
        org.junit.Assert.assertEquals(locale25.toString(), "french_FRA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HI!" + "'", str26, "HI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "FRA" + "'", str27, "FRA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "South Korea" + "'", str28, "South Korea");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.util.Locale locale3 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale6.getDisplayName(locale10);
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale14.getISO3Language();
        java.lang.String str16 = locale14.getDisplayName();
        java.lang.String str17 = locale13.getDisplayScript(locale14);
        java.lang.String str18 = locale13.getLanguage();
        java.lang.String str19 = locale10.getDisplayCountry(locale13);
        java.lang.String str20 = locale3.getDisplayName(locale13);
        org.junit.Assert.assertEquals(locale3.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "kor" + "'", str7, "kor");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str11, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str12, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "kor" + "'", str15, "kor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "coreano (Corea del Sud)" + "'", str16, "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fra (KOR,France)" + "'", str20, "fra (KOR,France)");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber2 = faker1.phoneNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker1.resolve("ZH");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(phoneNumber2);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u6587");
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u6587");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.util.Locale locale0 = null;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        java.util.stream.DoubleStream doubleStream5 = random2.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream7 = random2.doubles(1L);
        random2.setSeed((long) 1);
        java.util.stream.LongStream longStream11 = random2.longs((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream12 = random2.doubles();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FR", 0.48032853120316416d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.util.Locale locale1 = new java.util.Locale("Japan");
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder8 = builder4.addUnicodeLocaleAttribute("Italia");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setExtension('a', "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ??? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder7 = builder2.clear();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder13 = builder8.setLocale(locale11);
        java.util.Locale.Builder builder15 = builder13.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale locale16 = builder13.build();
        java.util.Locale.Builder builder17 = builder2.setLocale(locale16);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale22 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.lang.String str24 = locale22.getDisplayVariant();
        java.lang.String str25 = locale19.getDisplayCountry(locale22);
        java.lang.String str26 = locale22.toLanguageTag();
        java.util.Locale locale27 = locale22.stripExtensions();
        java.lang.String str28 = locale16.getDisplayCountry(locale27);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale22.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "french" + "'", str26, "french");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "french_FRA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.util.Random random1 = new java.util.Random((-464978171729231043L));
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) 1036684082, (-1.3068466606213818d), (double) 1891812663);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.Random random5 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        int int8 = random5.nextInt(10);
        java.util.Random random10 = new java.util.Random(10L);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random10.nextBytes(byteArray16);
        random5.nextBytes(byteArray16);
        random1.nextBytes(byteArray16);
        java.util.stream.IntStream intStream20 = random1.ints();
        double double21 = random1.nextGaussian();
        java.util.stream.IntStream intStream22 = random1.ints();
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale23.getDisplayScript();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale23);
        java.util.Random random27 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream28 = random27.ints();
        java.util.stream.LongStream longStream29 = random27.longs();
        java.util.Random random31 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        int int34 = random31.nextInt(10);
        java.util.Random random36 = new java.util.Random(10L);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random36.nextBytes(byteArray42);
        random31.nextBytes(byteArray42);
        random27.nextBytes(byteArray42);
        java.util.stream.IntStream intStream46 = random27.ints();
        int int47 = random27.nextInt();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(locale23, random27);
        java.util.Random random50 = new java.util.Random((long) '#');
        java.util.stream.DoubleStream doubleStream52 = random50.doubles((long) (short) 100);
        java.util.Random random54 = new java.util.Random(10L);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random54.nextBytes(byteArray60);
        random50.nextBytes(byteArray60);
        random27.nextBytes(byteArray60);
        random1.nextBytes(byteArray60);
        java.util.stream.DoubleStream doubleStream66 = random1.doubles((long) 9);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.14158131146144248d) + "'", double21 == (-0.14158131146144248d));
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(intStream28);
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7 + "'", int34 == 7);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1708368258 + "'", int47 == 1708368258);
        org.junit.Assert.assertNotNull(doubleStream52);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[114, 38, -2, -10, -124]");
        org.junit.Assert.assertNotNull(doubleStream66);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale9);
        java.lang.String str11 = locale9.getDisplayName();
        java.lang.String str12 = locale9.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale9);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Name name3 = faker2.name();
        com.github.javafaker.Name name4 = faker2.name();
        com.github.javafaker.Name name5 = faker2.name();
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(name5);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        float float10 = random1.nextFloat();
        java.util.stream.IntStream intStream11 = random1.ints();
        random1.setSeed((long) 553627293);
        java.util.stream.LongStream longStream14 = random1.longs();
        double double15 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.24137181f + "'", float10 == 0.24137181f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.371765031357728d + "'", double15 == 0.371765031357728d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Book book5 = faker2.book();
        com.github.javafaker.Internet internet6 = faker2.internet();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        com.github.javafaker.Options options8 = faker2.options();
        java.lang.String str10 = faker2.bothify("gb");
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gb" + "'", str10, "gb");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        java.util.stream.LongStream longStream5 = random1.longs((long) '#', 0L, (long) (byte) 10);
        java.util.stream.LongStream longStream6 = random1.longs();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number3 = faker2.number();
        java.lang.String str5 = faker2.numerify("Chinese (China)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale6.getLanguage();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getISO3Language();
        java.lang.String str11 = locale9.getDisplayLanguage();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale9);
        java.lang.String str13 = locale6.getDisplayCountry(locale9);
        java.lang.String str14 = locale3.getDisplayName(locale6);
        java.lang.String str15 = locale3.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra" + "'", str10, "fra");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French" + "'", str11, "French");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English (United Kingdom)" + "'", str14, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color6 = faker5.color();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.util.Locale locale2 = new java.util.Locale("KOR", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale6 = new java.util.Locale("kor", "french (FRENCH)");
        java.lang.String str7 = locale6.getCountry();
        java.util.Locale locale10 = new java.util.Locale("France", "fra");
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale locale14 = locale12.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale15.getDisplayName(locale16);
        java.lang.String str18 = locale12.getDisplayName(locale16);
        java.util.Set<java.lang.Character> charSet19 = locale12.getExtensionKeys();
        java.lang.String str20 = locale12.getDisplayLanguage();
        java.lang.String str21 = locale6.getDisplayCountry(locale12);
        java.lang.String str22 = locale2.getDisplayName(locale12);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "kor_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRENCH (FRENCH)" + "'", str7, "FRENCH (FRENCH)");
        org.junit.Assert.assertEquals(locale10.toString(), "france_FRA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Korean" + "'", str11, "Korean");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "kor" + "'", str13, "kor");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str17, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str18, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Korean" + "'", str20, "Korean");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FRENCH (FRENCH)" + "'", str21, "FRENCH (FRENCH)");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\ud55c\uad6d\uc5b4\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))" + "'", str22, "\ud55c\uad6d\uc5b4\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.LongStream longStream9 = random3.longs();
        java.util.Random random11 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        int int14 = random11.nextInt(10);
        java.util.Random random16 = new java.util.Random(10L);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random16.nextBytes(byteArray22);
        random11.nextBytes(byteArray22);
        random3.nextBytes(byteArray22);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Company company27 = faker26.company();
        com.github.javafaker.Name name28 = faker26.name();
        com.github.javafaker.Finance finance29 = faker26.finance();
        com.github.javafaker.Address address30 = faker26.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[34, 42, 124, -86, 50]");
        org.junit.Assert.assertNotNull(company27);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(finance29);
        org.junit.Assert.assertNotNull(address30);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        com.github.javafaker.Book book5 = faker2.book();
        com.github.javafaker.Finance finance6 = faker2.finance();
        com.github.javafaker.Company company7 = faker2.company();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.DoubleStream doubleStream3 = random1.doubles(0L);
        long long4 = random1.nextLong();
        double double5 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-5013995466868426345L) + "'", long4 == (-5013995466868426345L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.49641270101483514d + "'", double5 == 0.49641270101483514d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        com.github.javafaker.Business business7 = faker1.business();
        com.github.javafaker.Internet internet8 = faker1.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(internet8);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book7 = faker6.book();
        com.github.javafaker.Color color8 = faker6.color();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker6.resolve("French (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setVariant("\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ???????? (???????????) [at index 0]");
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
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale1.getDisplayCountry(locale4);
        java.lang.String str8 = locale1.getDisplayVariant();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.lang.String str15 = locale12.getISO3Country();
        java.lang.String str16 = locale9.getDisplayLanguage(locale12);
        java.util.Locale locale20 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.util.Locale locale22 = new java.util.Locale("");
        java.util.Locale.setDefault(locale22);
        java.lang.String str24 = locale20.getDisplayScript(locale22);
        java.lang.String str25 = locale12.getDisplayScript(locale22);
        java.lang.String str26 = locale22.getVariant();
        java.lang.String str27 = locale1.getDisplayLanguage(locale22);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "French" + "'", str16, "French");
        org.junit.Assert.assertEquals(locale20.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de-DE", 0.23019102468168146d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de-de" + "'", str3, "de-de");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream3 = random1.longs((long) 0);
        java.util.Random random5 = new java.util.Random(10L);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random5.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        java.util.stream.IntStream intStream17 = random1.ints((long) (short) 0, (-1), (int) (short) 0);
        java.util.stream.DoubleStream doubleStream21 = random1.doubles((long) 38, 0.7304302967434272d, 1.2981846735357514d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream25 = random1.doubles((long) 1430131985, 0.3268766592932178d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-46, 122, -3, -70, -8]");
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        java.util.Random random1 = new java.util.Random((long) 38);
        boolean boolean2 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random1.ints((-5015647950085110473L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        long long5 = random1.nextLong();
        random1.setSeed((long) 'a');
        long long8 = random1.nextLong();
        long long9 = random1.nextLong();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-5015647950085110473L) + "'", long5 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5123059410709186348L) + "'", long8 == (-5123059410709186348L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-5785953002346952466L) + "'", long9 == (-5785953002346952466L));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random2.ints((long) 1891812663, (int) ' ', (-485610818));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        java.util.Locale locale2 = new java.util.Locale("fra", "China");
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "fra_CHINA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
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
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        java.util.Locale locale2 = new java.util.Locale("\u6cd5\u6587", "");
        org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u6587");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = locale0.getISO3Country();
        java.util.Locale locale5 = new java.util.Locale("FRENCH (FRENCH)");
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale0.getDisplayName(locale5);
        java.lang.String str8 = locale5.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KOR" + "'", str3, "KOR");
        org.junit.Assert.assertEquals(locale5.toString(), "french (french)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean (South Korea)" + "'", str7, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream3 = random1.longs((long) 0);
        java.util.Random random5 = new java.util.Random(10L);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random5.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        java.util.stream.DoubleStream doubleStream16 = random1.doubles((double) (-4967725919621401576L), (-1.3325983427023256d));
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-46, 122, -3, -70, -8]");
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-CA", (double) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=13.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        double double2 = random1.nextDouble();
        java.util.stream.IntStream intStream3 = random1.ints();
        double double4 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22278216143339702d + "'", double2 == 0.22278216143339702d);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.14158131146144248d) + "'", double4 == (-0.14158131146144248d));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Internet internet10 = faker9.internet();
        java.lang.String str12 = faker9.bothify("fr-FR");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker9.resolve("\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr-FR" + "'", str12, "fr-FR");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setScript("");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("Canada");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setRegion("\ud55c\uad6d\uc5b4\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ???????? (??? (????)) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fra (HI!,kor)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fra(hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????(???????????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.util.Random random9 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        float float11 = random9.nextFloat();
        java.util.stream.IntStream intStream15 = random9.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream17 = random9.ints((long) 'x');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale7, random9);
        java.util.Locale.Builder builder19 = builder4.setLocale(locale7);
        java.util.Locale.Builder builder21 = builder19.addUnicodeLocaleAttribute("francese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder21.removeUnicodeLocaleAttribute("\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (??) [at index 0]");
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
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.72810113f + "'", float11 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.util.Locale locale3 = new java.util.Locale("zh-CN", "zh-CN", "fra-France");
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale locale6 = new java.util.Locale("french (FRENCH)");
        java.util.Locale locale10 = new java.util.Locale("hi!", "french (FRENCH)", "hi!");
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale6.getDisplayCountry(locale10);
        java.util.Locale locale14 = new java.util.Locale("France");
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale10.getDisplayCountry(locale14);
        java.lang.String str17 = locale3.getDisplayLanguage(locale14);
        java.util.Locale locale19 = new java.util.Locale("TW");
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = builder20.build();
        java.util.Locale.Builder builder22 = builder20.clear();
        java.util.Locale locale23 = builder22.build();
        java.lang.String str24 = locale23.getDisplayName();
        java.lang.String str25 = locale19.getDisplayScript(locale23);
        java.lang.String str26 = locale14.getDisplayName(locale23);
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cn_ZH-CN_fra-France");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ZH-CN" + "'", str4, "ZH-CN");
        org.junit.Assert.assertEquals(locale6.toString(), "french (french)");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!_FRENCH (FRENCH)_hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale14.toString(), "france");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FRENCH (FRENCH)" + "'", str16, "FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-cn" + "'", str17, "zh-cn");
        org.junit.Assert.assertEquals(locale19.toString(), "tw");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "france" + "'", str26, "france");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextGaussian();
        double double2 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random0.doubles((-5013995466868426345L), 0.0d, 0.2413718236526089d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05350525567307007d + "'", double1 == 0.05350525567307007d);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0423195769646623d + "'", double2 == 1.0423195769646623d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.util.Locale locale3 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale7 = new java.util.Locale("fra", "fra");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Locale locale9 = locale3.stripExtensions();
        java.lang.String str10 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals(locale7.toString(), "fra_FRA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra" + "'", str8, "fra");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fra_KOR_France");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra_KOR_France" + "'", str10, "fra_KOR_France");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.util.Random random1 = new java.util.Random((long) 7);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.22278214f, (double) 100);
        java.util.stream.LongStream longStream5 = random1.longs();
        java.lang.Class<?> wildcardClass6 = random1.getClass();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("Cina");
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale7.toLanguageTag();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale7);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale11.getDisplayCountry();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getISO3Language();
        java.util.Locale locale16 = java.util.Locale.UK;
        java.lang.String str17 = locale14.getDisplayLanguage(locale16);
        java.lang.String str18 = locale11.getDisplayName(locale16);
        java.util.Locale locale19 = java.util.Locale.US;
        java.lang.String str20 = locale19.getISO3Language();
        java.lang.String str21 = locale11.getDisplayCountry(locale19);
        java.lang.String str22 = locale7.getDisplayLanguage(locale11);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ko-KR" + "'", str9, "ko-KR");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "France" + "'", str12, "France");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "French (France)" + "'", str18, "French (France)");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eng" + "'", str20, "eng");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "France" + "'", str21, "France");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "cor\351en" + "'", str22, "cor\351en");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("de_de (FRA,de,DE)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=de_de (fra,de,de)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        java.util.Locale locale3 = new java.util.Locale("ita", "Chinook jargon (Germany,KR)", "\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.util.Random random1 = new java.util.Random(4755622236989466036L);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.util.Locale locale2 = new java.util.Locale("coreano", "\u97e9\u56fd");
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        float float6 = random4.nextFloat();
        java.util.stream.DoubleStream doubleStream10 = random4.doubles((long) 1, 0.2413718236526089d, (double) 0.6659571f);
        java.util.stream.DoubleStream doubleStream11 = random4.doubles();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale2, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: coreano_?? could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u97e9\u56fd");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.72810113f + "'", float6 == 0.72810113f);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("und-France", (double) (-2085682583702141179L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-2.08568258370214118E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.util.Locale locale2 = new java.util.Locale("Gergo chinook", "");
        org.junit.Assert.assertEquals(locale2.toString(), "gergo chinook");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.LongStream longStream9 = random3.longs();
        int int11 = random3.nextInt(1);
        double double12 = random3.nextDouble();
        float float13 = random3.nextFloat();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2413718236526089d + "'", double12 == 0.2413718236526089d);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.57896465f + "'", float13 == 0.57896465f);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("TWN", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.util.Locale locale3 = new java.util.Locale("fr", "Chinese (China)", "tedesco");
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3, random4);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CHINESE (CHINA)_tedesco");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Random random9 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((long) (byte) 1);
        long long13 = random9.nextLong();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale7, random9);
        java.util.stream.LongStream longStream15 = random9.longs();
        int int17 = random9.nextInt(1);
        double double18 = random9.nextDouble();
        float float19 = random9.nextFloat();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0, random9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CHN" + "'", str5, "CHN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-5015647950085110473L) + "'", long13 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2413718236526089d + "'", double18 == 0.2413718236526089d);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.57896465f + "'", float19 == 0.57896465f);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Color color9 = faker8.color();
        com.github.javafaker.Number number10 = faker8.number();
        java.lang.String str12 = faker8.numerify("fra_KOR_France");
        com.github.javafaker.Color color13 = faker8.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fra_KOR_France" + "'", str12, "fra_KOR_France");
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.setVariant("French");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }
}
