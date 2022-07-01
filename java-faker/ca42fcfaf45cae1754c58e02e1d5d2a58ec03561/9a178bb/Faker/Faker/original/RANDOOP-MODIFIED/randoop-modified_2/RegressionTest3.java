import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("Cina");
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale7.toLanguageTag();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder10.clear();
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.util.Locale locale3 = new java.util.Locale("Cina", "South Korea", "french");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "cina_SOUTH KOREA_french");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cina" + "'", str4, "cina");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("cinese");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "cinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.lang.Class<?> wildcardClass2 = random1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.util.Locale locale3 = new java.util.Locale("fra-x-lvariant-kor", "", "FRENCH");
        java.lang.String str4 = locale3.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getUnicodeLocaleType("francese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: francese");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fra-x-lvariant-kor__FRENCH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        java.lang.Object obj40 = locale39.clone();
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
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        java.util.Locale.Builder builder6 = builder2.setLanguage("Korean");
        java.util.Locale.Builder builder8 = builder6.setLanguage("it");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.addUnicodeLocaleAttribute("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.IntStream intStream3 = random1.ints((long) 100);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address5 = faker4.address();
        java.lang.String str7 = faker4.numerify("jpn");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jpn" + "'", str7, "jpn");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        java.util.Random random1 = new java.util.Random((long) 7);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) 1, (double) (short) 10);
        float float6 = random1.nextFloat();
        random1.setSeed((long) (byte) 100);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream11 = random1.longs(5840930912313687631L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8452060657049847d + "'", double2 == 0.8452060657049847d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.3483097f + "'", float6 == 0.3483097f);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.Random random6 = new java.util.Random(10L);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random6.nextBytes(byteArray12);
        random1.nextBytes(byteArray12);
        java.util.stream.DoubleStream doubleStream18 = random1.doubles(100L, 0.0d, 10.0d);
        random1.setSeed(0L);
        java.util.stream.IntStream intStream22 = random1.ints(100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[55, -59, -62, 112, 34]");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(intStream22);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FRENCH", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        java.util.Locale locale37 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet39 = locale37.getUnicodeLocaleAttributes();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str42 = locale40.getExtension('x');
        java.lang.String str43 = locale37.getDisplayCountry(locale40);
        java.util.Locale.setDefault(category0, locale37);
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
        org.junit.Assert.assertEquals(locale37.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "FRA" + "'", str43, "FRA");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.util.Locale locale3 = new java.util.Locale("francese (Francia)", "french (FRENCH)", "\u6cd5\u6587");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale locale6 = new java.util.Locale("CHN", "de", "KR");
        java.lang.String str7 = locale0.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale6.toString(), "chn_DE_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinook jargon (Germany,KR)" + "'", str8, "Chinook jargon (Germany,KR)");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        com.github.javafaker.Book book9 = faker2.book();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Lorem lorem2 = faker0.lorem();
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Company company5 = faker0.company();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Random random3 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        int int6 = random3.nextInt((int) '4');
        java.util.stream.IntStream intStream7 = random3.ints();
        double double8 = random3.nextDouble();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Code code10 = faker9.code();
        com.github.javafaker.Internet internet11 = faker9.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6991794951529816d + "'", double8 == 0.6991794951529816d);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(internet11);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        int int2 = random1.nextInt();
        int int3 = random1.nextInt();
        double double4 = random1.nextGaussian();
        random1.setSeed(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1157793070) + "'", int2 == (-1157793070));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1913984760 + "'", int3 == 1913984760);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.561798736983973d) + "'", double4 == (-0.561798736983973d));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        com.github.javafaker.Code code9 = faker2.code();
        com.github.javafaker.Options options10 = faker2.options();
        com.github.javafaker.Code code11 = faker2.code();
        com.github.javafaker.Code code12 = faker2.code();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(code12);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
        java.lang.String str5 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coreano (Corea del Sud)" + "'", str5, "coreano (Corea del Sud)");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
            java.util.Locale.Builder builder15 = builder7.addUnicodeLocaleAttribute("fra (HI!,kor)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fra (HI!,kor) [at index 0]");
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.util.Locale locale1 = new java.util.Locale("French (Canada)");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale6 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale6.getDisplayName();
        java.lang.String str9 = locale2.getDisplayScript(locale6);
        java.lang.String str10 = locale1.getDisplayCountry(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "french (canada)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertEquals(locale6.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "french (FRENCH)" + "'", str8, "french (FRENCH)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        float float23 = random1.nextFloat();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-42, -97, -43, -72, -76]");
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.19497603f + "'", float23 == 0.19497603f);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        java.lang.String str6 = faker3.letterify("Germany");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Germany" + "'", str6, "Germany");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.numerify("French");
        com.github.javafaker.Code code8 = faker1.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        java.util.stream.DoubleStream doubleStream13 = random3.doubles();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2413718236526089d + "'", double12 == 0.2413718236526089d);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.util.Locale locale2 = new java.util.Locale("coreano (Corea del Sud)", "kor");
        java.lang.String str3 = locale2.getScript();
        java.util.Random random5 = new java.util.Random(10L);
        int int7 = random5.nextInt((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale2, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: coreano (corea del sud)_KOR could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "coreano (corea del sud)_KOR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 13 + "'", int7 == 13);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.util.Locale locale0 = null;
        java.util.Random random2 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream4 = random2.longs();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.util.Locale locale3 = new java.util.Locale("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)", "TW", "");
        org.junit.Assert.assertEquals(locale3.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)_TW");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.util.Locale locale1 = new java.util.Locale("FRENCH");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "french");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chinese");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.util.Locale locale1 = new java.util.Locale("cina");
        org.junit.Assert.assertEquals(locale1.toString(), "cina");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Italy");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream11 = random1.longs((long) (short) -1, (long) 10);
        float float12 = random1.nextFloat();
        java.util.stream.IntStream intStream15 = random1.ints((-1192805220), (-1156638823));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.44047195f + "'", float12 == 0.44047195f);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra-x-lvariant-kor" + "'", str2, "fra-x-lvariant-kor");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        boolean boolean5 = locale3.hasExtensions();
        java.lang.String str6 = locale3.getCountry();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale11.getISO3Language();
        java.lang.String str13 = locale11.getDisplayName();
        java.lang.String str14 = locale10.getDisplayScript(locale11);
        java.util.Locale.Builder builder15 = builder9.setLocale(locale10);
        java.lang.String str16 = locale3.getDisplayCountry(locale10);
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.lang.String str18 = locale17.getScript();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale locale21 = locale19.stripExtensions();
        java.util.Locale locale24 = new java.util.Locale("fra-x-lvariant-kor", "hi!");
        java.lang.String str25 = locale19.getDisplayScript(locale24);
        java.lang.String str26 = locale17.getDisplayName(locale19);
        java.lang.String str27 = locale10.getDisplayScript(locale17);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GB" + "'", str6, "GB");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "kor" + "'", str12, "kor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Korean (South Korea)" + "'", str13, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United Kingdom" + "'", str16, "United Kingdom");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "kor" + "'", str20, "kor");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertEquals(locale24.toString(), "fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str26, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.DateAndTime dateAndTime2 = faker1.date();
        com.github.javafaker.Company company3 = faker1.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(company3);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        java.lang.String str9 = faker2.letterify("german (KO-KR,ko)");
        java.lang.String str11 = faker2.letterify("und");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "german (KO-KR,ko)" + "'", str9, "german (KO-KR,ko)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "und" + "'", str11, "und");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale9.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "kor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        float float9 = random3.nextFloat();
        int int10 = random3.nextInt();
        java.util.stream.IntStream intStream11 = random3.ints();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.6659571f + "'", float9 == 0.6659571f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1036684082 + "'", int10 == 1036684082);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Finance finance10 = faker9.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.util.Locale locale1 = new java.util.Locale("fra_KOR_France");
        java.lang.String str2 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "fra_kor_france");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getISO3Country();
        java.util.Locale locale7 = locale3.stripExtensions();
        java.lang.String str8 = locale0.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.IntStream intStream3 = random1.ints((long) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream7 = random1.ints(0, (int) 'u');
        java.util.stream.LongStream longStream9 = random1.longs(0L);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        java.lang.String str13 = locale8.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("TW", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u6587", "Canada", "\u30d5\u30e9\u30f3\u30b9");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u30d5\u30e9\u30f3\u30b9");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.util.Locale locale2 = new java.util.Locale("zho", "french_FRENCH");
        org.junit.Assert.assertEquals(locale2.toString(), "zho_FRENCH_FRENCH");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        com.github.javafaker.Number number13 = faker9.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr-FR" + "'", str12, "fr-FR");
        org.junit.Assert.assertNotNull(number13);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale8);
        java.util.Locale.setDefault(category5, locale8);
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category5, locale11);
        java.lang.String str13 = locale4.getDisplayCountry(locale11);
        java.lang.String str14 = locale0.getDisplayLanguage(locale4);
        java.lang.String str15 = locale0.getScript();
        java.lang.String str16 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale8.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "German" + "'", str14, "German");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tedesco" + "'", str16, "tedesco");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.util.Locale locale1 = new java.util.Locale("JP");
        java.util.Locale locale4 = new java.util.Locale("ENGLISH", "eng");
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Random random7 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        float float9 = random7.nextFloat();
        int int11 = random7.nextInt((int) '#');
        double double12 = random7.nextGaussian();
        random7.setSeed((long) 553627293);
        double double15 = random7.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale4, random7);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: english_ENG could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "jp");
        org.junit.Assert.assertEquals(locale4.toString(), "english_ENG");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.72810113f + "'", float9 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3268766592932178d + "'", double12 == 0.3268766592932178d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.371765031357728d + "'", double15 == 0.371765031357728d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fra");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getExtension('u');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("coreano");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder8.setUnicodeLocaleKeyword("Chinese", "Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Chinese [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-CN");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("English");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("zh", "");
        java.util.Locale locale13 = builder12.build();
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet14);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "english__#u-zh");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        double double2 = random1.nextDouble();
        float float3 = random1.nextFloat();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((-1.2072549328028286d), (double) 1708368258);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22278216143339702d + "'", double2 == 0.22278216143339702d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.39776045f + "'", float3 == 0.39776045f);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        boolean boolean10 = random1.nextBoolean();
        double double11 = random1.nextDouble();
        int int13 = random1.nextInt(1036684082);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8869349148715235d + "'", double11 == 0.8869349148715235d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 216154118 + "'", int13 == 216154118);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jpn" + "'", str3, "jpn");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Business business6 = faker1.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.util.Locale locale2 = new java.util.Locale("chn", "chinese_kor (CANADA)");
        org.junit.Assert.assertEquals(locale2.toString(), "chn_CHINESE_KOR (CANADA)");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.util.Locale locale3 = new java.util.Locale("fra-x-lvariant-kor", "zh", "Coreano (FRENCH (FRENCH))");
        java.lang.String str4 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "fra-x-lvariant-kor_ZH_Coreano (FRENCH (FRENCH))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coreano (FRENCH (FRENCH))" + "'", str4, "Coreano (FRENCH (FRENCH))");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints(1L);
        int int5 = random1.nextInt((int) '#');
        java.util.stream.DoubleStream doubleStream7 = random1.doubles((long) (short) 100);
        java.lang.Class<?> wildcardClass8 = random1.getClass();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.Business business6 = faker0.business();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.util.Locale locale2 = new java.util.Locale("Canada", "french (french)");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("coreano (Corea del Sud)");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.lang.String str7 = locale6.getDisplayScript();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale6);
        java.util.Random random10 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream11 = random10.ints();
        java.util.stream.LongStream longStream12 = random10.longs();
        java.util.Random random14 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        int int17 = random14.nextInt(10);
        java.util.Random random19 = new java.util.Random(10L);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random19.nextBytes(byteArray25);
        random14.nextBytes(byteArray25);
        random10.nextBytes(byteArray25);
        java.util.stream.IntStream intStream29 = random10.ints();
        int int30 = random10.nextInt();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(locale6, random10);
        java.lang.String str32 = locale6.getScript();
        java.lang.String str33 = locale4.getDisplayScript(locale6);
        java.lang.String str34 = locale2.getDisplayLanguage(locale6);
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale locale36 = builder35.build();
        java.util.Locale.Builder builder37 = builder35.clearExtensions();
        java.util.Locale.Builder builder38 = builder37.clearExtensions();
        java.util.Locale locale39 = builder38.build();
        java.lang.String str40 = locale39.getDisplayCountry();
        java.lang.String str41 = locale39.getLanguage();
        java.util.Locale locale42 = java.util.Locale.ROOT;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale43.getISO3Language();
        java.lang.String str45 = locale43.getDisplayName();
        java.lang.String str46 = locale42.getDisplayScript(locale43);
        java.lang.String str47 = locale42.getLanguage();
        java.util.Locale locale48 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str49 = locale48.getISO3Language();
        java.lang.String str50 = locale48.getDisplayLanguage();
        java.lang.String str51 = locale42.getDisplayName(locale48);
        java.lang.String str53 = locale48.getExtension('u');
        java.lang.String str54 = locale39.getDisplayCountry(locale48);
        java.lang.String str55 = locale6.getDisplayScript(locale39);
        org.junit.Assert.assertEquals(locale2.toString(), "canada_FRENCH (FRENCH)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1708368258 + "'", int30 == 1708368258);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "canada" + "'", str34, "canada");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "kor" + "'", str44, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str45, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "fra" + "'", str49, "fra");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str50, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setExtension('u', "TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setExtension('#', "ENGLISH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ZH-CN");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder13 = builder8.setLocale(locale11);
        java.lang.String str14 = locale7.getDisplayCountry(locale11);
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale.setDefault(category0, locale17);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FRENCH" + "'", str14, "FRENCH");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Locale locale4 = locale2.stripExtensions();
        java.lang.String str5 = locale4.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_TW" + "'", str5, "zh_TW");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.util.Locale locale3 = new java.util.Locale("zh", "en-CA", "Francia");
        org.junit.Assert.assertEquals(locale3.toString(), "zh_EN-CA_Francia");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.util.Locale locale3 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Random random8 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        int int11 = random8.nextInt(10);
        java.util.stream.DoubleStream doubleStream12 = random8.doubles();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale6, random8);
        java.util.stream.DoubleStream doubleStream16 = random8.doubles((long) 'u');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale3, random8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh_tw_CHINESE_Chinese could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("it", (double) 0.100473166f);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.util.Locale locale1 = new java.util.Locale("Francia");
        org.junit.Assert.assertEquals(locale1.toString(), "francia");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.lang.String str14 = locale3.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale3.getUnicodeLocaleType("Japanese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Japanese");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fra (HI!,kor)" + "'", str14, "fra (HI!,kor)");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream7 = random1.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        java.util.stream.IntStream intStream8 = random1.ints();
        java.util.stream.LongStream longStream9 = random1.longs();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setExtension('u', "TWN");
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setExtension('u', "\u30d5\u30e9\u30f3\u30b9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale.Builder builder10 = builder6.setRegion("");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream8 = random1.ints((long) 'u');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.DateAndTime dateAndTime7 = faker6.date();
        com.github.javafaker.Color color8 = faker6.color();
        com.github.javafaker.Company company9 = faker6.company();
        com.github.javafaker.Internet internet10 = faker6.internet();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertNotNull(internet10);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        int int16 = random6.nextInt();
        java.util.stream.LongStream longStream17 = random6.longs();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1434703326) + "'", int16 == (-1434703326));
        org.junit.Assert.assertNotNull(longStream17);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints(1L);
        int int5 = random1.nextInt((int) '#');
        java.util.stream.DoubleStream doubleStream7 = random1.doubles((long) (short) 100);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles(100L);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream11 = random1.longs();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.lang.String str6 = locale0.getDisplayName(locale4);
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale8.getISO3Language();
        java.lang.String str10 = locale8.getDisplayName();
        java.lang.String str11 = locale7.getDisplayScript(locale8);
        java.lang.String str12 = locale7.getLanguage();
        java.lang.String str13 = locale4.getDisplayCountry(locale7);
        java.lang.String str14 = locale7.getDisplayVariant();
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
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "kor" + "'", str9, "kor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Korean (South Korea)" + "'", str10, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Code code2 = faker0.code();
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Finance finance4 = faker0.finance();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRA");
        java.lang.String str2 = languageRange1.getRange();
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap30);
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
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList56);
        boolean boolean60 = languageRange1.equals((java.lang.Object) localeList56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
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
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        java.util.Locale locale43 = java.util.Locale.CHINESE;
        java.util.Locale.setDefault(category0, locale43);
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
        org.junit.Assert.assertEquals(locale43.toString(), "zh");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.util.Locale locale1 = new java.util.Locale("inglese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("FRA-X-LVARIANT-KOR_HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: FRA-X-LVARIANT-KOR_HI!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "inglese");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        com.github.javafaker.Address address24 = faker23.address();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-42, -97, -43, -72, -76]");
        org.junit.Assert.assertNotNull(address24);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Address address4 = faker2.address();
        com.github.javafaker.Name name5 = faker2.name();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker2.resolve("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(name5);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("french");
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
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, strMap34);
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale locale38 = new java.util.Locale("");
        java.lang.String str39 = locale38.getISO3Language();
        java.util.Locale.Builder builder40 = builder36.setLocale(locale38);
        java.util.Locale locale42 = new java.util.Locale("");
        java.lang.String str43 = locale42.getISO3Language();
        java.util.Locale locale45 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder46 = new java.util.Locale.Builder();
        java.util.Locale locale48 = new java.util.Locale("");
        java.lang.String str49 = locale48.getISO3Language();
        java.util.Locale.Builder builder50 = builder46.setLocale(locale48);
        java.util.Locale locale52 = new java.util.Locale("");
        java.lang.String str53 = locale52.getISO3Language();
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale38, locale42, locale45, locale48, locale52 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.Locale locale57 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList58, filteringMode59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap61);
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
        java.lang.String[] strArray91 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList92);
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags(languageRangeList62, (java.util.Collection<java.lang.String>) strList92);
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
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals(locale45.toString(), "hi!");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(locale57);
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode59.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList60);
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
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(strList95);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.lang.String str4 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        java.lang.String str7 = faker5.letterify("french (french)");
        com.github.javafaker.Lorem lorem8 = faker5.lorem();
        java.lang.String str10 = faker5.bothify("FRENCH (FRANCE) (France)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = faker5.resolve("ja");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "french (french)" + "'", str7, "french (french)");
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FRENCH (FRANCE) (France)" + "'", str10, "FRENCH (FRANCE) (France)");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        random4.setSeed((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream20 = random4.ints((-4967725919621401576L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
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
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italia", 0.8452060657049847d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italia" + "'", str3, "italia");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random5 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream7 = random5.ints(1L);
        long long8 = random5.nextLong();
        int int10 = random5.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random5);
        java.lang.String str13 = faker11.letterify("french");
        com.github.javafaker.Book book14 = faker11.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "french" + "'", str13, "french");
        org.junit.Assert.assertNotNull(book14);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        java.lang.String str19 = locale13.getDisplayName(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale locale22 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "kor" + "'", str14, "kor");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str18, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str19, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ja");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale1.getDisplayCountry(locale4);
        java.lang.String str8 = locale4.toLanguageTag();
        java.util.Locale locale9 = locale4.stripExtensions();
        java.lang.String str10 = locale9.getScript();
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.setVariant("");
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "CA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setLanguage("\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ??? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        java.lang.String str25 = locale3.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Korean" + "'", str25, "Korean");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.util.Random random1 = new java.util.Random((long) 38);
        boolean boolean2 = random1.nextBoolean();
        double double3 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9785363823927327d + "'", double3 == 0.9785363823927327d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        java.util.stream.LongStream longStream8 = random1.longs((-5123059410709186348L), (long) 32);
        java.util.stream.IntStream intStream10 = random1.ints(1L);
        random1.setSeed((long) (short) 1);
        java.util.stream.LongStream longStream16 = random1.longs(0L, (long) (-485610818), (long) 13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream18 = random1.doubles((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.Random random6 = new java.util.Random(10L);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random6.nextBytes(byteArray12);
        random1.nextBytes(byteArray12);
        java.util.stream.DoubleStream doubleStream18 = random1.doubles(100L, 0.0d, 10.0d);
        random1.setSeed(0L);
        java.util.stream.LongStream longStream22 = random1.longs((long) 28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[55, -59, -62, 112, 34]");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(longStream22);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        java.lang.String str22 = locale6.getScript();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber();
        java.lang.String str9 = faker6.numerify("FRA-X-LVARIANT-KOR_HI!");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French (France)" + "'", str2, "French (France)");
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRA-X-LVARIANT-KOR_HI!" + "'", str9, "FRA-X-LVARIANT-KOR_HI!");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.util.Locale locale2 = new java.util.Locale("it", "zh-TW");
        java.lang.String str3 = locale2.getISO3Language();
        org.junit.Assert.assertEquals(locale2.toString(), "it_ZH-TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getDisplayCountry();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Address address6 = faker5.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Canada" + "'", str4, "Canada");
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FRA-X-LVARIANT-KOR", (double) 393447903);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=3.93447903E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.util.Locale locale3 = new java.util.Locale("chinese_kor_CANADA", "TW", "cinese (taiwan)");
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_kor_canada_TW_cinese (taiwan)");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder2.setLocale(locale5);
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale10 = new java.util.Locale("ko");
        java.lang.String str11 = locale5.getDisplayVariant(locale10);
        java.util.Random random13 = new java.util.Random((long) 1);
        java.util.stream.IntStream intStream14 = random13.ints();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale5, random13);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.LongStream longStream5 = random1.longs();
        boolean boolean6 = random1.nextBoolean();
        int int8 = random1.nextInt(1036684082);
        int int10 = random1.nextInt((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 393447903 + "'", int8 == 393447903);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.util.Locale locale2 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        java.lang.String str9 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FRA" + "'", str8, "FRA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRA" + "'", str9, "FRA");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.util.Random random1 = new java.util.Random(100L);
        random1.setSeed((long) 'u');
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.util.Random random1 = new java.util.Random(0L);
        java.util.stream.LongStream longStream4 = random1.longs((-464978171729231043L), 0L);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = locale23.getUnicodeLocaleType("cinese (Cina)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: cinese (Cina)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        com.github.javafaker.Code code9 = faker2.code();
        com.github.javafaker.Options options10 = faker2.options();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = faker2.resolve("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker2.resolve("kor");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(address3);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale7.getDisplayLanguage(locale9);
        java.lang.String str11 = locale4.getDisplayName(locale9);
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getISO3Language();
        java.lang.String str14 = locale4.getDisplayCountry(locale12);
        java.lang.String str15 = locale0.getDisplayName(locale12);
        java.lang.String str16 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u30d5\u30e9\u30f3\u30b9" + "'", str5, "\u30d5\u30e9\u30f3\u30b9");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French (France)" + "'", str11, "French (France)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "France" + "'", str14, "France");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Japanese" + "'", str15, "Japanese");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str16, "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Company company5 = faker1.company();
        com.github.javafaker.Business business6 = faker1.business();
        com.github.javafaker.Code code7 = faker1.code();
        com.github.javafaker.Code code8 = faker1.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = new java.util.Locale("fra", "China");
        java.lang.String str4 = locale0.getDisplayVariant(locale3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale3.toString(), "fra_CHINA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("coreano");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setVariant("fra-x-lvariant-kor_HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fra-x-lvariant-kor_HI! [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.util.Random random1 = new java.util.Random((long) 513819833);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.util.Locale locale3 = new java.util.Locale("German", "fra-x-lvariant-kor_HI!", "de_DE");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "german_FRA-X-LVARIANT-KOR_HI!_de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA-X-LVARIANT-KOR_HI!" + "'", str4, "FRA-X-LVARIANT-KOR_HI!");
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        com.github.javafaker.PhoneNumber phoneNumber12 = faker9.phoneNumber();
        com.github.javafaker.Number number13 = faker9.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(number13);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        java.lang.Class<?> wildcardClass11 = locale8.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30d5\u30e9\u30f3\u30b9" + "'", str1, "\u30d5\u30e9\u30f3\u30b9");
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        java.lang.String str19 = locale13.getDisplayName(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.lang.String str22 = locale21.getISO3Language();
        java.lang.String str23 = locale21.getISO3Language();
        java.util.Locale locale27 = new java.util.Locale("", "chinois (Taiwan)", "cinese");
        java.lang.String str28 = locale21.getDisplayScript(locale27);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "kor" + "'", str14, "kor");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str18, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str19, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "jpn" + "'", str22, "jpn");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "jpn" + "'", str23, "jpn");
        org.junit.Assert.assertEquals(locale27.toString(), "_CHINOIS (TAIWAN)_cinese");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.lang.Object obj10 = locale8.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Address address4 = faker1.address();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker1.phoneNumber();
        com.github.javafaker.Color color6 = faker1.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        com.github.javafaker.Name name7 = faker1.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.LongStream longStream5 = random1.longs((long) 1913984760, (long) 13, (long) 85);
        java.util.stream.IntStream intStream7 = random1.ints((long) 6);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        java.util.stream.DoubleStream doubleStream10 = random2.doubles((long) 'u');
        random2.setSeed((long) '#');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random5 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream7 = random5.ints(1L);
        long long8 = random5.nextLong();
        int int10 = random5.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random5);
        java.util.stream.IntStream intStream15 = random5.ints((long) 6, 10, 216154118);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)" + "'", str2, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zho", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("it_it");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=it_it");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setUnicodeLocaleKeyword("", "English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
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
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder7 = builder2.clear();
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Number number3 = faker2.number();
        com.github.javafaker.Lorem lorem4 = faker2.lorem();
        com.github.javafaker.Code code5 = faker2.code();
        com.github.javafaker.Book book6 = faker2.book();
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale10.getExtension(' ');
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str11, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("France");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u8a9e\u30ab\u30ca\u30c0)" + "'", str5, "\u82f1\u8a9e\u30ab\u30ca\u30c0)");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book4 = faker3.book();
        com.github.javafaker.Business business5 = faker3.business();
        com.github.javafaker.Company company6 = faker3.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str2, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Cina", (double) (short) 0);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cina" + "'", str3, "cina");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.util.Random random1 = new java.util.Random((long) 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) (-1), (long) (byte) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code7 = faker6.code();
        java.lang.String str9 = faker6.numerify("FRENCH (FRENCH)");
        com.github.javafaker.Finance finance10 = faker6.finance();
        com.github.javafaker.Book book11 = faker6.book();
        com.github.javafaker.DateAndTime dateAndTime12 = faker6.date();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRENCH (FRENCH)" + "'", str9, "FRENCH (FRENCH)");
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(dateAndTime12);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.setRegion("");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("france");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: france [at index 0]");
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
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.util.Locale locale1 = new java.util.Locale("KOR");
        org.junit.Assert.assertEquals(locale1.toString(), "kor");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinese");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("fra");
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
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList35);
        java.lang.String str38 = java.util.Locale.lookupTag(languageRangeList5, (java.util.Collection<java.lang.String>) strList37);
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale40);
        java.lang.String str42 = locale40.getLanguage();
        java.util.Set<java.lang.String> strSet43 = locale40.getUnicodeLocaleAttributes();
        java.lang.String str44 = java.util.Locale.lookupTag(languageRangeList5, (java.util.Collection<java.lang.String>) strSet43);
        java.lang.String str45 = java.util.Locale.lookupTag(languageRangeList3, (java.util.Collection<java.lang.String>) strSet43);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
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
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "fr");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Italy", strMap1);
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.parse("French", strMap33);
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
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList64);
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags(languageRangeList34, (java.util.Collection<java.lang.String>) strList66);
        java.lang.String str68 = java.util.Locale.lookupTag(languageRangeList31, (java.util.Collection<java.lang.String>) strList66);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList66, filteringMode69);
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
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode69.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList70);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.setLanguage("chn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setRegion("canada");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: canada [at index 0]");
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
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.util.Random random1 = new java.util.Random(10L);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random1.nextBytes(byteArray7);
        random1.setSeed((long) 31);
        java.util.stream.IntStream intStream13 = random1.ints((int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream16 = random1.ints((-1156638823), (-1156638823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3, -70, -8]");
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        java.util.stream.IntStream intStream9 = random1.ints();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles();
        java.util.Random random12 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        int int15 = random12.nextInt((int) '4');
        java.util.stream.IntStream intStream16 = random12.ints();
        java.util.Random random18 = new java.util.Random((long) (byte) 100);
        java.util.Random random20 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream21 = random20.ints();
        java.util.stream.LongStream longStream22 = random20.longs();
        java.util.Random random24 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        int int27 = random24.nextInt(10);
        java.util.Random random29 = new java.util.Random(10L);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random29.nextBytes(byteArray35);
        random24.nextBytes(byteArray35);
        random20.nextBytes(byteArray35);
        random18.nextBytes(byteArray35);
        random12.nextBytes(byteArray35);
        random1.nextBytes(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = random1.nextInt((-1157793070));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[55, -59, -62, 112, 34]");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setRegion("zh");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.util.Locale locale1 = new java.util.Locale("\u65e5\u672c\u8a9e");
        org.junit.Assert.assertEquals(locale1.toString(), "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        java.util.Locale locale17 = new java.util.Locale("French");
        java.lang.String str18 = locale6.getDisplayScript(locale17);
        java.lang.String str19 = locale6.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertEquals(locale17.toString(), "french");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "it_IT" + "'", str19, "it_IT");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getExtension('x');
        java.lang.String str4 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese" + "'", str1, "cinese");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.util.Random random1 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream5 = random1.ints(28, 431529176);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((double) (-1155869325), (double) (-5015647950085110473L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.lang.String str6 = locale3.getDisplayVariant();
        java.util.Locale locale8 = new java.util.Locale("CHN");
        java.lang.String str9 = locale3.getDisplayName(locale8);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale8.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "french (FRENCH)" + "'", str9, "french (FRENCH)");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("jpn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.removeUnicodeLocaleAttribute("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ????? (????) [at index 0]");
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
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder7 = builder4.setExtension('x', "Korean");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.setVariant("french (france)_CANADA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: french (france)_CANADA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder7 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder2.setScript("China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("chn");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chn");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Code code6 = faker1.code();
        java.lang.String str8 = faker1.letterify("fra_KOR_France");
        com.github.javafaker.DateAndTime dateAndTime9 = faker1.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra_KOR_France" + "'", str8, "fra_KOR_France");
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Address address7 = faker2.address();
        com.github.javafaker.Color color8 = faker2.color();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale2.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.lang.String str9 = locale8.getISO3Language();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("South Korea");
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        java.util.Random random8 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream9 = random8.ints();
        boolean boolean10 = locale5.equals((java.lang.Object) intStream9);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra-x-lvariant-kor" + "'", str2, "fra-x-lvariant-kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra-x-lvariant-kor" + "'", str3, "fra-x-lvariant-kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra-x-lvariant-kor" + "'", str4, "fra-x-lvariant-kor");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        com.github.javafaker.Book book14 = faker13.book();
        com.github.javafaker.Address address15 = faker13.address();
        com.github.javafaker.Internet internet16 = faker13.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.35703205834598994d) + "'", double12 == (-0.35703205834598994d));
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertNotNull(internet16);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        boolean boolean25 = locale1.hasExtensions();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.util.Random random1 = new java.util.Random(0L);
        random1.setSeed((long) 31);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        java.lang.Class<?> wildcardClass10 = charSet9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.LongStream longStream10 = random1.longs((long) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.PhoneNumber phoneNumber12 = faker11.phoneNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker11.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(phoneNumber12);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Lorem lorem2 = faker0.lorem();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Options options4 = faker0.options();
        java.lang.String str6 = faker0.numerify("inglese");
        com.github.javafaker.Code code7 = faker0.code();
        java.lang.String str9 = faker0.bothify("fra_KOR_France");
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "inglese" + "'", str6, "inglese");
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fra_KOR_France" + "'", str9, "fra_KOR_France");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random5 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream7 = random5.ints(1L);
        long long8 = random5.nextLong();
        int int10 = random5.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.DateAndTime dateAndTime12 = faker11.date();
        com.github.javafaker.Internet internet13 = faker11.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(internet13);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra" + "'", str4, "fra");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.setVariant("French");
        java.util.Locale.Builder builder8 = builder3.setExtension('x', "");
        java.util.Locale.Builder builder10 = builder3.removeUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder12 = builder3.setLanguageTag("fr-FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.stream.IntStream intStream4 = random1.ints((int) (short) 10, 28);
        double double5 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = random1.nextInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2981846735357514d + "'", double5 == 1.2981846735357514d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        int int15 = random6.nextInt();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1434703326) + "'", int15 == (-1434703326));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        java.lang.String str5 = faker1.numerify("it");
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Color color7 = faker1.color();
        java.lang.Class<?> wildcardClass8 = color7.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.setExtension('x', "Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("cinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: cinese (Taiwan) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.parse("France");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.parse("French", strMap49);
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
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList50, (java.util.Collection<java.lang.String>) strSet57);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList47, (java.util.Collection<java.lang.String>) strList93);
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList94);
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
        org.junit.Assert.assertNotNull(languageRangeList50);
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
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(strList95);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        com.github.javafaker.DateAndTime dateAndTime26 = faker25.date();
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
        org.junit.Assert.assertNotNull(dateAndTime26);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.util.Locale locale2 = new java.util.Locale("France", "FRENCH (FRENCH)");
        org.junit.Assert.assertEquals(locale2.toString(), "france_FRENCH (FRENCH)");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.util.Locale locale3 = new java.util.Locale("", "French (France)", "France");
        java.lang.String str4 = locale3.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: _FRENCH (FRANCE)_France could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "_FRENCH (FRANCE)_France");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRENCH (FRANCE) (France)" + "'", str4, "FRENCH (FRANCE) (France)");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("coreano", (double) (-2085682583702141179L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-2.08568258370214118E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french (french)", 0.8869349148715235d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (french)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
            java.util.Locale.Builder builder13 = builder10.removeUnicodeLocaleAttribute("fr-FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr-FR [at index 0]");
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
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        java.lang.String str18 = locale0.toLanguageTag();
        java.util.Random random20 = new java.util.Random((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale0, random20);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh" + "'", str18, "zh");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.setVariant("");
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "chn");
        java.util.Locale locale13 = builder12.build();
        java.lang.Object obj14 = locale13.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "kor");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "kor__#a-chn");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "kor__#a-chn");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "kor__#a-chn");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "kor__#a-chn");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.util.Locale locale2 = new java.util.Locale("\ud55c\uad6d\uc5b4", "french");
        java.util.Locale locale6 = new java.util.Locale("", "French (France)", "France");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for FRENCH");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "\ud55c\uad6d\uc5b4_FRENCH");
        org.junit.Assert.assertEquals(locale6.toString(), "_FRENCH (FRANCE)_France");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Random random6 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((long) (byte) 1);
        long long10 = random6.nextLong();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale4, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale0, random6);
        java.util.stream.DoubleStream doubleStream16 = random6.doubles();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Canada" + "'", str1, "Canada");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-5015647950085110473L) + "'", long10 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Business business10 = faker9.business();
        java.lang.String str12 = faker9.letterify("Chinese (China)");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese (China)" + "'", str12, "Chinese (China)");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Book book6 = faker0.book();
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Internet internet8 = faker0.internet();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(internet8);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getVariant();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str2, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.util.Locale locale1 = new java.util.Locale("french (FRENCH)");
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "french (french)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.util.Locale locale2 = new java.util.Locale("French", "French");
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french" + "'", str3, "french");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FRENCH" + "'", str5, "FRENCH");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str2 = locale0.getExtension('x');
        java.lang.String str3 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u672c" + "'", str3, "\u65e5\u672c");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("coreano (Corea del Sud)");
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayCountry(locale5);
        java.util.Locale locale11 = new java.util.Locale("fra-x-lvariant-kor", "fra", "kor");
        java.lang.String str12 = locale0.getDisplayName(locale11);
        java.util.Locale locale13 = locale11.stripExtensions();
        java.util.Locale locale16 = new java.util.Locale("eng", "zh-TW");
        java.lang.String str17 = locale16.toLanguageTag();
        java.lang.String str18 = locale11.getDisplayLanguage(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587" + "'", str2, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "France" + "'", str7, "France");
        org.junit.Assert.assertEquals(locale11.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "French (France)" + "'", str12, "French (France)");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertEquals(locale16.toString(), "eng_ZH-TW");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eng" + "'", str17, "eng");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fra-x-lvariant-kor" + "'", str18, "fra-x-lvariant-kor");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
            java.util.Locale.Builder builder11 = builder6.addUnicodeLocaleAttribute("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ko-KR [at index 0]");
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
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.util.Locale locale3 = new java.util.Locale("chinese_KOR", "Chinese", "cinese (Taiwan)");
        java.lang.String str4 = locale3.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for CHINESE");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_kor_CHINESE_cinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.util.Locale locale8 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.lang.String str15 = locale12.getScript();
        java.util.Locale.setDefault(category9, locale12);
        java.util.Locale locale17 = java.util.Locale.getDefault(category9);
        java.lang.String str18 = locale8.getDisplayScript(locale17);
        java.lang.String str19 = locale8.getDisplayName();
        boolean boolean20 = languageRange1.equals((java.lang.Object) str19);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals(locale8.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fra (HI!,kor)" + "'", str19, "fra (HI!,kor)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder7 = builder6.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale5 = new java.util.Locale("kor", "", "");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.lang.String str7 = locale5.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals(locale5.toString(), "kor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Korean (South Korea)" + "'", str6, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u97d3\u6587" + "'", str7, "\u97d3\u6587");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = faker1.resolve("\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale.Builder builder9 = builder4.setLanguageTag("Korean");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setExtension('4', "TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        random1.setSeed((long) (short) 0);
        float float4 = random1.nextFloat();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 7);
        java.util.stream.IntStream intStream8 = random1.ints((long) 431529176);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.73096776f + "'", float4 == 0.73096776f);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.util.Random random1 = new java.util.Random((long) 7);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Language();
        java.lang.String str7 = locale2.getDisplayName(locale5);
        java.lang.String str8 = locale5.toLanguageTag();
        java.lang.String str9 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet10 = locale5.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.util.Locale locale2 = new java.util.Locale("canada", "Korean");
        java.util.Locale locale3 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
        java.lang.String str5 = locale2.getDisplayLanguage(locale3);
        org.junit.Assert.assertEquals(locale2.toString(), "canada_KOREAN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "canada" + "'", str5, "canada");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 'u');
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 1, (double) 6, (double) 553627293);
        java.util.stream.LongStream longStream12 = random1.longs(0L);
        double double13 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7281011855672591d + "'", double13 == 0.7281011855672591d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        java.lang.String str15 = locale11.getScript();
        java.lang.String str16 = locale11.getDisplayCountry();
        java.lang.String str17 = locale11.getDisplayVariant();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        boolean boolean26 = random3.nextBoolean();
        java.util.stream.IntStream intStream30 = random3.ints((long) 28, (-485610818), (int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intStream30);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] { languageRange35 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray44 = new java.lang.String[] { "kor", "fra", "kor", "French", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList45, filteringMode47);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap50);
        java.util.Collection<java.lang.String> strCollection52 = null;
        java.lang.String str53 = java.util.Locale.lookupTag(languageRangeList51, strCollection52);
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
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.lang.String str9 = locale1.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale1.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        java.util.Locale locale31 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.lang.String str33 = java.util.Locale.lookupTag(languageRangeList28, (java.util.Collection<java.lang.String>) strSet32);
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.lang.String str35 = locale34.getISO3Language();
        java.lang.String str36 = locale34.getDisplayName();
        java.lang.String str37 = locale34.getDisplayScript();
        java.util.Random random39 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream41 = random39.ints(1L);
        long long42 = random39.nextLong();
        int int44 = random39.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(locale34, random39);
        java.lang.String str46 = locale34.getLanguage();
        java.util.Set<java.lang.String> strSet47 = locale34.getUnicodeLocaleKeys();
        java.lang.String str48 = java.util.Locale.lookupTag(languageRangeList28, (java.util.Collection<java.lang.String>) strSet47);
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
        org.junit.Assert.assertEquals(locale31.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "kor" + "'", str35, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u97d3\u6587\u5357\u97d3)" + "'", str36, "\u97d3\u6587\u5357\u97d3)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-5015647950085110473L) + "'", long42 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ko" + "'", str46, "ko");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream10 = random1.ints((int) (byte) 1, (int) 'x');
        java.util.stream.LongStream longStream12 = random1.longs((long) 100);
        java.util.stream.DoubleStream doubleStream14 = random1.doubles((long) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        int int5 = random1.nextInt((int) '#');
        double double6 = random1.nextDouble();
        java.util.stream.LongStream longStream8 = random1.longs((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = random1.nextInt((-1156638823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6659570968355509d + "'", double6 == 0.6659570968355509d);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.util.Locale locale3 = new java.util.Locale("\u97e9\u56fd", "CN", "zh_CN");
        org.junit.Assert.assertEquals(locale3.toString(), "\u97e9\u56fd_CN_zh_CN");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.util.Locale locale3 = new java.util.Locale("CA", "CHN", "fr-FR");
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ca_CHN_fr-FR");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("french (france) (CANADA)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (france) (canada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.util.Locale locale3 = new java.util.Locale("french (france) (CANADA)", "cina", "french (france)_CANADA");
        org.junit.Assert.assertEquals(locale3.toString(), "french (france) (canada)_CINA_french (france)_CANADA");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.util.Locale locale1 = new java.util.Locale("french (FRENCH)");
        java.util.Locale locale5 = new java.util.Locale("hi!", "french (FRENCH)", "hi!");
        boolean boolean6 = locale5.hasExtensions();
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale8 = locale5.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi!_FRENCH (FRENCH)_hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "french (french)");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_FRENCH (FRENCH)_hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!_FRENCH (FRENCH)_hi!");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Korean");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale4.getDisplayScript();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Random random10 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        int int13 = random10.nextInt(10);
        java.util.stream.DoubleStream doubleStream14 = random10.doubles();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale8, random10);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale4, random10);
        java.lang.String str18 = locale2.getDisplayLanguage(locale4);
        java.lang.String str19 = locale2.getDisplayCountry();
        java.lang.String str20 = locale0.getDisplayCountry(locale2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587" + "'", str3, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "kor" + "'", str5, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u97d3\u6587\u5357\u97d3)" + "'", str6, "\u97d3\u6587\u5357\u97d3)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str18, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        com.github.javafaker.Book book14 = faker13.book();
        com.github.javafaker.Name name15 = faker13.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u570b" + "'", str2, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.35703205834598994d) + "'", double12 == (-0.35703205834598994d));
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(name15);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.lang.String str6 = locale3.getCountry();
        java.lang.String str7 = locale3.getLanguage();
        java.lang.String str8 = locale3.getDisplayScript();
        java.util.Set<java.lang.Character> charSet9 = locale3.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        java.util.stream.IntStream intStream8 = random1.ints();
        int int10 = random1.nextInt(13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.44047195711667986d + "'", double7 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("France");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = new java.util.Locale("FRA-X-LVARIANT-KOR", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale0.getDisplayLanguage(locale6);
        java.lang.String str9 = locale6.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))" + "'", str7, "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream9 = random1.ints(13, 1891812663);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.IntStream intStream8 = random1.ints(100L);
        float float9 = random1.nextFloat();
        java.util.stream.LongStream longStream12 = random1.longs((-4972683369271453960L), (long) 0);
        float float13 = random1.nextFloat();
        java.util.stream.DoubleStream doubleStream17 = random1.doubles((long) 32, (double) 38, 100.0d);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Company company19 = faker18.company();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.72810113f + "'", float9 == 0.72810113f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.44047195f + "'", float13 == 0.44047195f);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(company19);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.util.Random random1 = new java.util.Random((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((-1L), 5840930912313687631L, (-5013995466868426345L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.PhoneNumber phoneNumber10 = faker9.phoneNumber();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.lang.String str8 = faker6.numerify("fra");
        com.github.javafaker.Code code9 = faker6.code();
        java.lang.String str11 = faker6.numerify("fr");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra" + "'", str8, "fra");
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        java.util.Locale.Builder builder24 = builder21.setExtension('a', "KR");
        java.util.Locale.Builder builder26 = builder21.removeUnicodeLocaleAttribute("TWN");
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
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder2.setLocale(locale5);
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale1.getDisplayCountry();
        java.util.Set<java.lang.String> strSet10 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str8, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u53f0\u7063" + "'", str9, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList11, strMap12);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.parse("Chinese");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList15, strMap16);
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] { languageRange19 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray28 = new java.lang.String[] { "kor", "fra", "kor", "French", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.Locale.FilteringMode filteringMode31 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList29, filteringMode31);
        java.lang.String str33 = java.util.Locale.lookupTag(languageRangeList17, (java.util.Collection<java.lang.String>) strList29);
        java.lang.String str34 = java.util.Locale.lookupTag(languageRangeList13, (java.util.Collection<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList29);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + filteringMode31 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode31.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ko_KR", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ko_kr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        boolean boolean13 = locale9.hasExtensions();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CHN", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        java.util.Random random1 = new java.util.Random((long) 7);
        double double2 = random1.nextGaussian();
        float float3 = random1.nextFloat();
        random1.setSeed((long) (-1));
        int int7 = random1.nextInt((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8452060657049847d + "'", double2 == 0.8452060657049847d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.3483097f + "'", float3 == 0.3483097f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 13 + "'", int7 == 13);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        com.github.javafaker.Code code9 = faker2.code();
        com.github.javafaker.Options options10 = faker2.options();
        com.github.javafaker.Code code11 = faker2.code();
        java.lang.String str13 = faker2.letterify("canada");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "canada" + "'", str13, "canada");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem7 = faker6.lorem();
        com.github.javafaker.Options options8 = faker6.options();
        java.lang.String str10 = faker6.letterify("French");
        com.github.javafaker.Name name11 = faker6.name();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French" + "'", str10, "French");
        org.junit.Assert.assertNotNull(name11);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder6 = builder1.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.util.Locale.Builder builder15 = builder7.setLocale(locale12);
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale16.toLanguageTag();
        java.lang.String str18 = locale12.getDisplayVariant(locale16);
        java.lang.String str19 = locale0.getDisplayName(locale12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ja" + "'", str17, "ja");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese (Taiwan)" + "'", str19, "Chinese (Taiwan)");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale28);
        java.lang.String str30 = locale28.getCountry();
        java.lang.String str31 = locale27.getDisplayVariant(locale28);
        java.lang.String str32 = locale28.getDisplayCountry();
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
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "CN" + "'", str30, "CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "kor" + "'", str31, "kor");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u56fd" + "'", str32, "\u4e2d\u56fd");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.util.Locale locale2 = new java.util.Locale("", "Francia");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "_FRANCIA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_FRANCIA" + "'", str3, "_FRANCIA");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Address address4 = faker1.address();
        com.github.javafaker.Name name5 = faker1.name();
        com.github.javafaker.Name name6 = faker1.name();
        com.github.javafaker.Number number7 = faker1.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints(1L);
        long long4 = random1.nextLong();
        int int6 = random1.nextInt((int) (byte) 1);
        java.util.stream.LongStream longStream7 = random1.longs();
        java.util.stream.LongStream longStream9 = random1.longs((long) (byte) 10);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-5015647950085110473L) + "'", long4 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream3 = random1.longs((long) 0);
        java.util.Random random5 = new java.util.Random(10L);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random5.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        java.util.stream.IntStream intStream17 = random1.ints((long) (short) 0, (-1), (int) (short) 0);
        double double18 = random1.nextDouble();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random1);
        boolean boolean20 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-46, 122, -3, -70, -8]");
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2578027905957804d + "'", double18 == 0.2578027905957804d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Locale locale4 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str2, "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale6);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u56fd" + "'", str7, "\u6cd5\u56fd");
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
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        java.util.Set<java.lang.String> strSet16 = locale10.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.Collection<java.util.Locale> localeCollection89 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale90 = java.util.Locale.lookup(languageRangeList2, localeCollection89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(localeList88);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(category0, locale11);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getISO3Language();
        java.util.Locale.Builder builder17 = builder13.setLocale(locale15);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale20 = new java.util.Locale("");
        java.lang.String str21 = locale20.getISO3Language();
        java.util.Locale.Builder builder22 = builder18.setLocale(locale20);
        java.lang.String str23 = locale15.getDisplayCountry(locale20);
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleKeys();
        java.lang.String str26 = locale24.getDisplayCountry();
        java.lang.String str27 = locale15.getDisplayName(locale24);
        java.lang.String str28 = locale24.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale24);
        java.util.Locale locale30 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chinese" + "'", str28, "Chinese");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        java.lang.String str5 = locale0.getISO3Country();
        java.lang.String str6 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CHN" + "'", str5, "CHN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CHN" + "'", str6, "CHN");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Locale.Builder builder8 = builder4.setLocale(locale6);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale.setDefault(category3, locale6);
        java.util.Locale locale11 = java.util.Locale.getDefault(category3);
        java.util.Locale locale12 = java.util.Locale.getDefault(category3);
        java.util.Locale.setDefault(locale12);
        java.lang.String str14 = locale12.getDisplayScript();
        java.lang.String str15 = locale0.getDisplayVariant(locale12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.util.Random random1 = new java.util.Random((long) 7);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        java.util.stream.IntStream intStream7 = random1.ints((long) '#', (int) (short) 1, (int) (byte) 10);
        int int9 = random1.nextInt(1761283695);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1569164236 + "'", int9 == 1569164236);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.util.Locale locale2 = new java.util.Locale("francese (Francia)", "cinese");
        org.junit.Assert.assertEquals(locale2.toString(), "francese (francia)_CINESE");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale15);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English (United States)", (double) 0.19497603f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united states)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.util.Locale locale2 = new java.util.Locale("FRA-X-LVARIANT-KOR", "");
        org.junit.Assert.assertEquals(locale2.toString(), "fra-x-lvariant-kor");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        java.lang.String str15 = locale0.getDisplayName();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale0);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese (China)" + "'", str15, "Chinese (China)");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("jpn", (double) 0.92756605f);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.util.Locale locale3 = new java.util.Locale("fr", "Chinese (China)", "tedesco");
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3, random4);
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CHINESE (CHINA)_tedesco");
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Code code2 = faker0.code();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        java.lang.String str5 = faker0.numerify("\uc911\uad6d\uc5b4");
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime7 = faker0.date();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str5, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        java.lang.String str22 = faker20.bothify("KR");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "KR" + "'", str22, "KR");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("South Korea", (double) 0.92756605f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=south korea");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("cinese");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder2.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder9 = builder2.clearExtensions();
        java.util.Locale locale10 = builder2.build();
        java.util.Locale.Builder builder12 = builder2.setLanguage("eng");
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = locale13.getDisplayName();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale15.getISO3Language();
        java.lang.String str17 = locale15.getDisplayName();
        java.lang.String str18 = locale15.getDisplayScript();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.util.Random random21 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        int int24 = random21.nextInt(10);
        java.util.stream.DoubleStream doubleStream25 = random21.doubles();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale19, random21);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale15, random21);
        java.lang.String str29 = locale13.getDisplayLanguage(locale15);
        java.lang.String str30 = locale13.getDisplayCountry();
        java.lang.String str31 = locale13.getISO3Language();
        java.lang.String str32 = locale13.getDisplayScript();
        java.lang.String str33 = locale13.toLanguageTag();
        java.util.Locale.Builder builder34 = builder2.setLocale(locale13);
        boolean boolean35 = languageRange1.equals((java.lang.Object) locale13);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese" + "'", str14, "Chinese");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "kor" + "'", str16, "kor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Korean (South Korea)" + "'", str17, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str29, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zho" + "'", str31, "zho");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh" + "'", str33, "zh");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Random random3 = new java.util.Random(10L);
        float float4 = random3.nextFloat();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random3);
        long long6 = random3.nextLong();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.DateAndTime dateAndTime8 = faker7.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.73043025f + "'", float4 == 0.73043025f);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8220501950349663546L + "'", long6 == 8220501950349663546L);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("German", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fra");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("fra");
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, strMap21);
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale locale25 = new java.util.Locale("");
        java.lang.String str26 = locale25.getISO3Language();
        java.util.Locale.Builder builder27 = builder23.setLocale(locale25);
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getISO3Language();
        java.util.Locale locale32 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder33 = new java.util.Locale.Builder();
        java.util.Locale locale35 = new java.util.Locale("");
        java.lang.String str36 = locale35.getISO3Language();
        java.util.Locale.Builder builder37 = builder33.setLocale(locale35);
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getISO3Language();
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale25, locale29, locale32, locale35, locale39 };
        java.util.ArrayList<java.util.Locale> localeList42 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList42, localeArray41);
        java.util.Locale locale44 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.util.Locale>) localeList42);
        java.util.Locale.FilteringMode filteringMode45 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList42, filteringMode45);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet12, filteringMode45);
        java.lang.String str48 = java.util.Locale.lookupTag(languageRangeList5, (java.util.Collection<java.lang.String>) strList47);
        java.util.Locale.LanguageRange languageRange50 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] { languageRange50 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.lang.String[] strArray59 = new java.lang.String[] { "kor", "fra", "kor", "French", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList60, filteringMode62);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strList47, filteringMode62);
        java.lang.Class<?> wildcardClass65 = languageRangeList3.getClass();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale32.toString(), "hi!");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(localeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(locale44);
        org.junit.Assert.assertTrue("'" + filteringMode45 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode45.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode62.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        java.util.Locale locale12 = builder6.build();
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        double double7 = random3.nextDouble();
        boolean boolean8 = random3.nextBoolean();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French (France)" + "'", str2, "French (France)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7304302967434272d + "'", double7 == 0.7304302967434272d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Number number2 = faker0.number();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(number2);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        java.lang.String str5 = locale0.getISO3Country();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0);
        java.lang.String str8 = faker6.bothify("it_IT");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CHN" + "'", str5, "CHN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it_IT" + "'", str8, "it_IT");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Color color6 = faker1.color();
        com.github.javafaker.Color color7 = faker1.color();
        com.github.javafaker.Finance finance8 = faker1.finance();
        com.github.javafaker.Name name9 = faker1.name();
        com.github.javafaker.Lorem lorem10 = faker1.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Random random5 = new java.util.Random((long) (byte) 100);
        double double6 = random5.nextDouble();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7220096548596434d + "'", double6 == 0.7220096548596434d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.util.Random random1 = new java.util.Random((long) 6);
        java.util.stream.LongStream longStream2 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale7.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_kor_CANADA");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_ZH-CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinese_kor (CANADA)" + "'", str6, "chinese_kor (CANADA)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str9, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CHN" + "'", str12, "CHN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Lorem lorem2 = faker0.lorem();
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        java.lang.String str5 = faker0.numerify("zh_CN");
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.Options options7 = faker0.options();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_CN" + "'", str5, "zh_CN");
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        com.github.javafaker.Business business29 = faker26.business();
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
        org.junit.Assert.assertNotNull(business29);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.util.Random random1 = new java.util.Random(10L);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random1.nextBytes(byteArray7);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet11 = faker10.internet();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker10.phoneNumber();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3, -70, -8]");
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(phoneNumber12);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        boolean boolean10 = random1.nextBoolean();
        int int12 = random1.nextInt(32);
        java.util.stream.LongStream longStream15 = random1.longs((long) (-1193959466), (long) (-1156638823));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book7 = faker6.book();
        java.lang.Class<?> wildcardClass8 = book7.getClass();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        java.util.Random random1 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt((int) '4');
        random1.setSeed((long) 17);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet8 = faker7.internet();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertNotNull(internet8);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.util.Locale locale3 = new java.util.Locale("Korean", "zh", "\u4e2d\u6587");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for korean");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        java.util.stream.LongStream longStream8 = random1.longs((-5123059410709186348L), (long) 32);
        random1.setSeed(10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale.Builder builder10 = builder6.setRegion("");
        java.util.Locale.Builder builder11 = builder6.clear();
        java.util.Locale locale12 = builder6.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french", 0.0d);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder13 = builder10.addUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder16 = builder10.setExtension('u', "chn");
        boolean boolean17 = languageRange2.equals((java.lang.Object) builder16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "french" + "'", str4, "french");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.IntStream intStream8 = random1.ints(100L);
        float float9 = random1.nextFloat();
        java.util.stream.LongStream longStream12 = random1.longs((-4972683369271453960L), (long) 0);
        java.util.stream.LongStream longStream15 = random1.longs((long) 17, (long) '4');
        java.util.stream.LongStream longStream16 = random1.longs();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.72810113f + "'", float9 == 0.72810113f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.util.Locale locale2 = new java.util.Locale("CN", "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd))");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.lang.String str6 = locale2.toLanguageTag();
        java.lang.String str7 = locale2.getVariant();
        java.lang.Object obj8 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.DateAndTime dateAndTime7 = faker6.date();
        com.github.javafaker.Color color8 = faker6.color();
        com.github.javafaker.Options options9 = faker6.options();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.IntStream intStream8 = random1.ints(100L);
        float float9 = random1.nextFloat();
        java.util.stream.LongStream longStream12 = random1.longs((-4972683369271453960L), (long) 0);
        float float13 = random1.nextFloat();
        java.util.stream.DoubleStream doubleStream17 = random1.doubles((long) 32, (double) 38, 100.0d);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream21 = random1.longs((long) 17, (long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.72810113f + "'", float9 == 0.72810113f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.44047195f + "'", float13 == 0.44047195f);
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder8 = builder4.addUnicodeLocaleAttribute("Italia");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder4.addUnicodeLocaleAttribute("_FRANCIA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: _FRANCIA [at index 0]");
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
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.util.Locale locale3 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale7 = new java.util.Locale("fra", "fra");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Random random10 = new java.util.Random((long) 7);
        double double11 = random10.nextGaussian();
        float float12 = random10.nextFloat();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale7, random10);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra_FRA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals(locale7.toString(), "fra_FRA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra" + "'", str8, "fra");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8452060657049847d + "'", double11 == 0.8452060657049847d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.3483097f + "'", float12 == 0.3483097f);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united kingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.util.Locale locale3 = new java.util.Locale("Francia", "allemand", "fra_KOR_France");
        org.junit.Assert.assertEquals(locale3.toString(), "francia_ALLEMAND_fra_KOR_France");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.util.Random random1 = new java.util.Random((long) '4');
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        java.util.stream.IntStream intStream11 = random1.ints((long) (byte) 100);
        double double12 = random1.nextDouble();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2413718236526089d + "'", double12 == 0.2413718236526089d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (-1192805220));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.19280522E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        java.util.stream.LongStream longStream28 = random1.longs((long) 1913984760);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[34, 42, 124, -86, 50]");
        org.junit.Assert.assertNotNull(longStream28);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.util.Locale locale2 = new java.util.Locale("hi!", "zh-CN");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_ZH-CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZH-CN" + "'", str3, "ZH-CN");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Lorem lorem2 = faker0.lorem();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Name name4 = faker0.name();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(name4);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Color color6 = faker1.color();
        com.github.javafaker.Book book7 = faker1.book();
        com.github.javafaker.Color color8 = faker1.color();
        com.github.javafaker.Name name9 = faker1.name();
        java.lang.String str11 = faker1.numerify("Canada");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Canada" + "'", str11, "Canada");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream3 = random1.longs((long) 0);
        java.util.Random random5 = new java.util.Random(10L);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random5.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        java.util.stream.IntStream intStream17 = random1.ints((long) (short) 0, (-1), (int) (short) 0);
        double double18 = random1.nextDouble();
        float float19 = random1.nextFloat();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-46, 122, -3, -70, -8]");
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2578027905957804d + "'", double18 == 0.2578027905957804d);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.059201956f + "'", float19 == 0.059201956f);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.LongStream longStream9 = random1.longs((long) '#', 100L);
        int int11 = random1.nextInt(10);
        long long12 = random1.nextLong();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 8125273516308965922L + "'", long12 == 8125273516308965922L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        java.lang.String str18 = locale2.getISO3Country();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "TWN" + "'", str18, "TWN");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.DoubleStream doubleStream3 = random1.doubles(0L);
        long long4 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) 1359947704, (double) (-1789290896), (double) 'u');
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-5013995466868426345L) + "'", long4 == (-5013995466868426345L));
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        java.util.Locale locale3 = new java.util.Locale("fra", "hi!", "kor");
        java.lang.String str4 = locale3.toLanguageTag();
        boolean boolean5 = locale3.hasExtensions();
        java.lang.String str6 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "fra_HI!_kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra-x-lvariant-kor" + "'", str4, "fra-x-lvariant-kor");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.util.Locale locale3 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale8);
        java.lang.String str10 = locale8.getDisplayCountry();
        java.lang.String str11 = locale8.getDisplayVariant();
        java.lang.String str12 = locale8.getISO3Country();
        java.lang.String str13 = locale3.getDisplayCountry(locale8);
        java.lang.String str14 = locale8.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CHN" + "'", str12, "CHN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHINESE" + "'", str13, "CHINESE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.util.Random random1 = new java.util.Random(0L);
        random1.setSeed((long) 31);
        java.util.stream.LongStream longStream4 = random1.longs();
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.IntStream intStream8 = random1.ints(100L);
        float float9 = random1.nextFloat();
        java.util.stream.LongStream longStream12 = random1.longs((-4972683369271453960L), (long) 0);
        double double13 = random1.nextDouble();
        random1.setSeed(0L);
        random1.setSeed((-2085682583702141179L));
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.72810113f + "'", float9 == 0.72810113f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.44047195711667986d + "'", double13 == 0.44047195711667986d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Business business8 = faker2.business();
        com.github.javafaker.Color color9 = faker2.color();
        java.lang.String str11 = faker2.bothify("Canada");
        com.github.javafaker.Name name12 = faker2.name();
        com.github.javafaker.Book book13 = faker2.book();
        com.github.javafaker.Color color14 = faker2.color();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Canada" + "'", str11, "Canada");
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        double double4 = random1.nextDouble();
        int int6 = random1.nextInt(1891812663);
        double double7 = random1.nextDouble();
        java.util.stream.LongStream longStream9 = random1.longs((long) 553627293);
        java.util.stream.IntStream intStream11 = random1.ints((long) 17);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7281011855672591d + "'", double4 == 0.7281011855672591d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1430131985 + "'", int6 == 1430131985);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2413718236526089d + "'", double7 == 0.2413718236526089d);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinese");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("Italy", strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("Canada");
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor");
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("fra");
        java.lang.String str18 = languageRange17.getRange();
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("fra");
        java.lang.String str21 = languageRange20.getRange();
        java.lang.String str22 = languageRange20.getRange();
        java.util.Locale.LanguageRange languageRange24 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange languageRange27 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        java.lang.String str28 = languageRange27.getRange();
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor");
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        double double34 = languageRange33.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] { languageRange8, languageRange11, languageRange13, languageRange15, languageRange17, languageRange20, languageRange24, languageRange27, languageRange30, languageRange33 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strMap41);
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
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.util.Locale>) localeList67, filteringMode70);
        java.util.Locale locale72 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.Locale locale73 = java.util.Locale.lookup(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.parse("Chinese");
        java.util.Locale locale78 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet79 = locale78.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet80 = locale78.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags(languageRangeList75, (java.util.Collection<java.lang.String>) strSet80, filteringMode81);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList71, filteringMode81);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fra" + "'", str18, "fra");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fra" + "'", str21, "fra");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fra" + "'", str22, "fra");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "french" + "'", str28, "french");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
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
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode70.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNull(locale72);
        org.junit.Assert.assertNull(locale73);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertEquals(locale78.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode81.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(localeList83);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream3 = random1.ints();
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        boolean boolean4 = locale3.hasExtensions();
        java.util.Locale locale6 = new java.util.Locale("Chinese");
        java.lang.String str7 = locale3.getDisplayName(locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.util.Set<java.lang.Character> charSet9 = locale6.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals(locale6.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese (Taiwan)" + "'", str7, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Korean" + "'", str8, "Korean");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Language();
        java.lang.String str7 = locale2.getDisplayName(locale5);
        java.lang.String str8 = locale2.getVariant();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale2);
        java.lang.String str10 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "kor" + "'", str6, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uc911\uad6d\uc5b4\ub300\ub9cc)" + "'", str7, "\uc911\uad6d\uc5b4\ub300\ub9cc)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cinese (Taiwan)" + "'", str10, "cinese (Taiwan)");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.IntStream intStream8 = random1.ints(100L);
        float float9 = random1.nextFloat();
        java.util.stream.LongStream longStream12 = random1.longs((-4972683369271453960L), (long) 0);
        float float13 = random1.nextFloat();
        java.util.stream.DoubleStream doubleStream15 = random1.doubles((long) 3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.72810113f + "'", float9 == 0.72810113f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.44047195f + "'", float13 == 0.44047195f);
        org.junit.Assert.assertNotNull(doubleStream15);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder8 = builder6.setRegion("CA");
        java.util.Locale.Builder builder11 = builder6.setExtension('u', "coreano");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder8.setVariant("English");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.lang.String str6 = locale3.getDisplayVariant();
        java.util.Locale locale8 = new java.util.Locale("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        java.lang.String str9 = locale3.getDisplayVariant(locale8);
        java.lang.String str10 = locale3.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale8.toString(), "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "french_FRENCH" + "'", str10, "french_FRENCH");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.util.Random random1 = new java.util.Random(8125273516308965922L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = random1.ints((long) (-1157793070));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        long long5 = random1.nextLong();
        random1.setSeed((long) 'a');
        long long8 = random1.nextLong();
        long long9 = random1.nextLong();
        java.util.stream.IntStream intStream12 = random1.ints((-1167796541), 32);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-5015647950085110473L) + "'", long5 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5123059410709186348L) + "'", long8 == (-5123059410709186348L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-5785953002346952466L) + "'", long9 == (-5785953002346952466L));
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.IntStream intStream8 = random1.ints(100L);
        float float9 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random1.doubles((long) (short) 100, (double) (-1155484576), (double) (-4967725919621401576L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.72810113f + "'", float9 == 0.72810113f);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.util.Locale locale3 = new java.util.Locale("de_DE", "French", "it_IT");
        java.lang.String str4 = locale3.getScript();
        java.util.Random random6 = new java.util.Random(10L);
        long long7 = random6.nextLong();
        float float8 = random6.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale3, random6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: de_de_FRENCH_it_IT could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "de_de_FRENCH_it_IT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.25780278f + "'", float8 == 0.25780278f);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        java.lang.String str34 = locale17.getCountry();
        java.util.Locale locale36 = new java.util.Locale("");
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.util.Locale locale39 = locale37.stripExtensions();
        java.lang.String str40 = locale17.getDisplayCountry(locale39);
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale locale44 = builder43.build();
        java.util.Locale.Builder builder45 = builder43.clearExtensions();
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet47 = locale46.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder48 = builder43.setLocale(locale46);
        java.lang.String str49 = locale46.getCountry();
        java.lang.String str50 = locale46.getLanguage();
        java.util.Locale locale51 = java.util.Locale.FRENCH;
        java.lang.String str52 = locale51.toLanguageTag();
        java.util.Locale locale55 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale55);
        java.lang.String str57 = locale55.getDisplayName();
        java.lang.String str58 = locale51.getDisplayScript(locale55);
        java.lang.String str59 = locale51.getLanguage();
        java.lang.String str60 = locale46.getDisplayCountry(locale51);
        java.lang.String str61 = locale41.getDisplayCountry(locale51);
        java.lang.String str62 = locale17.getDisplayLanguage(locale41);
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
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "FRA" + "'", str40, "FRA");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh" + "'", str50, "zh");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "fr" + "'", str52, "fr");
        org.junit.Assert.assertEquals(locale55.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "french (FRENCH)" + "'", str57, "french (FRENCH)");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "fr" + "'", str59, "fr");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "french" + "'", str62, "french");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        java.util.Locale.Builder builder23 = builder19.addUnicodeLocaleAttribute("kor");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder19.setUnicodeLocaleKeyword("\uc911\uad6d", "chinese_kor_CANADA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?????? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
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
        java.lang.String str14 = locale11.getISO3Country();
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
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.util.Locale locale2 = new java.util.Locale("cinese (Cina)", "\u65e5\u672c\u8a9e");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u65e5\u672c\u8a9e");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (-1155869325), (double) 1066038166);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        double double4 = random1.nextDouble();
        int int6 = random1.nextInt(1891812663);
        double double7 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random1.longs((-5785953002346952466L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7281011855672591d + "'", double4 == 0.7281011855672591d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1430131985 + "'", int6 == 1430131985);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2413718236526089d + "'", double7 == 0.2413718236526089d);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra (HI!,kor)", (double) 1708368258);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.708368258E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Address address4 = faker2.address();
        com.github.javafaker.Lorem lorem5 = faker2.lorem();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra-France", (double) 0.44047195f);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.util.Locale locale3 = new java.util.Locale("chinese_KOR", "und", "ENGLISH");
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_kor_UND_ENGLISH");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        int int21 = random1.nextInt();
        java.util.stream.IntStream intStream23 = random1.ints((long) (byte) 1);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[95, 64, 8, 57, 59]");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1708368258 + "'", int21 == 1708368258);
        org.junit.Assert.assertNotNull(intStream23);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        int int5 = random1.nextInt((int) '#');
        double double6 = random1.nextGaussian();
        java.util.Random random8 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        int int11 = random8.nextInt((int) '4');
        java.util.stream.IntStream intStream12 = random8.ints();
        java.util.Random random14 = new java.util.Random((long) (byte) 100);
        java.util.Random random16 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream17 = random16.ints();
        java.util.stream.LongStream longStream18 = random16.longs();
        java.util.Random random20 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        int int23 = random20.nextInt(10);
        java.util.Random random25 = new java.util.Random(10L);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random25.nextBytes(byteArray31);
        random20.nextBytes(byteArray31);
        random16.nextBytes(byteArray31);
        random14.nextBytes(byteArray31);
        random8.nextBytes(byteArray31);
        random1.nextBytes(byteArray31);
        java.util.stream.LongStream longStream38 = random1.longs();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3268766592932178d + "'", double6 == 0.3268766592932178d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[112, -106, 89, -107, 79]");
        org.junit.Assert.assertNotNull(longStream38);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale5);
        java.util.Locale locale7 = locale5.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale7.getDisplayCountry(locale9);
        java.lang.String str11 = locale0.getDisplayLanguage(locale7);
        java.util.Locale locale14 = new java.util.Locale("fra", "fra");
        java.lang.String str15 = locale7.getDisplayVariant(locale14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French" + "'", str11, "French");
        org.junit.Assert.assertEquals(locale14.toString(), "fra_FRA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        java.lang.String str13 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale8.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese (China)" + "'", str12, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setExtension('u', "");
        java.util.Locale locale12 = new java.util.Locale("Chinese (China)", "canada (FRENCH (FRENCH))");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.setLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: chinese (china) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale12.toString(), "chinese (china)_CANADA (FRENCH (FRENCH))");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getISO3Language();
        java.lang.String str5 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese (Taiwan)" + "'", str3, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-TW" + "'", str5, "zh-TW");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        int int5 = random1.nextInt((int) '#');
        double double6 = random1.nextGaussian();
        random1.setSeed((long) 553627293);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random1.ints((long) 1761283695, 393447903, (-1167796541));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3268766592932178d + "'", double6 == 0.3268766592932178d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        java.lang.String str18 = locale6.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "France" + "'", str7, "France");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "France" + "'", str18, "France");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Business business8 = faker2.business();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker2.phoneNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.util.Locale locale1 = new java.util.Locale("FRENCH (FRENCH)");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        boolean boolean4 = locale1.equals((java.lang.Object) locale3);
        org.junit.Assert.assertEquals(locale1.toString(), "french (french)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale1.getDisplayCountry(locale4);
        java.lang.String str8 = locale1.toLanguageTag();
        java.util.Locale locale11 = new java.util.Locale("chinese_KOR", "ENGLISH");
        java.lang.String str12 = locale1.getDisplayCountry(locale11);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
        org.junit.Assert.assertEquals(locale11.toString(), "chinese_kor_ENGLISH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setScript("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ????? (????) [at index 0]");
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
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap40);
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale locale44 = new java.util.Locale("");
        java.lang.String str45 = locale44.getISO3Language();
        java.util.Locale.Builder builder46 = builder42.setLocale(locale44);
        java.lang.String str47 = locale44.getScript();
        java.util.Locale.Builder builder48 = new java.util.Locale.Builder();
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getISO3Language();
        java.util.Locale.Builder builder52 = builder48.setLocale(locale50);
        java.lang.String str53 = locale50.getISO3Country();
        java.lang.String str54 = locale44.getDisplayLanguage(locale50);
        java.util.Locale locale57 = new java.util.Locale("fra", "fra");
        java.util.Locale locale60 = new java.util.Locale("French (France)", "Canada");
        java.lang.String str61 = locale57.getDisplayScript(locale60);
        java.lang.String str62 = locale50.getDisplayCountry(locale57);
        java.util.Set<java.lang.String> strSet63 = locale57.getUnicodeLocaleKeys();
        java.lang.String str64 = java.util.Locale.lookupTag(languageRangeList41, (java.util.Collection<java.lang.String>) strSet63);
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
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale57.toString(), "fra_FRA");
        org.junit.Assert.assertEquals(locale60.toString(), "french (france)_CANADA");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Color color1 = faker0.color();
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getLanguage();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale10);
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder15 = builder12.setLanguage("Canada");
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale16.getISO3Language();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.lang.String str19 = locale16.getDisplayScript();
        java.util.Locale.Builder builder20 = builder15.setLocale(locale16);
        java.lang.String str21 = locale16.getDisplayCountry();
        java.lang.String str22 = locale4.getDisplayLanguage(locale16);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "kor" + "'", str17, "kor");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "South Korea" + "'", str21, "South Korea");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("coreano");
        java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("TW", "french");
        java.util.Locale.Builder builder13 = builder7.setExtension('a', "");
        java.util.Locale.Builder builder15 = builder7.setVariant("francese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
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
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Finance finance5 = faker0.finance();
        java.lang.String str7 = faker0.numerify("Korean (South Korea)");
        java.lang.String str9 = faker0.numerify("China");
        com.github.javafaker.Lorem lorem10 = faker0.lorem();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean (South Korea)" + "'", str7, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker2.resolve("Canada");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        java.util.stream.IntStream intStream30 = random1.ints((long) 38);
        java.util.stream.DoubleStream doubleStream33 = random1.doubles((double) 0.9648155f, (double) (byte) 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-42, -97, -43, -72, -76]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertNotNull(doubleStream33);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.util.Locale locale1 = new java.util.Locale("ko");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("South Korea");
        java.lang.String str5 = locale1.getDisplayCountry(locale4);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        double double4 = random1.nextDouble();
        int int6 = random1.nextInt(1891812663);
        int int7 = random1.nextInt();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7281011855672591d + "'", double4 == 0.7281011855672591d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1430131985 + "'", int6 == 1430131985);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1036684082 + "'", int7 == 1036684082);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Locale locale4 = locale2.stripExtensions();
        java.lang.String str5 = locale2.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de_DE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=de_de");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.util.Locale locale3 = new java.util.Locale("canada", "South Korea", "English");
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale4.toLanguageTag();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale10);
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleKeys();
        java.lang.String str14 = locale4.getDisplayName(locale10);
        java.lang.String str15 = locale3.getDisplayScript(locale10);
        java.util.Random random17 = new java.util.Random((long) (short) 10);
        int int18 = random17.nextInt();
        int int19 = random17.nextInt();
        java.util.stream.DoubleStream doubleStream20 = random17.doubles();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale3, random17);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: canada_SOUTH KOREA_English could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "canada_SOUTH KOREA_English");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ko-KR" + "'", str6, "ko-KR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strSet13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str14, "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1157793070) + "'", int18 == (-1157793070));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1913984760 + "'", int19 == 1913984760);
        org.junit.Assert.assertNotNull(doubleStream20);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "france" + "'", str3, "france");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.IntStream intStream5 = random1.ints();
        random1.setSeed((-1L));
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr_CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_ca");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        java.util.Locale.Builder builder23 = builder19.addUnicodeLocaleAttribute("kor");
        java.util.Locale.Builder builder24 = builder19.clearExtensions();
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
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.util.Locale locale2 = new java.util.Locale("fr-FR", "JP");
        java.lang.String str3 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "fr-fr_JP");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Code code2 = faker0.code();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.Internet internet4 = faker0.internet();
        java.lang.Class<?> wildcardClass5 = faker0.getClass();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FRA-X-LVARIANT-KOR_HI!", (double) 216154118);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.16154118E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Code code6 = faker1.code();
        java.lang.String str8 = faker1.letterify("fra_KOR_France");
        com.github.javafaker.Options options9 = faker1.options();
        com.github.javafaker.Code code10 = faker1.code();
        com.github.javafaker.Internet internet11 = faker1.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra_KOR_France" + "'", str8, "fra_KOR_France");
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(internet11);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Business business8 = faker2.business();
        com.github.javafaker.Color color9 = faker2.color();
        java.lang.String str11 = faker2.bothify("Canada");
        java.lang.String str13 = faker2.bothify("French (France)");
        com.github.javafaker.Address address14 = faker2.address();
        com.github.javafaker.Lorem lorem15 = faker2.lorem();
        com.github.javafaker.Number number16 = faker2.number();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Canada" + "'", str11, "Canada");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "French (France)" + "'", str13, "French (France)");
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertNotNull(number16);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        com.github.javafaker.Book book14 = faker13.book();
        com.github.javafaker.Code code15 = faker13.code();
        com.github.javafaker.Code code16 = faker13.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.35703205834598994d) + "'", double12 == (-0.35703205834598994d));
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(code16);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.lang.String str10 = locale8.getCountry();
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale8.getDisplayName(locale11);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        java.util.Locale.Builder builder6 = builder2.setLanguage("Korean");
        java.util.Locale.Builder builder8 = builder6.setLanguage("it");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("FRENCH (FRANCE) (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: FRENCH (FRANCE) (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        java.util.Set<java.lang.String> strSet13 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.util.Random random1 = new java.util.Random((long) '#');
        long long2 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles(8220501950349663546L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5013995466868426345L) + "'", long2 == (-5013995466868426345L));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.util.Random random1 = new java.util.Random((long) 216154118);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("it_it");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=it_it");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("French");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Locale.Builder builder8 = builder4.setLocale(locale6);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getISO3Language();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.lang.String str14 = locale6.getDisplayCountry(locale11);
        java.util.Locale.setDefault(category3, locale11);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale locale17 = builder16.build();
        java.util.Locale.Builder builder18 = builder16.clearExtensions();
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder21 = builder16.setLocale(locale19);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getLanguage();
        java.util.Locale.setDefault(category3, locale19);
        java.lang.String str25 = locale19.getDisplayLanguage();
        java.lang.String str26 = locale2.getDisplayLanguage(locale19);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "french");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh" + "'", str23, "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinese" + "'", str25, "Chinese");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "french" + "'", str26, "french");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (short) 0);
        java.util.stream.DoubleStream doubleStream11 = random1.doubles(100.0d, (double) 1708368258);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = random1.ints(0L, (int) ' ', 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.util.Locale locale3 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        java.lang.String str6 = faker3.bothify("\u97e9\u56fd");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u97e9\u56fd" + "'", str6, "\u97e9\u56fd");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        int int5 = random1.nextInt((int) '#');
        double double6 = random1.nextDouble();
        java.util.stream.LongStream longStream8 = random1.longs((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6659570968355509d + "'", double6 == 0.6659570968355509d);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.util.Random random1 = new java.util.Random((long) 0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        double double3 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8025330637390305d + "'", double3 == 0.8025330637390305d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream2 = random1.longs();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        java.lang.String str5 = faker3.bothify("cinese (Taiwan)");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (Taiwan)" + "'", str5, "cinese (Taiwan)");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CAN" + "'", str4, "CAN");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.util.Locale locale2 = new java.util.Locale("it", "zh-TW");
        java.lang.String str3 = locale2.getScript();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale7.getDisplayLanguage(locale9);
        java.lang.String str11 = locale4.getDisplayName(locale9);
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getISO3Language();
        java.lang.String str14 = locale4.getDisplayCountry(locale12);
        java.lang.String str15 = locale2.getDisplayScript(locale4);
        org.junit.Assert.assertEquals(locale2.toString(), "it_ZH-TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "France" + "'", str5, "France");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French (France)" + "'", str11, "French (France)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "France" + "'", str14, "France");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        java.lang.String str13 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ko" + "'", str12, "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko_KR" + "'", str13, "ko_KR");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        int int5 = random1.nextInt((int) '#');
        double double6 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (-1167796541));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6659570968355509d + "'", double6 == 0.6659570968355509d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        random3.setSeed((long) 'x');
        java.util.stream.IntStream intStream9 = random3.ints();
        float float10 = random3.nextFloat();
        java.util.Random random12 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        int int15 = random12.nextInt((int) '4');
        java.util.stream.IntStream intStream16 = random12.ints();
        java.util.Random random18 = new java.util.Random((long) (byte) 100);
        java.util.Random random20 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream21 = random20.ints();
        java.util.stream.LongStream longStream22 = random20.longs();
        java.util.Random random24 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        int int27 = random24.nextInt(10);
        java.util.Random random29 = new java.util.Random(10L);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random29.nextBytes(byteArray35);
        random24.nextBytes(byteArray35);
        random20.nextBytes(byteArray35);
        random18.nextBytes(byteArray35);
        random12.nextBytes(byteArray35);
        java.util.Locale locale41 = java.util.Locale.GERMANY;
        java.util.Random random43 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        float float45 = random43.nextFloat();
        java.util.stream.IntStream intStream49 = random43.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream51 = random43.ints((long) 'x');
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(locale41, random43);
        boolean boolean53 = random43.nextBoolean();
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale55 = locale54.stripExtensions();
        java.util.Random random57 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        java.util.stream.DoubleStream doubleStream60 = random57.doubles((long) (byte) 1);
        long long61 = random57.nextLong();
        com.github.javafaker.Faker faker62 = new com.github.javafaker.Faker(locale55, random57);
        com.github.javafaker.Faker faker63 = new com.github.javafaker.Faker(random57);
        java.util.stream.LongStream longStream65 = random57.longs(0L);
        java.util.Random random67 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream70 = random67.doubles((double) 0.24137181f, (double) (short) 1);
        long long71 = random67.nextLong();
        java.util.Random random73 = new java.util.Random(10L);
        java.util.stream.LongStream longStream75 = random73.longs((long) 0);
        java.util.Random random77 = new java.util.Random(10L);
        byte[] byteArray83 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random77.nextBytes(byteArray83);
        random73.nextBytes(byteArray83);
        random67.nextBytes(byteArray83);
        random57.nextBytes(byteArray83);
        random43.nextBytes(byteArray83);
        random12.nextBytes(byteArray83);
        random3.nextBytes(byteArray83);
        int int92 = random3.nextInt(15);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French (France)" + "'", str2, "French (France)");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.72308457f + "'", float10 == 0.72308457f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[85, 109, -3, -78, -25]");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.72810113f + "'", float45 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream49);
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-5015647950085110473L) + "'", long61 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(longStream65);
        org.junit.Assert.assertNotNull(doubleStream70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-4972683369271453960L) + "'", long71 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream75);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[53, 80, -101, -127, -57]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 14 + "'", int92 == 14);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.util.Random random1 = new java.util.Random((long) 'a');
        int int3 = random1.nextInt((int) (byte) 100);
        float float4 = random1.nextFloat();
        double double5 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 38 + "'", int3 == 38);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.92756605f + "'", float4 == 0.92756605f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6863428549843967d + "'", double5 == 0.6863428549843967d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Random random2 = new java.util.Random();
        random2.setSeed((long) 10);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.DateAndTime dateAndTime6 = faker5.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "France" + "'", str1, "France");
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHN" + "'", str2, "CHN");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
            java.util.Locale.Builder builder23 = builder19.setLanguageTag("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: zh_CN [at index 0]");
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
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.toLanguageTag();
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr-FR" + "'", str4, "fr-FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FR" + "'", str6, "FR");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        java.lang.String str27 = locale25.toLanguageTag();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "korean" + "'", str27, "korean");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        java.lang.String str15 = locale0.getDisplayName();
        java.lang.String str16 = locale0.getISO3Language();
        boolean boolean18 = locale0.equals((java.lang.Object) "en-CA");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese (China)" + "'", str15, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        java.util.stream.DoubleStream doubleStream18 = random4.doubles();
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
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.IntStream intStream5 = random1.ints(85, 393447903);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.util.Random random1 = new java.util.Random(10L);
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet4 = faker3.internet();
        com.github.javafaker.Options options5 = faker3.options();
        com.github.javafaker.Book book6 = faker3.book();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73043025f + "'", float2 == 0.73043025f);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        java.util.Locale.Builder builder6 = builder2.setLanguage("Korean");
        java.util.Locale.Builder builder8 = builder6.setLanguage("it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("Chinese", "\u30d5\u30e9\u30f3\u30b9\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Chinese [at index 0]");
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
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        int int2 = random1.nextInt();
        java.util.stream.IntStream intStream3 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (-1789290896));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1157793070) + "'", int2 == (-1157793070));
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (short) 0);
        java.util.stream.DoubleStream doubleStream11 = random1.doubles(100.0d, (double) 1708368258);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random1.doubles(0.0d, (-0.561798736983973d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book3 = faker2.book();
        java.lang.String str5 = faker2.bothify("\u6cd5\u6587\u6cd5\u570b)");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u6cd5\u570b)" + "'", str5, "\u6cd5\u6587\u6cd5\u570b)");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getDisplayCountry();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Color color6 = faker5.color();
        com.github.javafaker.Name name7 = faker5.name();
        com.github.javafaker.Lorem lorem8 = faker5.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Canada" + "'", str4, "Canada");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getVariant();
        boolean boolean2 = locale0.hasExtensions();
        boolean boolean3 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Collection<java.lang.String> strCollection1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = java.util.Locale.filterTags(languageRangeList0, strCollection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale38);
        java.lang.String str40 = locale38.getLanguage();
        java.util.Set<java.lang.String> strSet41 = locale38.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap45);
        java.util.Locale locale47 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, strMap52);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strMap57);
        java.util.Locale.Builder builder59 = new java.util.Locale.Builder();
        java.util.Locale locale61 = new java.util.Locale("");
        java.lang.String str62 = locale61.getISO3Language();
        java.util.Locale.Builder builder63 = builder59.setLocale(locale61);
        java.util.Locale locale65 = new java.util.Locale("");
        java.lang.String str66 = locale65.getISO3Language();
        java.util.Locale locale68 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder69 = new java.util.Locale.Builder();
        java.util.Locale locale71 = new java.util.Locale("");
        java.lang.String str72 = locale71.getISO3Language();
        java.util.Locale.Builder builder73 = builder69.setLocale(locale71);
        java.util.Locale locale75 = new java.util.Locale("");
        java.lang.String str76 = locale75.getISO3Language();
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale61, locale65, locale68, locale71, locale75 };
        java.util.ArrayList<java.util.Locale> localeList78 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList78, localeArray77);
        java.util.Locale locale80 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.util.Locale>) localeList78, filteringMode81);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strSet48, filteringMode81);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet41, filteringMode81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap85 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList86 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap85);
        java.util.Collection<java.util.Locale> localeCollection87 = null;
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, localeCollection87);
        java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList88);
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
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals(locale68.toString(), "hi!");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(localeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(locale80);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode81.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(languageRangeList86);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNull(locale89);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder11 = builder5.setExtension('u', "chn");
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder12.clear();
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
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.util.Random random1 = new java.util.Random((-4972683369271453960L));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random1.ints((long) 216154118, 553627293, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.util.Locale locale2 = new java.util.Locale("Italia", "KOR");
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleKeys();
        java.lang.String str9 = locale2.getDisplayVariant(locale4);
        org.junit.Assert.assertEquals(locale2.toString(), "italia_KOR");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.util.Locale locale2 = new java.util.Locale("ko_KR", "\u53f0\u7063");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u53f0\u7063");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale5 = new java.util.Locale("German", "fra-x-lvariant-kor_HI!", "de_DE");
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale5.getDisplayVariant();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale5.toString(), "german_FRA-X-LVARIANT-KOR_HI!_de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA-X-LVARIANT-KOR_HI!" + "'", str6, "FRA-X-LVARIANT-KOR_HI!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "de,DE" + "'", str7, "de,DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Japan" + "'", str8, "Japan");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        java.util.Locale locale2 = new java.util.Locale("\ud504\ub791\uc2a4\uc5b4", "Italia");
        org.junit.Assert.assertEquals(locale2.toString(), "\ud504\ub791\uc2a4\uc5b4_ITALIA");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("French");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "french");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        float float10 = random1.nextFloat();
        java.util.stream.IntStream intStream11 = random1.ints();
        random1.setSeed((long) 553627293);
        java.lang.Class<?> wildcardClass14 = random1.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.24137181f + "'", float10 == 0.24137181f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream2 = random1.longs();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Options options4 = faker3.options();
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        java.util.Locale locale1 = new java.util.Locale("zh-TW");
        org.junit.Assert.assertEquals(locale1.toString(), "zh-tw");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.util.Locale locale2 = new java.util.Locale("Canada", "");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale6);
        java.lang.String str9 = locale6.getCountry();
        java.lang.String str10 = locale6.getLanguage();
        java.lang.String str11 = locale2.getDisplayVariant(locale6);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "canada");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u671d\u9c9c\u6587\u97e9\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??? (??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        java.lang.String str35 = locale27.getISO3Language();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zho" + "'", str35, "zho");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.util.Locale locale1 = new java.util.Locale("KR");
        org.junit.Assert.assertEquals(locale1.toString(), "kr");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.util.Random random1 = new java.util.Random((long) 1890976351);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.Set<java.lang.String> strSet9 = locale1.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getCountry();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale3);
        com.github.javafaker.Internet internet7 = faker6.internet();
        java.lang.String str9 = faker6.bothify("FRENCH (FRENCH)");
        com.github.javafaker.Name name10 = faker6.name();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRENCH (FRENCH)" + "'", str9, "FRENCH (FRENCH)");
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Book book6 = faker1.book();
        java.lang.Class<?> wildcardClass7 = book6.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap54);
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
        org.junit.Assert.assertNotNull(languageRangeList55);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh", 0.8452060657049847d);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8452060657049847d + "'", double3 == 0.8452060657049847d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        double double2 = random1.nextDouble();
        float float3 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random1.longs((long) (byte) 0, (long) 1430131985, (long) (-1155869325));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22278216143339702d + "'", double2 == 0.22278216143339702d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.39776045f + "'", float3 == 0.39776045f);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.util.Locale locale1 = new java.util.Locale("Chinook jargon");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "chinook jargon");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinook jargon" + "'", str2, "chinook jargon");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        java.lang.String str19 = locale15.getISO3Country();
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
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code7 = faker6.code();
        com.github.javafaker.Lorem lorem8 = faker6.lorem();
        com.github.javafaker.Color color9 = faker6.color();
        com.github.javafaker.Lorem lorem10 = faker6.lorem();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Code code6 = faker0.code();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Locale locale10 = new java.util.Locale("fra-x-lvariant-kor", "fra", "kor");
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet11);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertEquals(locale10.toString(), "fra-x-lvariant-kor_FRA_kor");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.util.Locale locale3 = new java.util.Locale("fra (HI!,kor)", "CN", "french (france)_CANADA");
        java.lang.String str4 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "fra (hi!,kor)_CN_french (france)_CANADA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        float float6 = random1.nextFloat();
        double double7 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = random1.nextInt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.44047195f + "'", float6 == 0.44047195f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3268766592932178d + "'", double7 == 0.3268766592932178d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale2 = new java.util.Locale("fra");
        java.util.Locale locale5 = new java.util.Locale("und", "zh");
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale2.getDisplayName(locale5);
        java.lang.String str8 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale9 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale2.toString(), "fra");
        org.junit.Assert.assertEquals(locale5.toString(), "und_ZH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fra" + "'", str7, "fra");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Taiwan" + "'", str8, "Taiwan");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
            java.util.Locale.Builder builder10 = builder7.setRegion("Chinook jargon (Germany,KR)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinook jargon (Germany,KR) [at index 0]");
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
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("it_IT");
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.stream.IntStream intStream4 = random1.ints((int) (short) 10, 28);
        java.util.stream.IntStream intStream6 = random1.ints((long) 32);
        int int7 = random1.nextInt();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1188188233) + "'", int7 == (-1188188233));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextGaussian();
        double double2 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random0.longs((long) 37, (long) (-1156638823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6749154566111719d + "'", double1 == 0.6749154566111719d);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5741935291201905d + "'", double2 == 0.5741935291201905d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.util.Locale locale3 = new java.util.Locale("GB", "FRA", "en");
        java.lang.String str4 = locale3.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "gb_FRA_en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gb" + "'", str4, "gb");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.DoubleStream doubleStream9 = random3.doubles();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Locale.setDefault(locale4);
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean" + "'", str2, "Korean");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        java.util.stream.LongStream longStream6 = random1.longs();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Book book5 = faker2.book();
        com.github.javafaker.Internet internet6 = faker2.internet();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        com.github.javafaker.Options options8 = faker2.options();
        com.github.javafaker.Business business9 = faker2.business();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("South Korea");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        java.util.stream.IntStream intStream11 = random1.ints((long) (byte) 100);
        double double12 = random1.nextDouble();
        float float13 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2413718236526089d + "'", double12 == 0.2413718236526089d);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.57896465f + "'", float13 == 0.57896465f);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Options options7 = faker0.options();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.LongStream longStream10 = random1.longs((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream11 = random1.doubles();
        double double12 = random1.nextGaussian();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.561581040188955d + "'", double12 == 1.561581040188955d);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder23.setScript("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: French (Canada) [at index 0]");
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
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setScript("TWN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: TWN [at index 0]");
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
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.util.Locale locale1 = new java.util.Locale("fra-x-lvariant-kor_HI!");
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "fra-x-lvariant-kor_hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale2 = new java.util.Locale("fra");
        java.util.Locale locale5 = new java.util.Locale("und", "zh");
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale2.getDisplayName(locale5);
        java.lang.String str8 = locale0.getDisplayCountry(locale2);
        java.lang.Object obj9 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale2.toString(), "fra");
        org.junit.Assert.assertEquals(locale5.toString(), "und_ZH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fra" + "'", str7, "fra");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Taiwan" + "'", str8, "Taiwan");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "fra");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "fra");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "fra");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        java.util.Locale locale2 = new java.util.Locale("Canada", "french (french)");
        java.util.Locale locale6 = new java.util.Locale("Chinese (China)", "French", "french (FRENCH)");
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.lang.String str8 = locale6.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale6.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for FRENCH");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "canada_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals(locale6.toString(), "chinese (china)_FRENCH_french (FRENCH)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "canada (FRENCH (FRENCH))" + "'", str7, "canada (FRENCH (FRENCH))");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chinese (china) (FRENCH,french (FRENCH))" + "'", str8, "chinese (china) (FRENCH,french (FRENCH))");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        double double2 = random1.nextDouble();
        java.util.stream.IntStream intStream3 = random1.ints();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((double) (-4972683369271453960L), (double) 38);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22278216143339702d + "'", double2 == 0.22278216143339702d);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        java.util.Set<java.lang.Character> charSet9 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FRA-X-LVARIANT-KOR", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.DoubleStream doubleStream3 = random1.doubles(0L);
        java.util.stream.LongStream longStream4 = random1.longs();
        java.util.stream.LongStream longStream6 = random1.longs((long) (short) 0);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.util.Locale locale2 = new java.util.Locale("French (France)", "");
        java.lang.String str3 = locale2.getISO3Country();
        org.junit.Assert.assertEquals(locale2.toString(), "french (france)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 0.7732599f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.util.Locale locale3 = new java.util.Locale("ko", "", "");
        java.lang.String str4 = locale3.getISO3Country();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale3.getLanguage();
        java.util.Random random8 = new java.util.Random((long) (byte) 0);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale3, random8);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ko" + "'", str6, "ko");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("canada (FRENCH (FRENCH))", (double) 1853403699951111791L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.85340369995111168E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.util.Locale locale3 = new java.util.Locale("france", "\ud504\ub791\uc2a4\uc5b4", "canada");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ud504\ub791\uc2a4\uc5b4_canada");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale8);
        java.util.Locale.setDefault(category5, locale8);
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category5, locale11);
        java.lang.String str13 = locale4.getDisplayCountry(locale11);
        java.lang.String str14 = locale0.getDisplayLanguage(locale4);
        java.lang.String str15 = locale0.getScript();
        java.lang.String str16 = locale0.toLanguageTag();
        boolean boolean17 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale8.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "German" + "'", str14, "German");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "de" + "'", str16, "de");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale5 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.lang.String str6 = locale0.getDisplayLanguage(locale5);
        java.lang.Class<?> wildcardClass7 = locale5.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale5.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese" + "'", str6, "Chinese");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder7 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder2.setRegion("\ud504\ub791\uc2a4\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        // The following exception was thrown during execution in test generation
        try {
            int int25 = random1.nextInt((-1155484576));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-42, -97, -43, -72, -76]");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale4 = new java.util.Locale("kor", "french (FRENCH)");
        java.lang.String str5 = locale4.getDisplayName();
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = locale0.getDisplayCountry(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese (Cina)" + "'", str1, "cinese (Cina)");
        org.junit.Assert.assertEquals(locale4.toString(), "kor_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coreano (FRENCH (FRENCH))" + "'", str5, "Coreano (FRENCH (FRENCH))");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.setVariant("");
        java.util.Locale.Builder builder12 = builder9.setExtension('a', "chn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setVariant("CAN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: CAN [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("CHINESE");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getLanguage();
        java.util.Locale locale6 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coreano (Corea del Sud)" + "'", str3, "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Company company5 = faker1.company();
        com.github.javafaker.Business business6 = faker1.business();
        java.lang.String str8 = faker1.bothify("\u671d\u9c9c\u6587\u97e9\u56fd)");
        com.github.javafaker.PhoneNumber phoneNumber9 = faker1.phoneNumber();
        java.lang.String str11 = faker1.letterify("Canada");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str8, "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Canada" + "'", str11, "Canada");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.util.Locale locale2 = new java.util.Locale("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)", "\uc911\uad6d\uc5b4");
        java.lang.String str3 = locale2.getDisplayScript();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Color color9 = faker8.color();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker8.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        java.lang.String str34 = locale17.getCountry();
        java.util.Locale locale36 = new java.util.Locale("");
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.util.Locale locale39 = locale37.stripExtensions();
        java.lang.String str40 = locale17.getDisplayCountry(locale39);
        java.util.Locale locale41 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str43 = locale41.getExtension('x');
        java.util.Random random45 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker(random45);
        float float47 = random45.nextFloat();
        java.util.stream.IntStream intStream51 = random45.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream52 = random45.ints();
        double double53 = random45.nextDouble();
        float float54 = random45.nextFloat();
        com.github.javafaker.Faker faker55 = new com.github.javafaker.Faker(locale41, random45);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker(locale17, random45);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
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
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "FRA" + "'", str40, "FRA");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.72810113f + "'", float47 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertNotNull(intStream52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.44047195711667986d + "'", double53 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.24137181f + "'", float54 == 0.24137181f);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        long long27 = random3.nextLong();
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-2085682583702141179L) + "'", long27 == (-2085682583702141179L));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.lang.String str6 = locale3.getCountry();
        java.lang.String str7 = locale3.getLanguage();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.toLanguageTag();
        java.util.Locale locale12 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale12);
        java.lang.String str14 = locale12.getDisplayName();
        java.lang.String str15 = locale8.getDisplayScript(locale12);
        java.lang.String str16 = locale8.getLanguage();
        java.lang.String str17 = locale3.getDisplayCountry(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = locale3.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals(locale12.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "french (FRENCH)" + "'", str14, "french (FRENCH)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fr" + "'", str16, "fr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.util.Locale locale2 = new java.util.Locale("\ud55c\uad6d\uc5b4", "french");
        java.util.Locale locale6 = new java.util.Locale("", "French (France)", "France");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale6.getUnicodeLocaleType("south korea (SOUTH KOREA)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: south korea (SOUTH KOREA)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "\ud55c\uad6d\uc5b4_FRENCH");
        org.junit.Assert.assertEquals(locale6.toString(), "_FRENCH (FRANCE)_France");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und-France" + "'", str8, "und-France");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("KOR");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.util.Locale locale3 = new java.util.Locale("korean", "chn", "\ud55c\uad6d\uc5b4");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FRA", 0.6991794951529816d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
            java.util.Locale.Builder builder12 = builder8.setVariant("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Korean (South Korea) [at index 0]");
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u8a9e\u30ab\u30ca\u30c0)", "\u30d5\u30e9\u30f3\u30b9", "it_IT");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30ab\u30ca\u30c0\u30d5\u30e9\u30f3\u30b9_it_IT");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str10 = locale8.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Random random3 = new java.util.Random(10L);
        float float4 = random3.nextFloat();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random3);
        long long6 = random3.nextLong();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random3);
        java.util.stream.IntStream intStream10 = random3.ints((-1157793070), 254270492);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.73043025f + "'", float4 == 0.73043025f);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8220501950349663546L + "'", long6 == 8220501950349663546L);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        com.github.javafaker.PhoneNumber phoneNumber21 = faker20.phoneNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = faker20.resolve("chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(phoneNumber21);
    }
}
