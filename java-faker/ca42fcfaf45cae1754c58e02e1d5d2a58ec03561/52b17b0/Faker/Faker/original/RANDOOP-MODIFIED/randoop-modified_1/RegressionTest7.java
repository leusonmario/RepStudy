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
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.Random random2 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random2.longs();
        float float4 = random2.nextFloat();
        java.util.stream.IntStream intStream5 = random2.ints();
        int int6 = random2.nextInt();
        random2.setSeed((long) (-1155869325));
        java.util.stream.IntStream intStream9 = random2.ints();
        java.util.stream.DoubleStream doubleStream12 = random2.doubles((double) (-682588711), (double) 0.113836765f);
        java.util.stream.IntStream intStream15 = random2.ints((-509927405), 2088989465);
        java.util.Random random17 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream19 = random17.doubles((long) 10);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random17.nextBytes(byteArray23);
        random2.nextBytes(byteArray23);
        random1.nextBytes(byteArray23);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.621592f + "'", float4 == 0.621592f);
        org.junit.Assert.assertNotNull(intStream5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-815854966) + "'", int6 == (-815854966));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-73, -81, 45]");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        java.util.stream.IntStream intStream6 = random1.ints((-1193959466), 78707950);
        double double7 = random1.nextGaussian();
        boolean boolean8 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6246292191371761d + "'", double7 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream5 = random0.ints();
        java.util.stream.IntStream intStream6 = random0.ints();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.24047399f + "'", float2 == 0.24047399f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str23 = locale20.getExtension('a');
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
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        random10.setSeed((long) (-1142367176));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random10.doubles((long) 50, (double) 0.73806375f, (double) (-266361440));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        java.lang.String str25 = locale23.getDisplayVariant();
        java.lang.String str26 = locale23.getDisplayScript();
        java.lang.String str27 = locale23.toLanguageTag();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fr" + "'", str27, "fr");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Address address7 = faker0.address();
        com.github.javafaker.Internet internet8 = faker0.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker0.resolve("CHN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(internet8);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.util.Random random1 = new java.util.Random((long) 27);
        long long2 = random1.nextLong();
        int int4 = random1.nextInt(33);
        long long5 = random1.nextLong();
        long long6 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles(2387756735974468056L, (double) 0.023669124f, (double) 0.113836765f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random1.doubles((long) (-1210349396));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4947896108136290151L) + "'", long2 == (-4947896108136290151L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 17 + "'", int4 == 17);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7314023144807116478L + "'", long5 == 7314023144807116478L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-4346288304706427364L) + "'", long6 == (-4346288304706427364L));
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        java.util.Locale locale2 = new java.util.Locale("us", "zh-cn (JPN)");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "us_ZH-CN (JPN)");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Name name6 = faker0.name();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream8 = random0.ints(100L, (int) (byte) -1, (int) ' ');
        boolean boolean9 = random0.nextBoolean();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet11 = faker10.internet();
        com.github.javafaker.Color color12 = faker10.color();
        com.github.javafaker.Hacker hacker13 = faker10.hacker();
        com.github.javafaker.DateAndTime dateAndTime14 = faker10.date();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.8965876f + "'", float2 == 0.8965876f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(hacker13);
        org.junit.Assert.assertNotNull(dateAndTime14);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale locale5 = builder2.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Japanese" + "'", str4, "Japanese");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("ita", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.parse("und", strMap9);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList12, strMap13);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.parse("und");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("und");
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
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter(languageRangeList16, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Locale locale82 = java.util.Locale.lookup(languageRangeList12, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter(languageRangeList10, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Locale locale84 = java.util.Locale.lookup(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Locale locale85 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Set<java.lang.Character> charSet86 = locale85.getExtensionKeys();
        java.lang.String str87 = locale85.getDisplayLanguage();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
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
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNull(locale84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "");
        org.junit.Assert.assertNotNull(charSet86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder5.clearExtensions();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale.Builder builder14 = builder11.clear();
        java.util.Locale.Builder builder16 = builder11.setScript("");
        java.util.Locale.Builder builder18 = builder16.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder21 = builder16.setExtension('u', "");
        java.util.Locale.Builder builder24 = builder21.setExtension('u', "");
        java.util.Locale locale25 = builder21.build();
        java.util.Locale locale26 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder27 = builder21.setLocale(locale26);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        java.util.Locale.Builder builder32 = builder30.setVariant("");
        java.util.Locale locale33 = java.util.Locale.PRC;
        java.lang.String str34 = locale33.getVariant();
        java.util.Locale.Builder builder35 = builder30.setLocale(locale33);
        java.lang.String str36 = locale26.getDisplayLanguage(locale33);
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(locale26, random37);
        java.util.Locale.Builder builder39 = builder5.setLocale(locale26);
        java.util.Locale.Builder builder40 = builder39.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder42 = builder39.setRegion("French");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: French [at index 0]");
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587" + "'", str36, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getDisplayVariant();
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.lang.String str13 = locale10.getCountry();
        java.lang.String str14 = locale6.getDisplayVariant(locale10);
        java.util.Locale.Builder builder15 = builder3.setLocale(locale6);
        java.lang.String str16 = locale6.getDisplayCountry();
        java.util.Set<java.lang.String> strSet17 = locale6.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        random1.setSeed((long) 1408303951);
        java.util.Random random7 = new java.util.Random();
        java.util.stream.LongStream longStream10 = random7.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) '#');
        java.util.Random random14 = new java.util.Random(1L);
        java.util.Random random16 = new java.util.Random((long) (short) 1);
        java.util.Random random18 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles((long) 10);
        int int21 = random18.nextInt();
        java.util.stream.DoubleStream doubleStream22 = random18.doubles();
        java.util.stream.IntStream intStream23 = random18.ints();
        java.util.Random random25 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream27 = random25.doubles((long) 10);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random25.nextBytes(byteArray31);
        random18.nextBytes(byteArray31);
        random16.nextBytes(byteArray31);
        random14.nextBytes(byteArray31);
        random7.nextBytes(byteArray31);
        random1.nextBytes(byteArray31);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random1);
        java.lang.String str40 = faker38.regexify("und-a-chinese-u-china");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1157793070) + "'", int21 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-17, -88, 18]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "und-a-chinese-u-china" + "'", str40, "und-a-chinese-u-china");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ENG");
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code3 = faker2.code();
        com.github.javafaker.Business business4 = faker2.business();
        com.github.javafaker.Lorem lorem5 = faker2.lorem();
        com.github.javafaker.Address address6 = faker2.address();
        com.github.javafaker.Lorem lorem7 = faker2.lorem();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker2.phoneNumber();
        boolean boolean9 = languageRange1.equals((java.lang.Object) phoneNumber8);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        java.util.stream.LongStream longStream14 = random10.longs((long) 9, (long) 964153902);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        java.util.stream.IntStream intStream34 = random1.ints();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1157793070) + "'", int15 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-42, -97, -43]");
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertNotNull(intStream34);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale1);
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.util.Random random1 = new java.util.Random((long) (-1900217354));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = random1.ints((long) (-1155869325), 74692140, (-572239868));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        java.lang.String str4 = faker0.numerify("ITA");
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Number number6 = faker0.number();
        com.github.javafaker.Code code7 = faker0.code();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        com.github.javafaker.Book book34 = faker33.book();
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
        org.junit.Assert.assertNotNull(book34);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        java.lang.String str83 = null; // flaky: locale80.getDisplayName();
        java.util.Set<java.lang.Character> charSet84 = null; // flaky: locale80.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = null; // flaky: locale80.getUnicodeLocaleType("\u6cd5\u56fd)");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: x-lvariant-jpn (JPN,??)");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "French" + "'", str83, "French");
// flaky:         org.junit.Assert.assertNotNull(charSet84);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        java.util.Random random25 = new java.util.Random((long) (byte) 10);
        random25.setSeed((long) 1699180332);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale21, random25);
        java.util.Random random30 = new java.util.Random((long) (short) 100);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        java.util.Random random33 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream35 = random33.ints((long) (short) 100);
        java.util.stream.DoubleStream doubleStream36 = random33.doubles();
        random33.setSeed((long) (-1157793070));
        java.util.Locale locale39 = java.util.Locale.CHINA;
        java.util.Random random40 = new java.util.Random();
        java.util.stream.LongStream longStream41 = random40.longs();
        java.util.stream.LongStream longStream43 = random40.longs(0L);
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(locale39, random40);
        java.util.Random random46 = new java.util.Random(100L);
        java.util.stream.LongStream longStream48 = random46.longs((long) (short) 0);
        java.util.Random random50 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream52 = random50.doubles((long) 10);
        int int53 = random50.nextInt();
        java.util.stream.DoubleStream doubleStream54 = random50.doubles();
        java.util.stream.IntStream intStream55 = random50.ints();
        java.util.Random random57 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream59 = random57.doubles((long) 10);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random57.nextBytes(byteArray63);
        random50.nextBytes(byteArray63);
        random46.nextBytes(byteArray63);
        random40.nextBytes(byteArray63);
        random33.nextBytes(byteArray63);
        random30.nextBytes(byteArray63);
        random25.nextBytes(byteArray63);
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
        org.junit.Assert.assertNotNull(intStream35);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertNotNull(longStream43);
        org.junit.Assert.assertNotNull(longStream48);
        org.junit.Assert.assertNotNull(doubleStream52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1157793070) + "'", int53 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream54);
        org.junit.Assert.assertNotNull(intStream55);
        org.junit.Assert.assertNotNull(doubleStream59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[69, -21, 122]");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setExtension('a', "anglais (Etats-Unis)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: anglais (Etats [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream3 = random1.ints((long) (short) 100);
        java.util.stream.IntStream intStream4 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Internet internet3 = faker0.internet();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.Color color6 = faker0.color();
        com.github.javafaker.Business business7 = faker0.business();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker0.resolve("x-lvariant-FRA");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Options options5 = faker0.options();
        java.lang.String str7 = faker0.numerify("English");
        com.github.javafaker.Book book8 = faker0.book();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "FR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder6.setRegion("HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: HI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        java.lang.String str6 = faker0.bothify("zh_CN");
        com.github.javafaker.Finance finance7 = faker0.finance();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_CN" + "'", str6, "zh_CN");
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.util.Locale locale2 = new java.util.Locale("gb", "en,CA");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "gb_EN,CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EN,CA" + "'", str3, "EN,CA");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setRegion("de");
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguageTag("\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ???? (??,fr) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream6 = random1.longs(10L, 0L, (long) (short) 100);
        double double7 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random1.doubles((long) (-1811023350), 0.2227720902128787d, (double) 643247446);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.10047321632624884d + "'", double7 == 0.10047321632624884d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        java.util.Locale locale20 = locale18.stripExtensions();
        boolean boolean21 = locale18.hasExtensions();
        java.util.Random random23 = new java.util.Random(100L);
        java.util.stream.LongStream longStream25 = random23.longs((long) (short) 0);
        random23.setSeed((long) 'x');
        java.util.stream.LongStream longStream31 = random23.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream34 = random23.longs((long) (-1528827163), (long) 1);
        java.util.stream.IntStream intStream37 = random23.ints(591553211, 2002825273);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random23);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(locale18, random23);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CN" + "'", str13, "CN");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertNotNull(intStream37);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("cn");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.util.Locale locale1 = new java.util.Locale("english united kingdom");
        org.junit.Assert.assertEquals(locale1.toString(), "english united kingdom");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("china");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        java.util.stream.IntStream intStream5 = random1.ints();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ZH-CN");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.util.Random random1 = new java.util.Random((long) (-1296110853));
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (-9107597632174108729L), (double) 0.989446f);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        float float11 = random1.nextFloat();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.72308457f + "'", float11 == 0.72308457f);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) ' ');
        java.util.stream.IntStream intStream5 = random1.ints((long) 784223937);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random1.doubles((long) (-1101314636));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        com.github.javafaker.Color color18 = faker16.color();
        com.github.javafaker.Hacker hacker19 = faker16.hacker();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.48098397f + "'", float11 == 0.48098397f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2116890938) + "'", int13 == (-2116890938));
        org.junit.Assert.assertNotNull(hacker17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(hacker19);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (China)" + "'", str8, "Chinese (China)");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        java.util.Locale.Builder builder30 = builder17.addUnicodeLocaleAttribute("Cina");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder32 = builder30.setLanguageTag("italien (italie)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: italien (italie) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        java.util.Locale locale29 = java.util.Locale.PRC;
        java.lang.String str30 = locale29.getISO3Language();
        java.lang.String str31 = locale25.getDisplayCountry(locale29);
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
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zho" + "'", str30, "zho");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u97d3\u6587");
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("japonais (Japon)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=japonais(japon)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.String str2 = locale1.getLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        boolean boolean5 = locale3.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        java.util.Set<java.lang.String> strSet14 = locale6.getUnicodeLocaleKeys();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList16, strMap17);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = java.util.Locale.lookupTag(languageRangeList20, (java.util.Collection<java.lang.String>) strSet22);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.parse("und");
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
        java.util.Locale locale87 = java.util.Locale.lookup(languageRangeList25, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter(languageRangeList20, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList18, (java.util.Collection<java.util.Locale>) localeList83);
        java.lang.String str90 = locale6.getDisplayLanguage(locale89);
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
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(languageRangeList25);
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
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "");
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Chinese" + "'", str90, "Chinese");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        java.util.stream.IntStream intStream15 = random12.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream17 = random12.ints((long) (-125456132));
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
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.util.Random random1 = new java.util.Random((long) (-388136581));
        java.util.Random random3 = new java.util.Random((long) 0);
        int int5 = random3.nextInt((int) '4');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random3);
        double double7 = random3.nextDouble();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        boolean boolean10 = random3.nextBoolean();
        java.util.Random random12 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream14 = random12.doubles((long) 10);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random12.nextBytes(byteArray18);
        random3.nextBytes(byteArray18);
        random1.nextBytes(byteArray18);
        double double22 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream24 = random1.ints((long) (-1337057767));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44 + "'", int5 == 44);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8314409887870612d + "'", double7 == 0.8314409887870612d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-18, -111, -105]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.7802865894136035d + "'", double22 == 0.7802865894136035d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.util.Random random1 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        boolean boolean3 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("CAN", "Korean");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: CAN [at index 0]");
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
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.util.Random random1 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        long long4 = random1.nextLong();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Internet internet7 = faker5.internet();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-4964420948893066024L) + "'", long4 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        double double2 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles(0L, (double) 2401558996911791356L, (double) 1820495529);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8025330637390305d + "'", double2 == 0.8025330637390305d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.util.Locale locale2 = new java.util.Locale("und", "FRA");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale4 = null;
        java.lang.String str5 = null; // flaky: locale2.getDisplayScript(locale4);
        org.junit.Assert.assertEquals(locale2.toString(), "und_FRA");
        org.junit.Assert.assertNotNull(charSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale1);
        java.util.Locale locale13 = new java.util.Locale("italien (Italie)", "ITA", "zh_CN");
        java.lang.String str14 = locale1.getDisplayCountry(locale13);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertEquals(locale13.toString(), "italien (italie)_ITA_zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clear();
        java.util.Locale.Builder builder9 = builder0.setVariant("china");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder13.setVariant("");
        java.util.Locale.Builder builder17 = builder13.setVariant("");
        java.util.Locale locale18 = builder17.build();
        java.lang.String str19 = locale11.getDisplayName(locale18);
        java.util.Locale locale22 = new java.util.Locale("zh-cn", "JPN");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.lang.String str24 = locale11.getDisplayCountry(locale22);
        java.util.Locale.Builder builder25 = builder9.setLocale(locale11);
        java.util.Locale.Builder builder26 = builder9.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale22.toString(), "zh-cn_JPN");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.util.Locale locale3 = new java.util.Locale("zh-TW", "X-LVARIANT-JPN", "");
        org.junit.Assert.assertEquals(locale3.toString(), "zh-tw_X-LVARIANT-JPN");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((double) 100.0f, (double) 190001823);
        double double6 = random0.nextDouble();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color8 = faker7.color();
        java.lang.String str10 = faker7.numerify("english (_FR)");
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.07555699f + "'", float2 == 0.07555699f);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.21291316227189172d + "'", double6 == 0.21291316227189172d);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english (_FR)" + "'", str10, "english (_FR)");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company8 = faker7.company();
        com.github.javafaker.Number number9 = faker7.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.stream.LongStream longStream9 = random0.longs((long) 1358566768, (long) (-1690734402), (long) (-1279776254));
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        double double11 = random0.nextDouble();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23268368200580536d + "'", double11 == 0.23268368200580536d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.util.Locale locale2 = new java.util.Locale("JP", "\u97d3\u6587");
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.util.Locale locale12 = new java.util.Locale("hi!", "hi!", "zh-CN");
        java.lang.String str13 = locale12.getDisplayVariant();
        java.lang.String str14 = locale6.getDisplayCountry(locale12);
        java.lang.String str15 = locale12.getDisplayScript();
        java.lang.String str16 = locale2.getDisplayVariant(locale12);
        java.util.Locale locale17 = locale12.stripExtensions();
        java.lang.String str18 = locale12.getDisplayScript();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u97d3\u6587");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        int int9 = random1.nextInt();
        double double10 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4129126974821382d + "'", double7 == 0.4129126974821382d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1408064384) + "'", int9 == (-1408064384));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.561798736983973d) + "'", double10 == (-0.561798736983973d));
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setVariant("");
        java.util.Locale locale8 = builder7.build();
        java.lang.String str9 = locale1.getDisplayName(locale8);
        java.lang.String str10 = locale8.getDisplayCountry();
        java.lang.String str11 = locale8.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        com.github.javafaker.Hacker hacker19 = faker17.hacker();
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
        org.junit.Assert.assertNotNull(hacker19);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.util.Locale locale3 = new java.util.Locale("", "x-lvariant-fr", "English (United Kingdom)");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "_X-LVARIANT-FR_English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English (United Kingdom)" + "'", str4, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clear();
        java.util.Locale.Builder builder9 = builder0.setVariant("china");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder13.setVariant("");
        java.util.Locale.Builder builder17 = builder13.setVariant("");
        java.util.Locale locale18 = builder17.build();
        java.lang.String str19 = locale11.getDisplayName(locale18);
        java.util.Locale locale22 = new java.util.Locale("zh-cn", "JPN");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.lang.String str24 = locale11.getDisplayCountry(locale22);
        java.util.Locale.Builder builder25 = builder9.setLocale(locale11);
        java.util.Locale.Builder builder26 = builder25.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale22.toString(), "zh-cn_JPN");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("French");
        java.util.Locale.Builder builder9 = builder7.setVariant("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.removeUnicodeLocaleAttribute("Undetermined");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Undetermined [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        java.util.stream.LongStream longStream3 = random0.longs(0L);
        int int5 = random0.nextInt(44);
        boolean boolean6 = random0.nextBoolean();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app8 = faker7.app();
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 13 + "'", int5 == 13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(app8);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale11);
        java.util.Set<java.lang.String> strSet14 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale11.getDisplayName();
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
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "French" + "'", str15, "French");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        random1.setSeed((long) 1699180332);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        double double5 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((double) 0.7837344f, (double) 0.88910496f);
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((long) 1600337857);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.6263073f + "'", float2 == 0.6263073f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2090587360) + "'", int4 == (-2090587360));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.39145997129712096d) + "'", double5 == (-0.39145997129712096d));
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.util.Random random1 = new java.util.Random(0L);
        boolean boolean2 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.util.Locale locale2 = new java.util.Locale("en_CA", "zh,cn (ITALIENISCH)");
        org.junit.Assert.assertEquals(locale2.toString(), "en_ca_ZH,CN (ITALIENISCH)");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.util.Locale locale2 = new java.util.Locale("de", "Chinese (China)");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str9 = locale7.getExtension('x');
        java.lang.String str10 = locale3.getDisplayVariant(locale7);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale7.getDisplayScript(locale11);
        java.lang.String str14 = locale2.getDisplayVariant(locale11);
        java.util.Locale locale15 = locale11.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str18 = locale16.getDisplayLanguage(locale17);
        java.lang.String str19 = locale16.getVariant();
        java.lang.String str20 = locale16.getDisplayName();
        java.lang.String str21 = locale15.getDisplayName(locale16);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale16);
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u97d3\u6587" + "'", str18, "\u97d3\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Korean" + "'", str20, "Korean");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str21, "\ud504\ub791\uc2a4\uc5b4");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chinese (china) (ITALIEN (ITALIE),Chinese)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese (china) (italien (italie),chinese)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        long long5 = random0.nextLong();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((-0.47000348883266796d), (double) 'x');
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6816276727925371051L + "'", long5 == 6816276727925371051L);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.util.Locale locale2 = new java.util.Locale("Chine", "fra");
        java.util.Locale locale6 = new java.util.Locale("English (United Kingdom)", "italien Italie", "de");
        java.util.Locale locale10 = new java.util.Locale("French", "FRA", "und");
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale2.getDisplayCountry(locale10);
        java.util.Locale locale14 = locale10.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "chine_FRA");
        org.junit.Assert.assertEquals(locale6.toString(), "english (united kingdom)_ITALIEN ITALIE_de");
        org.junit.Assert.assertEquals(locale10.toString(), "french_FRA_und");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "french_FRA_und");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet13 = locale11.getExtensionKeys();
        java.util.Locale.setDefault(category10, locale11);
        java.util.Locale locale15 = java.util.Locale.getDefault(category10);
        java.util.Locale locale16 = java.util.Locale.getDefault(category10);
        java.util.Locale locale17 = java.util.Locale.getDefault(category10);
        java.util.Random random18 = new java.util.Random();
        java.util.stream.LongStream longStream19 = random18.longs();
        float float20 = random18.nextFloat();
        java.util.stream.IntStream intStream21 = random18.ints();
        int int22 = random18.nextInt();
        random18.setSeed((long) (-1155869325));
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale17, random18);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale27 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        java.util.Locale.Builder builder31 = builder28.clear();
        java.util.Locale.Builder builder33 = builder28.setScript("");
        java.util.Locale.Builder builder35 = builder33.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder38 = builder33.setExtension('u', "");
        java.util.Locale.Builder builder41 = builder38.setExtension('u', "");
        java.util.Locale locale42 = builder38.build();
        java.util.Locale locale43 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder44 = builder38.setLocale(locale43);
        java.util.Locale.Builder builder45 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder47 = builder45.setVariant("");
        java.util.Locale.Builder builder49 = builder47.setVariant("");
        java.util.Locale locale50 = java.util.Locale.PRC;
        java.lang.String str51 = locale50.getVariant();
        java.util.Locale.Builder builder52 = builder47.setLocale(locale50);
        java.lang.String str53 = locale43.getDisplayLanguage(locale50);
        java.util.Random random54 = null;
        com.github.javafaker.Faker faker55 = new com.github.javafaker.Faker(locale43, random54);
        java.lang.String str56 = locale43.getISO3Language();
        java.util.Locale.setDefault(category0, locale43);
        java.util.Locale locale58 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(longStream19);
// flaky:         org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.76041204f + "'", float20 == 0.76041204f);
        org.junit.Assert.assertNotNull(intStream21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1422161693) + "'", int22 == (-1422161693));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u4e2d\u6587" + "'", str53, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "zho" + "'", str56, "zho");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_TW");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.util.Locale locale1 = new java.util.Locale("italian");
        java.util.Locale locale5 = new java.util.Locale("TW", "English", "ITA");
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.lang.String str7 = locale6.getDisplayScript();
        java.lang.String str8 = locale6.getDisplayScript();
        java.util.Locale locale12 = new java.util.Locale("", "", "");
        java.lang.String str14 = locale12.getExtension('x');
        java.util.Locale.setDefault(locale12);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.lang.String str17 = locale12.getDisplayLanguage(locale16);
        java.lang.String str18 = locale16.getDisplayVariant();
        java.lang.String str19 = locale6.getDisplayCountry(locale16);
        java.lang.String str20 = locale5.getDisplayName(locale6);
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str24 = locale21.getExtension('x');
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder25.setVariant("");
        java.util.Locale.Builder builder28 = builder25.clear();
        java.util.Locale.Builder builder30 = builder25.setScript("");
        java.util.Locale locale31 = builder25.build();
        java.lang.String str32 = locale21.getDisplayLanguage(locale31);
        java.lang.String str33 = locale6.getDisplayCountry(locale21);
        java.lang.String str34 = locale1.getDisplayCountry(locale21);
        boolean boolean35 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertEquals(locale5.toString(), "tw_ENGLISH_ITA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Japon" + "'", str19, "Japon");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)" + "'", str20, "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Chinese" + "'", str32, "Chinese");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u65e5\u672c" + "'", str33, "\u65e5\u672c");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setRegion("JPN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: JPN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("cn", (double) 0.66756254f);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale4.getDisplayScript(locale8);
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale10.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese" + "'", str12, "Chinese");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.util.Locale locale3 = new java.util.Locale("fra (FRA,fr)", "German", "Italian");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "fra (fra,fr)_GERMAN_Italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra (fra,fr)_GERMAN_Italian" + "'", str4, "fra (fra,fr)_GERMAN_Italian");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream6 = random0.ints((long) 1);
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.Random random9 = new java.util.Random((-4962768465676381896L));
        java.util.Random random11 = new java.util.Random(1L);
        java.util.Random random13 = new java.util.Random((long) (short) 1);
        java.util.Random random15 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream17 = random15.doubles((long) 10);
        int int18 = random15.nextInt();
        java.util.stream.DoubleStream doubleStream19 = random15.doubles();
        java.util.stream.IntStream intStream20 = random15.ints();
        java.util.Random random22 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream24 = random22.doubles((long) 10);
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random22.nextBytes(byteArray28);
        random15.nextBytes(byteArray28);
        random13.nextBytes(byteArray28);
        random11.nextBytes(byteArray28);
        random9.nextBytes(byteArray28);
        random0.nextBytes(byteArray28);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.45493293f + "'", float2 == 0.45493293f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1157793070) + "'", int18 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(byteArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[109, -108, -98]");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream6 = random0.ints((long) 1);
        random0.setSeed((long) (-682588711));
        java.util.stream.LongStream longStream9 = random0.longs();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.6594929f + "'", float2 == 0.6594929f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguageTag("chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder2.setUnicodeLocaleKeyword("FRA (FRA,FR)", "francese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: FRA (FRA,FR) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = builder12.build();
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
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
        org.junit.Assert.assertNotNull(charSet15);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Twi");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("GB");
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
        java.util.Locale.Builder builder80 = builder5.setLocale(locale79);
        java.util.Locale.Builder builder82 = builder5.setLanguageTag("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder85 = builder82.setUnicodeLocaleKeyword("und", "italien Italie");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
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
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.bothify("English (United Kingdom)");
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Hacker hacker9 = faker0.hacker();
        com.github.javafaker.Options options10 = faker0.options();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English (United Kingdom)" + "'", str7, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.util.Locale locale2 = new java.util.Locale("us", "und-DE");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("ENGLISCH (KANADA)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ENGLISCH (KANADA)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "us_UND-DE");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.util.Locale locale2 = new java.util.Locale("\ud504\ub791\uc2a4\uc5b4", "us_ZH-CN (JPN)");
        java.util.Locale locale3 = locale2.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "\ud504\ub791\uc2a4\uc5b4_US_ZH-CN (JPN)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\ud504\ub791\uc2a4\uc5b4_US_ZH-CN (JPN)");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.util.Locale locale3 = new java.util.Locale("Chine", "und", "anglais");
        org.junit.Assert.assertEquals(locale3.toString(), "chine_UND_anglais");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Business business7 = faker0.business();
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Hacker hacker9 = faker0.hacker();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.util.Locale locale3 = new java.util.Locale("italien (Italie)", "ITA", "zh_CN");
        java.lang.String str5 = locale3.getExtension('x');
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet7 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "italien (italie)_ITA_zh_CN");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italien (italie)" + "'", str6, "italien (italie)");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((double) (-682588711), (double) 0.113836765f);
        java.util.stream.IntStream intStream13 = random0.ints((-509927405), 2088989465);
        java.util.Random random15 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream17 = random15.doubles((long) 10);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random15.nextBytes(byteArray21);
        random0.nextBytes(byteArray21);
        int int25 = random0.nextInt(1447301737);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.72198355f + "'", float2 == 0.72198355f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1839280320) + "'", int4 == (-1839280320));
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[104, -65, 25]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 905585588 + "'", int25 == 905585588);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        java.lang.String str23 = locale21.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.JAPAN;
        java.lang.String str25 = locale24.getDisplayScript();
        java.lang.String str26 = locale24.getDisplayScript();
        java.lang.String str27 = locale24.getVariant();
        java.lang.String str28 = locale24.getISO3Language();
        java.lang.String str29 = locale21.getDisplayName(locale24);
        java.lang.String str30 = locale24.getDisplayScript();
        java.lang.Object obj31 = locale24.clone();
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
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "jpn" + "'", str28, "jpn");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u82f1\u8a9e" + "'", str29, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "ja_JP");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "ja_JP");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "ja_JP");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        random1.setSeed((long) 2088989465);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.1460540722898627d + "'", double6 == 1.1460540722898627d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.util.Locale locale1 = new java.util.Locale("und");
        java.lang.String str3 = locale1.getExtension('x');
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "und");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Undetermined" + "'", str5, "Undetermined");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Internet internet6 = faker5.internet();
        com.github.javafaker.Address address7 = faker5.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(address7);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        java.util.stream.LongStream longStream2 = random0.longs();
        long long3 = random0.nextLong();
        boolean boolean4 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = random0.nextInt((-268554284));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 65198016419462839L + "'", long3 == 65198016419462839L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale locale9 = new java.util.Locale("hi!", "hi!", "zh-CN");
        java.lang.String str10 = locale9.getDisplayVariant();
        java.lang.String str11 = locale3.getDisplayCountry(locale9);
        java.lang.String str12 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.util.Locale locale1 = new java.util.Locale("CHINESISCH (TAIWAN)");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "chinesisch (taiwan)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.util.Locale locale3 = new java.util.Locale("italien", "X-LVARIANT-JPN", "en_CA");
        org.junit.Assert.assertEquals(locale3.toString(), "italien_X-LVARIANT-JPN_en_CA");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        boolean boolean51 = random0.nextBoolean();
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[28, 10, -108]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("chinois (Chine)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinois(chine)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (canada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=united kingdom");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.util.Locale locale1 = new java.util.Locale("DE");
        org.junit.Assert.assertEquals(locale1.toString(), "de");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        float float9 = random6.nextFloat();
        java.util.stream.LongStream longStream13 = random6.longs(8838767171837691191L, (long) (-1501435335), (long) 32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream16 = random6.longs((long) 1820495529, (long) 1480825437);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25780278f + "'", float9 == 0.25780278f);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.util.Locale locale3 = new java.util.Locale("GB", "English (United Kingdom)", "ITA");
        java.util.Locale.setDefault(locale3);
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale3.getLanguage();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale12 = new java.util.Locale("", "", "");
        java.lang.String str14 = locale12.getExtension('x');
        java.lang.String str15 = locale8.getDisplayVariant(locale12);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.lang.String str17 = locale16.getLanguage();
        java.lang.String str18 = locale12.getDisplayScript(locale16);
        java.lang.String str19 = locale7.getDisplayCountry(locale12);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder20.setVariant("");
        java.util.Locale.Builder builder23 = builder20.clear();
        java.util.Locale locale24 = builder23.build();
        java.lang.String str25 = locale24.getCountry();
        java.lang.String str26 = locale7.getDisplayLanguage(locale24);
        java.lang.String str27 = locale7.getDisplayName();
        java.util.Random random28 = new java.util.Random();
        java.util.stream.LongStream longStream29 = random28.longs();
        float float30 = random28.nextFloat();
        java.util.stream.IntStream intStream31 = random28.ints();
        java.util.stream.LongStream longStream35 = random28.longs((long) '#', (long) (byte) 1, (long) 100);
        random28.setSeed((long) 591553211);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(locale7, random28);
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale7.getDisplayVariant(locale41);
        java.util.Set<java.lang.Character> charSet43 = locale41.getExtensionKeys();
        java.lang.String str44 = locale3.getDisplayVariant(locale41);
        org.junit.Assert.assertEquals(locale3.toString(), "gb_ENGLISH (UNITED KINGDOM)_ITA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITA" + "'", str5, "ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gb" + "'", str6, "gb");
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
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chinese" + "'", str26, "Chinese");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese (China)" + "'", str27, "Chinese (China)");
        org.junit.Assert.assertNotNull(longStream29);
// flaky:         org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.115614235f + "'", float30 == 0.115614235f);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertNotNull(longStream35);
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ITA" + "'", str44, "ITA");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        com.github.javafaker.Internet internet20 = faker19.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale6.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.46217072f + "'", float10 == 0.46217072f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(internet20);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale10.getDisplayLanguage(locale14);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = new java.util.Locale("", "", "");
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale20.getDisplayLanguage(locale24);
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.lang.String str31 = locale29.getExtension('x');
        java.util.Locale.setDefault(locale29);
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale35.getISO3Country();
        java.util.Locale locale40 = new java.util.Locale("", "", "");
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.lang.String str45 = locale40.getDisplayLanguage(locale44);
        java.util.Locale locale47 = new java.util.Locale("hi!");
        java.util.Locale locale48 = locale47.stripExtensions();
        java.util.Locale locale50 = new java.util.Locale("hi!");
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.util.Locale locale55 = locale54.stripExtensions();
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale6, locale10, locale16, locale24, locale29, locale35, locale44, locale47, locale50, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.Locale.FilteringMode filteringMode59 = null;
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList57, filteringMode59);
        java.util.Locale locale61 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleAttributes();
        java.lang.String str63 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList65, strMap66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList67, strMap68);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals(locale47.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localeList60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(languageRangeList67);
        org.junit.Assert.assertNotNull(languageRangeList69);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        java.util.Set<java.lang.Character> charSet14 = locale6.getExtensionKeys();
        boolean boolean15 = locale6.hasExtensions();
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
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u56fd", "Korean", "cor\351en");
        org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u56fd_KOREAN_cor\351en");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((long) (short) 10);
        double double9 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.3548792f + "'", float2 == 0.3548792f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-534149794) + "'", int4 == (-534149794));
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4535178753986381d + "'", double9 == 0.4535178753986381d);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", (double) 0.03924471f);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        double double5 = languageRange2.getWeight();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de" + "'", str3, "de");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03924471139907837d + "'", double4 == 0.03924471139907837d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.03924471139907837d + "'", double5 == 0.03924471139907837d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.util.Random random1 = new java.util.Random(2898173593284639382L);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextDouble();
        java.util.stream.LongStream longStream7 = random1.longs();
        java.util.stream.IntStream intStream10 = random1.ints((-401604129), (-388136581));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8314409887870612d + "'", double6 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("coreano");
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code3 = faker2.code();
        java.lang.String str5 = faker2.bothify("hi!");
        com.github.javafaker.Hacker hacker6 = faker2.hacker();
        com.github.javafaker.Code code7 = faker2.code();
        java.lang.String str9 = faker2.regexify("\u6cd5\u6587");
        com.github.javafaker.App app10 = faker2.app();
        com.github.javafaker.DateAndTime dateAndTime11 = faker2.date();
        com.github.javafaker.Finance finance12 = faker2.finance();
        com.github.javafaker.Finance finance13 = faker2.finance();
        boolean boolean14 = languageRange1.equals((java.lang.Object) finance13);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587" + "'", str9, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(app10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.util.Locale locale3 = new java.util.Locale("FRA", "FRA", "fr");
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.lang.String str5 = locale3.getDisplayName(locale4);
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
        java.util.Locale locale27 = locale9.stripExtensions();
        java.lang.String str28 = locale3.getDisplayScript(locale9);
        java.util.Set<java.lang.Character> charSet29 = locale9.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "fra_FRA_fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra (FRA,fr)" + "'", str5, "fra (FRA,fr)");
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
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charSet29);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "zh-CN");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getDisplayCountry(locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str3 = languageRange2.getRange();
        java.lang.Object obj4 = null;
        boolean boolean5 = languageRange2.equals(obj4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        java.util.stream.LongStream longStream3 = random0.longs(0L);
        int int5 = random0.nextInt(44);
        boolean boolean6 = random0.nextBoolean();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random0.ints((-99702794), (-1752065703));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.util.Locale locale3 = new java.util.Locale("de", "FRA", "English (United Kingdom)");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder10 = builder6.setLanguage("French");
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale3.getDisplayLanguage(locale11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        java.util.Locale.setDefault(category13, locale14);
        java.util.Random random19 = new java.util.Random((long) (byte) 10);
        long long20 = random19.nextLong();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale14, random19);
        java.util.Random random23 = new java.util.Random(8220501950349663546L);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale14, random23);
        java.lang.String str25 = locale3.getDisplayVariant(locale14);
        java.lang.String str26 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "de_FRA_English (United Kingdom)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "french");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "German" + "'", str12, "German");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-4972683369271453960L) + "'", long20 == (-4972683369271453960L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "English (United Kingdom)" + "'", str25, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.util.Locale locale2 = new java.util.Locale("french", "fr");
        java.lang.String str3 = locale2.getCountry();
        java.lang.String str4 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "french" + "'", str4, "french");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0L);
        java.util.stream.IntStream intStream7 = random0.ints();
        double double8 = random0.nextDouble();
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((double) 0.44563425f, 0.815468261653394d);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-978601784) + "'", int4 == (-978601784));
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7230111333478574d + "'", double8 == 0.7230111333478574d);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2226004067371665d + "'", double9 == 0.2226004067371665d);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        java.lang.String str6 = faker0.regexify("\u6cd5\u6587");
        java.lang.String str8 = faker0.regexify("\u4e2d\u56fd");
        java.lang.String str10 = faker0.numerify("chinese (JPN)");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chinese (JPN)" + "'", str10, "chinese (JPN)");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("");
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale0.getDisplayScript(locale32);
        java.lang.String str35 = locale0.getDisplayLanguage();
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
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Chinese" + "'", str35, "Chinese");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        java.lang.String str17 = locale0.getLanguage();
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.util.Random random19 = new java.util.Random();
        java.util.stream.LongStream longStream20 = random19.longs();
        java.util.stream.LongStream longStream22 = random19.longs(0L);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale18, random19);
        boolean boolean24 = random19.nextBoolean();
        double double25 = random19.nextDouble();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale0, random19);
        com.github.javafaker.Book book27 = faker26.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.8982038f + "'", float3 == 0.8982038f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 608203801 + "'", int5 == 608203801);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr" + "'", str17, "fr");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(longStream22);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5080218295075238d + "'", double25 == 0.5080218295075238d);
        org.junit.Assert.assertNotNull(book27);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        java.util.Locale locale3 = new java.util.Locale("GB", "English (United Kingdom)", "ITA");
        java.util.Locale.setDefault(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "gb_ENGLISH (UNITED KINGDOM)_ITA");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.util.Locale locale1 = new java.util.Locale("FR");
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        java.util.stream.IntStream intStream8 = random1.ints(1397386546144374610L, 14, 1991855488);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random1.longs((long) (-1509809876), (long) 773776253, (-8549949981968836370L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.Lorem lorem8 = faker0.lorem();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0);
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        java.lang.String str20 = locale5.getCountry();
        java.lang.String str21 = locale5.getScript();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.addUnicodeLocaleAttribute("DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DE [at index 0]");
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
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
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
        java.lang.String str14 = locale13.getScript();
        java.util.Set<java.lang.Character> charSet15 = locale13.getExtensionKeys();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charSet15);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.util.Locale locale3 = new java.util.Locale("\u610f\u5927\u5229\u6587", "ja", "de");
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "\u610f\u5927\u5229\u6587_JA_de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) 1900068223);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random1.longs(0L, (-4346288304706427364L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        java.util.stream.DoubleStream doubleStream39 = random1.doubles((long) 445843723);
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
        org.junit.Assert.assertNotNull(doubleStream39);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Internet internet3 = faker2.internet();
        com.github.javafaker.Hacker hacker4 = faker2.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fran\347ais" + "'", str1, "fran\347ais");
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(hacker4);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayScript(locale5);
        java.lang.String str14 = locale0.getExtension('u');
        boolean boolean15 = locale0.hasExtensions();
        java.lang.String str16 = locale0.getDisplayVariant();
        java.lang.String str17 = locale0.getDisplayScript();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("italien (italie)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: italien (italie) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream3 = random1.ints((long) (short) 100);
        java.util.stream.IntStream intStream4 = random1.ints();
        java.lang.Class<?> wildcardClass5 = random1.getClass();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("french");
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet13 = locale11.getExtensionKeys();
        java.util.Locale.setDefault(category10, locale11);
        java.util.Locale locale15 = java.util.Locale.getDefault(category10);
        java.util.Locale locale16 = java.util.Locale.getDefault(category10);
        java.util.Locale locale17 = java.util.Locale.getDefault(category10);
        java.util.Random random18 = new java.util.Random();
        java.util.stream.LongStream longStream19 = random18.longs();
        float float20 = random18.nextFloat();
        java.util.stream.IntStream intStream21 = random18.ints();
        int int22 = random18.nextInt();
        random18.setSeed((long) (-1155869325));
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale17, random18);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale27 = locale17.stripExtensions();
        java.util.Locale locale31 = new java.util.Locale("", "", "");
        java.lang.String str33 = locale31.getExtension('x');
        java.util.Locale.setDefault(locale31);
        java.util.Locale locale37 = new java.util.Locale("de", "\u6cd5\u6587");
        java.lang.String str38 = locale31.getDisplayLanguage(locale37);
        java.lang.String str39 = locale17.getDisplayScript(locale31);
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
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(longStream19);
// flaky:         org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.85699314f + "'", float20 == 0.85699314f);
        org.junit.Assert.assertNotNull(intStream21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 44876787 + "'", int22 == 44876787);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNull(str33);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.App app4 = faker0.app();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(app4);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("us_ZH-CN (JPN)", 0.8733440484689767d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=us_zh-cn (jpn)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.util.Locale locale2 = new java.util.Locale("und-FR", "fr");
        org.junit.Assert.assertEquals(locale2.toString(), "und-fr_FR");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.util.Locale locale3 = new java.util.Locale("", "fr", "");
        java.lang.String str4 = locale3.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale5.getExtension('x');
        java.lang.String str9 = locale3.getDisplayName(locale5);
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale13.getDisplayLanguage(locale17);
        java.lang.String str19 = locale13.getISO3Country();
        java.util.Locale locale20 = locale13.stripExtensions();
        java.util.Locale.setDefault(locale13);
        java.lang.String str22 = locale3.getDisplayLanguage(locale13);
        java.util.Locale locale23 = java.util.Locale.PRC;
        java.lang.String str24 = locale23.getVariant();
        java.util.Random random26 = new java.util.Random(100L);
        double double27 = random26.nextGaussian();
        random26.setSeed((long) (-1157793070));
        double double30 = random26.nextGaussian();
        boolean boolean31 = random26.nextBoolean();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale23, random26);
        double double33 = random26.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(locale13, random26);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA" + "'", str4, "FRA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u56fd" + "'", str9, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6246292191371761d + "'", double27 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.09760425216810112d + "'", double30 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.8527831688664765d + "'", double33 == 0.8527831688664765d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("gb__Englisch Kanada", (double) 0.099019885f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=gb__englisch kanada");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.util.Locale locale2 = new java.util.Locale("", "cinese (Cina)");
        org.junit.Assert.assertEquals(locale2.toString(), "_CINESE (CINA)");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        double double4 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) ' ');
        random1.setSeed((long) (-1155484576));
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale.Builder builder10 = builder5.setScript("");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder15 = builder10.setExtension('u', "");
        java.util.Locale.Builder builder18 = builder15.setExtension('u', "");
        java.util.Locale locale19 = builder15.build();
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder21 = builder15.setLocale(locale20);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder22.setVariant("");
        java.util.Locale.Builder builder26 = builder24.setVariant("");
        java.util.Locale locale27 = java.util.Locale.PRC;
        java.lang.String str28 = locale27.getVariant();
        java.util.Locale.Builder builder29 = builder24.setLocale(locale27);
        java.lang.String str30 = locale20.getDisplayLanguage(locale27);
        java.lang.String str31 = locale20.getLanguage();
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder34 = builder32.setVariant("");
        java.util.Locale.Builder builder36 = builder34.setVariant("");
        java.util.Locale.Builder builder38 = builder34.setLanguage("French");
        java.util.Locale locale39 = builder38.build();
        java.util.Locale.Builder builder40 = builder38.clear();
        java.util.Locale locale41 = builder38.build();
        java.lang.String str42 = locale41.getCountry();
        java.lang.String str43 = locale20.getDisplayVariant(locale41);
        java.util.Locale.setDefault(category0, locale41);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587" + "'", str30, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh" + "'", str31, "zh");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "french");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        java.util.Random random13 = new java.util.Random();
        java.util.stream.LongStream longStream14 = random13.longs();
        float float15 = random13.nextFloat();
        java.util.stream.DoubleStream doubleStream17 = random13.doubles((long) '4');
        java.util.stream.IntStream intStream19 = random13.ints((long) 1);
        java.util.stream.DoubleStream doubleStream22 = random13.doubles((double) 0.5463555f, (double) (byte) 10);
        double double23 = random13.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale7, random13);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "french" + "'", str9, "french");
        org.junit.Assert.assertNotNull(charSet10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.4138136f + "'", float15 == 0.4138136f);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(doubleStream22);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6151451873525883d + "'", double23 == 0.6151451873525883d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setRegion("de");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("JAPAN");
        java.util.Locale.Builder builder6 = builder3.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder0.clear();
        java.util.Locale.Builder builder10 = builder0.setLanguageTag("x-lvariant-fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("\ud504\ub791\uc2a4\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        java.util.Locale locale2 = new java.util.Locale("zh-cn", "");
        java.lang.String str4 = locale2.getExtension('x');
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleKeys();
        java.lang.String str6 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cn");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-cn" + "'", str6, "zh-cn");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        java.util.Locale locale21 = locale13.stripExtensions();
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        java.lang.String str21 = locale13.getDisplayCountry();
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
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = builder3.build();
        java.lang.String str9 = locale8.getISO3Country();
        java.lang.String str11 = locale8.getExtension('a');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("GB");
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.lang.String str13 = locale11.getExtension('x');
        java.util.Locale.setDefault(locale11);
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.lang.String str16 = locale11.getDisplayLanguage(locale15);
        java.util.Set<java.lang.String> strSet17 = locale11.getUnicodeLocaleKeys();
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet21 = locale19.getExtensionKeys();
        java.util.Locale.setDefault(category18, locale19);
        java.lang.String str23 = locale11.getDisplayName(locale19);
        java.util.Locale locale24 = locale11.stripExtensions();
        java.util.Locale.Builder builder25 = builder5.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder5.removeUnicodeLocaleAttribute("\u97d3\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Number number3 = faker2.number();
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        java.util.Locale.Category category40 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet43 = locale41.getExtensionKeys();
        java.util.Locale.setDefault(category40, locale41);
        java.util.Random random46 = new java.util.Random((long) (byte) 10);
        long long47 = random46.nextLong();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(locale41, random46);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale41);
        java.util.Locale.setDefault(category0, locale41);
        java.lang.String str51 = locale41.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = locale41.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
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
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.FORMAT + "'", category40.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-4972683369271453960L) + "'", long47 == (-4972683369271453960L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale10.getDisplayLanguage(locale14);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = new java.util.Locale("", "", "");
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale20.getDisplayLanguage(locale24);
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.lang.String str31 = locale29.getExtension('x');
        java.util.Locale.setDefault(locale29);
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale35.getISO3Country();
        java.util.Locale locale40 = new java.util.Locale("", "", "");
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.lang.String str45 = locale40.getDisplayLanguage(locale44);
        java.util.Locale locale47 = new java.util.Locale("hi!");
        java.util.Locale locale48 = locale47.stripExtensions();
        java.util.Locale locale50 = new java.util.Locale("hi!");
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.util.Locale locale55 = locale54.stripExtensions();
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale6, locale10, locale16, locale24, locale29, locale35, locale44, locale47, locale50, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.Locale.FilteringMode filteringMode59 = null;
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList57, filteringMode59);
        java.util.Locale locale61 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleAttributes();
        java.lang.String str63 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList65, strMap66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList65, strMap68);
        java.util.Locale locale70 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet71 = locale70.getUnicodeLocaleAttributes();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.parse("fr", strMap73);
        java.util.Locale locale75 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet76 = locale75.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList74, (java.util.Collection<java.lang.String>) strSet76, filteringMode77);
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags(languageRangeList65, (java.util.Collection<java.lang.String>) strSet71, filteringMode77);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals(locale47.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localeList60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(languageRangeList67);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode77.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList79);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        com.github.javafaker.Lorem lorem16 = faker15.lorem();
        com.github.javafaker.Color color17 = faker15.color();
        com.github.javafaker.Business business18 = faker15.business();
        com.github.javafaker.Internet internet19 = faker15.internet();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.66168463f + "'", float11 == 0.66168463f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2112353123) + "'", int13 == (-2112353123));
        org.junit.Assert.assertNotNull(lorem16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(business18);
        org.junit.Assert.assertNotNull(internet19);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder8.setVariant("German");
        java.util.Locale.Builder builder12 = builder8.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder8.addUnicodeLocaleAttribute("gb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: gb [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        java.util.stream.LongStream longStream7 = random1.longs();
        long long8 = random1.nextLong();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-4193000546993396526L) + "'", long8 == (-4193000546993396526L));
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        com.github.javafaker.Finance finance35 = faker33.finance();
        com.github.javafaker.Options options36 = faker33.options();
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
        org.junit.Assert.assertNotNull(finance35);
        org.junit.Assert.assertNotNull(options36);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.util.Locale locale1 = new java.util.Locale("zh");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str15 = languageRange14.getRange();
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange5, languageRange8, languageRange11, languageRange14, languageRange18 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
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
        java.util.Locale locale83 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList79);
        java.lang.String str84 = null; // flaky: locale83.getISO3Country();
        java.lang.String str86 = null; // flaky: locale83.getExtension('u');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fr" + "'", str15, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
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
// flaky:         org.junit.Assert.assertNotNull(locale83);
// flaky:         org.junit.Assert.assertEquals(locale83.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u82f1\u8a9e", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale10.getDisplayLanguage(locale14);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = new java.util.Locale("", "", "");
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale20.getDisplayLanguage(locale24);
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.lang.String str31 = locale29.getExtension('x');
        java.util.Locale.setDefault(locale29);
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale35.getISO3Country();
        java.util.Locale locale40 = new java.util.Locale("", "", "");
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.lang.String str45 = locale40.getDisplayLanguage(locale44);
        java.util.Locale locale47 = new java.util.Locale("hi!");
        java.util.Locale locale48 = locale47.stripExtensions();
        java.util.Locale locale50 = new java.util.Locale("hi!");
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.util.Locale locale55 = locale54.stripExtensions();
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale6, locale10, locale16, locale24, locale29, locale35, locale44, locale47, locale50, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.Locale.FilteringMode filteringMode59 = null;
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList57, filteringMode59);
        java.util.Locale locale61 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleAttributes();
        java.lang.String str63 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList65, strMap66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList65, strMap68);
        java.util.Locale locale73 = new java.util.Locale("GB", "", "Englisch (Kanada)");
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags(languageRangeList65, (java.util.Collection<java.lang.String>) strSet74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap77 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList78 = java.util.Locale.LanguageRange.parse("Italian", strMap77);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap79 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList80 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList78, strMap79);
        java.util.Locale locale81 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet82 = locale81.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode83 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags(languageRangeList80, (java.util.Collection<java.lang.String>) strSet82, filteringMode83);
        java.lang.String str85 = java.util.Locale.lookupTag(languageRangeList65, (java.util.Collection<java.lang.String>) strSet82);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals(locale47.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localeList60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(languageRangeList67);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertEquals(locale73.toString(), "gb__Englisch (Kanada)");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(languageRangeList78);
        org.junit.Assert.assertNotNull(languageRangeList80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertTrue("'" + filteringMode83 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode83.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = random1.longs((-4964420948893066024L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4972683369271453960L) + "'", long2 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = builder3.build();
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Locale.setDefault(locale8);
        java.lang.String str11 = locale8.getVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("china");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Korean", strMap1);
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList6 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap7);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        java.util.Locale locale3 = new java.util.Locale("ita", "", "und");
        java.lang.String str4 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "ita__und");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita-x-lvariant-und" + "'", str4, "ita-x-lvariant-und");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.Random random7 = new java.util.Random(1L);
        java.util.Random random9 = new java.util.Random((long) (short) 1);
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
        random9.nextBytes(byteArray24);
        random7.nextBytes(byteArray24);
        random0.nextBytes(byteArray24);
        java.util.stream.DoubleStream doubleStream31 = random0.doubles((long) 1557051528);
        java.util.stream.IntStream intStream33 = random0.ints((long) 'u');
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1157793070) + "'", int14 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[101, 41, -22]");
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(intStream33);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.util.Locale locale2 = new java.util.Locale("\u82f1\u8a9e", "ja");
        java.lang.String str3 = locale2.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u8a9e_JA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e" + "'", str3, "\u82f1\u8a9e");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder2.build();
        java.lang.String str8 = locale7.getDisplayName();
        java.lang.String str9 = locale7.getCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "french" + "'", str8, "french");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        java.util.Locale locale2 = new java.util.Locale("fr-FR", "Chinese");
        org.junit.Assert.assertEquals(locale2.toString(), "fr-fr_CHINESE");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        java.util.Random random8 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream10 = random8.doubles((long) 10);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random8.nextBytes(byteArray14);
        random1.nextBytes(byteArray14);
        java.util.stream.LongStream longStream19 = random1.longs((long) (-1950768727), (long) (-1157793070));
        double double20 = random1.nextDouble();
        int int22 = random1.nextInt(834941583);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-8, 22, 21]");
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2578027905957804d + "'", double20 == 0.2578027905957804d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 127135246 + "'", int22 == 127135246);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        java.util.Locale locale3 = new java.util.Locale("zh,CN", "\u6cd5\u6587,fran\347ais)", "GB");
        java.lang.String str4 = locale3.getDisplayScript();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587,FRAN\347AIS)_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        java.util.Locale locale2 = new java.util.Locale("french (FRA,und)", "ja");
        org.junit.Assert.assertEquals(locale2.toString(), "french (fra,und)_JA");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream10 = random0.doubles(0L, (double) (short) 0, (double) 0.9816493f);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book12 = faker11.book();
        java.lang.String str14 = faker11.bothify("jpn_HI! (CHINESE (CHINA))");
        com.github.javafaker.Name name15 = faker11.name();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1653308120 + "'", int4 == 1653308120);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(book12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "jpn_HI! (CHINESE (CHINA))" + "'", str14, "jpn_HI! (CHINESE (CHINA))");
        org.junit.Assert.assertNotNull(name15);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        java.util.Random random1 = new java.util.Random((-5553633455863655373L));
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        java.util.Random random15 = new java.util.Random((long) 0);
        int int17 = random15.nextInt((int) '4');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random15);
        double double19 = random15.nextDouble();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0, random15);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale0);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 44 + "'", int17 == 44);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.8314409887870612d + "'", double19 == 0.8314409887870612d);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u6cd5\u56fd)", (double) (-1631086829));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.631086829E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        java.util.Locale locale1 = new java.util.Locale("Chinook jargon (KOREAN)");
        org.junit.Assert.assertEquals(locale1.toString(), "chinook jargon (korean)");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        java.util.Random random1 = new java.util.Random((long) 1600337857);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("us", (double) 0.67215943f);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        java.util.Locale locale3 = new java.util.Locale("und", "zh,CN", "EN,CA");
        org.junit.Assert.assertEquals(locale3.toString(), "und_ZH,CN_EN,CA");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        java.util.Locale locale3 = new java.util.Locale("zh", "Undetermined", "zh,CN");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "zh_UNDETERMINED_zh,CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UNDETERMINED" + "'", str4, "UNDETERMINED");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.43266338f, 0.6246292191371761d);
        double double5 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8746788966462123d + "'", double5 == 0.8746788966462123d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setUnicodeLocaleKeyword("\u65e5\u672c", "\u672a\u5b9a\u8bed\u79cd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
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
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("chinois");
        java.util.Locale.Builder builder11 = builder8.setExtension('u', "en_GB");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguageTag("chinese china");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: chinese china [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayScript(locale5);
        java.lang.String str14 = locale0.getExtension('u');
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.util.Locale locale17 = locale16.stripExtensions();
        java.util.Set<java.lang.Character> charSet18 = locale16.getExtensionKeys();
        java.util.Locale.setDefault(locale16);
        java.lang.String str20 = locale0.getDisplayScript(locale16);
        boolean boolean21 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        java.util.Random random1 = new java.util.Random((long) (-1900217354));
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Random random3 = new java.util.Random();
        java.util.stream.LongStream longStream4 = random3.longs();
        java.util.stream.LongStream longStream6 = random3.longs(0L);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random3);
        java.util.Random random9 = new java.util.Random(100L);
        java.util.stream.LongStream longStream11 = random9.longs((long) (short) 0);
        java.util.Random random13 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream15 = random13.doubles((long) 10);
        int int16 = random13.nextInt();
        java.util.stream.DoubleStream doubleStream17 = random13.doubles();
        java.util.stream.IntStream intStream18 = random13.ints();
        java.util.Random random20 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream22 = random20.doubles((long) 10);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random20.nextBytes(byteArray26);
        random13.nextBytes(byteArray26);
        random9.nextBytes(byteArray26);
        random3.nextBytes(byteArray26);
        random1.nextBytes(byteArray26);
        java.util.stream.LongStream longStream34 = random1.longs((long) (-2058711394), 8849569814870478533L);
        int int36 = random1.nextInt(6);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1157793070) + "'", int16 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-103, -31, 74]");
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        com.github.javafaker.Address address22 = faker15.address();
        com.github.javafaker.Hacker hacker23 = faker15.hacker();
        com.github.javafaker.Business business24 = faker15.business();
        com.github.javafaker.PhoneNumber phoneNumber25 = faker15.phoneNumber();
        com.github.javafaker.Number number26 = faker15.number();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.7161704f + "'", float11 == 0.7161704f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1946189265) + "'", int13 == (-1946189265));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese (China)" + "'", str19, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-TW" + "'", str21, "zh-TW");
        org.junit.Assert.assertNotNull(address22);
        org.junit.Assert.assertNotNull(hacker23);
        org.junit.Assert.assertNotNull(business24);
        org.junit.Assert.assertNotNull(phoneNumber25);
        org.junit.Assert.assertNotNull(number26);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color6 = faker5.color();
        com.github.javafaker.Hacker hacker7 = faker5.hacker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-GB", (double) 0.7904554f);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7904554009437561d + "'", double3 == 0.7904554009437561d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7904554009437561d + "'", double4 == 0.7904554009437561d);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        java.lang.String str31 = locale28.getDisplayLanguage();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale28);
        com.github.javafaker.PhoneNumber phoneNumber33 = faker32.phoneNumber();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u6587" + "'", str31, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(phoneNumber33);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Company company7 = faker0.company();
        java.lang.String str9 = faker0.numerify("Englisch (Kanada)");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Englisch (Kanada)" + "'", str9, "Englisch (Kanada)");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder10 = builder5.addUnicodeLocaleAttribute("italien");
        java.util.Locale locale11 = builder5.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company2 = faker1.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(company2);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.util.Random random1 = new java.util.Random((long) 1370835837);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = random1.nextInt((-1900217354));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.util.Locale locale2 = new java.util.Locale("Chine", "fra");
        java.util.Locale locale6 = new java.util.Locale("English (United Kingdom)", "italien Italie", "de");
        java.util.Locale locale10 = new java.util.Locale("French", "FRA", "und");
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale2.getDisplayCountry(locale10);
        java.util.Random random15 = new java.util.Random((long) 0);
        int int17 = random15.nextInt((int) '4');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random15);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale10, random15);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRA_und could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "chine_FRA");
        org.junit.Assert.assertEquals(locale6.toString(), "english (united kingdom)_ITALIEN ITALIE_de");
        org.junit.Assert.assertEquals(locale10.toString(), "french_FRA_und");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 44 + "'", int17 == 44);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.util.Locale locale3 = new java.util.Locale("CN", "french", "chinese (china)");
        java.lang.Object obj4 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "cn_FRENCH_chinese (china)");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "cn_FRENCH_chinese (china)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "cn_FRENCH_chinese (china)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "cn_FRENCH_chinese (china)");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("China", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        java.util.Random random1 = new java.util.Random((long) (-910502427));
        java.util.stream.LongStream longStream4 = random1.longs((long) (-1608557193), (long) 2073616612);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random1.ints((long) (-389258033), (-820187910), (-2065160384));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.43266338f, 0.6246292191371761d);
        float float5 = random1.nextFloat();
        long long6 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream7 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.73043025f + "'", float5 == 0.73043025f);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8220501950349663546L + "'", long6 == 8220501950349663546L);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        java.util.Locale.Builder builder27 = builder6.setExtension('a', "und_FRA");
        java.util.Locale.Builder builder29 = builder6.addUnicodeLocaleAttribute("italian");
        java.util.Locale.Builder builder30 = builder6.clear();
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
// flaky:         org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.7777182f + "'", float18 == 0.7777182f);
        org.junit.Assert.assertNotNull(intStream19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-322662750) + "'", int20 == (-322662750));
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u6587" + "'", str23, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "french");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale locale9 = new java.util.Locale("\u82f1\u8a9e");
        java.lang.String str10 = locale5.getDisplayVariant(locale9);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = locale11.getVariant();
        java.util.Random random14 = new java.util.Random(100L);
        double double15 = random14.nextGaussian();
        random14.setSeed((long) (-1157793070));
        double double18 = random14.nextGaussian();
        boolean boolean19 = random14.nextBoolean();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale11, random14);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.util.Locale locale25 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale25.getExtension('x');
        java.lang.String str28 = locale21.getDisplayName(locale25);
        java.lang.String str30 = locale21.getExtension('x');
        java.util.Locale locale32 = new java.util.Locale("fra");
        java.lang.String str33 = locale21.getDisplayScript(locale32);
        java.util.Locale locale34 = locale21.stripExtensions();
        java.lang.String str35 = locale11.getDisplayScript(locale34);
        java.lang.String str36 = locale34.getDisplayVariant();
        java.lang.String str37 = locale34.getDisplayScript();
        java.lang.String str38 = locale5.getDisplayCountry(locale34);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals(locale9.toString(), "\u82f1\u8a9e");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh,CN" + "'", str10, "zh,CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6246292191371761d + "'", double15 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.09760425216810112d + "'", double18 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "French" + "'", str28, "French");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals(locale32.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CHINA" + "'", str38, "CHINA");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale0);
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
        java.lang.String str23 = locale0.getDisplayCountry(locale20);
        java.lang.String str24 = locale20.getCountry();
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.lang.String str26 = locale25.getDisplayScript();
        java.lang.String str27 = locale25.getDisplayScript();
        java.lang.String str28 = locale25.getVariant();
        java.lang.String str29 = locale25.getISO3Language();
        java.lang.String str30 = locale20.getDisplayName(locale25);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chine" + "'", str23, "Chine");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "jpn" + "'", str29, "jpn");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str30, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        java.lang.String str5 = faker0.letterify("fr");
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Color color7 = faker0.color();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        int int7 = random1.nextInt();
        double double8 = random1.nextDouble();
        int int9 = random1.nextInt();
        double double10 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream13 = random1.doubles((double) (-322102451), (double) (-54155984));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random1.doubles((long) (-1165217776), (double) 0.07816422f, (double) (-389258033));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.3325983427023256d) + "'", double6 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1408064384) + "'", int7 == (-1408064384));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.24411725056425315d + "'", double8 == 0.24411725056425315d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-778209333) + "'", int9 == (-778209333));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35676463500575895d + "'", double10 == 0.35676463500575895d);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.letterify("it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("German");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str7 = languageRange6.getRange();
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange16 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] { languageRange6, languageRange10, languageRange13, languageRange16, languageRange19 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder28 = builder26.setVariant("");
        java.util.Locale locale29 = builder26.build();
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.util.Locale locale37 = new java.util.Locale("", "", "");
        java.lang.String str38 = locale33.getDisplayLanguage(locale37);
        java.util.Locale locale39 = java.util.Locale.FRENCH;
        java.util.Locale locale43 = new java.util.Locale("", "", "");
        java.util.Locale locale47 = new java.util.Locale("", "", "");
        java.lang.String str48 = locale43.getDisplayLanguage(locale47);
        java.util.Locale locale52 = new java.util.Locale("", "", "");
        java.lang.String str54 = locale52.getExtension('x');
        java.util.Locale.setDefault(locale52);
        java.util.Locale locale57 = new java.util.Locale("hi!");
        java.util.Locale locale58 = locale57.stripExtensions();
        java.lang.String str59 = locale58.getISO3Country();
        java.util.Locale locale63 = new java.util.Locale("", "", "");
        java.util.Locale locale67 = new java.util.Locale("", "", "");
        java.lang.String str68 = locale63.getDisplayLanguage(locale67);
        java.util.Locale locale70 = new java.util.Locale("hi!");
        java.util.Locale locale71 = locale70.stripExtensions();
        java.util.Locale locale73 = new java.util.Locale("hi!");
        java.util.Locale locale75 = new java.util.Locale("hi!");
        java.util.Locale locale77 = new java.util.Locale("hi!");
        java.util.Locale locale78 = locale77.stripExtensions();
        java.util.Locale[] localeArray79 = new java.util.Locale[] { locale29, locale33, locale39, locale47, locale52, locale58, locale67, locale70, locale73, locale75, locale77 };
        java.util.ArrayList<java.util.Locale> localeList80 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList80, localeArray79);
        java.util.Locale.FilteringMode filteringMode82 = null;
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList80, filteringMode82);
        java.util.Locale locale84 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList80, filteringMode85);
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap88 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList89 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap88);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals(locale70.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "hi!");
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertEquals(locale75.toString(), "hi!");
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(localeList83);
// flaky:         org.junit.Assert.assertNotNull(locale84);
// flaky:         org.junit.Assert.assertEquals(locale84.toString(), "fr");
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode85.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNotNull(languageRangeList89);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        com.github.javafaker.Address address21 = faker19.address();
        com.github.javafaker.Company company22 = faker19.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale6.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.713879f + "'", float10 == 0.713879f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertNotNull(company22);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str7 = locale4.getExtension('x');
        java.lang.String str8 = locale4.getDisplayScript();
        java.lang.String str9 = locale4.getDisplayScript();
        java.lang.String str10 = locale4.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.util.Random random12 = new java.util.Random();
        java.util.stream.LongStream longStream13 = random12.longs();
        float float14 = random12.nextFloat();
        java.util.stream.IntStream intStream15 = random12.ints();
        int int16 = random12.nextInt();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale11, random12);
        com.github.javafaker.Color color18 = faker17.color();
        boolean boolean19 = locale4.equals((java.lang.Object) faker17);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.121099055f + "'", float14 == 0.121099055f);
        org.junit.Assert.assertNotNull(intStream15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 158843412 + "'", int16 == 158843412);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.util.Locale.Builder builder9 = builder4.setLocale(locale8);
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setScript("en-gb (ZH-TW)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en-gb (ZH-TW) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.util.Locale locale3 = new java.util.Locale("GB", "", "Englisch (Kanada)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("und_fra ENGLISH UNITED KINGDOM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: und_fra ENGLISH UNITED KINGDOM");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "gb__Englisch (Kanada)");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        java.util.stream.LongStream longStream20 = random8.longs();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale6.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.40131152f + "'", float10 == 0.40131152f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(longStream20);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        java.lang.String str8 = locale5.getCountry();
        boolean boolean9 = locale5.hasExtensions();
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = locale5.getDisplayVariant(locale10);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale10);
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean6 = random1.nextBoolean();
        long long7 = random1.nextLong();
        long long8 = random1.nextLong();
        int int9 = random1.nextInt();
        int int11 = random1.nextInt((int) 'a');
        float float12 = random1.nextFloat();
        random1.setSeed((long) (-54155984));
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6536353257044113225L) + "'", long7 == (-6536353257044113225L));
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 7237087851403959952L + "'", long8 == 7237087851403959952L);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 417621112 + "'", int9 == 417621112);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
// flaky:         org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.3448496f + "'", float12 == 0.3448496f);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getVariant();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.lang.String str19 = locale12.getDisplayVariant(locale16);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = locale16.getDisplayScript(locale20);
        java.lang.String str23 = locale11.getDisplayScript(locale16);
        java.util.Locale locale26 = new java.util.Locale("de", "FRA");
        java.lang.String str27 = locale16.getDisplayVariant(locale26);
        java.lang.String str28 = locale8.getDisplayVariant(locale16);
        java.util.Locale.Category category29 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale30 = java.util.Locale.getDefault(category29);
        java.lang.String str31 = locale16.getDisplayScript(locale30);
        java.lang.String str32 = locale1.getDisplayLanguage(locale30);
        java.util.Set<java.lang.Character> charSet33 = locale30.getExtensionKeys();
        java.util.Locale locale37 = new java.util.Locale("", "", "");
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.lang.String str42 = locale37.getDisplayLanguage(locale41);
        java.lang.String str43 = locale37.getISO3Country();
        java.util.Locale locale44 = locale37.stripExtensions();
        java.util.Locale.setDefault(locale37);
        java.lang.String str46 = locale37.toLanguageTag();
        java.lang.String str47 = locale37.getDisplayName();
        boolean boolean48 = locale30.equals((java.lang.Object) str47);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fr" + "'", str21, "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals(locale26.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + category29 + "' != '" + java.util.Locale.Category.FORMAT + "'", category29.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "allemand" + "'", str32, "allemand");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "und" + "'", str46, "und");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('u', "ja_JP");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        long long5 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random1.longs((long) 633455038, (long) 1115909453, (long) (-1139614796));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3109364765729502342L) + "'", long5 == (-3109364765729502342L));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("inglese");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglese" + "'", str2, "inglese");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder2.build();
        java.lang.String str5 = locale4.getCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-tw_CHINE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh-tw_chine");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("anglais (Etats-Unis)");
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        java.util.stream.IntStream intStream6 = random1.ints((long) 387629116, (int) 'u', 180726124);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder2.build();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Locale.setDefault(locale6);
        java.lang.String str9 = locale4.getDisplayVariant(locale6);
        java.util.Random random11 = new java.util.Random(0L);
        double double12 = random11.nextGaussian();
        boolean boolean13 = random11.nextBoolean();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale6, random11);
        java.util.Set<java.lang.Character> charSet16 = locale6.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8025330637390305d + "'", double12 == 0.8025330637390305d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charSet16);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale4.getDisplayScript(locale8);
        java.util.Locale locale10 = locale8.stripExtensions();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str13 = locale8.getDisplayLanguage(locale12);
        java.lang.String str14 = locale8.getDisplayVariant();
        java.util.Set<java.lang.String> strSet15 = locale8.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.util.Random random1 = new java.util.Random((long) (-469336362));
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        java.lang.String str8 = locale5.getCountry();
        boolean boolean9 = locale5.hasExtensions();
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = locale5.getDisplayVariant(locale10);
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("");
        java.lang.String str16 = locale13.getDisplayLanguage(locale15);
        java.lang.String str17 = locale13.getDisplayLanguage();
        java.lang.String str18 = locale13.getDisplayLanguage();
        java.lang.String str19 = locale5.getDisplayName(locale13);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale5);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "French" + "'", str19, "French");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("JAPAN");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        java.util.Locale locale3 = new java.util.Locale("und-DE", "en-GB", "Cina");
        org.junit.Assert.assertEquals(locale3.toString(), "und-de_EN-GB_Cina");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        java.util.Random random1 = new java.util.Random((long) (-1422161693));
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FRA", (double) (-1155484576));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.155484576E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.util.Locale locale2 = new java.util.Locale("\u610f\u5927\u5229\u6587", "anglais");
        org.junit.Assert.assertEquals(locale2.toString(), "\u610f\u5927\u5229\u6587_ANGLAIS");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        java.util.Locale locale3 = new java.util.Locale("zh", "Undetermined", "zh,CN");
        java.lang.String str4 = locale3.getCountry();
        java.lang.String str5 = locale3.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "zh_UNDETERMINED_zh,CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UNDETERMINED" + "'", str4, "UNDETERMINED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Hacker hacker1 = faker0.hacker();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Number number4 = faker0.number();
        org.junit.Assert.assertNotNull(hacker1);
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("italien italie");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italienitalie");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder12 = builder5.setExtension('x', "English");
        java.util.Locale locale13 = builder5.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr__#x-english");
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        com.github.javafaker.Lorem lorem16 = faker15.lorem();
        com.github.javafaker.Color color17 = faker15.color();
        com.github.javafaker.Business business18 = faker15.business();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.35633457f + "'", float11 == 0.35633457f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1353839200) + "'", int13 == (-1353839200));
        org.junit.Assert.assertNotNull(lorem16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(business18);
        org.junit.Assert.assertNotNull(lorem19);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        java.util.Locale locale2 = new java.util.Locale("Chine", "fra");
        java.util.Locale locale6 = new java.util.Locale("English (United Kingdom)", "italien Italie", "de");
        java.util.Locale locale10 = new java.util.Locale("French", "FRA", "und");
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale2.getDisplayCountry(locale10);
        java.util.Random random15 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random15);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale2, random15);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chine_FRA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "chine_FRA");
        org.junit.Assert.assertEquals(locale6.toString(), "english (united kingdom)_ITALIEN ITALIE_de");
        org.junit.Assert.assertEquals(locale10.toString(), "french_FRA_und");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("chinois");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("deu");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder66 = builder0.removeUnicodeLocaleAttribute("gb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: gb [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "");
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
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.util.Locale locale0 = null;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream4 = random1.longs((long) (-1), (long) (short) 10);
        int int5 = random1.nextInt();
        double double6 = random1.nextGaussian();
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
        random1.nextBytes(byteArray34);
        java.util.stream.IntStream intStream42 = random1.ints();
        long long43 = random1.nextLong();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random1);
        double double45 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker(locale0, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-52500711) + "'", int5 == (-52500711));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3561158518829507d) + "'", double6 == (-0.3561158518829507d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1155869325) + "'", int11 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1157793070) + "'", int24 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(byteArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[118, -28, -10]");
        org.junit.Assert.assertNotNull(intStream42);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3766761110746172454L + "'", long43 == 3766761110746172454L);
// flaky:         org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.02092223529347992d + "'", double45 == 0.02092223529347992d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        int int7 = random1.nextInt();
        java.util.stream.LongStream longStream8 = random1.longs();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        random1.setSeed((long) 1408303951);
        int int13 = random1.nextInt(1839438880);
        java.util.stream.LongStream longStream14 = random1.longs();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1690734402) + "'", int7 == (-1690734402));
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1049187447 + "'", int13 == 1049187447);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ja", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("deu");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("und");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale locale15 = builder12.build();
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.lang.String str24 = locale19.getDisplayLanguage(locale23);
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.lang.String str34 = locale29.getDisplayLanguage(locale33);
        java.util.Locale locale38 = new java.util.Locale("", "", "");
        java.lang.String str40 = locale38.getExtension('x');
        java.util.Locale.setDefault(locale38);
        java.util.Locale locale43 = new java.util.Locale("hi!");
        java.util.Locale locale44 = locale43.stripExtensions();
        java.lang.String str45 = locale44.getISO3Country();
        java.util.Locale locale49 = new java.util.Locale("", "", "");
        java.util.Locale locale53 = new java.util.Locale("", "", "");
        java.lang.String str54 = locale49.getDisplayLanguage(locale53);
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale57 = locale56.stripExtensions();
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.util.Locale locale61 = new java.util.Locale("hi!");
        java.util.Locale locale63 = new java.util.Locale("hi!");
        java.util.Locale locale64 = locale63.stripExtensions();
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale15, locale19, locale25, locale33, locale38, locale44, locale53, locale56, locale59, locale61, locale63 };
        java.util.ArrayList<java.util.Locale> localeList66 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList66, localeArray65);
        java.util.Locale.FilteringMode filteringMode68 = null;
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList66, filteringMode68);
        java.util.Locale locale70 = java.util.Locale.lookup(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList72);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(localeList73);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.util.Locale locale3 = new java.util.Locale("und", "de", "fr");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.lang.String str10 = locale8.getExtension('x');
        java.lang.String str11 = locale4.getDisplayVariant(locale8);
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale8.getDisplayScript(locale12);
        java.util.Locale locale14 = locale12.stripExtensions();
        java.lang.String str15 = locale3.getDisplayLanguage(locale14);
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.lang.String str17 = locale16.getISO3Country();
        java.lang.String str18 = locale16.getDisplayVariant();
        java.util.Locale locale20 = new java.util.Locale("hi!");
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Set<java.lang.Character> charSet22 = locale20.getExtensionKeys();
        java.lang.String str23 = locale20.getCountry();
        java.lang.String str24 = locale16.getDisplayVariant(locale20);
        java.lang.String str25 = locale14.getDisplayName(locale16);
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder28 = builder26.setVariant("");
        java.util.Locale.Builder builder29 = builder26.clear();
        java.util.Locale.Builder builder31 = builder26.setScript("");
        java.util.Locale.Builder builder33 = builder31.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder36 = builder31.setExtension('u', "");
        java.util.Locale.Builder builder39 = builder36.setExtension('u', "");
        java.util.Locale locale40 = builder36.build();
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder41.setVariant("");
        java.util.Locale.Builder builder44 = builder43.clearExtensions();
        java.util.Locale locale45 = builder43.build();
        java.lang.String str46 = locale40.getDisplayVariant(locale45);
        java.util.Locale locale50 = new java.util.Locale("", "", "");
        java.lang.String str51 = locale45.getDisplayLanguage(locale50);
        java.util.Locale locale54 = new java.util.Locale("zh-cn", "");
        java.lang.String str56 = locale54.getExtension('x');
        java.lang.String str57 = locale50.getDisplayName(locale54);
        java.util.Set<java.lang.String> strSet58 = locale54.getUnicodeLocaleKeys();
        java.lang.String str59 = locale14.getDisplayLanguage(locale54);
        org.junit.Assert.assertEquals(locale3.toString(), "und_DE_fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u672a\u5b9a\u8bed\u79cd" + "'", str15, "\u672a\u5b9a\u8bed\u79cd");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinesisch (China)" + "'", str25, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale54.toString(), "zh-cn");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Chinese" + "'", str59, "Chinese");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = builder3.build();
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Locale.setDefault(locale8);
        java.lang.String str11 = locale8.getISO3Country();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", (double) 0.03924471f);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03924471139907837d + "'", double3 == 0.03924471139907837d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03924471139907837d + "'", double4 == 0.03924471139907837d);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.Code code4 = faker0.code();
        com.github.javafaker.Name name5 = faker0.name();
        java.lang.String str7 = faker0.regexify("chinese (china)");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chinese china" + "'", str7, "chinese china");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale0.getDisplayLanguage(locale1);
        java.lang.String str4 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587" + "'", str3, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra" + "'", str4, "fra");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CHN");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chn");
        org.junit.Assert.assertNotNull(strSet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Jargon chinook" + "'", str3, "Jargon chinook");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.util.Locale.Builder builder9 = builder4.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("Japan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setScript("US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
        java.lang.String str30 = locale15.getDisplayLanguage();
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
// flaky:         org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.36546707f + "'", float21 == 0.36546707f);
        org.junit.Assert.assertNotNull(intStream22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1310607558 + "'", int23 == 1310607558);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fran\347ais" + "'", str26, "fran\347ais");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr" + "'", str28, "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "french" + "'", str29, "french");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fran\347ais" + "'", str30, "fran\347ais");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.App app3 = faker1.app();
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(app3);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.util.Locale locale3 = new java.util.Locale("", "fr", "");
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str6 = locale3.getExtension('u');
        java.lang.String str7 = locale3.getDisplayScript();
        java.lang.String str8 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA" + "'", str4, "FRA");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR" + "'", str8, "FR");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FRA", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.Hacker hacker7 = faker6.hacker();
        com.github.javafaker.App app8 = faker6.app();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(app8);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company5 = faker4.company();
        com.github.javafaker.Company company6 = faker4.company();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        java.util.stream.IntStream intStream36 = random1.ints((-1501435335), 1715556003);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1157793070) + "'", int15 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-42, -97, -43]");
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertNotNull(intStream36);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Company company5 = faker0.company();
        java.lang.String str7 = faker0.bothify("ita");
        com.github.javafaker.App app8 = faker0.app();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker0.resolve("Italienisch");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ita" + "'", str7, "ita");
        org.junit.Assert.assertNotNull(app8);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.util.Random random1 = new java.util.Random((long) (-1165217776));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = random1.ints((long) (-750638973));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        java.lang.String str44 = locale39.getDisplayLanguage();
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
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        java.util.Locale locale1 = new java.util.Locale("en,CA");
        org.junit.Assert.assertEquals(locale1.toString(), "en,ca");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        java.lang.String str4 = faker2.numerify("Chine");
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chine" + "'", str4, "Chine");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("JA_JP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ja_jp");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        java.util.stream.LongStream longStream22 = random14.longs();
        java.util.Random random23 = new java.util.Random();
        java.util.stream.LongStream longStream26 = random23.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream28 = random23.doubles((long) '#');
        java.util.stream.DoubleStream doubleStream30 = random23.doubles((long) (short) 100);
        java.util.stream.LongStream longStream33 = random23.longs((long) (short) 0, (long) 190001823);
        java.util.stream.LongStream longStream34 = random23.longs();
        boolean boolean35 = random23.nextBoolean();
        java.util.Random random37 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream39 = random37.doubles((long) 10);
        int int40 = random37.nextInt();
        java.util.stream.DoubleStream doubleStream41 = random37.doubles();
        double double42 = random37.nextGaussian();
        int int43 = random37.nextInt();
        double double44 = random37.nextDouble();
        int int45 = random37.nextInt();
        java.util.Locale locale46 = java.util.Locale.PRC;
        java.lang.String str47 = locale46.getVariant();
        java.util.Random random49 = new java.util.Random(100L);
        double double50 = random49.nextGaussian();
        random49.setSeed((long) (-1157793070));
        double double53 = random49.nextGaussian();
        boolean boolean54 = random49.nextBoolean();
        com.github.javafaker.Faker faker55 = new com.github.javafaker.Faker(locale46, random49);
        com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker(random49);
        java.util.Random random58 = new java.util.Random((long) (short) 1);
        int int59 = random58.nextInt();
        java.util.stream.LongStream longStream63 = random58.longs(10L, 0L, (long) (short) 100);
        java.util.Random random65 = new java.util.Random(1L);
        java.util.Random random67 = new java.util.Random((long) (short) 1);
        java.util.Random random69 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream71 = random69.doubles((long) 10);
        int int72 = random69.nextInt();
        java.util.stream.DoubleStream doubleStream73 = random69.doubles();
        java.util.stream.IntStream intStream74 = random69.ints();
        java.util.Random random76 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream78 = random76.doubles((long) 10);
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random76.nextBytes(byteArray82);
        random69.nextBytes(byteArray82);
        random67.nextBytes(byteArray82);
        random65.nextBytes(byteArray82);
        random58.nextBytes(byteArray82);
        random49.nextBytes(byteArray82);
        random37.nextBytes(byteArray82);
        random23.nextBytes(byteArray82);
        random14.nextBytes(byteArray82);
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
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(longStream33);
        org.junit.Assert.assertNotNull(longStream34);
// flaky:         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleStream39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1157793070) + "'", int40 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.3325983427023256d) + "'", double42 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1408064384) + "'", int43 == (-1408064384));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.24411725056425315d + "'", double44 == 0.24411725056425315d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-778209333) + "'", int45 == (-778209333));
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.6246292191371761d + "'", double50 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.09760425216810112d + "'", double53 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1155869325) + "'", int59 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream63);
        org.junit.Assert.assertNotNull(doubleStream71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1157793070) + "'", int72 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream73);
        org.junit.Assert.assertNotNull(intStream74);
        org.junit.Assert.assertNotNull(doubleStream78);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[58, -16, 29]");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        java.lang.String str17 = locale0.getLanguage();
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.util.Random random19 = new java.util.Random();
        java.util.stream.LongStream longStream20 = random19.longs();
        java.util.stream.LongStream longStream22 = random19.longs(0L);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale18, random19);
        boolean boolean24 = random19.nextBoolean();
        double double25 = random19.nextDouble();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale0, random19);
        com.github.javafaker.Options options27 = faker26.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.85737354f + "'", float3 == 0.85737354f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1632609166 + "'", int5 == 1632609166);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr" + "'", str17, "fr");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(longStream22);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5864656599344277d + "'", double25 == 0.5864656599344277d);
        org.junit.Assert.assertNotNull(options27);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        java.util.Random random1 = new java.util.Random(0L);
        double double2 = random1.nextGaussian();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8025330637390305d + "'", double2 == 0.8025330637390305d);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
        java.util.Set<java.lang.String> strSet22 = locale13.getUnicodeLocaleKeys();
        java.lang.String str23 = locale13.getISO3Language();
        java.util.Locale.setDefault(locale13);
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
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        double double4 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) ' ');
        random1.setSeed((long) (-1155484576));
        int int9 = random1.nextInt();
        boolean boolean10 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1764305998) + "'", int9 == (-1764305998));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        java.util.Random random1 = new java.util.Random((long) 1947844456);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) (-1377016274));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        java.lang.String str16 = locale13.getDisplayCountry();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("_FR", (double) 1472231282);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.472231282E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        java.util.Locale locale3 = new java.util.Locale("\u610f\u5927\u5229\u6587", "CA", "JPN");
        org.junit.Assert.assertEquals(locale3.toString(), "\u610f\u5927\u5229\u6587_CA_JPN");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u6cd5\u6587,fran\347ais)", (double) 2025219429);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.025219429E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        java.util.Locale locale2 = new java.util.Locale("English United Kingdom", "fran\347ais");
        org.junit.Assert.assertEquals(locale2.toString(), "english united kingdom_FRAN\347AIS");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("Italian");
        java.lang.Class<?> wildcardClass10 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Internet internet6 = faker1.internet();
        java.lang.String str8 = faker1.numerify("french (FRA,und)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "french (FRA,und)" + "'", str8, "french (FRA,und)");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
        java.lang.String str13 = locale5.getScript();
        java.lang.String str15 = locale5.getExtension('a');
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Color color5 = faker0.color();
        java.lang.String str7 = faker0.bothify("China");
        com.github.javafaker.App app8 = faker0.app();
        com.github.javafaker.Address address9 = faker0.address();
        com.github.javafaker.Hacker hacker10 = faker0.hacker();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertNotNull(app8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        java.util.stream.LongStream longStream5 = random1.longs();
        float float6 = random1.nextFloat();
        int int7 = random1.nextInt();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1139614796) + "'", int7 == (-1139614796));
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale12 = builder10.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        float float7 = random1.nextFloat();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.44563425f + "'", float7 == 0.44563425f);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Code code3 = faker0.code();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Company company6 = faker0.company();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.util.Random random1 = new java.util.Random(0L);
        double double2 = random1.nextGaussian();
        boolean boolean3 = random1.nextBoolean();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream5 = random1.longs();
        double double6 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8025330637390305d + "'", double2 == 0.8025330637390305d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.9015460884175122d) + "'", double6 == (-0.9015460884175122d));
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
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
        java.lang.String str26 = locale19.getDisplayName();
        java.lang.String str27 = locale19.getDisplayCountry();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        boolean boolean8 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random0.doubles((long) (-417959428));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.3506906f + "'", float2 == 0.3506906f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        java.lang.String str22 = locale4.getDisplayCountry();
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
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        java.util.Locale locale3 = new java.util.Locale("fra (FRA,fr)", "German", "Italian");
        java.lang.String str4 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "fra (fra,fr)_GERMAN_Italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        java.util.Random random1 = new java.util.Random((long) 74589158);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (-1408064384), 0.5537882918690327d, (double) (-2065160384));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        java.util.Locale locale3 = new java.util.Locale("", "zh-CN", "jpn_HI! (CHINESE (CHINA))");
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.lang.String str12 = locale10.getExtension('x');
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.lang.String str15 = locale14.getLanguage();
        java.lang.String str16 = locale10.getDisplayScript(locale14);
        java.lang.String str17 = locale5.getDisplayCountry(locale10);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder18.setVariant("");
        java.util.Locale.Builder builder21 = builder18.clear();
        java.util.Locale locale22 = builder21.build();
        java.lang.String str23 = locale22.getCountry();
        java.lang.String str24 = locale5.getDisplayLanguage(locale22);
        java.lang.String str25 = locale5.getDisplayName();
        java.util.Random random26 = new java.util.Random();
        java.util.stream.LongStream longStream27 = random26.longs();
        float float28 = random26.nextFloat();
        java.util.stream.IntStream intStream29 = random26.ints();
        java.util.stream.LongStream longStream33 = random26.longs((long) '#', (long) (byte) 1, (long) 100);
        random26.setSeed((long) 591553211);
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale5, random26);
        java.util.Set<java.lang.String> strSet37 = locale5.getUnicodeLocaleKeys();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.lang.String str40 = locale38.getDisplayName(locale39);
        java.lang.String str41 = locale39.getDisplayCountry();
        java.util.Locale.Category category42 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet45 = locale43.getExtensionKeys();
        java.util.Locale.setDefault(category42, locale43);
        java.util.Locale locale47 = java.util.Locale.getDefault(category42);
        java.lang.String str49 = locale47.getExtension('a');
        java.lang.String str50 = locale47.getCountry();
        java.lang.String str51 = locale39.getDisplayCountry(locale47);
        java.lang.String str52 = locale5.getDisplayName(locale47);
        java.lang.String str53 = locale3.getDisplayCountry(locale47);
        java.lang.String str54 = locale47.getCountry();
        java.lang.String str55 = locale47.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "_ZH-CN_jpn_HI! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jpn_HI! (CHINESE (CHINA))" + "'", str4, "jpn_HI! (CHINESE (CHINA))");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fr" + "'", str15, "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "China" + "'", str17, "China");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chinese" + "'", str24, "Chinese");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinese (China)" + "'", str25, "Chinese (China)");
        org.junit.Assert.assertNotNull(longStream27);
// flaky:         org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.39380342f + "'", float28 == 0.39380342f);
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertNotNull(longStream33);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Englisch (Kanada)" + "'", str40, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.FORMAT + "'", category42.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(charSet45);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "chinois (Chine)" + "'", str52, "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ZH-CN" + "'", str53, "ZH-CN");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "fr" + "'", str55, "fr");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream12 = random1.longs((long) (-1528827163), (long) 1);
        java.util.stream.IntStream intStream15 = random1.ints(591553211, 2002825273);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random1);
        java.lang.String str18 = faker16.regexify("GB");
        com.github.javafaker.Business business19 = faker16.business();
        java.lang.String str21 = faker16.numerify("");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GB" + "'", str18, "GB");
        org.junit.Assert.assertNotNull(business19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
        java.lang.String str27 = locale14.getDisplayLanguage();
        java.util.Locale locale28 = locale14.stripExtensions();
        java.lang.String str29 = locale14.getDisplayVariant();
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.util.Random random31 = new java.util.Random();
        java.util.stream.LongStream longStream32 = random31.longs();
        float float33 = random31.nextFloat();
        java.util.stream.IntStream intStream34 = random31.ints();
        int int35 = random31.nextInt();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale30, random31);
        java.lang.String str37 = locale14.getDisplayName(locale30);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream32);
// flaky:         org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.47345078f + "'", float33 == 0.47345078f);
        org.junit.Assert.assertNotNull(intStream34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1190747935 + "'", int35 == 1190747935);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
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
        java.util.stream.DoubleStream doubleStream41 = random0.doubles();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-490070307) + "'", int4 == (-490070307));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.6308012667826332d) + "'", double5 == (-0.6308012667826332d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1155869325) + "'", int10 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1157793070) + "'", int23 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[114, 116, -108]");
        org.junit.Assert.assertNotNull(doubleStream41);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((long) (short) 10);
        int int9 = random0.nextInt();
        long long10 = random0.nextLong();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.25048143f + "'", float2 == 0.25048143f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1596189641 + "'", int4 == 1596189641);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1947844456 + "'", int9 == 1947844456);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 7778920967000952751L + "'", long10 == 7778920967000952751L);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        java.util.Random random1 = new java.util.Random((long) 190001823);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        java.util.Random random1 = new java.util.Random((long) 33);
        float float2 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.72801155f + "'", float2 == 0.72801155f);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        java.util.stream.IntStream intStream8 = random1.ints(1397386546144374610L, 14, 1991855488);
        boolean boolean9 = random1.nextBoolean();
        random1.setSeed((long) (-91063411));
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ZH-CN");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        java.util.Random random1 = new java.util.Random((long) (-290302496));
        // The following exception was thrown during execution in test generation
        try {
            int int3 = random1.nextInt((-266083962));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale0.getExtension('a');
        java.util.Random random4 = new java.util.Random((-4071542935431320084L));
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random4);
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber();
        com.github.javafaker.Options options7 = faker5.options();
        com.github.javafaker.Book book8 = faker5.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getScript();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet7 = locale5.getExtensionKeys();
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale locale9 = java.util.Locale.getDefault(category4);
        java.util.Locale locale10 = java.util.Locale.getDefault(category4);
        java.util.Locale locale11 = java.util.Locale.getDefault(category4);
        java.util.Locale locale12 = java.util.Locale.getDefault(category4);
        java.util.Locale locale13 = java.util.Locale.getDefault(category4);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale16 = null;
        java.lang.String str17 = null; // flaky: locale15.getDisplayScript(locale16);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet21 = locale19.getExtensionKeys();
        java.util.Locale.setDefault(category18, locale19);
        java.util.Locale locale23 = java.util.Locale.getDefault(category18);
        java.lang.String str25 = locale23.getExtension('a');
        java.lang.String str26 = locale23.getCountry();
        boolean boolean27 = locale23.hasExtensions();
        java.lang.String str28 = locale15.getDisplayScript(locale23);
        java.util.Locale.setDefault(category4, locale23);
        java.util.Locale.Category category30 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale31 = java.util.Locale.getDefault(category30);
        java.util.Locale locale32 = java.util.Locale.PRC;
        java.lang.String str33 = locale32.getVariant();
        java.util.Random random35 = new java.util.Random(100L);
        double double36 = random35.nextGaussian();
        random35.setSeed((long) (-1157793070));
        double double39 = random35.nextGaussian();
        boolean boolean40 = random35.nextBoolean();
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale32, random35);
        java.util.Locale.setDefault(category30, locale32);
        java.lang.String str44 = locale32.getExtension('a');
        java.util.Locale.setDefault(category4, locale32);
        java.lang.String str46 = locale0.getDisplayVariant(locale32);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-TW" + "'", str1, "zh-TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category30.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6246292191371761d + "'", double36 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.09760425216810112d + "'", double39 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getCountry();
        java.util.Random random3 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream5 = random3.doubles((long) 10);
        int int6 = random3.nextInt();
        java.util.stream.DoubleStream doubleStream7 = random3.doubles();
        double double8 = random3.nextGaussian();
        int int9 = random3.nextInt();
        double double10 = random3.nextDouble();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random3);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale.Builder builder15 = builder12.clear();
        java.util.Locale.Builder builder17 = builder12.setScript("");
        java.util.Locale.Builder builder19 = builder17.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder22 = builder17.setExtension('u', "");
        java.util.Locale.Builder builder25 = builder22.setExtension('u', "");
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet29 = locale27.getExtensionKeys();
        java.util.Locale.setDefault(category26, locale27);
        java.util.Locale locale31 = java.util.Locale.getDefault(category26);
        java.util.Locale locale32 = java.util.Locale.getDefault(category26);
        java.util.Locale locale33 = java.util.Locale.getDefault(category26);
        java.util.Locale locale34 = java.util.Locale.getDefault(category26);
        java.util.Locale.Builder builder35 = builder22.setLocale(locale34);
        java.util.Set<java.lang.String> strSet36 = locale34.getUnicodeLocaleKeys();
        boolean boolean37 = locale34.hasExtensions();
        java.lang.String str38 = locale0.getDisplayName(locale34);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1157793070) + "'", int6 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.3325983427023256d) + "'", double8 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1408064384) + "'", int9 == (-1408064384));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.24411725056425315d + "'", double10 == 0.24411725056425315d);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
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
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fran\347ais" + "'", str38, "fran\347ais");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        java.util.Locale locale2 = new java.util.Locale("japonais (Japon)", "en,CA");
        org.junit.Assert.assertEquals(locale2.toString(), "japonais (japon)_EN,CA");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale.Builder builder12 = builder7.setExtension('u', "Japan");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale.Builder builder15 = builder12.setLanguageTag("zh-TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder12.setScript("english united kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: english united kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        java.util.Random random1 = new java.util.Random((long) 190001823);
        java.util.stream.IntStream intStream3 = random1.ints((long) 1894354479);
        java.util.stream.IntStream intStream4 = random1.ints();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 336522226);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random1.longs((-845881371119552628L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("GB");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("english united kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: english united kingdom [at index 0]");
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
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder11 = builder5.setLanguage("");
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale13 = java.util.Locale.getDefault(category12);
        java.util.Locale locale14 = java.util.Locale.getDefault(category12);
        java.util.Locale locale15 = java.util.Locale.JAPAN;
        java.lang.String str16 = locale15.getDisplayScript();
        java.lang.String str17 = locale15.getDisplayScript();
        java.util.Locale locale21 = new java.util.Locale("", "", "");
        java.lang.String str23 = locale21.getExtension('x');
        java.util.Locale.setDefault(locale21);
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.lang.String str26 = locale21.getDisplayLanguage(locale25);
        java.lang.String str27 = locale25.getDisplayVariant();
        java.lang.String str28 = locale15.getDisplayCountry(locale25);
        java.util.Locale.setDefault(category12, locale15);
        java.lang.String str30 = locale15.toLanguageTag();
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder31.setVariant("");
        java.util.Locale.Builder builder35 = builder31.setVariant("");
        java.util.Locale locale36 = builder35.build();
        java.util.Locale locale39 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str40 = locale36.getDisplayCountry(locale39);
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Category category42 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category42, locale46);
        java.util.Locale.Builder builder48 = builder41.setLocale(locale46);
        java.lang.String str49 = locale46.getScript();
        java.lang.String str50 = locale36.getDisplayCountry(locale46);
        java.lang.String str51 = locale15.getDisplayLanguage(locale36);
        java.util.Locale.Builder builder52 = builder11.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder55 = builder52.setUnicodeLocaleKeyword("JA_JP", "anglais (Royaume-Uni)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: JA_JP [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Japon" + "'", str28, "Japon");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ja-JP" + "'", str30, "ja-JP");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals(locale39.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.FORMAT + "'", category42.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Japanese" + "'", str51, "Japanese");
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) (-750638973), (double) 0.57876664f, (double) 643247446);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Company company6 = faker0.company();
        java.lang.String str8 = faker0.regexify("");
        com.github.javafaker.Code code9 = faker0.code();
        java.lang.Class<?> wildcardClass10 = faker0.getClass();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("chinese", strMap1);
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.lang.String str12 = locale3.getDisplayCountry(locale9);
        java.util.Set<java.lang.String> strSet13 = locale3.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet13);
        org.junit.Assert.assertNotNull(languageRangeList2);
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
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        random0.setSeed((long) 591553211);
        java.util.stream.LongStream longStream10 = random0.longs();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.48496795f + "'", float2 == 0.48496795f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale.Builder builder12 = builder7.setExtension('u', "Japan");
        java.util.Locale.Builder builder14 = builder7.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder7.setVariant("tw");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: tw [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        java.util.Random random1 = new java.util.Random((long) 1107254586);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        java.util.Random random18 = new java.util.Random(1L);
        java.util.Random random20 = new java.util.Random((long) (short) 1);
        java.util.Random random22 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream24 = random22.doubles((long) 10);
        int int25 = random22.nextInt();
        java.util.stream.DoubleStream doubleStream26 = random22.doubles();
        java.util.stream.IntStream intStream27 = random22.ints();
        java.util.Random random29 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream31 = random29.doubles((long) 10);
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random29.nextBytes(byteArray35);
        random22.nextBytes(byteArray35);
        random20.nextBytes(byteArray35);
        random18.nextBytes(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(locale4, random18);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
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
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1157793070) + "'", int25 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[115, -43, 26]");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        int int7 = random1.nextInt();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream9 = random1.ints();
        random1.setSeed((long) 24);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.3325983427023256d) + "'", double6 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1408064384) + "'", int7 == (-1408064384));
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        java.util.Random random1 = new java.util.Random((-5264020926839611059L));
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        java.util.Locale locale2 = new java.util.Locale("DE", "italien (Italie)");
        org.junit.Assert.assertEquals(locale2.toString(), "de_ITALIEN (ITALIE)");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
            com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale25);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
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
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u6cd5\u6587,fran\347ais)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=twn (??,franc?ais)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        java.util.Locale locale3 = new java.util.Locale("US", "italien", "Chinesisch (Taiwan)");
        org.junit.Assert.assertEquals(locale3.toString(), "us_ITALIEN_Chinesisch (Taiwan)");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        java.util.Locale locale72 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleKeys();
        java.lang.String str75 = locale72.getExtension('x');
        java.util.Locale.Builder builder76 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder78 = builder76.setVariant("");
        java.util.Locale.Builder builder79 = builder76.clear();
        java.util.Locale.Builder builder81 = builder76.setScript("");
        java.util.Locale locale82 = builder76.build();
        java.lang.String str83 = locale72.getDisplayLanguage(locale82);
        java.util.Set<java.lang.String> strSet84 = locale72.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet84);
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
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Chinese" + "'", str83, "Chinese");
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNotNull(strList85);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        int int3 = random1.nextInt(102643840);
        java.util.stream.LongStream longStream6 = random1.longs((long) (-2058711394), (long) 2002825273);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10846315 + "'", int3 == 10846315);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker8 = faker7.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("ITA");
        java.lang.String str4 = locale0.getDisplayCountry(locale3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        java.util.Random random1 = new java.util.Random((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random1.ints((-1631086829), (-1656932537));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
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
        com.github.javafaker.Address address19 = faker15.address();
        com.github.javafaker.Number number20 = faker15.number();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0787065f + "'", float11 == 0.0787065f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1853047068 + "'", int13 == 1853047068);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en_GB" + "'", str18, "en_GB");
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(number20);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        java.util.Locale locale3 = new java.util.Locale("italien (Italie)", "italien Italie", "\u610f\u5927\u5229\u6587");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        java.util.Locale.Builder builder25 = builder22.clear();
        java.util.Locale.Builder builder27 = builder22.setScript("");
        java.util.Locale.Builder builder29 = builder27.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder32 = builder27.setExtension('u', "");
        java.util.Locale.Builder builder35 = builder32.setExtension('u', "");
        java.util.Locale locale36 = builder32.build();
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder37.setVariant("");
        java.util.Locale.Builder builder40 = builder39.clearExtensions();
        java.util.Locale locale41 = builder39.build();
        java.lang.String str42 = locale36.getDisplayVariant(locale41);
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.lang.String str47 = locale41.getDisplayLanguage(locale46);
        java.util.Locale locale50 = new java.util.Locale("zh-cn", "");
        java.lang.String str52 = locale50.getExtension('x');
        java.lang.String str53 = locale46.getDisplayName(locale50);
        java.util.Locale.setDefault(category0, locale50);
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale50.toString(), "zh-cn");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale0.getExtension('a');
        java.util.Random random4 = new java.util.Random((-4071542935431320084L));
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random4);
        com.github.javafaker.Hacker hacker6 = faker5.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
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
        java.lang.String str20 = locale5.getDisplayScript();
        java.lang.String str21 = locale5.getISO3Country();
        java.lang.String str23 = locale5.getExtension('a');
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
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
        java.util.Locale.Builder builder27 = builder6.setExtension('a', "und_FRA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder29 = builder6.setLanguage("cor\351en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: core?en [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
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
// flaky:         org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.36409628f + "'", float18 == 0.36409628f);
        org.junit.Assert.assertNotNull(intStream19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1781238191) + "'", int20 == (-1781238191));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "French" + "'", str23, "French");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        java.util.Random random1 = new java.util.Random((-4947896108136290151L));
        double double2 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8526649592391055d + "'", double2 == 0.8526649592391055d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
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
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.lang.String str15 = locale13.getExtension('a');
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder16.setVariant("");
        java.util.Locale.Builder builder19 = builder16.clear();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale20.getDisplayName(locale21);
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleKeys();
        java.lang.String str25 = locale21.getExtension('a');
        boolean boolean26 = locale21.hasExtensions();
        java.util.Set<java.lang.Character> charSet27 = locale21.getExtensionKeys();
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.lang.String str30 = locale28.getDisplayName(locale29);
        java.lang.String str31 = locale21.getDisplayName(locale29);
        java.lang.String str32 = locale13.getDisplayCountry(locale21);
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale34 = java.util.Locale.PRC;
        java.lang.String str35 = locale34.getVariant();
        java.util.Random random37 = new java.util.Random(100L);
        double double38 = random37.nextGaussian();
        random37.setSeed((long) (-1157793070));
        double double41 = random37.nextGaussian();
        boolean boolean42 = random37.nextBoolean();
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(locale34, random37);
        java.util.Locale locale44 = java.util.Locale.FRENCH;
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.lang.String str50 = locale48.getExtension('x');
        java.lang.String str51 = locale44.getDisplayName(locale48);
        java.lang.String str53 = locale44.getExtension('x');
        java.util.Locale locale55 = new java.util.Locale("fra");
        java.lang.String str56 = locale44.getDisplayScript(locale55);
        java.util.Locale locale57 = locale44.stripExtensions();
        java.lang.String str58 = locale34.getDisplayScript(locale57);
        java.lang.String str59 = locale34.getScript();
        java.util.Locale locale63 = new java.util.Locale("x-lvariant-JPN", "jpn", "\u6cd5\u56fd");
        java.lang.String str64 = locale34.getDisplayName(locale63);
        java.util.Locale locale68 = new java.util.Locale("", "", "");
        java.lang.String str70 = locale68.getExtension('x');
        java.util.Locale.setDefault(locale68);
        java.util.Locale locale72 = java.util.Locale.FRENCH;
        java.lang.String str73 = locale68.getDisplayLanguage(locale72);
        java.lang.String str74 = locale68.getISO3Language();
        java.lang.String str75 = locale68.getDisplayLanguage();
        java.lang.String str76 = locale34.getDisplayScript(locale68);
        java.util.Locale.setDefault(category0, locale68);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6246292191371761d + "'", double6 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.09760425216810112d + "'", double9 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Englisch (Kanada)" + "'", str30, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Italienisch" + "'", str31, "Italienisch");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.6246292191371761d + "'", double38 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.09760425216810112d + "'", double41 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "French" + "'", str51, "French");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals(locale55.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Chinese (China)" + "'", str64, "Chinese (China)");
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        java.util.Locale locale3 = new java.util.Locale("Chinese (China)", "italien (Italie)", "Chinese");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "chinese (china)_ITALIEN (ITALIE)_Chinese");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chinese (china)" + "'", str4, "chinese (china)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und-Chinese" + "'", str5, "und-Chinese");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        java.lang.String str6 = faker0.regexify("\u6cd5\u6587");
        com.github.javafaker.Business business7 = faker0.business();
        com.github.javafaker.Options options8 = faker0.options();
        com.github.javafaker.Finance finance9 = faker0.finance();
        com.github.javafaker.Lorem lorem10 = faker0.lorem();
        java.lang.String str12 = faker0.bothify("italien (italie)");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italien (italie)" + "'", str12, "italien (italie)");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale0);
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "zh_CN");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale0.getExtension('a');
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale7.getDisplayName(locale8);
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str12 = locale8.getExtension('a');
        boolean boolean13 = locale8.hasExtensions();
        java.util.Set<java.lang.Character> charSet14 = locale8.getExtensionKeys();
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.lang.String str17 = locale15.getDisplayName(locale16);
        java.lang.String str18 = locale8.getDisplayName(locale16);
        java.lang.String str19 = locale0.getDisplayCountry(locale8);
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder21.setVariant("");
        java.util.Locale.Builder builder24 = builder21.clear();
        java.util.Locale locale25 = builder24.build();
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.lang.String str27 = locale26.getLanguage();
        java.util.Locale.Builder builder28 = builder24.setLocale(locale26);
        java.lang.String str29 = locale20.getDisplayCountry(locale26);
        java.lang.String str30 = locale20.getDisplayName();
        java.lang.String str31 = locale20.getScript();
        java.util.Locale.setDefault(locale20);
        java.lang.String str33 = locale8.getDisplayLanguage(locale20);
        java.lang.Object obj34 = null;
        boolean boolean35 = locale20.equals(obj34);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Englisch (Kanada)" + "'", str17, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italienisch" + "'", str18, "Italienisch");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fr" + "'", str27, "fr");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str30, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "italiano" + "'", str33, "italiano");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream12 = random1.longs(0L);
        java.util.stream.DoubleStream doubleStream13 = random1.doubles();
        java.util.stream.LongStream longStream15 = random1.longs(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream19 = random1.doubles((-6139822020582680716L), (double) 0.42169613f, 1.1876021058094577d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder0.setLanguage("ja");
        java.util.Locale.Builder builder11 = builder0.setVariant("Chinese");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        java.util.stream.LongStream longStream3 = random0.longs(0L);
        int int5 = random0.nextInt(44);
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.IntStream intStream8 = random0.ints((long) 112184576);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        java.util.Locale locale1 = new java.util.Locale("us");
        org.junit.Assert.assertEquals(locale1.toString(), "us");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
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
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet23 = locale21.getExtensionKeys();
        java.lang.String str24 = locale19.getDisplayLanguage(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = locale19.getUnicodeLocaleType("\u97d3\u6587,fra (FRA,fr))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: english united kingdom (??,fra (FRA,fr))");
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        java.util.Random random1 = new java.util.Random((long) 102643840);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) (-474113270), (long) (-1946189265), (long) 200959200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream5 = random0.ints();
        double double6 = random0.nextDouble();
        int int7 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((double) (-8040985019838370092L), (double) (-4797905507370029140L));
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9842211f + "'", float2 == 0.9842211f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8250984731437457d + "'", double6 == 0.8250984731437457d);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 867354708 + "'", int7 == 867354708);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber();
        com.github.javafaker.Name name8 = faker6.name();
        com.github.javafaker.Address address9 = faker6.address();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker6.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5853443f + "'", float3 == 0.5853443f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 113560932 + "'", int5 == 113560932);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u56fd", "X-LVARIANT-JPN", "CHINA");
        org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u56fd_X-LVARIANT-JPN_CHINA");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        int int7 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        random1.setSeed((long) (-1690734402));
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.3325983427023256d) + "'", double6 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1408064384) + "'", int7 == (-1408064384));
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        java.util.Locale locale2 = new java.util.Locale("italiano", "italien Italie");
        org.junit.Assert.assertEquals(locale2.toString(), "italiano_ITALIEN ITALIE");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        java.util.Random random1 = new java.util.Random((-3109364765729502342L));
        java.util.stream.IntStream intStream2 = random1.ints();
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        java.util.stream.DoubleStream doubleStream17 = random9.doubles();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.10288149f + "'", float11 == 0.10288149f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-23211725) + "'", int13 == (-23211725));
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((long) (short) 10);
        double double9 = random0.nextGaussian();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        java.lang.String str12 = faker10.regexify("");
        com.github.javafaker.Color color13 = faker10.color();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.274913E-4f + "'", float2 == 8.274913E-4f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-904664817) + "'", int4 == (-904664817));
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.4996932076353699d) + "'", double9 == (-0.4996932076353699d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Address address5 = faker0.address();
        java.lang.String str7 = faker0.numerify("Englisch (Kanada)");
        java.lang.Class<?> wildcardClass8 = faker0.getClass();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Englisch (Kanada)" + "'", str7, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getDisplayScript();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("und");
        java.lang.String str9 = locale7.getExtension('u');
        java.lang.String str10 = locale0.getDisplayScript(locale7);
        java.util.Locale locale11 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "inglese" + "'", str4, "inglese");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale7.toString(), "und");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getCountry();
        java.util.Set<java.lang.Character> charSet10 = locale7.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        java.util.Locale locale3 = new java.util.Locale("Korean South Korea", "francese", "hi! ITALIEN ITALIE,fr");
        org.junit.Assert.assertEquals(locale3.toString(), "korean south korea_FRANCESE_hi! ITALIEN ITALIE,fr");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
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
        java.util.Locale.Builder builder15 = builder11.setExtension('u', "CHN");
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
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale.Builder builder7 = builder2.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder2.setLanguageTag("fr");
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale13.getExtension('x');
        java.util.Locale.setDefault(locale13);
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale13.getDisplayLanguage(locale17);
        boolean boolean19 = locale17.hasExtensions();
        java.lang.String str20 = locale17.getDisplayVariant();
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.util.Random random22 = new java.util.Random();
        java.util.stream.LongStream longStream23 = random22.longs();
        java.util.stream.LongStream longStream25 = random22.longs(0L);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale21, random22);
        java.lang.String str27 = locale17.getDisplayVariant(locale21);
        java.util.Locale.Builder builder28 = builder2.setLocale(locale17);
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("GBR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("FRA (FRA,FR)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: FRA (FRA,FR) [at index 0]");
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
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Company company7 = faker0.company();
        com.github.javafaker.Book book8 = faker0.book();
        java.lang.String str10 = faker0.numerify("hi! (ITALIEN (ITALIE),fr)");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! (ITALIEN (ITALIE),fr)" + "'", str10, "hi! (ITALIEN (ITALIE),fr)");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
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
        boolean boolean25 = locale22.hasExtensions();
        java.util.Set<java.lang.String> strSet26 = locale22.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale22);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("x-lvariant-FRA");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        java.util.Locale locale3 = new java.util.Locale("cinese (Cina)", "", "");
        org.junit.Assert.assertEquals(locale3.toString(), "cinese (cina)");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.util.Random random1 = new java.util.Random((long) (-1974675131));
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u610f\u5927\u5229\u6587", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        java.util.Locale locale2 = new java.util.Locale("CHINA", "hi! (HI!,zh-CN)");
        org.junit.Assert.assertEquals(locale2.toString(), "china_HI! (HI!,ZH-CN)");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale1.getUnicodeLocaleType("Catalan (EN,JP)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Catalan (EN,JP)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italian" + "'", str12, "Italian");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.LongStream longStream10 = random0.longs((long) (-266083962), (long) 'a');
        java.util.stream.LongStream longStream14 = random0.longs((long) (byte) 100, (long) (-196947104), (long) (byte) -1);
        java.util.stream.DoubleStream doubleStream15 = random0.doubles();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random0);
        random0.setSeed((long) (-1855441849));
        long long19 = random0.nextLong();
        java.util.stream.LongStream longStream22 = random0.longs((long) 1949998615, 4233101705359871616L);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.13212204f + "'", float2 == 0.13212204f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 8685573510398654877L + "'", long19 == 8685573510398654877L);
        org.junit.Assert.assertNotNull(longStream22);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        java.util.Locale locale2 = new java.util.Locale("TW", "Korean (South Korea)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for KOREAN (SOUTH KOREA)");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "tw_KOREAN (SOUTH KOREA)");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Englisch (Kanada)");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet6 = faker5.internet();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(internet6);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        com.github.javafaker.Lorem lorem19 = faker15.lorem();
        java.lang.String str21 = faker15.bothify("Englisch (Kanada)");
        com.github.javafaker.Code code22 = faker15.code();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.79083204f + "'", float11 == 0.79083204f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 312815676 + "'", int13 == 312815676);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNotNull(business18);
        org.junit.Assert.assertNotNull(lorem19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Englisch (Kanada)" + "'", str21, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(code22);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
            java.util.Locale.Builder builder17 = builder15.setScript("EN,CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: EN,CA [at index 0]");
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
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder2.build();
        java.lang.String str6 = locale4.getUnicodeLocaleType("JP");
        java.util.Locale locale9 = new java.util.Locale("x-lvariant-jpn", "anglais");
        java.lang.String str10 = locale4.getDisplayLanguage(locale9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals(locale9.toString(), "x-lvariant-jpn_ANGLAIS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str8 = locale4.getUnicodeLocaleType("fr");
        java.util.Locale locale9 = locale4.stripExtensions();
        java.lang.String str10 = locale9.getDisplayCountry();
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
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream12 = random1.longs(0L);
        random1.setSeed((long) (byte) -1);
        java.util.stream.LongStream longStream15 = random1.longs();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        java.util.Random random1 = new java.util.Random((long) (-268554284));
        float float2 = random1.nextFloat();
        boolean boolean3 = random1.nextBoolean();
        boolean boolean4 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = random1.nextInt((-1030689906));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.24406683f + "'", float2 == 0.24406683f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Color color7 = faker0.color();
        java.lang.String str9 = faker0.letterify("US");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "US" + "'", str9, "US");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream6 = random0.ints((long) 1);
        java.util.Random random7 = new java.util.Random();
        java.util.stream.LongStream longStream10 = random7.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) '#');
        java.util.Random random14 = new java.util.Random(1L);
        java.util.Random random16 = new java.util.Random((long) (short) 1);
        java.util.Random random18 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles((long) 10);
        int int21 = random18.nextInt();
        java.util.stream.DoubleStream doubleStream22 = random18.doubles();
        java.util.stream.IntStream intStream23 = random18.ints();
        java.util.Random random25 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream27 = random25.doubles((long) 10);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random25.nextBytes(byteArray31);
        random18.nextBytes(byteArray31);
        random16.nextBytes(byteArray31);
        random14.nextBytes(byteArray31);
        random7.nextBytes(byteArray31);
        random0.nextBytes(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream41 = random0.ints((long) 387629116, 1839438880, (-750638973));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.96863925f + "'", float2 == 0.96863925f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1157793070) + "'", int21 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(byteArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[104, 64, 47]");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        java.util.Locale locale3 = new java.util.Locale("und", "de", "fr");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.lang.String str10 = locale8.getExtension('x');
        java.lang.String str11 = locale4.getDisplayVariant(locale8);
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale8.getDisplayScript(locale12);
        java.util.Locale locale14 = locale12.stripExtensions();
        java.lang.String str15 = locale3.getDisplayLanguage(locale14);
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getVariant();
        java.util.Random random21 = new java.util.Random(100L);
        double double22 = random21.nextGaussian();
        random21.setSeed((long) (-1157793070));
        double double25 = random21.nextGaussian();
        boolean boolean26 = random21.nextBoolean();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale18, random21);
        java.util.Locale.setDefault(category16, locale18);
        java.util.Random random30 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream31 = random30.ints();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale18, random30);
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(locale18);
        java.lang.String str35 = locale3.getDisplayName(locale18);
        java.util.Locale locale38 = new java.util.Locale("_FR", "ita");
        java.lang.String str39 = locale18.getDisplayCountry(locale38);
        org.junit.Assert.assertEquals(locale3.toString(), "und_DE_fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u672a\u5b9a\u8bed\u79cd" + "'", str15, "\u672a\u5b9a\u8bed\u79cd");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6246292191371761d + "'", double22 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.09760425216810112d + "'", double25 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intStream31);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)" + "'", str35, "\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)");
        org.junit.Assert.assertEquals(locale38.toString(), "_fr_ITA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
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
        java.lang.String str20 = faker18.numerify("zh-TW");
        com.github.javafaker.Business business21 = faker18.business();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh-TW" + "'", str20, "zh-TW");
        org.junit.Assert.assertNotNull(business21);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale locale8 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder4.setVariant("x-lvariant-jpn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: x-lvariant-jpn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("fr");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setScript("Cina");
        java.util.Locale locale11 = builder10.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr__#Cina");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Random random3 = new java.util.Random();
        java.util.stream.LongStream longStream6 = random3.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Book book9 = faker8.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        java.util.Locale locale2 = new java.util.Locale("UNDETERMINED", "CAN");
        org.junit.Assert.assertEquals(locale2.toString(), "undetermined_CAN");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company8 = faker7.company();
        com.github.javafaker.Internet internet9 = faker7.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(internet9);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        random1.setSeed((long) 1408303951);
        java.util.stream.IntStream intStream8 = random1.ints((long) 867354708);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random1.doubles((double) (-4947896108136290151L), (double) (-6047590478893910070L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        java.util.Locale locale3 = new java.util.Locale("zho", "\u97d3\u6587", "TWN");
        boolean boolean4 = locale3.hasExtensions();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u97d3\u6587_TWN");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
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
        java.util.Locale locale28 = new java.util.Locale("zh-cn", "");
        java.lang.String str30 = locale28.getExtension('x');
        java.lang.String str31 = locale24.getDisplayName(locale28);
        java.util.Locale locale32 = locale28.stripExtensions();
        java.util.Locale.Builder builder33 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder33.setVariant("");
        java.util.Locale.Builder builder37 = builder35.setVariant("");
        java.util.Locale.Builder builder39 = builder35.setLanguage("French");
        java.util.Locale locale40 = builder39.build();
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleKeys();
        java.lang.String str42 = locale40.getDisplayLanguage();
        java.lang.String str43 = locale40.getDisplayScript();
        java.lang.String str44 = locale28.getDisplayCountry(locale40);
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
        org.junit.Assert.assertEquals(locale28.toString(), "zh-cn");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh-cn");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "french");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "french" + "'", str42, "french");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        java.util.Locale locale1 = new java.util.Locale("Chine");
        java.lang.String str3 = locale1.getExtension('a');
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "chine");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder5.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Set<java.lang.String> strSet7 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = new java.util.Locale("ENGLISH", "Chinese");
        java.lang.String str11 = locale0.getDisplayVariant(locale10);
        java.lang.String str12 = locale10.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals(locale10.toString(), "english_CHINESE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english (CHINESE)" + "'", str12, "english (CHINESE)");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder5.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder10.build();
        java.util.Locale.Builder builder14 = builder10.setLanguageTag("cn");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ja-JP", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        java.lang.String str25 = locale23.getCountry();
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
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder10.setScript("zh,cn (ITALIENISCH)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh,cn (ITALIENISCH) [at index 0]");
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
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder8 = builder0.setLanguageTag("Japon");
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("JAPAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setVariant("Korean South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Korean South Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        int int11 = random1.nextInt(2027332310);
        java.util.stream.IntStream intStream12 = random1.ints();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1552812408 + "'", int11 == 1552812408);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u6587,fran\347ais)", "deu", "zh,cn (ITALIENISCH)");
        org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587,fran\347ais)_DEU_zh,cn (ITALIENISCH)");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        java.util.Random random1 = new java.util.Random(8220501950349663546L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = random1.ints((long) (-1810696907));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr", strMap1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode5 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList6 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet4, filteringMode5);
        java.util.Collection<java.util.Locale> localeCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList8 = java.util.Locale.filter(languageRangeList2, localeCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + filteringMode5 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode5.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        java.lang.String str6 = faker0.regexify("\u6cd5\u6587");
        com.github.javafaker.Business business7 = faker0.business();
        java.lang.String str9 = faker0.numerify("anglais (Royaume-Uni)");
        com.github.javafaker.PhoneNumber phoneNumber10 = faker0.phoneNumber();
        com.github.javafaker.Business business11 = faker0.business();
        com.github.javafaker.Code code12 = faker0.code();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "anglais (Royaume-Uni)" + "'", str9, "anglais (Royaume-Uni)");
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(code12);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        java.util.Locale locale1 = new java.util.Locale("x-lvariant-FRA");
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale7 = java.util.Locale.getDefault(category2);
        java.lang.String str9 = locale7.getExtension('a');
        java.lang.String str10 = locale7.getCountry();
        boolean boolean11 = locale7.hasExtensions();
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale7.getDisplayVariant(locale12);
        java.util.Set<java.lang.String> strSet14 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale1.getDisplayCountry(locale7);
        org.junit.Assert.assertEquals(locale1.toString(), "x-lvariant-fra");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setRegion("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.LongStream longStream9 = random8.longs();
        float float10 = random8.nextFloat();
        java.util.stream.IntStream intStream11 = random8.ints();
        int int12 = random8.nextInt();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale7, random8);
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.lang.String str15 = locale14.getDisplayName();
        java.lang.String str16 = locale7.getDisplayName(locale14);
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder17.setVariant("");
        java.util.Locale.Builder builder20 = builder17.clear();
        java.util.Locale.Builder builder22 = builder20.setScript("");
        java.util.Locale locale23 = builder22.build();
        java.lang.String str24 = locale7.getDisplayVariant(locale23);
        java.util.Locale.Builder builder25 = builder5.setLocale(locale7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.89965737f + "'", float10 == 0.89965737f);
        org.junit.Assert.assertNotNull(intStream11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-105070952) + "'", int12 == (-105070952));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "French" + "'", str15, "French");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "italien (Italie)" + "'", str16, "italien (Italie)");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        java.util.Locale locale1 = new java.util.Locale("Italienisch");
        java.util.Locale locale5 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale5.getDisplayVariant();
        java.lang.String str8 = locale5.getISO3Country();
        java.lang.String str9 = locale1.getDisplayLanguage(locale5);
        org.junit.Assert.assertEquals(locale1.toString(), "italienisch");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italienisch" + "'", str9, "italienisch");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Company company6 = faker0.company();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getVariant();
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        java.lang.String str5 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CN" + "'", str5, "CN");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        java.util.Random random1 = new java.util.Random((long) (-1656932537));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        java.util.Locale locale3 = new java.util.Locale("\u53f0\u6e7e", "English (Canada)", "ita-x-lvariant-und");
        org.junit.Assert.assertEquals(locale3.toString(), "\u53f0\u6e7e_ENGLISH (CANADA)_ita-x-lvariant-und");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale17);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", (double) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=120.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        java.util.Locale locale2 = new java.util.Locale("\u82f1\u6587", "_FR");
        org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u6587__FR");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = builder3.build();
        java.lang.String str9 = locale8.getISO3Country();
        java.lang.String str10 = locale8.getCountry();
        java.lang.String str11 = locale8.getISO3Country();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        int int9 = random1.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random1.longs((long) 1802692291, (long) 44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4129126974821382d + "'", double7 == 0.4129126974821382d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1408064384) + "'", int9 == (-1408064384));
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        java.util.Locale locale1 = new java.util.Locale("Chinese");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str4 = locale1.getExtension('u');
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
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
        java.lang.String str16 = locale5.getISO3Language();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.057645977f + "'", float11 == 0.057645977f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1505131154 + "'", int13 == 1505131154);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fra" + "'", str16, "fra");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        java.util.Locale locale24 = locale20.stripExtensions();
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
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayScript(locale5);
        java.lang.String str14 = locale0.getExtension('u');
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.util.Locale locale17 = locale16.stripExtensions();
        java.util.Set<java.lang.Character> charSet18 = locale16.getExtensionKeys();
        java.util.Locale.setDefault(locale16);
        java.lang.String str20 = locale0.getDisplayScript(locale16);
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.lang.String str26 = locale24.getExtension('x');
        java.util.Locale.setDefault(locale24);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale24.getDisplayLanguage(locale28);
        boolean boolean30 = locale28.hasExtensions();
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder31.setVariant("");
        java.util.Locale.Builder builder35 = builder33.setVariant("");
        java.util.Locale.Builder builder37 = builder33.setLanguage("French");
        java.util.Locale locale38 = builder37.build();
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = locale38.getDisplayScript();
        java.lang.String str41 = locale28.getDisplayLanguage(locale38);
        java.lang.String str42 = locale16.getDisplayLanguage(locale28);
        java.lang.String str43 = locale28.getDisplayLanguage();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "french");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "French" + "'", str41, "French");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "French" + "'", str43, "French");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale5.getUnicodeLocaleType("\u97d3\u6587,fra (FRA,fr))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: english united kingdom (??,fra (FRA,fr))");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
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
            java.util.Locale.Builder builder16 = builder13.setVariant("en_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: en_CA [at index 0]");
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
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.Internet internet9 = faker8.internet();
        com.github.javafaker.Color color10 = faker8.color();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Number number2 = faker0.number();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(number2);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
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
        java.lang.String str17 = locale6.getISO3Country();
        java.lang.String str18 = locale6.getCountry();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber();
        com.github.javafaker.Name name8 = faker6.name();
        com.github.javafaker.Address address9 = faker6.address();
        com.github.javafaker.App app10 = faker6.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5339136f + "'", float3 == 0.5339136f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 508887558 + "'", int5 == 508887558);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(app10);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
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
        java.util.Locale locale33 = locale16.stripExtensions();
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
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
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
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ja_JP");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
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
        boolean boolean18 = locale15.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = locale15.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals(locale15.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FRA" + "'", str17, "FRA");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder0.clear();
        java.util.Locale.Builder builder10 = builder0.setLanguageTag("x-lvariant-fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setExtension('a', "x-lvariant-FRA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: x [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        com.github.javafaker.Company company7 = faker0.company();
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Number number9 = faker0.number();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        double double5 = random0.nextGaussian();
        float float6 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((double) (-8643194533869656942L), (double) 3781791188705226281L);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1968261884 + "'", int4 == 1968261884);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.724914733566298d) + "'", double5 == (-0.724914733566298d));
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.9855809f + "'", float6 == 0.9855809f);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.DateAndTime dateAndTime6 = faker5.date();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        java.lang.String str9 = faker5.bothify("\u4e2d\u6587");
        com.github.javafaker.Company company10 = faker5.company();
        java.lang.String str12 = faker5.bothify("inglese");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "inglese" + "'", str12, "inglese");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Business business6 = faker4.business();
        com.github.javafaker.Company company7 = faker4.company();
        com.github.javafaker.Options options8 = faker4.options();
        com.github.javafaker.Color color9 = faker4.color();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker4.phoneNumber();
        com.github.javafaker.Address address11 = faker4.address();
        com.github.javafaker.Hacker hacker12 = faker4.hacker();
        com.github.javafaker.Internet internet13 = faker4.internet();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(internet13);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        java.util.Locale locale1 = new java.util.Locale("GBR");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "gbr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinesisch Taiwan", 0.2658586601009726d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch taiwan");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale.Builder builder12 = builder7.setExtension('u', "Japan");
        java.util.Locale.Builder builder13 = builder7.clear();
        java.util.Locale.Builder builder16 = builder13.setExtension('x', "gb");
        java.util.Locale locale17 = builder16.build();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        java.util.Locale locale3 = new java.util.Locale("FRA", "FRA", "fr");
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.lang.String str5 = locale3.getDisplayName(locale4);
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
        java.util.Locale locale27 = locale9.stripExtensions();
        java.lang.String str28 = locale3.getDisplayScript(locale9);
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder29.setVariant("");
        java.util.Locale.Builder builder33 = builder31.setVariant("");
        java.util.Locale.Builder builder35 = builder31.setLanguage("French");
        java.util.Locale locale36 = builder35.build();
        java.lang.String str37 = locale36.toLanguageTag();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        java.util.Locale locale43 = new java.util.Locale("", "", "");
        java.lang.String str45 = locale43.getExtension('x');
        java.lang.String str46 = locale39.getDisplayVariant(locale43);
        java.util.Locale locale47 = java.util.Locale.FRENCH;
        java.lang.String str48 = locale47.getLanguage();
        java.lang.String str49 = locale43.getDisplayScript(locale47);
        java.lang.String str50 = locale38.getDisplayScript(locale43);
        java.util.Locale locale53 = new java.util.Locale("de", "FRA");
        java.lang.String str54 = locale43.getDisplayVariant(locale53);
        java.lang.String str55 = locale36.getDisplayVariant(locale43);
        java.lang.String str56 = locale3.getDisplayLanguage(locale43);
        java.util.Set<java.lang.String> strSet57 = locale43.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "fra_FRA_fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra (FRA,fr)" + "'", str5, "fra (FRA,fr)");
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
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "french");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "french" + "'", str37, "french");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "fr" + "'", str48, "fr");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals(locale53.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "fra" + "'", str56, "fra");
        org.junit.Assert.assertNotNull(strSet57);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        int int11 = random1.nextInt(2027332310);
        float float12 = random1.nextFloat();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1552812408 + "'", int11 == 1552812408);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.50627613f + "'", float12 == 0.50627613f);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder16.setVariant("");
        java.util.Locale.Builder builder19 = builder16.clear();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getLanguage();
        java.util.Locale.Builder builder23 = builder19.setLocale(locale21);
        java.util.Locale locale24 = java.util.Locale.ITALY;
        java.util.Random random25 = new java.util.Random();
        java.util.stream.LongStream longStream26 = random25.longs();
        float float27 = random25.nextFloat();
        java.util.stream.IntStream intStream28 = random25.ints();
        int int29 = random25.nextInt();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale24, random25);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(locale21, random25);
        java.lang.String str32 = locale21.getDisplayName();
        java.util.Set<java.lang.String> strSet33 = locale21.getUnicodeLocaleKeys();
        java.lang.String str34 = locale5.getDisplayCountry(locale21);
        java.util.Locale locale35 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str37 = locale35.getDisplayName();
        java.util.Locale.Category category38 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale39 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet41 = locale39.getExtensionKeys();
        java.util.Locale.setDefault(category38, locale39);
        java.util.Random random44 = new java.util.Random((long) (byte) 10);
        long long45 = random44.nextLong();
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker(locale39, random44);
        java.util.Random random48 = new java.util.Random(8220501950349663546L);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale39, random48);
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker(locale35, random48);
        com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(locale5, random48);
        com.github.javafaker.Code code52 = faker51.code();
        com.github.javafaker.Color color53 = faker51.color();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.22965872f + "'", float11 == 0.22965872f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 979482748 + "'", int13 == 979482748);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr" + "'", str22, "fr");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream26);
// flaky:         org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8046637f + "'", float27 == 0.8046637f);
        org.junit.Assert.assertNotNull(intStream28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 511543503 + "'", int29 == 511543503);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "French" + "'", str32, "French");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "English (United Kingdom)" + "'", str37, "English (United Kingdom)");
        org.junit.Assert.assertTrue("'" + category38 + "' != '" + java.util.Locale.Category.FORMAT + "'", category38.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(charSet41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-4972683369271453960L) + "'", long45 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(code52);
        org.junit.Assert.assertNotNull(color53);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        java.util.Locale locale3 = new java.util.Locale("hi!", "italien (Italie)", "fr");
        java.lang.Class<?> wildcardClass4 = locale3.getClass();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ITALIEN (ITALIE)_fr");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        java.util.stream.IntStream intStream6 = random1.ints((-1193959466), 78707950);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) 74589158, (double) 591553211);
        long long10 = random1.nextLong();
        long long11 = random1.nextLong();
        java.util.stream.LongStream longStream12 = random1.longs();
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-5128016860359238732L) + "'", long10 == (-5128016860359238732L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3596673253889729385L + "'", long11 == 3596673253889729385L);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("en_CA", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_ca");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str15 = languageRange14.getRange();
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange5, languageRange8, languageRange11, languageRange14, languageRange18 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
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
        java.util.Locale locale83 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList79);
        java.lang.String str84 = null; // flaky: locale83.getDisplayCountry();
        java.lang.String str86 = null; // flaky: locale83.getExtension('a');
        java.lang.String str87 = null; // flaky: locale83.getISO3Language();
        java.lang.String str88 = null; // flaky: locale83.toLanguageTag();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fr" + "'", str15, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
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
// flaky:         org.junit.Assert.assertNotNull(locale83);
// flaky:         org.junit.Assert.assertEquals(locale83.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNull(str86);
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "fra" + "'", str87, "fra");
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "fr" + "'", str88, "fr");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.lang.String str6 = locale4.getExtension('a');
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.lang.String str8 = locale4.getDisplayName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder10 = builder6.removeUnicodeLocaleAttribute("English");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("ZH-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ZH-CN [at index 0]");
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
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        java.util.Locale locale1 = new java.util.Locale("Korean (South Korea)");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random2.longs();
        java.util.stream.LongStream longStream5 = random2.longs(0L);
        java.util.stream.IntStream intStream7 = random2.ints((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: korean (south korea) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "korean (south korea)");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Italian", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("und", strMap6);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.lang.String str10 = locale9.getLanguage();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags(languageRangeList7, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.parse("Italian", strMap15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList16, strMap17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.parse("French", strMap20);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleKeys();
        java.lang.String str26 = java.util.Locale.lookupTag(languageRangeList23, (java.util.Collection<java.lang.String>) strSet25);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        java.lang.String str31 = java.util.Locale.lookupTag(languageRangeList28, (java.util.Collection<java.lang.String>) strSet30);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strSet30);
        java.lang.String str33 = java.util.Locale.lookupTag(languageRangeList21, (java.util.Collection<java.lang.String>) strList32);
        java.lang.String str34 = java.util.Locale.lookupTag(languageRangeList18, (java.util.Collection<java.lang.String>) strList32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder40 = builder38.setVariant("");
        java.util.Locale locale41 = builder38.build();
        java.util.Locale locale45 = new java.util.Locale("", "", "");
        java.util.Locale locale49 = new java.util.Locale("", "", "");
        java.lang.String str50 = locale45.getDisplayLanguage(locale49);
        java.util.Locale locale51 = java.util.Locale.FRENCH;
        java.util.Locale locale55 = new java.util.Locale("", "", "");
        java.util.Locale locale59 = new java.util.Locale("", "", "");
        java.lang.String str60 = locale55.getDisplayLanguage(locale59);
        java.util.Locale locale64 = new java.util.Locale("", "", "");
        java.lang.String str66 = locale64.getExtension('x');
        java.util.Locale.setDefault(locale64);
        java.util.Locale locale69 = new java.util.Locale("hi!");
        java.util.Locale locale70 = locale69.stripExtensions();
        java.lang.String str71 = locale70.getISO3Country();
        java.util.Locale locale75 = new java.util.Locale("", "", "");
        java.util.Locale locale79 = new java.util.Locale("", "", "");
        java.lang.String str80 = locale75.getDisplayLanguage(locale79);
        java.util.Locale locale82 = new java.util.Locale("hi!");
        java.util.Locale locale83 = locale82.stripExtensions();
        java.util.Locale locale85 = new java.util.Locale("hi!");
        java.util.Locale locale87 = new java.util.Locale("hi!");
        java.util.Locale locale89 = new java.util.Locale("hi!");
        java.util.Locale locale90 = locale89.stripExtensions();
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale41, locale45, locale51, locale59, locale64, locale70, locale79, locale82, locale85, locale87, locale89 };
        java.util.ArrayList<java.util.Locale> localeList92 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList92, localeArray91);
        java.util.Locale.FilteringMode filteringMode94 = null;
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList92, filteringMode94);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter(languageRangeList18, (java.util.Collection<java.util.Locale>) localeList95);
        java.util.Locale locale97 = java.util.Locale.lookup(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList96);
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList96);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertEquals(locale69.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals(locale82.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "hi!");
        org.junit.Assert.assertEquals(locale85.toString(), "hi!");
        org.junit.Assert.assertEquals(locale87.toString(), "hi!");
        org.junit.Assert.assertEquals(locale89.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertNull(locale97);
        org.junit.Assert.assertNotNull(localeList98);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Hacker hacker1 = faker0.hacker();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber();
        com.github.javafaker.Name name3 = faker0.name();
        org.junit.Assert.assertNotNull(hacker1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(name3);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Options options3 = faker0.options();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Options options5 = faker0.options();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
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
        java.lang.String str24 = locale22.getISO3Language();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fra" + "'", str24, "fra");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        java.util.Random random1 = new java.util.Random((long) (-925427400));
        java.util.Locale locale2 = java.util.Locale.PRC;
        java.lang.String str3 = locale2.getVariant();
        java.util.Random random5 = new java.util.Random(100L);
        double double6 = random5.nextGaussian();
        random5.setSeed((long) (-1157793070));
        double double9 = random5.nextGaussian();
        boolean boolean10 = random5.nextBoolean();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale2, random5);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random5);
        java.util.Random random14 = new java.util.Random((long) (short) 1);
        int int15 = random14.nextInt();
        java.util.stream.LongStream longStream19 = random14.longs(10L, 0L, (long) (short) 100);
        java.util.Random random21 = new java.util.Random(1L);
        java.util.Random random23 = new java.util.Random((long) (short) 1);
        java.util.Random random25 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream27 = random25.doubles((long) 10);
        int int28 = random25.nextInt();
        java.util.stream.DoubleStream doubleStream29 = random25.doubles();
        java.util.stream.IntStream intStream30 = random25.ints();
        java.util.Random random32 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream34 = random32.doubles((long) 10);
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random32.nextBytes(byteArray38);
        random25.nextBytes(byteArray38);
        random23.nextBytes(byteArray38);
        random21.nextBytes(byteArray38);
        random14.nextBytes(byteArray38);
        random5.nextBytes(byteArray38);
        random1.nextBytes(byteArray38);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6246292191371761d + "'", double6 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.09760425216810112d + "'", double9 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1155869325) + "'", int15 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1157793070) + "'", int28 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertNotNull(doubleStream34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[78, 119, -39]");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
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
        java.util.Set<java.lang.String> strSet81 = null; // flaky: locale80.getUnicodeLocaleKeys();
        com.github.javafaker.Faker faker82 = null; // flaky: new com.github.javafaker.Faker(locale80);
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
// flaky:         org.junit.Assert.assertNotNull(strSet81);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        java.util.stream.LongStream longStream3 = random0.longs(0L);
        java.util.stream.IntStream intStream5 = random0.ints((long) (byte) 1);
        float float6 = random0.nextFloat();
        double double7 = random0.nextGaussian();
        java.util.stream.LongStream longStream10 = random0.longs((long) (-1385411462), (long) (-1189342480));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random0.ints(683908158, (-833381869));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream5);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.88697314f + "'", float6 == 0.88697314f);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6069993250126298d + "'", double7 == 0.6069993250126298d);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chine");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        java.util.Random random1 = new java.util.Random((long) 608203801);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        boolean boolean23 = locale21.hasExtensions();
        java.lang.String str24 = locale21.getDisplayScript();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale21);
        java.util.Random random27 = new java.util.Random((long) 0);
        int int29 = random27.nextInt((int) '4');
        java.util.stream.IntStream intStream32 = random27.ints((-303169301), 0);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale21, random27);
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random27);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 44 + "'", int29 == 44);
        org.junit.Assert.assertNotNull(intStream32);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("und-DE", (double) 179251573188998827L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.79251573188998816E17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        java.util.Locale locale3 = new java.util.Locale("zh-tw_CHINE", "", "\u97d3\u6587,fra (FRA,fr))");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u97d3\u6587,fra (FRA,fr))");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        java.util.Random random1 = new java.util.Random((long) (-54155984));
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        java.util.Locale locale3 = new java.util.Locale("und-DE", "CHINESISCH (TAIWAN)", "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        java.util.Locale locale2 = new java.util.Locale("US", "chinese");
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.getDisplayScript();
        java.lang.String str5 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "us_CHINESE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us (CHINESE)" + "'", str3, "us (CHINESE)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u82f1\u6587\u82f1\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        java.util.Random random1 = new java.util.Random((long) 1957295020);
        long long2 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) 1155652984, (double) 0.75124323f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7401099607487150525L + "'", long2 == 7401099607487150525L);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        java.util.Locale locale2 = new java.util.Locale("de", "und");
        org.junit.Assert.assertEquals(locale2.toString(), "de_UND");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
        java.lang.String str25 = locale0.getISO3Language();
        java.lang.String str26 = locale0.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zho" + "'", str25, "zho");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chinese" + "'", str26, "Chinese");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        java.util.Random random1 = new java.util.Random((long) 1839438880);
        double double2 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) 34);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7435802055998083d + "'", double2 == 0.7435802055998083d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        java.util.Locale locale2 = new java.util.Locale("hi!", "Chinese (China)");
        java.util.Locale locale4 = new java.util.Locale("\u6cd5\u6587");
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.util.Locale locale7 = new java.util.Locale("und");
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale7.getISO3Language();
        java.lang.String str10 = locale2.getDisplayName(locale7);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_CHINESE (CHINA)");
        org.junit.Assert.assertEquals(locale4.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! (CHINESE (CHINA))" + "'", str5, "hi! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals(locale7.toString(), "und");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "und" + "'", str9, "und");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! (CHINESE (CHINA))" + "'", str10, "hi! (CHINESE (CHINA))");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("chinois", strMap1);
        java.util.Collection<java.lang.String> strCollection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = java.util.Locale.filterTags(languageRangeList2, strCollection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        java.lang.String str8 = locale5.getCountry();
        boolean boolean9 = locale5.hasExtensions();
        java.lang.String str10 = locale5.getDisplayName();
        java.lang.String str11 = locale5.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French" + "'", str10, "French");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Color color5 = faker0.color();
        java.lang.String str7 = faker0.bothify("China");
        java.lang.String str9 = faker0.numerify("JP");
        com.github.javafaker.Finance finance10 = faker0.finance();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JP" + "'", str9, "JP");
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
        java.lang.String str34 = locale21.getVariant();
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale21.getDisplayVariant(locale35);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.LongStream longStream10 = random0.longs((long) (-266083962), (long) 'a');
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Locale locale15 = new java.util.Locale("", "", "");
        java.lang.String str17 = locale15.getExtension('x');
        java.lang.String str18 = locale11.getDisplayVariant(locale15);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.lang.String str20 = locale19.getLanguage();
        java.lang.String str21 = locale15.getDisplayScript(locale19);
        java.util.Locale locale25 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale25.getExtension('x');
        java.util.Locale.setDefault(locale25);
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.lang.String str30 = locale25.getDisplayLanguage(locale29);
        java.lang.String str31 = locale15.getDisplayCountry(locale29);
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.lang.String str33 = locale15.getDisplayScript(locale32);
        java.lang.String str34 = locale32.getDisplayScript();
        java.util.Random random36 = new java.util.Random((long) (short) 100);
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(locale32, random36);
        java.util.stream.DoubleStream doubleStream40 = random36.doubles((double) 0.021045089f, (double) 1761283695);
        java.util.Random random42 = new java.util.Random((long) 0);
        random42.setSeed((long) (byte) 100);
        java.util.stream.DoubleStream doubleStream45 = random42.doubles();
        random42.setSeed((long) 100);
        java.util.Random random49 = new java.util.Random(1L);
        java.util.Random random51 = new java.util.Random((long) (short) 1);
        java.util.Random random53 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream55 = random53.doubles((long) 10);
        int int56 = random53.nextInt();
        java.util.stream.DoubleStream doubleStream57 = random53.doubles();
        java.util.stream.IntStream intStream58 = random53.ints();
        java.util.Random random60 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream62 = random60.doubles((long) 10);
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random60.nextBytes(byteArray66);
        random53.nextBytes(byteArray66);
        random51.nextBytes(byteArray66);
        random49.nextBytes(byteArray66);
        random42.nextBytes(byteArray66);
        random36.nextBytes(byteArray66);
        random0.nextBytes(byteArray66);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4959694f + "'", float2 == 0.4959694f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fr" + "'", str20, "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertNotNull(doubleStream45);
        org.junit.Assert.assertNotNull(doubleStream55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1157793070) + "'", int56 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream57);
        org.junit.Assert.assertNotNull(intStream58);
        org.junit.Assert.assertNotNull(doubleStream62);
        org.junit.Assert.assertNotNull(byteArray66);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[69, -56, 76]");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        java.util.Locale locale2 = new java.util.Locale("Chinese", "ja_JP");
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_JA_JP");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JA_JP" + "'", str3, "JA_JP");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream6 = random1.longs();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) 14);
        long long9 = random1.nextLong();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8220501950349663546L + "'", long9 == 8220501950349663546L);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        java.util.stream.LongStream longStream3 = random0.longs(0L);
        java.util.stream.IntStream intStream5 = random0.ints((long) (byte) 1);
        java.util.stream.LongStream longStream6 = random0.longs();
        boolean boolean7 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        boolean boolean6 = random1.nextBoolean();
        boolean boolean7 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.lang.String str9 = locale0.getExtension('x');
        java.util.Locale locale11 = new java.util.Locale("fra");
        java.lang.String str12 = locale0.getDisplayScript(locale11);
        boolean boolean13 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals(locale11.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        java.util.Random random1 = new java.util.Random((long) 1935664679);
        java.util.stream.LongStream longStream2 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
    }
}
