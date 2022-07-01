import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 'u');
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 1, (double) 6, (double) 553627293);
        java.util.stream.DoubleStream doubleStream14 = random1.doubles((long) 85, 0.8869349148715235d, (double) 1036684082);
        java.util.stream.DoubleStream doubleStream15 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(doubleStream15);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setExtension('u', "french (FRENCH)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: french (FRENCH) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str5 = locale1.getCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("chinese_kor (CANADA)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese_kor(canada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.Locale locale1 = new java.util.Locale("FRA-X-LVARIANT-KOR_HI!");
        org.junit.Assert.assertEquals(locale1.toString(), "fra-x-lvariant-kor_hi!");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.Locale locale3 = new java.util.Locale("", "Germany", "fr");
        org.junit.Assert.assertEquals(locale3.toString(), "_GERMANY_fr");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.Locale locale2 = new java.util.Locale("fra-x-lvariant-kor", "hi!");
        java.lang.String str3 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.lang.String str8 = locale5.getScript();
        java.util.Locale.setDefault(category2, locale5);
        java.util.Locale locale10 = java.util.Locale.getDefault(category2);
        java.util.Locale locale11 = java.util.Locale.getDefault(category2);
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale0.getDisplayLanguage(locale11);
        java.lang.String str14 = locale11.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "und" + "'", str14, "und");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.Random random1 = new java.util.Random((long) '#');
        long long2 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        boolean boolean4 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random1.longs((long) 'a', (long) 'u', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5013995466868426345L) + "'", long2 == (-5013995466868426345L));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.Random random1 = new java.util.Random((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 'a', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.lang.String str6 = locale2.toLanguageTag();
        java.lang.String str7 = locale2.getVariant();
        java.lang.String str8 = locale2.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet9 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", 0.371765031357728d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u97e9\u56fd", (double) (-5015647950085110473L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-5.0156479500851108E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        java.lang.String str15 = locale0.getScript();
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale0, random16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.35703205834598994d) + "'", double12 == (-0.35703205834598994d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random3.ints((long) 10, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French (France)" + "'", str2, "French (France)");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setRegion("\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ????????? (???????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder8 = builder3.setLanguage("cinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("Korean");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Korean [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder10 = builder5.setRegion("fr");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "en");
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("und");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        int int2 = random1.nextInt();
        int int3 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        float float5 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1157793070) + "'", int2 == (-1157793070));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1913984760 + "'", int3 == 1913984760);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.25780278f + "'", float5 == 0.25780278f);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.LongStream longStream6 = random1.longs();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.Locale locale1 = new java.util.Locale("fr");
        java.lang.String str2 = locale1.getISO3Language();
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: CN [at index 0]");
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
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("french");
        java.util.Locale locale6 = new java.util.Locale("CHN");
        java.util.Locale.Builder builder7 = builder0.setLocale(locale6);
        boolean boolean8 = locale6.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale6.toString(), "chn");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Random random13 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Name name15 = faker14.name();
        com.github.javafaker.Name name16 = faker14.name();
        boolean boolean17 = locale11.equals((java.lang.Object) faker14);
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
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        double double2 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = random1.longs((-4967725919621401576L), (long) 'x', (long) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22278216143339702d + "'", double2 == 0.22278216143339702d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Internet internet3 = faker2.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(internet3);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color3 = faker2.color();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker2.resolve("fra-France");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("it", "French (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: French (France) [at index 0]");
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random1.ints((int) 'u', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 'u');
        java.util.stream.LongStream longStream7 = random1.longs();
        random1.setSeed((long) (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Finance finance11 = faker9.finance();
        com.github.javafaker.Finance finance12 = faker9.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(finance12);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        boolean boolean6 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        java.util.stream.IntStream intStream11 = random1.ints((long) (byte) 100);
        java.util.stream.IntStream intStream15 = random1.ints((long) '4', (int) '#', (int) 'x');
        boolean boolean16 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream20 = random1.doubles((long) (byte) 10, (double) (short) 0, 0.6659570968355509d);
        java.util.stream.IntStream intStream21 = random1.ints();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(intStream21);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Business business8 = faker2.business();
        java.lang.String str10 = faker2.numerify("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str10, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.Random random1 = new java.util.Random((-5785953002346952466L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) (-1157793070), 0L, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        java.util.stream.IntStream intStream11 = random1.ints((long) (byte) 100);
        java.util.stream.IntStream intStream15 = random1.ints((long) '4', (int) '#', (int) 'x');
        boolean boolean16 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream20 = random1.doubles((long) (byte) 10, (double) (short) 0, 0.6659570968355509d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream23 = random1.longs(100L, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleStream20);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("coreano");
        java.util.Locale.Builder builder11 = builder10.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        boolean boolean4 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Name name3 = faker2.name();
        com.github.javafaker.Name name4 = faker2.name();
        com.github.javafaker.Code code5 = faker2.code();
        java.lang.String str7 = faker2.bothify("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        com.github.javafaker.PhoneNumber phoneNumber8 = faker2.phoneNumber();
        java.lang.String str10 = faker2.letterify("\uc911\uad6d");
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str7, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\uc911\uad6d" + "'", str10, "\uc911\uad6d");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zho");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.Random random1 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt((int) '4');
        java.util.stream.IntStream intStream5 = random1.ints();
        java.util.stream.LongStream longStream7 = random1.longs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Company company5 = faker2.company();
        com.github.javafaker.Lorem lorem6 = faker2.lorem();
        com.github.javafaker.Internet internet7 = faker2.internet();
        java.lang.String str9 = faker2.numerify("KR");
        java.lang.String str11 = faker2.numerify("China");
        com.github.javafaker.Options options12 = faker2.options();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "KR" + "'", str9, "KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        com.github.javafaker.Code code9 = faker2.code();
        java.lang.String str11 = faker2.letterify("eng");
        java.lang.String str13 = faker2.letterify("Korean (FRENCH (FRENCH))");
        com.github.javafaker.Finance finance14 = faker2.finance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eng" + "'", str11, "eng");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Korean (FRENCH (FRENCH))" + "'", str13, "Korean (FRENCH (FRENCH))");
        org.junit.Assert.assertNotNull(finance14);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        boolean boolean7 = random1.nextBoolean();
        double double8 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.35703205834598994d) + "'", double8 == (-0.35703205834598994d));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        double double4 = random1.nextDouble();
        java.util.stream.IntStream intStream5 = random1.ints();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7281011855672591d + "'", double4 == 0.7281011855672591d);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.Locale locale1 = new java.util.Locale("FRENCH (FRENCH)");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "french (french)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.util.Locale locale2 = new java.util.Locale("jpn", "Chinese (Taiwan)");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "jpn_CHINESE (TAIWAN)");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale15.getDisplayScript();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale15);
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale locale24 = new java.util.Locale("kor", "", "");
        java.lang.String str25 = locale19.getDisplayName(locale24);
        java.util.Locale.setDefault(category0, locale19);
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.lang.String str28 = locale27.getDisplayScript();
        java.lang.String str29 = locale27.getDisplayLanguage();
        java.util.Locale locale30 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.lang.String str32 = locale30.getDisplayCountry();
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.lang.String str35 = locale30.getDisplayCountry(locale34);
        java.lang.String str36 = locale27.getDisplayScript(locale34);
        boolean boolean37 = locale34.hasExtensions();
        java.util.Locale.setDefault(category0, locale34);
        java.util.Locale locale39 = java.util.Locale.getDefault(category0);
        java.lang.Class<?> wildcardClass40 = category0.getClass();
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "kor" + "'", str20, "kor");
        org.junit.Assert.assertEquals(locale24.toString(), "kor");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Korean (South Korea)" + "'", str25, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str29, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setUnicodeLocaleKeyword("CHINESE", "zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: CHINESE [at index 0]");
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code7 = faker6.code();
        java.lang.String str9 = faker6.numerify("FRENCH (FRENCH)");
        java.lang.String str11 = faker6.bothify("tedesco");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRENCH (FRENCH)" + "'", str9, "FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "tedesco" + "'", str11, "tedesco");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("FRENCH (FRENCH)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRENCH (FRENCH) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        long long5 = random1.nextLong();
        random1.setSeed((long) 'a');
        long long8 = random1.nextLong();
        long long9 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random1.longs((long) (-1155869325), (long) (-1193959466), (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-5015647950085110473L) + "'", long5 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5123059410709186348L) + "'", long8 == (-5123059410709186348L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-5785953002346952466L) + "'", long9 == (-5785953002346952466L));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
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
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.util.Random random1 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt((int) '4');
        java.util.stream.IntStream intStream5 = random1.ints();
        double double6 = random1.nextDouble();
        java.util.stream.IntStream intStream8 = random1.ints((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random1.longs((long) (-1167796541), (long) 'u', (-6162003863595742414L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6991794951529816d + "'", double6 == 0.6991794951529816d);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ENGLISH");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.lang.String str6 = locale0.getISO3Language();
        boolean boolean7 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str3, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber();
        com.github.javafaker.Finance finance8 = faker6.finance();
        java.lang.String str10 = faker6.numerify("fr-FR");
        java.lang.String str12 = faker6.letterify("\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)" + "'", str2, "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)");
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr-FR" + "'", str10, "fr-FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str12, "\u671d\u9c9c\u6587\u97e9\u56fd)");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("und");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.Locale locale3 = new java.util.Locale("fran\347ais", "France", "it_IT");
        org.junit.Assert.assertEquals(locale3.toString(), "fran\347ais_FRANCE_it_IT");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setVariant("kor");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: kor [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale15.getDisplayScript();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale15);
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        java.util.Locale locale20 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.util.Random random1 = new java.util.Random((long) 'a');
        java.util.stream.IntStream intStream4 = random1.ints(13, 85);
        java.util.stream.IntStream intStream5 = random1.ints();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.Random random1 = new java.util.Random((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random1.ints(1761283695, (-1789290896));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguageTag("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: French (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Code code4 = faker1.code();
        java.lang.String str6 = faker1.letterify("FRA");
        com.github.javafaker.PhoneNumber phoneNumber7 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getLanguage();
        java.util.Locale locale6 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet7 = locale0.getUnicodeLocaleKeys();
        java.lang.Class<?> wildcardClass8 = strSet7.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str3, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("English");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Chinese (Taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "english");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getISO3Country();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("french", "fra-x-lvariant-kor");
        java.lang.String str11 = locale9.getExtension('u');
        java.util.Set<java.lang.String> strSet12 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale6.getDisplayCountry(locale9);
        java.util.Random random15 = new java.util.Random((long) 85);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale6, random15);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals(locale9.toString(), "french_FRA-X-LVARIANT-KOR");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", 0.23019102468168146d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.util.Locale locale2 = new java.util.Locale("zh-CN", "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cn_COREANO (COREA DEL SUD)");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French (Canada)", (double) 5840930912313687631L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.8409309123136881E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese" + "'", str4, "Chinese");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale5 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.lang.String str6 = locale0.getDisplayLanguage(locale5);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale5.getDisplayCountry(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale5.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese" + "'", str6, "Chinese");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        float float4 = random2.nextFloat();
        java.util.stream.IntStream intStream8 = random2.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream10 = random2.ints((long) 'x');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Business business12 = faker11.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.72810113f + "'", float4 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(business12);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Color color6 = faker1.color();
        com.github.javafaker.Book book7 = faker1.book();
        com.github.javafaker.Color color8 = faker1.color();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker1.resolve("CHN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale6);
        java.lang.String str8 = locale6.getDisplayCountry();
        java.lang.String str9 = locale0.getDisplayCountry(locale6);
        java.lang.String str10 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str2, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str8, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber2 = faker1.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Code code6 = faker1.code();
        java.lang.String str8 = faker1.letterify("fra_KOR_France");
        java.lang.String str10 = faker1.letterify("french (france)_CANADA");
        java.lang.String str12 = faker1.numerify("francese");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra_KOR_France" + "'", str8, "fra_KOR_France");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "french (france)_CANADA" + "'", str10, "french (france)_CANADA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "francese" + "'", str12, "francese");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = new java.util.Locale("fra", "China");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale3);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "fra_CHINA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra" + "'", str4, "fra");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getISO3Language();
        java.lang.String str17 = locale12.getDisplayVariant(locale15);
        java.lang.String str18 = locale2.getDisplayName(locale15);
        java.lang.String str20 = locale15.getExtension('u');
        java.lang.String str21 = locale15.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.util.Locale locale1 = new java.util.Locale("chinois (Taiwan)");
        org.junit.Assert.assertEquals(locale1.toString(), "chinois (taiwan)");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale15.getDisplayName();
        java.lang.String str17 = locale4.getDisplayCountry(locale15);
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "inglese" + "'", str16, "inglese");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Code code2 = faker0.code();
        com.github.javafaker.Business business3 = faker0.business();
        java.lang.String str5 = faker0.numerify("Korean (South Korea)");
        com.github.javafaker.Company company6 = faker0.company();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Korean (South Korea)" + "'", str5, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale locale7 = builder3.build();
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale11 = locale9.stripExtensions();
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale11.getDisplayCountry(locale13);
        java.util.Locale.Builder builder15 = builder3.setLocale(locale13);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "english");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("Cina");
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale7.toLanguageTag();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale7);
        java.util.Locale locale11 = builder6.build();
        java.util.Locale.Builder builder13 = builder6.setLanguageTag("zh-TW");
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
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.util.Random random1 = new java.util.Random((long) (byte) -1);
        double double2 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7853314409882288d + "'", double2 == 1.7853314409882288d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("jpn", 0.0d);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.lang.String str8 = faker6.numerify("fra");
        com.github.javafaker.PhoneNumber phoneNumber9 = faker6.phoneNumber();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra" + "'", str8, "fra");
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.IntStream intStream3 = random1.ints((long) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color5 = faker4.color();
        com.github.javafaker.Lorem lorem6 = faker4.lorem();
        com.github.javafaker.Code code7 = faker4.code();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 100);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet8 = faker7.internet();
        com.github.javafaker.Internet internet9 = faker7.internet();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(internet9);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra" + "'", str4, "fra");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra" + "'", str5, "fra");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.setVariant("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.removeUnicodeLocaleAttribute("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: French (Canada) [at index 0]");
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
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.util.Locale locale3 = new java.util.Locale("fr", "Chinese (China)", "tedesco");
        java.util.Locale locale4 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CHINESE (CHINA)_tedesco");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CHINESE (CHINA)_tedesco");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.lang.String str6 = locale2.toLanguageTag();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = locale7.getDisplayName();
        java.lang.String str10 = locale7.getDisplayScript();
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.util.Random random13 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        int int16 = random13.nextInt(10);
        java.util.stream.DoubleStream doubleStream17 = random13.doubles();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale11, random13);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale7, random13);
        float float21 = random13.nextFloat();
        java.util.stream.IntStream intStream22 = random13.ints();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale2, random13);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "kor" + "'", str8, "kor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Korean (South Korea)" + "'", str9, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.44047195f + "'", float21 == 0.44047195f);
        org.junit.Assert.assertNotNull(intStream22);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("cinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cinese (taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.util.Locale locale2 = new java.util.Locale("fra_KOR_France", "CA");
        org.junit.Assert.assertEquals(locale2.toString(), "fra_kor_france_CA");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.util.Locale locale2 = new java.util.Locale("kor", "french (FRENCH)");
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.getVariant();
        boolean boolean5 = locale2.hasExtensions();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale2, random6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: kor_FRENCH (FRENCH) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "kor_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (FRENCH (FRENCH))" + "'", str3, "Korean (FRENCH (FRENCH))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.040336471041875925d + "'", double7 == 0.040336471041875925d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        java.util.stream.IntStream intStream11 = random1.ints((long) (byte) 100);
        java.util.stream.IntStream intStream15 = random1.ints((long) '4', (int) '#', (int) 'x');
        boolean boolean16 = random1.nextBoolean();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Business business18 = faker17.business();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(business18);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        java.lang.String str17 = locale2.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ko_KR" + "'", str17, "ko_KR");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.setVariant("");
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "CA");
        java.util.Locale.Builder builder14 = builder12.setLanguage("German");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "kor");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale5 = new java.util.Locale("kor", "", "");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Random random8 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        float float10 = random8.nextFloat();
        java.util.stream.IntStream intStream14 = random8.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream15 = random8.ints();
        double double16 = random8.nextDouble();
        java.util.stream.IntStream intStream18 = random8.ints((long) (byte) 100);
        java.util.stream.IntStream intStream22 = random8.ints((long) '4', (int) '#', (int) 'x');
        boolean boolean23 = random8.nextBoolean();
        java.util.stream.DoubleStream doubleStream27 = random8.doubles((long) (byte) 10, (double) (short) 0, 0.6659570968355509d);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale0, random8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals(locale5.toString(), "kor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Korean (South Korea)" + "'", str6, "Korean (South Korea)");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.72810113f + "'", float10 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.44047195711667986d + "'", double16 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleStream27);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale4.getDisplayLanguage();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale4);
        java.lang.String str8 = locale1.getDisplayCountry(locale4);
        java.lang.String str9 = locale1.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra" + "'", str5, "fra");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.lang.String str10 = locale9.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.lang.String str5 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "French" + "'", str4, "French");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr_CA" + "'", str5, "fr_CA");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.LongStream longStream10 = random1.longs((long) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        int int12 = random1.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream15 = random1.doubles((double) 4755622236989466036L, (double) (-4967725919621401576L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1155869325) + "'", int12 == (-1155869325));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap27);
        java.util.Locale locale29 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale29);
        java.lang.String str31 = locale29.getDisplayCountry();
        java.lang.String str32 = locale29.getDisplayVariant();
        java.lang.String str33 = locale29.toLanguageTag();
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(locale29);
        java.util.Random random36 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random36);
        int int39 = random36.nextInt(10);
        java.util.stream.DoubleStream doubleStream40 = random36.doubles();
        double double41 = random36.nextGaussian();
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(locale29, random36);
        java.lang.String str43 = locale29.getVariant();
        java.lang.String str44 = locale29.getVariant();
        java.util.Set<java.lang.String> strSet45 = locale29.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet45, filteringMode46);
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
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "China" + "'", str31, "China");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-CN" + "'", str33, "zh-CN");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7 + "'", int39 == 7);
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-0.35703205834598994d) + "'", double41 == (-0.35703205834598994d));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode46.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList47);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setLanguage("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("de-DE");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setScript("zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList28, strMap29);
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
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeList30);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("eng");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        double double16 = random6.nextGaussian();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str2, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.44047195f + "'", float14 == 0.44047195f);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3268766592932178d + "'", double16 == 0.3268766592932178d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.util.Locale locale3 = new java.util.Locale("de_DE", "French", "it_IT");
        java.lang.Object obj4 = null;
        boolean boolean5 = locale3.equals(obj4);
        org.junit.Assert.assertEquals(locale3.toString(), "de_de_FRENCH_it_IT");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale locale3 = null;
        java.lang.String str4 = null; // flaky: locale0.getDisplayScript(locale3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Finance finance11 = faker9.finance();
        com.github.javafaker.Code code12 = faker9.code();
        com.github.javafaker.Lorem lorem13 = faker9.lorem();
        java.lang.String str15 = faker9.letterify("\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setRegion("fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fra [at index 0]");
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
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.util.Locale.Builder builder8 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder9 = builder2.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "kor" + "'", str5, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str6, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Finance finance11 = faker9.finance();
        com.github.javafaker.Number number12 = faker9.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(number12);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
            java.util.Locale.Builder builder13 = builder8.setUnicodeLocaleKeyword("South Korea", "Italia");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: South Korea [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str6, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        boolean boolean1 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("jpn", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        java.util.Locale.Builder builder21 = builder19.addUnicodeLocaleAttribute("Italia");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder19.setRegion("China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: China [at index 0]");
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
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.util.Locale locale3 = new java.util.Locale("canada (FRENCH (FRENCH))", "ZH-CN", "francese (Francia)");
        org.junit.Assert.assertEquals(locale3.toString(), "canada (french (french))_ZH-CN_francese (Francia)");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("jpn", (-0.14158131146144248d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.14158131146144248");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('u', "Cina");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("FRA-X-LVARIANT-KOR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: FRA-X-LVARIANT-KOR [at index 0]");
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale locale9 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setLanguage("french (france) (CANADA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: french (france) (CANADA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "kor");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.lang.String str6 = locale2.toLanguageTag();
        java.lang.String str7 = locale2.getVariant();
        boolean boolean8 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setExtension('#', "zh-TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
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
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream7 = random1.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        double double8 = random1.nextGaussian();
        double double9 = random1.nextDouble();
        int int10 = random1.nextInt();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.2235660632835625d + "'", double8 == 1.2235660632835625d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8869349148715235d + "'", double9 == 0.8869349148715235d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1789290896) + "'", int10 == (-1789290896));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.util.Locale locale2 = new java.util.Locale("kor", "french (FRENCH)");
        java.lang.String str3 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "kor_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        boolean boolean4 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.lang.String str6 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "French" + "'", str5, "French");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category13 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale16);
        java.util.Locale.setDefault(category13, locale16);
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category13, locale19);
        java.lang.String str21 = locale12.getDisplayCountry(locale19);
        java.util.Locale locale24 = new java.util.Locale("french", "fra");
        java.lang.String str25 = locale12.getDisplayCountry(locale24);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale27 = locale12.stripExtensions();
        java.util.Random random29 = new java.util.Random((long) 'a');
        int int31 = random29.nextInt((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale12, random29);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra_HI!_kor could not be found, does not have a corresponding yaml file");
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
        org.junit.Assert.assertEquals(locale12.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category13.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale16.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
        org.junit.Assert.assertEquals(locale24.toString(), "french_FRA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HI!" + "'", str25, "HI!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 38 + "'", int31 == 38);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        java.lang.String str5 = faker1.numerify("it");
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Color color7 = faker1.color();
        com.github.javafaker.Finance finance8 = faker1.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.util.Random random1 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt((int) '4');
        java.util.stream.IntStream intStream5 = random1.ints();
        double double6 = random1.nextDouble();
        boolean boolean7 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6991794951529816d + "'", double6 == 0.6991794951529816d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream2 = random1.longs();
        int int3 = random1.nextInt();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1157793070) + "'", int3 == (-1157793070));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.util.Locale locale2 = new java.util.Locale("chinese_KOR", "Canada");
        java.util.Locale locale5 = new java.util.Locale("hi!", "zh-CN");
        java.lang.String str6 = locale2.getDisplayName(locale5);
        java.lang.String str7 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_kor_CANADA");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_ZH-CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinese_kor (CANADA)" + "'", str6, "chinese_kor (CANADA)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale15.getDisplayScript();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale15);
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale22 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet24 = locale22.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale22);
        java.lang.String str26 = locale22.getDisplayLanguage();
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale22.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fra" + "'", str26, "fra");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.lang.String str15 = locale0.getScript();
        java.lang.Object obj16 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.35703205834598994d) + "'", double12 == (-0.35703205834598994d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "zh_CN");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder7 = builder4.setExtension('a', "FRA");
        java.util.Locale.Builder builder9 = builder4.setRegion("ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.util.Random random1 = new java.util.Random((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.7732599f, 0.7281011855672591d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("Korean");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setScript("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Chinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ko-KR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getISO3Country();
        java.lang.String str7 = locale0.getDisplayLanguage(locale3);
        java.util.Locale locale11 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Locale.setDefault(locale13);
        java.lang.String str15 = locale11.getDisplayScript(locale13);
        java.lang.String str16 = locale3.getDisplayScript(locale13);
        java.lang.String str17 = locale13.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertEquals(locale11.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        java.lang.String str13 = locale8.getCountry();
        java.lang.String str14 = locale8.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.util.Locale locale2 = new java.util.Locale("French", "french");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRENCH" + "'", str3, "FRENCH");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        float float9 = random2.nextFloat();
        random2.setSeed((long) (short) 10);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.44047195f + "'", float9 == 0.44047195f);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Korean (South Korea)", (double) 38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=38.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.util.Locale locale2 = new java.util.Locale("eng", "Japanese");
        org.junit.Assert.assertEquals(locale2.toString(), "eng_JAPANESE");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("chinese_KOR", 0.8452060657049847d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese_kor");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.util.Locale locale3 = new java.util.Locale("Italy", "\u4e2d\u6587", "de_DE");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587_de_DE");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.util.Locale locale1 = new java.util.Locale("french (FRENCH)");
        java.util.Locale locale5 = new java.util.Locale("hi!", "french (FRENCH)", "hi!");
        boolean boolean6 = locale5.hasExtensions();
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale1.getUnicodeLocaleType("Canada");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Canada");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "french (french)");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_FRENCH (FRENCH)_hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.LongStream longStream10 = random1.longs((long) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream13 = random1.ints((long) 1);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        java.util.stream.IntStream intStream11 = random1.ints((long) (byte) 100);
        java.util.stream.IntStream intStream15 = random1.ints((long) '4', (int) '#', (int) 'x');
        boolean boolean16 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream20 = random1.doubles((long) (byte) 10, (double) (short) 0, 0.6659570968355509d);
        double double21 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.8869349148715235d + "'", double21 == 0.8869349148715235d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.lang.String str8 = faker6.numerify("fra");
        com.github.javafaker.Business business9 = faker6.business();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra" + "'", str8, "fra");
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        java.util.stream.LongStream longStream11 = random3.longs(0L);
        java.util.Random random13 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream16 = random13.doubles((double) 0.24137181f, (double) (short) 1);
        long long17 = random13.nextLong();
        java.util.Random random19 = new java.util.Random(10L);
        java.util.stream.LongStream longStream21 = random19.longs((long) 0);
        java.util.Random random23 = new java.util.Random(10L);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random23.nextBytes(byteArray29);
        random19.nextBytes(byteArray29);
        random13.nextBytes(byteArray29);
        random3.nextBytes(byteArray29);
        java.util.Random random35 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(random35);
        float float37 = random35.nextFloat();
        java.util.stream.IntStream intStream41 = random35.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream42 = random35.ints();
        java.util.stream.IntStream intStream43 = random35.ints();
        java.util.stream.DoubleStream doubleStream44 = random35.doubles();
        java.util.Random random46 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(random46);
        int int49 = random46.nextInt((int) '4');
        java.util.stream.IntStream intStream50 = random46.ints();
        java.util.Random random52 = new java.util.Random((long) (byte) 100);
        java.util.Random random54 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream55 = random54.ints();
        java.util.stream.LongStream longStream56 = random54.longs();
        java.util.Random random58 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker59 = new com.github.javafaker.Faker(random58);
        int int61 = random58.nextInt(10);
        java.util.Random random63 = new java.util.Random(10L);
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random63.nextBytes(byteArray69);
        random58.nextBytes(byteArray69);
        random54.nextBytes(byteArray69);
        random52.nextBytes(byteArray69);
        random46.nextBytes(byteArray69);
        random35.nextBytes(byteArray69);
        random3.nextBytes(byteArray69);
        float float77 = random3.nextFloat();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-4972683369271453960L) + "'", long17 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[34, 42, 124, -86, 50]");
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.72810113f + "'", float37 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertNotNull(intStream42);
        org.junit.Assert.assertNotNull(intStream43);
        org.junit.Assert.assertNotNull(doubleStream44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 31 + "'", int49 == 31);
        org.junit.Assert.assertNotNull(intStream50);
        org.junit.Assert.assertNotNull(intStream55);
        org.junit.Assert.assertNotNull(longStream56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 7 + "'", int61 == 7);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[-66, 42, 14, -29, 5]");
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 0.5833982f + "'", float77 == 0.5833982f);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        float float10 = random1.nextFloat();
        java.util.stream.IntStream intStream11 = random1.ints();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Random random15 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((long) (byte) 1);
        long long19 = random15.nextLong();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale13, random15);
        java.util.stream.LongStream longStream21 = random15.longs();
        java.util.Random random23 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        int int26 = random23.nextInt(10);
        java.util.Random random28 = new java.util.Random(10L);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random28.nextBytes(byteArray34);
        random23.nextBytes(byteArray34);
        random15.nextBytes(byteArray34);
        random1.nextBytes(byteArray34);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.24137181f + "'", float10 == 0.24137181f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-5015647950085110473L) + "'", long19 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-66, 42, 14, -29, 5]");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        java.util.stream.DoubleStream doubleStream16 = random4.doubles((long) (short) 1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.72810113f + "'", float6 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.44047195711667986d + "'", double12 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.24137181f + "'", float13 == 0.24137181f);
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italy" + "'", str1, "Italy");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale3 = new java.util.Locale("fr");
        java.lang.String str4 = locale3.getLanguage();
        java.util.Random random6 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) 0.24137181f, (double) (short) 1);
        long long10 = random6.nextLong();
        java.util.Random random12 = new java.util.Random(10L);
        java.util.stream.LongStream longStream14 = random12.longs((long) 0);
        java.util.Random random16 = new java.util.Random(10L);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random16.nextBytes(byteArray22);
        random12.nextBytes(byteArray22);
        random6.nextBytes(byteArray22);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale3, random6);
        java.lang.String str27 = locale0.getDisplayLanguage(locale3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de-DE" + "'", str1, "de-DE");
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-4972683369271453960L) + "'", long10 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[58, 93, -1, 65, -76]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "allemand" + "'", str27, "allemand");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Company company5 = faker2.company();
        java.lang.String str7 = faker2.letterify("chinois (Taiwan)");
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chinois (Taiwan)" + "'", str7, "chinois (Taiwan)");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.util.Random random1 = new java.util.Random((long) 100);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Finance finance3 = faker2.finance();
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category13 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale16);
        java.util.Locale.setDefault(category13, locale16);
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category13, locale19);
        java.lang.String str21 = locale12.getDisplayCountry(locale19);
        java.util.Locale locale24 = new java.util.Locale("french", "fra");
        java.lang.String str25 = locale12.getDisplayCountry(locale24);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getISO3Language();
        java.util.Locale.Builder builder31 = builder27.setLocale(locale29);
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getISO3Language();
        java.util.Locale.Builder builder36 = builder32.setLocale(locale34);
        java.lang.String str37 = locale29.getDisplayCountry(locale34);
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = locale38.getDisplayCountry();
        java.lang.String str41 = locale29.getDisplayName(locale38);
        java.util.Locale.setDefault(category0, locale29);
        java.util.Locale locale43 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category13.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale16.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
        org.junit.Assert.assertEquals(locale24.toString(), "french_FRA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HI!" + "'", str25, "HI!");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.removeUnicodeLocaleAttribute("\u30d5\u30e9\u30f3\u30b9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???? [at index 0]");
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
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale locale8 = new java.util.Locale("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ??? (??) [at index 0]");
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
        org.junit.Assert.assertEquals(locale8.toString(), "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.util.Locale locale3 = new java.util.Locale("FRA", "English", "zh-CN");
        org.junit.Assert.assertEquals(locale3.toString(), "fra_ENGLISH_zh-CN");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("Cina");
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale7.toLanguageTag();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("Francia", "fra-France");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Francia [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.util.Locale locale2 = new java.util.Locale("Canada", "french (french)");
        java.util.Locale locale6 = new java.util.Locale("Chinese (China)", "French", "french (FRENCH)");
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.lang.Object obj8 = null;
        boolean boolean9 = locale6.equals(obj8);
        org.junit.Assert.assertEquals(locale2.toString(), "canada_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals(locale6.toString(), "chinese (china)_FRENCH_french (FRENCH)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "canada (FRENCH (FRENCH))" + "'", str7, "canada (FRENCH (FRENCH))");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Business business8 = faker2.business();
        com.github.javafaker.Business business9 = faker2.business();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setLanguageTag("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ??????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        java.util.stream.LongStream longStream12 = random4.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = random4.ints((int) 'x', 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Korean", 0.6991794951529816d);
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        boolean boolean6 = languageRange2.equals((java.lang.Object) str5);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str5, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        double double2 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22278216143339702d + "'", double2 == 0.22278216143339702d);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Color color6 = faker1.color();
        com.github.javafaker.Book book7 = faker1.book();
        com.github.javafaker.Color color8 = faker1.color();
        com.github.javafaker.Code code9 = faker1.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getVariant();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "fr_FR");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Code code6 = faker1.code();
        java.lang.String str8 = faker1.letterify("fra_KOR_France");
        com.github.javafaker.Address address9 = faker1.address();
        com.github.javafaker.Number number10 = faker1.number();
        com.github.javafaker.Code code11 = faker1.code();
        com.github.javafaker.Address address12 = faker1.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra_KOR_France" + "'", str8, "fra_KOR_France");
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(address12);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Language();
        java.lang.String str7 = locale2.getDisplayName(locale5);
        java.lang.String str8 = locale5.toLanguageTag();
        java.lang.String str9 = locale5.getVariant();
        java.lang.String str10 = locale5.getISO3Country();
        java.lang.String str11 = locale5.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "kor" + "'", str6, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uc911\uad6d\uc5b4\ub300\ub9cc)" + "'", str7, "\uc911\uad6d\uc5b4\ub300\ub9cc)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ko-KR" + "'", str8, "ko-KR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "KOR" + "'", str10, "KOR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.util.Locale locale3 = new java.util.Locale("fra", "und", "");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra_UND could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fra_UND");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franc?ais");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.util.Locale locale3 = new java.util.Locale("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))", "\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)", "zh");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)_zh");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("France");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = new java.util.Locale("FRA-X-LVARIANT-KOR", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale0.getDisplayLanguage(locale6);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra-x-lvariant-kor_??? (????) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))" + "'", str7, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getDisplayCountry();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Canada" + "'", str4, "Canada");
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Code code2 = faker0.code();
        java.lang.String str4 = faker0.letterify("ko");
        java.lang.String str6 = faker0.letterify("de_DE");
        com.github.javafaker.Number number7 = faker0.number();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ko" + "'", str4, "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de_DE" + "'", str6, "de_DE");
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.LongStream longStream10 = random1.longs((long) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        int int12 = random1.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream16 = random1.ints((long) (byte) -1, 6, 431529176);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1155869325) + "'", int12 == (-1155869325));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Finance finance5 = faker0.finance();
        java.lang.String str7 = faker0.numerify("Korean (South Korea)");
        java.lang.String str9 = faker0.numerify("China");
        com.github.javafaker.Address address10 = faker0.address();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean (South Korea)" + "'", str7, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.util.Locale locale2 = new java.util.Locale("canada", "Korean");
        java.lang.String str3 = locale2.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "canada_KOREAN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "canada" + "'", str3, "canada");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        float float6 = random4.nextFloat();
        int int8 = random4.nextInt((int) '#');
        double double9 = random4.nextGaussian();
        java.util.Random random11 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        int int14 = random11.nextInt((int) '4');
        java.util.stream.IntStream intStream15 = random11.ints();
        java.util.Random random17 = new java.util.Random((long) (byte) 100);
        java.util.Random random19 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream20 = random19.ints();
        java.util.stream.LongStream longStream21 = random19.longs();
        java.util.Random random23 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        int int26 = random23.nextInt(10);
        java.util.Random random28 = new java.util.Random(10L);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random28.nextBytes(byteArray34);
        random23.nextBytes(byteArray34);
        random19.nextBytes(byteArray34);
        random17.nextBytes(byteArray34);
        random11.nextBytes(byteArray34);
        random4.nextBytes(byteArray34);
        random1.nextBytes(byteArray34);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.72810113f + "'", float6 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3268766592932178d + "'", double9 == 0.3268766592932178d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-42, -97, -43, -72, -76]");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Lorem lorem2 = faker0.lorem();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Options options4 = faker0.options();
        java.lang.String str6 = faker0.numerify("inglese");
        com.github.javafaker.Company company7 = faker0.company();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "inglese" + "'", str6, "inglese");
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Color color5 = faker2.color();
        com.github.javafaker.Internet internet6 = faker2.internet();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(internet6);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Finance finance11 = faker9.finance();
        com.github.javafaker.Code code12 = faker9.code();
        com.github.javafaker.Lorem lorem13 = faker9.lorem();
        com.github.javafaker.Company company14 = faker9.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(company14);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color3 = faker2.color();
        com.github.javafaker.Company company4 = faker2.company();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(company4);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.IntStream intStream3 = random1.ints((long) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream7 = random1.ints(0, (int) 'u');
        java.util.stream.LongStream longStream8 = random1.longs();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream4 = random1.ints((long) (short) 1);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        java.util.Locale.Builder builder6 = builder4.setVariant("francese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setLanguage("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: English (United States) [at index 0]");
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
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        float float4 = random2.nextFloat();
        java.util.stream.IntStream intStream8 = random2.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream10 = random2.ints((long) 'x');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random2);
        java.lang.String str13 = faker11.bothify("\u30d5\u30e9\u30f3\u30b9");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.72810113f + "'", float4 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u30d5\u30e9\u30f3\u30b9" + "'", str13, "\u30d5\u30e9\u30f3\u30b9");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.util.Locale locale2 = new java.util.Locale("South Korea", "South Korea");
        java.util.Locale locale4 = new java.util.Locale("fra-x-lvariant-kor_HI!");
        java.lang.String str5 = locale2.getDisplayName(locale4);
        org.junit.Assert.assertEquals(locale2.toString(), "south korea_SOUTH KOREA");
        org.junit.Assert.assertEquals(locale4.toString(), "fra-x-lvariant-kor_hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "south korea (SOUTH KOREA)" + "'", str5, "south korea (SOUTH KOREA)");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Company company6 = faker0.company();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("coreano");
        java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("TW", "french");
        java.util.Locale.Builder builder13 = builder7.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setRegion("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getISO3Language();
        java.lang.String str17 = locale12.getDisplayVariant(locale15);
        java.lang.String str18 = locale2.getDisplayName(locale15);
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale20.getISO3Language();
        java.lang.String str22 = locale20.getDisplayName();
        java.lang.String str23 = locale19.getDisplayScript(locale20);
        java.lang.String str24 = locale2.getDisplayVariant(locale19);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale19);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "kor" + "'", str21, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Korean (South Korea)" + "'", str22, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Locale locale7 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.lang.Object obj10 = locale7.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale7.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "fra_KOR_France");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "fra_KOR_France");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "fra_KOR_France");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Address address2 = faker0.address();
        java.lang.String str4 = faker0.numerify("francese");
        java.lang.String str6 = faker0.bothify("\uc911\uad6d\uc5b4\ub300\ub9cc)");
        java.lang.String str8 = faker0.letterify("eng");
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "francese" + "'", str4, "francese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc911\uad6d\uc5b4\ub300\ub9cc)" + "'", str6, "\uc911\uad6d\uc5b4\ub300\ub9cc)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eng" + "'", str8, "eng");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("Coreano (FRENCH (FRENCH))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Coreano (FRENCH (FRENCH)) [at index 0]");
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
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.util.Locale locale1 = new java.util.Locale("french (FRENCH)");
        java.util.Locale locale5 = new java.util.Locale("hi!", "french (FRENCH)", "hi!");
        boolean boolean6 = locale5.hasExtensions();
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.lang.String str8 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "french (french)");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_FRENCH (FRENCH)_hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "french (french)" + "'", str8, "french (french)");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("French", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getISO3Language();
        java.util.Locale.Builder builder24 = builder20.setLocale(locale22);
        java.util.Locale locale26 = new java.util.Locale("");
        java.lang.String str27 = locale26.getISO3Language();
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getISO3Language();
        java.util.Locale.Builder builder34 = builder30.setLocale(locale32);
        java.util.Locale locale36 = new java.util.Locale("");
        java.lang.String str37 = locale36.getISO3Language();
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale22, locale26, locale29, locale32, locale36 };
        java.util.ArrayList<java.util.Locale> localeList39 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList39, localeArray38);
        java.util.Locale locale41 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList39, filteringMode42);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet9, filteringMode42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap46);
        java.util.Locale locale49 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale49);
        java.lang.String str51 = locale49.getLanguage();
        java.util.Set<java.lang.String> strSet52 = locale49.getUnicodeLocaleAttributes();
        java.lang.String str53 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet52);
        java.util.Collection<java.util.Locale> localeCollection54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList55 = java.util.Locale.filter(languageRangeList2, localeCollection54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(localeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode42.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (-1155869325));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.155869325E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.util.Locale locale1 = new java.util.Locale("ko_KR");
        org.junit.Assert.assertEquals(locale1.toString(), "ko_kr");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.util.Random random1 = new java.util.Random((long) 1891812663);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Coreano (FRENCH (FRENCH))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=coreano (french (french))");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream7 = random1.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        java.util.stream.IntStream intStream8 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random1.doubles((-6162003863595742414L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        int int5 = random1.nextInt((int) '#');
        double double6 = random1.nextGaussian();
        java.util.stream.IntStream intStream10 = random1.ints((long) 7, 6, (int) 'x');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3268766592932178d + "'", double6 == 0.3268766592932178d);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder8 = builder0.clear();
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Lorem lorem2 = faker0.lorem();
        com.github.javafaker.Finance finance3 = faker0.finance();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Italy", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("fra-x-lvariant-kor", strMap6);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("french");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap37);
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
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList66, filteringMode67);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList69);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList7);
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
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode67.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList68);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(localeList70);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        float float6 = random4.nextFloat();
        java.util.stream.IntStream intStream10 = random4.ints((long) 10, 10, (int) '4');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random4);
        java.util.stream.LongStream longStream14 = random4.longs((long) (short) -1, (long) 10);
        boolean boolean15 = locale0.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str2, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.72810113f + "'", float6 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.util.Locale locale2 = new java.util.Locale("", "\ud55c\uad6d\uc5b4");
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Locale.setDefault(locale4);
        java.lang.String str6 = locale2.getDisplayName(locale4);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str6, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Lorem lorem4 = faker1.lorem();
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        com.github.javafaker.Number number6 = faker1.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale3 = new java.util.Locale("Chinese");
        java.lang.String str4 = locale0.getDisplayName(locale3);
        java.util.Random random6 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream11 = random6.doubles(1L);
        java.util.stream.IntStream intStream13 = random6.ints(100L);
        float float14 = random6.nextFloat();
        java.util.stream.LongStream longStream17 = random6.longs((-4972683369271453960L), (long) 0);
        float float18 = random6.nextFloat();
        java.util.stream.DoubleStream doubleStream22 = random6.doubles((long) 32, (double) 38, 100.0d);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random6);
        boolean boolean24 = locale3.equals((java.lang.Object) random6);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals(locale3.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese (Taiwan)" + "'", str4, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.72810113f + "'", float14 == 0.72810113f);
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.44047195f + "'", float18 == 0.44047195f);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.util.Locale locale3 = new java.util.Locale("CHINESE", "FRENCH", "German");
        java.lang.String str4 = locale3.getLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_FRENCH_German");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chinese" + "'", str4, "chinese");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.util.Locale locale2 = new java.util.Locale("fra-x-lvariant-kor", "hi!");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!" + "'", str3, "HI!");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("french (french)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (french)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Color color6 = faker1.color();
        com.github.javafaker.Address address7 = faker1.address();
        com.github.javafaker.Internet internet8 = faker1.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(internet8);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        java.lang.String str6 = faker2.letterify("Coreano (FRENCH (FRENCH))");
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coreano (FRENCH (FRENCH))" + "'", str6, "Coreano (FRENCH (FRENCH))");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setLanguage("canada (FRENCH (FRENCH))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: canada (FRENCH (FRENCH)) [at index 0]");
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
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("FRENCH (FRENCH)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: FRENCH (FRENCH) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        float float10 = random1.nextFloat();
        float float11 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.44047195f + "'", float10 == 0.44047195f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.6659571f + "'", float11 == 0.6659571f);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        java.util.Locale locale25 = new java.util.Locale("Korean");
        java.util.Locale.Builder builder26 = builder0.setLocale(locale25);
        java.util.Locale.Builder builder27 = builder0.clearExtensions();
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
        org.junit.Assert.assertEquals(locale25.toString(), "korean");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale1.getDisplayCountry(locale4);
        java.lang.String str8 = locale4.toLanguageTag();
        java.util.Locale locale9 = locale4.stripExtensions();
        java.lang.String str10 = locale9.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "french" + "'", str8, "french");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "french_FRA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ko_KR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ko_kr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.util.Locale locale1 = new java.util.Locale("fra");
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        int int6 = random3.nextInt(10);
        java.util.stream.IntStream intStream7 = random3.ints();
        random3.setSeed((-1L));
        java.util.stream.DoubleStream doubleStream11 = random3.doubles((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.util.Locale locale3 = new java.util.Locale("English", "Cina", "ja");
        org.junit.Assert.assertEquals(locale3.toString(), "english_CINA_ja");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Code code6 = faker1.code();
        java.lang.String str8 = faker1.letterify("fra_KOR_France");
        java.lang.String str10 = faker1.letterify("french (france)_CANADA");
        com.github.javafaker.PhoneNumber phoneNumber11 = faker1.phoneNumber();
        com.github.javafaker.Address address12 = faker1.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra_KOR_France" + "'", str8, "fra_KOR_France");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "french (france)_CANADA" + "'", str10, "french (france)_CANADA");
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(address12);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Color color5 = faker0.color();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.util.Random random1 = new java.util.Random((long) 7);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) 1, (double) (short) 10);
        float float6 = random1.nextFloat();
        random1.setSeed((long) (byte) 100);
        random1.setSeed((long) 1036684082);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8452060657049847d + "'", double2 == 0.8452060657049847d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.3483097f + "'", float6 == 0.3483097f);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.util.Locale locale2 = new java.util.Locale("french", "fra-x-lvariant-kor");
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet4 = faker3.internet();
        com.github.javafaker.Address address5 = faker3.address();
        com.github.javafaker.Color color6 = faker3.color();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker3.phoneNumber();
        boolean boolean8 = locale2.equals((java.lang.Object) phoneNumber7);
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA-X-LVARIANT-KOR");
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] { languageRange1 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray10 = new java.lang.String[] { "kor", "fra", "kor", "French", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getISO3Language();
        java.util.Locale.Builder builder24 = builder20.setLocale(locale22);
        java.util.Locale locale26 = new java.util.Locale("");
        java.lang.String str27 = locale26.getISO3Language();
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getISO3Language();
        java.util.Locale.Builder builder34 = builder30.setLocale(locale32);
        java.util.Locale locale36 = new java.util.Locale("");
        java.lang.String str37 = locale36.getISO3Language();
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale22, locale26, locale29, locale32, locale36 };
        java.util.ArrayList<java.util.Locale> localeList39 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList39, localeArray38);
        java.util.Locale locale41 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList44);
        java.lang.String str47 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strMap51);
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getISO3Language();
        java.util.Locale.Builder builder57 = builder53.setLocale(locale55);
        java.util.Locale locale59 = new java.util.Locale("");
        java.lang.String str60 = locale59.getISO3Language();
        java.util.Locale locale62 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder63 = new java.util.Locale.Builder();
        java.util.Locale locale65 = new java.util.Locale("");
        java.lang.String str66 = locale65.getISO3Language();
        java.util.Locale.Builder builder67 = builder63.setLocale(locale65);
        java.util.Locale locale69 = new java.util.Locale("");
        java.lang.String str70 = locale69.getISO3Language();
        java.util.Locale[] localeArray71 = new java.util.Locale[] { locale55, locale59, locale62, locale65, locale69 };
        java.util.ArrayList<java.util.Locale> localeList72 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList72, localeArray71);
        java.util.Locale locale74 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.util.Locale>) localeList72);
        java.lang.String[] strArray76 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList77);
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList77);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap81 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList82 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap81);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode13.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(localeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(localeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(locale74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(languageRangeList82);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream11 = random1.longs((long) (short) -1, (long) 10);
        float float12 = random1.nextFloat();
        java.util.stream.IntStream intStream13 = random1.ints();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.44047195f + "'", float12 == 0.44047195f);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.IntStream intStream3 = random1.ints((long) '#');
        random1.setSeed((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random1.ints(1066038166, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.numerify("French");
        com.github.javafaker.Number number8 = faker1.number();
        com.github.javafaker.Business business9 = faker1.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.util.Locale locale2 = new java.util.Locale("canada", "Korean");
        java.lang.String str3 = locale2.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for KOREAN");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "canada_KOREAN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "canada" + "'", str3, "canada");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.util.Locale locale2 = new java.util.Locale("France", "fra");
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "france_FRA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRA" + "'", str3, "FRA");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.lang.String str6 = locale3.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "french (FRENCH)" + "'", str6, "french (FRENCH)");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("GB");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "gb");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gb" + "'", str8, "gb");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        boolean boolean5 = locale1.hasExtensions();
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale9);
        java.util.Locale.setDefault(category6, locale9);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category6, locale12);
        boolean boolean14 = locale1.equals((java.lang.Object) locale12);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale9.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.util.Random random1 = new java.util.Random((long) 10);
        java.util.stream.LongStream longStream5 = random1.longs((long) 'u', 1L, (long) 1066038166);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.util.Random random1 = new java.util.Random((-6162003863595742414L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) (-1193959466), (long) (-485610818), 4755622236989466036L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("South Korea");
        java.lang.String str2 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.lang.String str6 = locale0.getDisplayName(locale4);
        java.util.Set<java.lang.Character> charSet7 = locale0.getExtensionKeys();
        java.lang.String str8 = locale0.getScript();
        java.util.Set<java.lang.Character> charSet9 = locale0.getExtensionKeys();
        java.lang.String str10 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str5, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str6, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "coreano (Corea del Sud)" + "'", str10, "coreano (Corea del Sud)");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ????????? (???????) [at index 0]");
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.util.Locale locale2 = new java.util.Locale("fra_KOR_France", "Korean (South Korea)");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra_kor_france_KOREAN (SOUTH KOREA) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "fra_kor_france_KOREAN (SOUTH KOREA)");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Company company5 = faker2.company();
        com.github.javafaker.Lorem lorem6 = faker2.lorem();
        com.github.javafaker.Options options7 = faker2.options();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getISO3Language();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.lang.String str14 = locale11.getScript();
        java.util.Locale.setDefault(category8, locale11);
        java.util.Locale.setDefault(category0, locale11);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale.Builder builder10 = builder6.setRegion("");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setRegion("cinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: cinese (Taiwan) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.DateAndTime dateAndTime2 = faker1.date();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale locale8 = builder0.build();
        java.util.Locale.Builder builder10 = builder0.setLanguage("eng");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Code code2 = faker0.code();
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Color color4 = faker0.color();
        java.lang.String str6 = faker0.bothify("fra_KOR_France");
        com.github.javafaker.Name name7 = faker0.name();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra_KOR_France" + "'", str6, "fra_KOR_France");
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale9.getDisplayLanguage(locale11);
        java.lang.String str13 = locale6.getDisplayName(locale11);
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale14.getISO3Language();
        java.lang.String str16 = locale6.getDisplayCountry(locale14);
        java.lang.String str17 = locale2.getDisplayName(locale6);
        java.lang.String str18 = locale6.getScript();
        java.lang.String str19 = locale6.getDisplayCountry();
        java.util.Set<java.lang.String> strSet20 = locale6.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "France" + "'", str7, "France");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "French (France)" + "'", str13, "French (France)");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eng" + "'", str15, "eng");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "France" + "'", str16, "France");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chinois (Taiwan)" + "'", str17, "chinois (Taiwan)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        java.util.Locale.Builder builder16 = builder14.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder14.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
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
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Address address4 = faker1.address();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker1.phoneNumber();
        com.github.javafaker.Company company6 = faker1.company();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker1.resolve("ENGLISH");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 0);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.util.Locale locale3 = new java.util.Locale("Coreano (FRENCH (FRENCH))", "Korean (South Korea)", "Coreano (FRENCH (FRENCH))");
        org.junit.Assert.assertEquals(locale3.toString(), "coreano (french (french))_KOREAN (SOUTH KOREA)_Coreano (FRENCH (FRENCH))");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french (france)_CANADA", (double) 8220501950349663546L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=8.2205019503496632E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.util.Locale locale2 = new java.util.Locale("it", "zho");
        org.junit.Assert.assertEquals(locale2.toString(), "it_ZHO");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("France");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = new java.util.Locale("FRA-X-LVARIANT-KOR", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale0.getDisplayLanguage(locale6);
        java.lang.String str9 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))" + "'", str7, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-CA" + "'", str9, "en-CA");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ko_KR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ko_kr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.util.Locale locale2 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        boolean boolean5 = locale2.hasExtensions();
        boolean boolean6 = locale2.hasExtensions();
        java.util.Set<java.lang.Character> charSet7 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charSet7);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale locale14 = java.util.Locale.UK;
        java.lang.String str15 = locale12.getDisplayLanguage(locale14);
        java.lang.String str16 = locale9.getDisplayName(locale14);
        java.util.Locale locale17 = java.util.Locale.US;
        java.lang.String str18 = locale17.getISO3Language();
        java.lang.String str19 = locale9.getDisplayCountry(locale17);
        java.lang.String str20 = locale9.getVariant();
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale9.getDisplayVariant(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = locale8.getDisplayName(locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Francia" + "'", str10, "Francia");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "French (France)" + "'", str16, "French (France)");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "eng" + "'", str18, "eng");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        java.lang.String str18 = locale7.getDisplayVariant();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream27 = random3.doubles((long) (-1157793070));
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
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[34, 42, 124, -86, 50]");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.util.Locale locale3 = new java.util.Locale("cinese", "Chinese", "south korea (SOUTH KOREA)");
        org.junit.Assert.assertEquals(locale3.toString(), "cinese_CHINESE_south korea (SOUTH KOREA)");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setScript("");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("Canada");
        java.util.Locale locale11 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.addUnicodeLocaleAttribute("\u97e9\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.getISO3Country();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale8);
        java.util.Locale.setDefault(category5, locale8);
        java.lang.String str11 = locale8.getDisplayVariant();
        java.lang.String str12 = locale0.getDisplayName(locale8);
        java.util.Random random14 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        float float16 = random14.nextFloat();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale0, random14);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Code code19 = faker18.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale8.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese (China)" + "'", str12, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.72810113f + "'", float16 == 0.72810113f);
        org.junit.Assert.assertNotNull(code19);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("French", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getISO3Language();
        java.util.Locale.Builder builder24 = builder20.setLocale(locale22);
        java.util.Locale locale26 = new java.util.Locale("");
        java.lang.String str27 = locale26.getISO3Language();
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getISO3Language();
        java.util.Locale.Builder builder34 = builder30.setLocale(locale32);
        java.util.Locale locale36 = new java.util.Locale("");
        java.lang.String str37 = locale36.getISO3Language();
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale22, locale26, locale29, locale32, locale36 };
        java.util.ArrayList<java.util.Locale> localeList39 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList39, localeArray38);
        java.util.Locale locale41 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList39, filteringMode42);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet9, filteringMode42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList47, strMap48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList49, strMap50);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(localeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode42.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(languageRangeList51);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguage("Canada");
        java.util.Locale locale10 = new java.util.Locale("france");
        java.util.Locale.Builder builder11 = builder5.setLocale(locale10);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale10.toString(), "france");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fran\347ais");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("\uc911\uad6d");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Finance finance5 = faker0.finance();
        java.lang.String str7 = faker0.numerify("Korean (South Korea)");
        com.github.javafaker.Company company8 = faker0.company();
        com.github.javafaker.Number number9 = faker0.number();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean (South Korea)" + "'", str7, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("inglese");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "inglese");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", 0.3268766592932178d);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        java.lang.String str12 = locale0.getISO3Country();
        java.util.Set<java.lang.Character> charSet13 = locale0.getExtensionKeys();
        java.lang.String str15 = locale0.getExtension('a');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "TWN" + "'", str12, "TWN");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Internet internet10 = faker9.internet();
        java.lang.String str12 = faker9.numerify("TW");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "TW" + "'", str12, "TW");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.util.Locale locale2 = new java.util.Locale("French (France)", "Canada");
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Locale.Builder builder8 = builder4.setLocale(locale6);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getISO3Language();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.lang.String str14 = locale6.getDisplayCountry(locale11);
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.lang.String str17 = locale15.getDisplayCountry();
        java.lang.String str18 = locale6.getDisplayName(locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str20 = locale2.getDisplayVariant(locale15);
        java.util.Set<java.lang.String> strSet21 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "french (france)_CANADA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Book book5 = faker2.book();
        com.github.javafaker.Internet internet6 = faker2.internet();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        com.github.javafaker.Options options8 = faker2.options();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker2.phoneNumber();
        com.github.javafaker.Business business10 = faker2.business();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale8.getDisplayLanguage();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale8);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("coreano (Corea del Sud)");
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale8.getDisplayCountry(locale13);
        java.util.Locale locale19 = new java.util.Locale("fra-x-lvariant-kor", "fra", "kor");
        java.lang.String str20 = locale8.getDisplayName(locale19);
        java.util.Locale locale21 = locale19.stripExtensions();
        java.util.Locale.setDefault(category0, locale19);
        java.util.Locale locale23 = java.util.Locale.getDefault(category0);
        java.util.Locale locale24 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "francese" + "'", str10, "francese");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "und" + "'", str14, "und");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "France" + "'", str15, "France");
        org.junit.Assert.assertEquals(locale19.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "French (France)" + "'", str20, "French (France)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fra-x-lvariant-kor_FRA_kor");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.util.Random random1 = new java.util.Random((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = random1.ints((long) (-1157793070));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setRegion("FRA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRA [at index 0]");
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str10 = locale8.getExtension('x');
        java.util.Random random12 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        float float14 = random12.nextFloat();
        java.util.stream.IntStream intStream18 = random12.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream19 = random12.ints();
        double double20 = random12.nextDouble();
        float float21 = random12.nextFloat();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale8, random12);
        java.util.Locale.Builder builder23 = builder6.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = locale8.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.72810113f + "'", float14 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.44047195711667986d + "'", double20 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.24137181f + "'", float21 == 0.24137181f);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.Random random6 = new java.util.Random(10L);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random6.nextBytes(byteArray12);
        random1.nextBytes(byteArray12);
        java.util.stream.DoubleStream doubleStream18 = random1.doubles(100L, 0.0d, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream22 = random1.doubles(0L, (double) 15, 1.561581040188955d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[55, -59, -62, 112, 34]");
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("Cina");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.setVariant("GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: GB [at index 0]");
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
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fra-France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguageTag("\u97e9\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
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
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        double double2 = random1.nextDouble();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22278216143339702d + "'", double2 == 0.22278216143339702d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.util.Random random1 = new java.util.Random((long) 7);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.22278214f, (double) 100);
        double double5 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7306990420600421d + "'", double5 == 0.7306990420600421d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        long long7 = random1.nextLong();
        double double8 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6659570968355509d + "'", double8 == 0.6659570968355509d);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.setVariant("French");
        java.util.Locale.Builder builder8 = builder3.setExtension('x', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ko-KR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Canada", (double) 553627293);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.53627293E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.util.Locale locale2 = new java.util.Locale("ENGLISH", "ZH-CN");
        org.junit.Assert.assertEquals(locale2.toString(), "english_ZH-CN");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.util.Locale locale1 = new java.util.Locale("CHN");
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.LongStream longStream5 = random3.longs();
        double double6 = random3.nextDouble();
        int int8 = random3.nextInt(1891812663);
        double double9 = random3.nextDouble();
        java.util.stream.LongStream longStream11 = random3.longs((long) 553627293);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chn could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "chn");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7281011855672591d + "'", double6 == 0.7281011855672591d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1430131985 + "'", int8 == 1430131985);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2413718236526089d + "'", double9 == 0.2413718236526089d);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.util.Locale locale2 = new java.util.Locale("\ud504\ub791\uc2a4\uc5b4", "zh-TW");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("fra-x-lvariant-kor_HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: fra-x-lvariant-kor_HI!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "\ud504\ub791\uc2a4\uc5b4_ZH-TW");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale15.getDisplayScript();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale15);
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        java.lang.String str20 = locale19.getDisplayLanguage();
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str20, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.lang.String str9 = locale0.getDisplayLanguage(locale6);
        java.lang.String str10 = locale6.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d" + "'", str2, "\uc911\uad6d");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d" + "'", str2, "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Address address6 = faker5.address();
        java.lang.String str8 = faker5.letterify("JP");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d" + "'", str2, "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JP" + "'", str8, "JP");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        int int11 = random1.nextInt((int) (short) 100);
        java.util.stream.LongStream longStream12 = random1.longs();
        long long13 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random1.doubles((long) 38, (double) 15, 1.2981846735357514d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 85 + "'", int11 == 85);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1853403699951111791L + "'", long13 == 1853403699951111791L);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.util.Locale locale2 = new java.util.Locale("french", "fra-x-lvariant-kor");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ????? (????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA-X-LVARIANT-KOR");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("it");
        java.util.Locale.Builder builder4 = builder2.setLanguage("jpn");
        java.util.Locale locale5 = builder2.build();
        java.util.Locale.Builder builder7 = builder2.setLanguageTag("fra-x-lvariant-kor");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("tedesco");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: tedesco [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "jpn");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setRegion("Korean");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Korean [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str6, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        com.github.javafaker.Name name6 = faker1.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        float float4 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.44047195f + "'", float4 == 0.44047195f);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random1);
        float float23 = random1.nextFloat();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.14158131146144248d) + "'", double21 == (-0.14158131146144248d));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.9648155f + "'", float23 == 0.9648155f);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        java.lang.String str13 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str2, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ko" + "'", str12, "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.util.Locale locale2 = new java.util.Locale("kor", "french (FRENCH)");
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = locale2.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for FRENCH (FRENCH)");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "kor_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4 (FRENCH (FRENCH))" + "'", str3, "\ud55c\uad6d\uc5b4 (FRENCH (FRENCH))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "kor" + "'", str5, "kor");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder11 = builder5.setExtension('a', "chn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setScript("\u97e9\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr-FR");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Code code2 = faker0.code();
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ko", (double) (byte) 0);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko" + "'", str3, "ko");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale23.getISO3Language();
        java.util.Locale locale25 = locale23.stripExtensions();
        java.util.Locale locale28 = new java.util.Locale("fra-x-lvariant-kor", "hi!");
        java.lang.String str29 = locale23.getDisplayScript(locale28);
        java.lang.String str30 = locale17.getDisplayCountry(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = locale17.getUnicodeLocaleType("FRA-X-LVARIANT-KOR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: FRA-X-LVARIANT-KOR");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d" + "'", str2, "\uc911\uad6d");
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
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "kor" + "'", str24, "kor");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertEquals(locale28.toString(), "fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FRA" + "'", str30, "FRA");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jpn" + "'", str4, "jpn");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Code code2 = faker0.code();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Options options4 = faker0.options();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
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
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList36 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList32, filteringMode35);
        java.util.Collection<java.lang.String> strCollection37 = null;
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strCollection37);
        java.util.Locale locale39 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(locale39);
        java.lang.String str41 = locale39.getDisplayCountry();
        java.lang.String str42 = locale39.getDisplayVariant();
        java.lang.String str43 = locale39.toLanguageTag();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(locale39);
        java.util.Random random46 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(random46);
        int int49 = random46.nextInt(10);
        java.util.stream.DoubleStream doubleStream50 = random46.doubles();
        double double51 = random46.nextGaussian();
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(locale39, random46);
        java.lang.String str53 = locale39.getVariant();
        java.util.Locale locale56 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleKeys();
        java.lang.String str58 = locale56.getDisplayVariant();
        java.lang.String str59 = locale39.getDisplayScript(locale56);
        java.util.Set<java.lang.String> strSet60 = locale56.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet60);
        boolean boolean62 = locale0.equals((java.lang.Object) languageRangeList4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertTrue("'" + filteringMode35 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode35.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str41, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh-CN" + "'", str43, "zh-CN");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 7 + "'", int49 == 7);
        org.junit.Assert.assertNotNull(doubleStream50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-0.35703205834598994d) + "'", double51 == (-0.35703205834598994d));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals(locale56.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Book book7 = faker0.book();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(book7);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.util.Locale locale1 = new java.util.Locale("ZH-CN");
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cn");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        float float2 = random1.nextFloat();
        java.util.stream.LongStream longStream5 = random1.longs((long) 13, (long) 17);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.22278214f + "'", float2 == 0.22278214f);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder10 = builder5.setRegion("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder5.setVariant("\u97e9\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("French", strMap1);
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
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap36);
        java.util.Collection<java.lang.String> strCollection38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = java.util.Locale.lookupTag(languageRangeList2, strCollection38);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(languageRangeList37);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextGaussian();
        double double2 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random0.doubles((long) 254270492, (double) 1891812663, (double) 1430131985);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6649881307321797d) + "'", double1 == (-0.6649881307321797d));
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1721912554819072d + "'", double2 == 0.1721912554819072d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinese");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] { languageRange5 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "kor", "fra", "kor", "French", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList15, filteringMode17);
        java.lang.String str19 = java.util.Locale.lookupTag(languageRangeList3, (java.util.Collection<java.lang.String>) strList15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap20);
        java.util.Locale locale23 = new java.util.Locale("");
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        java.util.Locale locale26 = locale24.stripExtensions();
        java.util.Set<java.lang.String> strSet27 = locale24.getUnicodeLocaleKeys();
        java.lang.String str28 = java.util.Locale.lookupTag(languageRangeList21, (java.util.Collection<java.lang.String>) strSet27);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode17.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("coreano");
        java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("TW", "french");
        java.util.Locale.Builder builder13 = builder7.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder7.setLanguage("\u671d\u9c9c\u6587\u97e9\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ??? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italia", 0.8452060657049847d);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale3.getDisplayName();
        java.lang.String str6 = locale3.getDisplayScript();
        java.util.Random random8 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream10 = random8.ints(1L);
        long long11 = random8.nextLong();
        int int13 = random8.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale3, random8);
        float float15 = random8.nextFloat();
        java.util.stream.IntStream intStream16 = random8.ints();
        boolean boolean17 = languageRange2.equals((java.lang.Object) random8);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor" + "'", str4, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str5, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-5015647950085110473L) + "'", long11 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.24137181f + "'", float15 == 0.24137181f);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.util.Locale locale1 = new java.util.Locale("JP");
        java.util.Locale locale4 = new java.util.Locale("ENGLISH", "eng");
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: english_ENG could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "jp");
        org.junit.Assert.assertEquals(locale4.toString(), "english_ENG");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.util.Locale locale3 = new java.util.Locale("de-DE", "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd", "francese (Francia)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd_francese (Francia)");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale7 = new java.util.Locale("chinese_KOR", "ko-KR", "canada");
        java.lang.String str8 = locale2.getDisplayCountry(locale7);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chinese_kor_KO-KR_canada could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals(locale7.toString(), "chinese_kor_KO-KR_canada");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "South Korea" + "'", str8, "South Korea");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french (france)_CANADA", (-0.6113090153776468d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.6113090153776468");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setVariant("fr_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fr_CA [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale.Builder builder8 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("chn", "german (KO-KR,ko)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: chn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale locale8 = builder0.build();
        java.util.Locale.Builder builder10 = builder0.setLanguage("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder0.removeUnicodeLocaleAttribute("ja");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ja [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.lang.String str6 = locale3.getDisplayVariant();
        java.lang.String str8 = locale3.getExtension('x');
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random5.longs((-5015647950085110473L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.24137181f + "'", float12 == 0.24137181f);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setExtension('a', "English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        int int11 = random1.nextInt((int) (short) 100);
        float float12 = random1.nextFloat();
        int int13 = random1.nextInt();
        int int15 = random1.nextInt(10);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 85 + "'", int11 == 85);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.100473166f + "'", float12 == 0.100473166f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1761283695 + "'", int13 == 1761283695);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale4);
        java.lang.String str7 = locale4.getScript();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getISO3Language();
        java.util.Locale.Builder builder12 = builder8.setLocale(locale10);
        java.lang.String str13 = locale10.getISO3Country();
        java.lang.String str14 = locale4.getDisplayLanguage(locale10);
        java.lang.String str15 = locale4.getCountry();
        java.lang.String str16 = locale0.getDisplayCountry(locale4);
        java.util.Locale locale17 = java.util.Locale.US;
        java.lang.String str18 = locale17.getISO3Language();
        java.lang.String str19 = locale0.getDisplayCountry(locale17);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number21 = faker20.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "South Korea" + "'", str16, "South Korea");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "eng" + "'", str18, "eng");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "South Korea" + "'", str19, "South Korea");
        org.junit.Assert.assertNotNull(number21);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.lang.String str10 = locale2.getDisplayCountry(locale7);
        java.util.Locale locale11 = locale2.stripExtensions();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str14 = locale12.getExtension('x');
        java.util.Random random16 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        float float18 = random16.nextFloat();
        java.util.stream.IntStream intStream22 = random16.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream23 = random16.ints();
        double double24 = random16.nextDouble();
        float float25 = random16.nextFloat();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale12, random16);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale12);
        com.github.javafaker.Finance finance28 = faker27.finance();
        boolean boolean29 = locale2.equals((java.lang.Object) finance28);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.72810113f + "'", float18 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.44047195711667986d + "'", double24 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.24137181f + "'", float25 == 0.24137181f);
        org.junit.Assert.assertNotNull(finance28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.util.Locale locale2 = new java.util.Locale("kor", "french (FRENCH)");
        java.lang.String str3 = locale2.getCountry();
        java.util.Locale locale6 = new java.util.Locale("France", "fra");
        java.lang.String str7 = locale2.getDisplayLanguage(locale6);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale8.getDisplayVariant();
        java.lang.String str10 = locale8.getISO3Country();
        java.lang.String str11 = locale6.getDisplayLanguage(locale8);
        org.junit.Assert.assertEquals(locale2.toString(), "kor_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRENCH (FRENCH)" + "'", str3, "FRENCH (FRENCH)");
        org.junit.Assert.assertEquals(locale6.toString(), "france_FRA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean" + "'", str7, "Korean");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FRA" + "'", str10, "FRA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "france" + "'", str11, "france");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("FRENCH", strMap3);
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
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap40);
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale locale44 = new java.util.Locale("");
        java.lang.String str45 = locale44.getISO3Language();
        java.util.Locale.Builder builder46 = builder42.setLocale(locale44);
        java.util.Locale locale48 = new java.util.Locale("");
        java.lang.String str49 = locale48.getISO3Language();
        java.util.Locale locale51 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale locale54 = new java.util.Locale("");
        java.lang.String str55 = locale54.getISO3Language();
        java.util.Locale.Builder builder56 = builder52.setLocale(locale54);
        java.util.Locale locale58 = new java.util.Locale("");
        java.lang.String str59 = locale58.getISO3Language();
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale44, locale48, locale51, locale54, locale58 };
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        java.util.Locale locale63 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList61);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList61, filteringMode64);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, strMap69);
        java.util.Locale.Builder builder71 = new java.util.Locale.Builder();
        java.util.Locale locale73 = new java.util.Locale("");
        java.lang.String str74 = locale73.getISO3Language();
        java.util.Locale.Builder builder75 = builder71.setLocale(locale73);
        java.util.Locale locale77 = new java.util.Locale("");
        java.lang.String str78 = locale77.getISO3Language();
        java.util.Locale locale80 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder81 = new java.util.Locale.Builder();
        java.util.Locale locale83 = new java.util.Locale("");
        java.lang.String str84 = locale83.getISO3Language();
        java.util.Locale.Builder builder85 = builder81.setLocale(locale83);
        java.util.Locale locale87 = new java.util.Locale("");
        java.lang.String str88 = locale87.getISO3Language();
        java.util.Locale[] localeArray89 = new java.util.Locale[] { locale73, locale77, locale80, locale83, locale87 };
        java.util.ArrayList<java.util.Locale> localeList90 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList90, localeArray89);
        java.util.Locale locale92 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList93);
        org.junit.Assert.assertNotNull(languageRangeList1);
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
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals(locale51.toString(), "hi!");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(localeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(locale63);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertEquals(locale77.toString(), "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals(locale80.toString(), "hi!");
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertEquals(locale87.toString(), "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(localeArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNotNull(localeList96);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.util.Random random1 = new java.util.Random((long) 7);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("it", (double) (byte) 0);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        java.util.Locale locale20 = builder19.build();
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setScript("\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ???????? (???????????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.util.Locale locale3 = new java.util.Locale("de", "TW", "de-DE");
        java.lang.Object obj4 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "de_TW_de-DE");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "de_TW_de-DE");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "de_TW_de-DE");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "de_TW_de-DE");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.setVariant("French");
        java.util.Locale.Builder builder8 = builder3.setExtension('x', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ???????? (???????????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.util.Random random1 = new java.util.Random((long) 85);
        java.util.stream.IntStream intStream4 = random1.ints(17, (int) '4');
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        java.util.stream.IntStream intStream11 = random1.ints((long) (byte) 100);
        java.util.stream.IntStream intStream15 = random1.ints((long) '4', (int) '#', (int) 'x');
        boolean boolean16 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream20 = random1.doubles((long) (byte) 10, (double) (short) 0, 0.6659570968355509d);
        long long21 = random1.nextLong();
        float float22 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-2085682583702141179L) + "'", long21 == (-2085682583702141179L));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5833982f + "'", float22 == 0.5833982f);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.lang.String str12 = locale11.getDisplayVariant();
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
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("french");
        java.util.Locale locale6 = new java.util.Locale("CHN");
        java.util.Locale.Builder builder7 = builder0.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguageTag("coreano (Corea del Sud)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: coreano (Corea del Sud) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale6.toString(), "chn");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "france" + "'", str3, "france");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "france" + "'", str4, "france");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        java.util.Random random12 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        int int15 = random12.nextInt(10);
        java.util.stream.IntStream intStream16 = random12.ints();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale9, random12);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("allemand", (-0.6814934967223469d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.6814934967223469");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        java.util.Random random1 = new java.util.Random((long) (-1193959466));
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        java.util.Random random4 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.LongStream longStream6 = random4.longs();
        java.util.Random random8 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        int int11 = random8.nextInt(10);
        java.util.Random random13 = new java.util.Random(10L);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random13.nextBytes(byteArray19);
        random8.nextBytes(byteArray19);
        random4.nextBytes(byteArray19);
        java.util.stream.IntStream intStream23 = random4.ints();
        int int24 = random4.nextInt();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale0, random4);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1708368258 + "'", int24 == 1708368258);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FRA-X-LVARIANT-KOR_HI!", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u6587", 0.7306990420600421d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.LongStream longStream9 = random3.longs();
        double double10 = random3.nextGaussian();
        int int12 = random3.nextInt(15);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3268766592932178d + "'", double10 == 0.3268766592932178d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        float float2 = random1.nextFloat();
        java.util.stream.LongStream longStream4 = random1.longs((long) 13);
        java.util.stream.DoubleStream doubleStream7 = random1.doubles((double) (-1), (double) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.22278214f + "'", float2 == 0.22278214f);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        java.util.Locale locale3 = new java.util.Locale("it_IT", "zh_TW", "\ud55c\uad6d\uc5b4");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayLanguage();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it_it" + "'", str5, "it_it");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.util.Random random1 = new java.util.Random((long) 431529176);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles(5840930912313687631L);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale0.getDisplayCountry(locale4);
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.lang.String str7 = locale6.getISO3Language();
        java.lang.String str8 = locale6.getDisplayName();
        java.lang.String str9 = locale6.getDisplayScript();
        java.util.Random random11 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream13 = random11.ints(1L);
        long long14 = random11.nextLong();
        int int16 = random11.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale6, random11);
        java.lang.String str18 = locale6.getLanguage();
        java.util.Set<java.lang.String> strSet19 = locale6.getUnicodeLocaleKeys();
        java.lang.String str20 = locale6.toLanguageTag();
        java.lang.String str21 = locale4.getDisplayLanguage(locale6);
        java.util.Locale.setDefault(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "kor" + "'", str7, "kor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Korean (South Korea)" + "'", str8, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-5015647950085110473L) + "'", long14 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ko" + "'", str18, "ko");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ko-KR" + "'", str20, "ko-KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Color color6 = faker1.color();
        com.github.javafaker.Book book7 = faker1.book();
        java.lang.String str9 = faker1.numerify("South Korea");
        com.github.javafaker.Name name10 = faker1.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "South Korea" + "'", str9, "South Korea");
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.DateAndTime dateAndTime2 = faker1.date();
        com.github.javafaker.DateAndTime dateAndTime3 = faker1.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Number number3 = faker2.number();
        com.github.javafaker.Lorem lorem4 = faker2.lorem();
        com.github.javafaker.Book book5 = faker2.book();
        com.github.javafaker.Lorem lorem6 = faker2.lorem();
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        com.github.javafaker.Options options8 = faker2.options();
        com.github.javafaker.Internet internet9 = faker2.internet();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(internet9);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.bothify("CHN");
        java.lang.String str9 = faker1.letterify("french (FRENCH)");
        com.github.javafaker.Book book10 = faker1.book();
        com.github.javafaker.DateAndTime dateAndTime11 = faker1.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CHN" + "'", str7, "CHN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "french (FRENCH)" + "'", str9, "french (FRENCH)");
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fra", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
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
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList36 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList32, filteringMode35);
        java.util.Locale locale37 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList32);
        java.util.Locale locale39 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale39);
        java.util.Locale locale41 = locale39.stripExtensions();
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = locale41.getDisplayCountry(locale43);
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale45.getVariant();
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.lang.String str48 = locale47.getISO3Language();
        java.util.Locale locale49 = locale47.stripExtensions();
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale41, locale45, locale49 };
        java.util.ArrayList<java.util.Locale> localeList51 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList51, localeArray50);
        java.util.Locale locale53 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList51);
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
        java.util.Locale.FilteringMode filteringMode88 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList83, filteringMode88);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertTrue("'" + filteringMode35 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode35.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList36);
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "kor" + "'", str48, "kor");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(localeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(locale53);
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
        org.junit.Assert.assertTrue("'" + filteringMode88 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode88.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList89);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.util.Locale locale2 = new java.util.Locale("chinese_KOR", "Canada");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_kor_CANADA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinese_kor_CANADA" + "'", str3, "chinese_kor_CANADA");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        java.lang.String str5 = faker1.numerify("it");
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Color color7 = faker1.color();
        com.github.javafaker.Name name8 = faker1.name();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker1.resolve("\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(name8);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        java.util.Locale locale25 = new java.util.Locale("Korean");
        java.util.Locale.Builder builder26 = builder0.setLocale(locale25);
        java.util.Locale locale27 = null;
        java.lang.String str28 = null; // flaky: locale25.getDisplayScript(locale27);
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
        org.junit.Assert.assertEquals(locale25.toString(), "korean");
        org.junit.Assert.assertNotNull(builder26);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.util.Locale locale2 = new java.util.Locale("france", "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.IntStream intStream8 = random1.ints((long) (byte) 100, (int) (byte) -1, (int) (short) 0);
        int int10 = random1.nextInt(13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("FRENCH (FRENCH)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: FRENCH (FRENCH) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
            java.util.Locale.Builder builder11 = builder9.setScript("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh_CN [at index 0]");
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
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        long long5 = random1.nextLong();
        random1.setSeed((long) 'a');
        long long8 = random1.nextLong();
        long long9 = random1.nextLong();
        double double10 = random1.nextDouble();
        double double11 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-5015647950085110473L) + "'", long5 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5123059410709186348L) + "'", long8 == (-5123059410709186348L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-5785953002346952466L) + "'", long9 == (-5785953002346952466L));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9562673247751239d + "'", double10 == 0.9562673247751239d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-2.797069603195829d) + "'", double11 == (-2.797069603195829d));
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("France");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = new java.util.Locale("FRA-X-LVARIANT-KOR", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale0.getDisplayLanguage(locale6);
        java.util.Set<java.lang.Character> charSet9 = locale6.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))" + "'", str7, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        float float6 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.6659571f + "'", float6 == 0.6659571f);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        java.util.Random random1 = new java.util.Random((long) 7);
        random1.setSeed((long) 'a');
        int int4 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1192805220) + "'", int4 == (-1192805220));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        java.util.stream.IntStream intStream2 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = random1.longs((-4967725919621401576L), (long) 28, (long) 1761283695);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale0.getDisplayVariant(locale3);
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale3.getDisplayName(locale6);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale6);
        boolean boolean9 = locale6.hasExtensions();
        java.lang.String str10 = locale6.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "de-DE" + "'", str10, "de-DE");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Canada");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "canada" + "'", str2, "canada");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 'u');
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 1, (double) 6, (double) 553627293);
        double double11 = random1.nextGaussian();
        java.util.stream.LongStream longStream14 = random1.longs((long) (-485610818), (long) '#');
        float float15 = random1.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.2235660632835625d + "'", double11 == 1.2235660632835625d);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8869349f + "'", float15 == 0.8869349f);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        com.github.javafaker.Internet internet8 = faker2.internet();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker2.phoneNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????? (????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("coreano (Corea del Sud)", (-1.4996531610587702d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.4996531610587702");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        java.lang.String str11 = locale6.getExtension('u');
        java.util.Random random13 = new java.util.Random((long) 7);
        random13.setSeed((long) (byte) 0);
        int int16 = random13.nextInt();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale6, random13);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1155484576) + "'", int16 == (-1155484576));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        java.lang.String str6 = faker0.bothify("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str6, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        java.util.Locale.Builder builder13 = builder10.setLanguageTag("Korean");
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Gergo chinook");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=gergochinook");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.lang.String str7 = locale3.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getISO3Language();
        java.util.Locale.Builder builder41 = builder37.setLocale(locale39);
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = locale43.getISO3Language();
        java.util.Locale locale46 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder47 = new java.util.Locale.Builder();
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getISO3Language();
        java.util.Locale.Builder builder51 = builder47.setLocale(locale49);
        java.util.Locale locale53 = new java.util.Locale("");
        java.lang.String str54 = locale53.getISO3Language();
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale39, locale43, locale46, locale49, locale53 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList56, filteringMode59);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, strMap64);
        java.util.Locale.Builder builder66 = new java.util.Locale.Builder();
        java.util.Locale locale68 = new java.util.Locale("");
        java.lang.String str69 = locale68.getISO3Language();
        java.util.Locale.Builder builder70 = builder66.setLocale(locale68);
        java.util.Locale locale72 = new java.util.Locale("");
        java.lang.String str73 = locale72.getISO3Language();
        java.util.Locale locale75 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder76 = new java.util.Locale.Builder();
        java.util.Locale locale78 = new java.util.Locale("");
        java.lang.String str79 = locale78.getISO3Language();
        java.util.Locale.Builder builder80 = builder76.setLocale(locale78);
        java.util.Locale locale82 = new java.util.Locale("");
        java.lang.String str83 = locale82.getISO3Language();
        java.util.Locale[] localeArray84 = new java.util.Locale[] { locale68, locale72, locale75, locale78, locale82 };
        java.util.ArrayList<java.util.Locale> localeList85 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList85, localeArray84);
        java.util.Locale locale87 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale locale90 = java.util.Locale.JAPAN;
        java.util.Locale locale91 = locale90.stripExtensions();
        java.util.Set<java.lang.String> strSet92 = locale90.getUnicodeLocaleKeys();
        java.lang.String str93 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet92);
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
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale46.toString(), "hi!");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode59.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals(locale75.toString(), "hi!");
        org.junit.Assert.assertEquals(locale78.toString(), "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(localeArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNull(locale87);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet92);
        org.junit.Assert.assertNull(str93);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder0.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
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
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.util.Locale locale2 = new java.util.Locale("ko-KR", "francese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for ko-kr");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "ko-kr_FRANCESE");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.util.Locale locale2 = new java.util.Locale("cinese (Taiwan)", "german (KO-KR,ko)");
        org.junit.Assert.assertEquals(locale2.toString(), "cinese (taiwan)_GERMAN (KO-KR,KO)");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Book book6 = faker0.book();
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        com.github.javafaker.Address address8 = faker0.address();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream16 = random5.doubles((long) 13, 1.7853314409882288d, 0.25081225922919653d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.24137181f + "'", float12 == 0.24137181f);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getISO3Language();
        java.lang.String str17 = locale12.getDisplayVariant(locale15);
        java.lang.String str18 = locale2.getDisplayName(locale15);
        java.lang.String str19 = locale15.getDisplayCountry();
        java.lang.String str20 = locale15.getISO3Language();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("FRENCH");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = new java.util.Locale("German", "fra-x-lvariant-kor_HI!", "de_DE");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Locale locale8 = new java.util.Locale("France");
        java.lang.String str9 = locale6.getDisplayCountry(locale8);
        java.util.Locale locale12 = new java.util.Locale("FRA-X-LVARIANT-KOR", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.lang.String str13 = locale12.getDisplayName();
        java.lang.String str14 = locale6.getDisplayLanguage(locale12);
        java.util.Locale.setDefault(locale6);
        java.util.Locale.setDefault(category0, locale6);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale4.toString(), "german_FRA-X-LVARIANT-KOR_HI!_de_DE");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale8.toString(), "france");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Canada" + "'", str9, "Canada");
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))" + "'", str13, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English" + "'", str14, "English");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Set<java.lang.Character> charSet14 = locale10.getExtensionKeys();
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
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charSet14);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        int int10 = random3.nextInt(85);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("canada", (double) 0.44047195f);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("ko_KR");
        boolean boolean5 = languageRange2.equals((java.lang.Object) locale4);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Lorem lorem4 = faker1.lorem();
        com.github.javafaker.Internet internet5 = faker1.internet();
        com.github.javafaker.Company company6 = faker1.company();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker1.resolve("de-DE");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("\u4e2d\u56fd", "Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("it", "Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: Korean (South Korea) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream8 = random1.ints((-1789290896), (int) (byte) 10);
        long long9 = random1.nextLong();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-5015647950085110473L) + "'", long9 == (-5015647950085110473L));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        float float4 = random2.nextFloat();
        java.util.stream.IntStream intStream8 = random2.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream10 = random2.ints((long) 'x');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Code code12 = faker11.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.72810113f + "'", float4 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(code12);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = random1.longs((long) (short) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random5 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream7 = random5.ints(1L);
        long long8 = random5.nextLong();
        int int10 = random5.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Code code13 = faker12.code();
        com.github.javafaker.Color color14 = faker12.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(code13);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.util.Locale locale2 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale2);
        java.lang.String str4 = locale2.getCountry();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.lang.String str7 = locale2.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.getScript();
        java.util.Random random10 = new java.util.Random(10L);
        float float11 = random10.nextFloat();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale6, random10);
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
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.73043025f + "'", float11 == 0.73043025f);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u56fd", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        boolean boolean17 = locale15.hasExtensions();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("south korea (SOUTH KOREA)", (-0.6814934967223469d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.6814934967223469");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("coreano (Corea del Sud)");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        float float6 = random4.nextFloat();
        java.util.stream.IntStream intStream10 = random4.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream11 = random4.ints();
        double double12 = random4.nextDouble();
        java.util.stream.IntStream intStream14 = random4.ints((long) (byte) 100);
        java.util.stream.IntStream intStream18 = random4.ints((long) '4', (int) '#', (int) 'x');
        boolean boolean19 = random4.nextBoolean();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random4);
        java.util.stream.DoubleStream doubleStream23 = random4.doubles((double) (-4967725919621401576L), (double) (-1167796541));
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale1, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.72810113f + "'", float6 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.44047195711667986d + "'", double12 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh-CN", (double) 0.25780278f);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.util.Random random1 = new java.util.Random((long) '#');
        long long2 = random1.nextLong();
        double double3 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random1.ints(0L, (int) (byte) 10, (-1156638823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5013995466868426345L) + "'", long2 == (-5013995466868426345L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.49641270101483514d + "'", double3 == 0.49641270101483514d);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = builder6.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "english");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("coreano");
        java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("TW", "french");
        java.util.Locale.Builder builder12 = builder7.setVariant("cinese");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream7 = random1.longs();
        java.util.stream.IntStream intStream8 = random1.ints();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem10 = faker9.lorem();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.IntStream intStream5 = random1.ints((int) (short) -1, (int) 'a');
        boolean boolean6 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (-1), 0.8746788966462123d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random1.ints((-5123059410709186348L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 'u');
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 1, (double) 6, (double) 553627293);
        double double11 = random1.nextGaussian();
        float float12 = random1.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.2235660632835625d + "'", double11 == 1.2235660632835625d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8869349f + "'", float12 == 0.8869349f);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.lang.String str6 = locale2.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("inglese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: inglese [at index 0]");
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
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fra-France");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        java.lang.String str20 = locale7.getISO3Language();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "deu" + "'", str20, "deu");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream49 = random33.ints(393447903, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.util.Locale locale2 = new java.util.Locale("French", "French");
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Random random5 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        float float7 = random5.nextFloat();
        java.util.stream.IntStream intStream11 = random5.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream12 = random5.ints();
        double double13 = random5.nextDouble();
        boolean boolean14 = random5.nextBoolean();
        int int16 = random5.nextInt(32);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale2, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRENCH could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french" + "'", str3, "french");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.72810113f + "'", float7 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.44047195711667986d + "'", double13 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 28 + "'", int16 == 28);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream7 = random1.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        java.util.stream.LongStream longStream8 = random1.longs();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
            java.util.Locale.Builder builder10 = builder8.setScript("fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fra [at index 0]");
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.util.Locale locale1 = new java.util.Locale("Korean (South Korea)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "korean (south korea)");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.util.Random random1 = new java.util.Random((long) (byte) -1);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (byte) 100, (-0.35703205834598994d), (double) 0.73043025f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random1.longs((long) 1036684082, (long) 513819833);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        long long17 = random4.nextLong();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.72810113f + "'", float6 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.44047195711667986d + "'", double12 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.24137181f + "'", float13 == 0.24137181f);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-2085682583702141179L) + "'", long17 == (-2085682583702141179L));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale10);
        java.lang.String str14 = locale10.getVariant();
        java.lang.String str15 = locale10.getDisplayCountry();
        java.util.Set<java.lang.String> strSet16 = locale10.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.util.Locale locale1 = new java.util.Locale("FRENCH");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "french" + "'", str2, "french");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Code code7 = faker0.code();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.util.Random random0 = new java.util.Random();
        random0.setSeed((long) 10);
        double double3 = random0.nextDouble();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7304302967434272d + "'", double3 == 0.7304302967434272d);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setVariant("\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ???????? (???????????) [at index 0]");
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
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.lang.String str8 = locale5.getScript();
        java.util.Locale.setDefault(category2, locale5);
        java.util.Locale locale10 = java.util.Locale.getDefault(category2);
        java.util.Locale locale11 = java.util.Locale.getDefault(category2);
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale0.getDisplayLanguage(locale11);
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.util.Random random17 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        java.util.stream.DoubleStream doubleStream20 = random17.doubles((long) (byte) 1);
        long long21 = random17.nextLong();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale15, random17);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Book book24 = faker23.book();
        com.github.javafaker.Finance finance25 = faker23.finance();
        com.github.javafaker.Code code26 = faker23.code();
        com.github.javafaker.Lorem lorem27 = faker23.lorem();
        boolean boolean28 = locale0.equals((java.lang.Object) faker23);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-5015647950085110473L) + "'", long21 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book24);
        org.junit.Assert.assertNotNull(finance25);
        org.junit.Assert.assertNotNull(code26);
        org.junit.Assert.assertNotNull(lorem27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code7 = faker6.code();
        java.lang.String str9 = faker6.numerify("FRENCH (FRENCH)");
        com.github.javafaker.Address address10 = faker6.address();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRENCH (FRENCH)" + "'", str9, "FRENCH (FRENCH)");
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.util.Locale locale1 = new java.util.Locale("France");
        java.lang.String str3 = locale1.getExtension('x');
        org.junit.Assert.assertEquals(locale1.toString(), "france");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder0.setLanguage("\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ???????? (???????????) [at index 0]");
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
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.getISO3Country();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FRENCH (FRANCE)", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        java.util.Locale locale3 = new java.util.Locale("CA", "Coreano (FRENCH (FRENCH))", "KOR");
        org.junit.Assert.assertEquals(locale3.toString(), "ca_COREANO (FRENCH (FRENCH))_KOR");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("french (france)_CANADA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (france)_canada");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
        java.lang.String str5 = locale2.getDisplayName(locale3);
        java.lang.String str6 = locale2.getDisplayLanguage();
        java.lang.Class<?> wildcardClass7 = locale2.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coreano (Corea del Sud)" + "'", str5, "coreano (Corea del Sud)");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u671d\u9c9c\u6587" + "'", str6, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        java.lang.String str10 = faker2.bothify("Korean (South Korea)");
        com.github.javafaker.Options options11 = faker2.options();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker2.phoneNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Korean (South Korea)" + "'", str10, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(phoneNumber12);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        java.util.Locale locale3 = new java.util.Locale("\uc911\uad6d", "und", "");
        java.lang.String str5 = locale3.getUnicodeLocaleType("zh");
        org.junit.Assert.assertEquals(locale3.toString(), "\uc911\uad6d_UND");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        java.lang.String str10 = faker2.bothify("Korean (South Korea)");
        com.github.javafaker.Book book11 = faker2.book();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Korean (South Korea)" + "'", str10, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("coreano");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.removeUnicodeLocaleAttribute("de-DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: de-DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french (french)", (double) 0.831441f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (french)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.util.Random random1 = new java.util.Random((long) '#');
        long long2 = random1.nextLong();
        double double3 = random1.nextDouble();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5013995466868426345L) + "'", long2 == (-5013995466868426345L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.49641270101483514d + "'", double3 == 0.49641270101483514d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1359947704 + "'", int5 == 1359947704);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        int int6 = random1.nextInt();
        java.util.stream.IntStream intStream7 = random1.ints();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1891812663 + "'", int6 == 1891812663);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.lang.String str8 = locale5.getScript();
        java.util.Locale.setDefault(category2, locale5);
        java.util.Locale locale10 = java.util.Locale.getDefault(category2);
        java.util.Locale locale11 = java.util.Locale.getDefault(category2);
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale0.getDisplayLanguage(locale11);
        java.lang.String str14 = locale11.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("chn", (double) 1430131985);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.430131985E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getLanguage();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale8.getISO3Language();
        java.lang.String str10 = locale8.getDisplayName();
        java.lang.String str11 = locale7.getDisplayScript(locale8);
        java.lang.String str12 = locale7.getLanguage();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale13.getISO3Language();
        java.lang.String str15 = locale13.getDisplayLanguage();
        java.lang.String str16 = locale7.getDisplayName(locale13);
        java.lang.String str18 = locale13.getExtension('u');
        java.lang.String str19 = locale4.getDisplayCountry(locale13);
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale4.getDisplayVariant(locale20);
        java.util.Random random22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale20, random22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "kor" + "'", str9, "kor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Korean (South Korea)" + "'", str10, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fra" + "'", str14, "fra");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "French" + "'", str15, "French");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("coreano (Corea del Sud)");
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayCountry(locale5);
        java.lang.String str8 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "France" + "'", str7, "France");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
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
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Color color9 = faker8.color();
        com.github.javafaker.Finance finance10 = faker8.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        java.util.Locale locale2 = new java.util.Locale("French (France)", "Canada");
        java.lang.String str3 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "french (france)_CANADA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder2.setExtension('#', "french (france)_CANADA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("jpn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setLanguageTag("FRA-X-LVARIANT-KOR_HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: KOR_HI! [at index 15]");
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
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Francia");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.util.Locale locale2 = new java.util.Locale("chinese_KOR", "Canada");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_kor_CANADA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_kor_CANADA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CANADA" + "'", str4, "CANADA");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.util.Random random1 = new java.util.Random(10L);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random1.nextBytes(byteArray7);
        java.util.stream.IntStream intStream10 = random1.ints((long) 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3, -70, -8]");
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.IntStream intStream3 = random1.ints((long) 100);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet5 = faker4.internet();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(internet5);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.util.Random random1 = new java.util.Random(10L);
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        double double4 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73043025f + "'", float2 == 0.73043025f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.3325983427023256d) + "'", double4 == (-1.3325983427023256d));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Language();
        java.lang.String str7 = locale2.getDisplayName(locale5);
        java.util.Locale locale8 = locale2.stripExtensions();
        java.lang.String str9 = locale2.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "kor" + "'", str6, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uc911\uad6d\uc5b4\ub300\ub9cc)" + "'", str7, "\uc911\uad6d\uc5b4\ub300\ub9cc)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese" + "'", str9, "Chinese");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Coreano (FRENCH (FRENCH))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=coreano(french(french))");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        float float6 = random1.nextFloat();
        java.util.Random random8 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        int int11 = random8.nextInt(10);
        java.util.Random random13 = new java.util.Random(10L);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random13.nextBytes(byteArray19);
        random8.nextBytes(byteArray19);
        java.util.stream.DoubleStream doubleStream25 = random8.doubles(100L, 0.0d, 10.0d);
        random8.setSeed(0L);
        java.util.Random random29 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        int int32 = random29.nextInt((int) '4');
        java.util.stream.IntStream intStream33 = random29.ints();
        java.util.Random random35 = new java.util.Random((long) (byte) 100);
        java.util.Random random37 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream38 = random37.ints();
        java.util.stream.LongStream longStream39 = random37.longs();
        java.util.Random random41 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(random41);
        int int44 = random41.nextInt(10);
        java.util.Random random46 = new java.util.Random(10L);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random46.nextBytes(byteArray52);
        random41.nextBytes(byteArray52);
        random37.nextBytes(byteArray52);
        random35.nextBytes(byteArray52);
        random29.nextBytes(byteArray52);
        random8.nextBytes(byteArray52);
        random1.nextBytes(byteArray52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.44047195f + "'", float6 == 0.44047195f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[55, -59, -62, 112, 34]");
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 31 + "'", int32 == 31);
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertNotNull(intStream38);
        org.junit.Assert.assertNotNull(longStream39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 7 + "'", int44 == 7);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[34, 42, 124, -86, 50]");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.LongStream longStream9 = random1.longs((long) '#', 100L);
        int int11 = random1.nextInt(10);
        int int13 = random1.nextInt(17);
        java.util.stream.IntStream intStream14 = random1.ints();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (short) 0);
        java.util.stream.DoubleStream doubleStream11 = random1.doubles(100.0d, (double) 1708368258);
        double double12 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7281011855672591d + "'", double12 == 0.7281011855672591d);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.util.Locale locale1 = new java.util.Locale("french (FRENCH)");
        java.util.Locale locale5 = new java.util.Locale("hi!", "french (FRENCH)", "hi!");
        boolean boolean6 = locale5.hasExtensions();
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.util.Random random9 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        int int12 = random9.nextInt(10);
        java.util.stream.DoubleStream doubleStream13 = random9.doubles();
        boolean boolean14 = locale5.equals((java.lang.Object) doubleStream13);
        org.junit.Assert.assertEquals(locale1.toString(), "french (french)");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_FRENCH (FRENCH)_hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FRENCH (FRANCE)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french(france)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ZH-CN");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("Canada");
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor");
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("fra");
        java.lang.String str13 = languageRange12.getRange();
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("fra");
        java.lang.String str16 = languageRange15.getRange();
        java.lang.String str17 = languageRange15.getRange();
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        java.lang.String str23 = languageRange22.getRange();
        java.util.Locale.LanguageRange languageRange25 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor");
        java.util.Locale.LanguageRange languageRange28 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        double double29 = languageRange28.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] { languageRange3, languageRange6, languageRange8, languageRange10, languageRange12, languageRange15, languageRange19, languageRange22, languageRange25, languageRange28 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, strMap36);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strMap41);
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale locale45 = new java.util.Locale("");
        java.lang.String str46 = locale45.getISO3Language();
        java.util.Locale.Builder builder47 = builder43.setLocale(locale45);
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getISO3Language();
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getISO3Language();
        java.util.Locale.Builder builder57 = builder53.setLocale(locale55);
        java.util.Locale locale59 = new java.util.Locale("");
        java.lang.String str60 = locale59.getISO3Language();
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale45, locale49, locale52, locale55, locale59 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.Locale locale64 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.Locale.FilteringMode filteringMode65 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList62, filteringMode65);
        java.util.Locale locale67 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale.LanguageRange languageRange69 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] { languageRange69 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.lang.String[] strArray78 = new java.lang.String[] { "kor", "fra", "kor", "French", "hi!" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.lang.String>) strList79, filteringMode81);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList66, filteringMode81);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fra" + "'", str13, "fra");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fra" + "'", str16, "fra");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fra" + "'", str17, "fra");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "french" + "'", str23, "french");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(localeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(locale64);
        org.junit.Assert.assertTrue("'" + filteringMode65 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode65.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNull(locale67);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode81.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(localeList83);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Finance finance2 = faker1.finance();
        java.lang.String str4 = faker1.bothify("french (france)_CANADA");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "french (france)_CANADA" + "'", str4, "french (france)_CANADA");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        java.util.Locale locale1 = new java.util.Locale("HI!");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ko-KR", (double) 0.24137181f);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles(100L);
        java.util.stream.IntStream intStream5 = random1.ints();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        java.lang.String str17 = locale0.getDisplayCountry();
        java.lang.String str18 = locale0.getISO3Language();
        java.lang.String str19 = locale0.getDisplayScript();
        java.lang.String str20 = locale0.getScript();
        java.lang.String str21 = locale0.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinese" + "'", str21, "Chinese");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Options options8 = faker2.options();
        com.github.javafaker.Company company9 = faker2.company();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(company9);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}
