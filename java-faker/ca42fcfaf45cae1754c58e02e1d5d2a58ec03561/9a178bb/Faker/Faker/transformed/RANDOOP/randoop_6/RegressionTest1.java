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
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        com.github.javafaker.Address address9 = faker5.address;
        faker1.address = address9;
        com.github.javafaker.Name name11 = faker1.name();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business13 = faker12.business;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Company company16 = null;
        faker15.company = company16;
        com.github.javafaker.Name name18 = faker15.name();
        faker12.name = name18;
        com.github.javafaker.Company company20 = faker12.company;
        faker1.company = company20;
        com.github.javafaker.Internet internet22 = faker1.internet;
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertNotNull(internet22);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.lang.String str6 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str2 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Canada" + "'", str2, "Canada");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Company company6 = null;
        faker1.company = company6;
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Internet internet9 = faker1.internet();
        com.github.javafaker.Lorem lorem10 = faker1.lorem;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Options options14 = faker12.options();
        com.github.javafaker.Color color15 = faker12.color();
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        java.lang.String str19 = faker17.numerify("");
        com.github.javafaker.Book book20 = null;
        faker17.book = book20;
        com.github.javafaker.Internet internet22 = faker17.internet;
        com.github.javafaker.DateAndTime dateAndTime23 = faker17.date();
        faker12.dateAndTime = dateAndTime23;
        faker1.dateAndTime = dateAndTime23;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(internet22);
        org.junit.Assert.assertNotNull(dateAndTime23);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles(315664383340106314L);
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Random random4 = new java.util.Random();
        int int6 = random4.nextInt((int) (short) 1);
        random4.setSeed((long) 100);
        float float9 = random4.nextFloat();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random4);
        java.util.Random random11 = new java.util.Random();
        int int13 = random11.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream15 = random11.longs((long) '#');
        java.util.stream.LongStream longStream17 = random11.longs((long) (short) 0);
        boolean boolean18 = random11.nextBoolean();
        java.util.Random random19 = new java.util.Random();
        int int21 = random19.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream23 = random19.longs((long) '#');
        java.util.stream.DoubleStream doubleStream26 = random19.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1 };
        random19.nextBytes(byteArray29);
        random11.nextBytes(byteArray29);
        random4.nextBytes(byteArray29);
        random0.nextBytes(byteArray29);
        int int34 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream38 = random0.doubles((long) (-651874858), (-0.7550023578602206d), (double) (-1129572628));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.7220096f + "'", float9 == 0.7220096f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream17);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(byteArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-105, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-619623872) + "'", int34 == (-619623872));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.LongStream longStream14 = random8.longs((long) (short) 0);
        boolean boolean15 = random8.nextBoolean();
        java.util.Random random16 = new java.util.Random();
        int int18 = random16.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream20 = random16.longs((long) '#');
        java.util.stream.DoubleStream doubleStream23 = random16.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1 };
        random16.nextBytes(byteArray26);
        random8.nextBytes(byteArray26);
        random1.nextBytes(byteArray26);
        java.util.stream.DoubleStream doubleStream30 = random1.doubles();
        double double31 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-76, -37]");
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0565816491790574d) + "'", double31 == (-1.0565816491790574d));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str9 = locale6.getDisplayName(locale8);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        java.util.Locale.setDefault(locale6);
        java.lang.String str12 = locale6.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet13 = locale6.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        java.lang.Object obj6 = null;
        boolean boolean7 = languageRange1.equals(obj6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gbr" + "'", str4, "gbr");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business6 = faker5.business;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Company company9 = null;
        faker8.company = company9;
        com.github.javafaker.Name name11 = faker8.name();
        faker5.name = name11;
        com.github.javafaker.Company company13 = faker5.company;
        com.github.javafaker.Options options14 = faker5.options;
        faker1.options = options14;
        com.github.javafaker.Finance finance16 = faker1.finance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(finance16);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder4 = builder0.setLanguage("English");
        java.util.Locale.Builder builder6 = builder0.setLanguageTag("chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.removeUnicodeLocaleAttribute("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        float float7 = random0.nextFloat();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5259239f + "'", float7 == 0.5259239f);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale locale11 = builder8.build();
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.Locale locale3 = new java.util.Locale("GBR", "\u82f1\u570b", "eng");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category5, locale6);
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Locale.setDefault(category5, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category5);
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: gbr_??_eng could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u570b_eng");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "gbr" + "'", str12, "gbr");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getISO3Country();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale5);
        java.lang.String str11 = locale5.getDisplayCountry();
        java.lang.String str12 = locale5.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TWN" + "'", str9, "TWN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Taiwan" + "'", str11, "Taiwan");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh" + "'", str12, "zh");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Address address6 = faker1.address();
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        java.lang.String str10 = faker8.numerify("");
        com.github.javafaker.Book book11 = null;
        faker8.book = book11;
        com.github.javafaker.Internet internet13 = faker8.internet();
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker8.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService14;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(internet13);
        org.junit.Assert.assertNotNull(fakeValuesService14);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u570b", 0.9549249021862884d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Book book6 = faker1.book();
        java.lang.String str8 = faker1.bothify("English (United States)");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English (United States)" + "'", str8, "English (United States)");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles(315664383340106314L);
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Random random4 = new java.util.Random();
        int int6 = random4.nextInt((int) (short) 1);
        random4.setSeed((long) 100);
        float float9 = random4.nextFloat();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random4);
        java.util.Random random11 = new java.util.Random();
        int int13 = random11.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream15 = random11.longs((long) '#');
        java.util.stream.LongStream longStream17 = random11.longs((long) (short) 0);
        boolean boolean18 = random11.nextBoolean();
        java.util.Random random19 = new java.util.Random();
        int int21 = random19.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream23 = random19.longs((long) '#');
        java.util.stream.DoubleStream doubleStream26 = random19.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1 };
        random19.nextBytes(byteArray29);
        random11.nextBytes(byteArray29);
        random4.nextBytes(byteArray29);
        random0.nextBytes(byteArray29);
        int int34 = random0.nextInt();
        boolean boolean35 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.7220096f + "'", float9 == 0.7220096f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream17);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(byteArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-32, 35]");
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 748666197 + "'", int34 == 748666197);
// flaky:         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.dateAndTime;
        org.junit.Assert.assertNotNull(dateAndTime1);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        java.lang.String str5 = faker3.numerify("");
        com.github.javafaker.Book book6 = null;
        faker3.book = book6;
        com.github.javafaker.Internet internet8 = faker3.internet;
        com.github.javafaker.Internet internet9 = faker3.internet;
        faker1.internet = internet9;
        com.github.javafaker.service.RandomService randomService11 = faker1.randomService;
        com.github.javafaker.Company company12 = faker1.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(randomService11);
        org.junit.Assert.assertNotNull(company12);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.DateAndTime dateAndTime3 = faker1.dateAndTime;
        com.github.javafaker.service.RandomService randomService4 = faker1.randomService;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str9 = locale6.getDisplayName(locale8);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        java.util.Locale locale11 = builder10.build();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale0.getDisplayVariant(locale8);
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale0.getDisplayName(locale11);
        java.lang.Object obj13 = locale11.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str7, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English (United States)" + "'", str12, "English (United States)");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Book book8 = faker1.book;
        com.github.javafaker.Code code9 = faker1.code;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getISO3Country();
        boolean boolean6 = locale4.hasExtensions();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setUnicodeLocaleKeyword("eng", "English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale1.getDisplayScript();
        java.lang.String str5 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet6 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_CN" + "'", str1, "zh_CN");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Lorem lorem7 = faker1.lorem();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Address address11 = faker9.address;
        com.github.javafaker.Address address12 = faker9.address;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        java.lang.String str16 = faker14.numerify("");
        com.github.javafaker.Book book17 = null;
        faker14.book = book17;
        com.github.javafaker.Internet internet19 = faker14.internet;
        com.github.javafaker.DateAndTime dateAndTime20 = faker14.date();
        com.github.javafaker.Code code21 = faker14.code;
        com.github.javafaker.Code code22 = faker14.code();
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Color color25 = faker24.color;
        com.github.javafaker.DateAndTime dateAndTime26 = faker24.dateAndTime;
        com.github.javafaker.service.RandomService randomService27 = faker24.randomService;
        faker14.randomService = randomService27;
        faker9.randomService = randomService27;
        faker1.randomService = randomService27;
        java.lang.String str32 = faker1.letterify("");
        com.github.javafaker.Company company33 = faker1.company;
        com.github.javafaker.Internet internet34 = faker1.internet;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNotNull(code21);
        org.junit.Assert.assertNotNull(code22);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(randomService27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(internet34);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        random0.nextBytes(byteArray10);
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0.0d, (double) 315664383340106314L);
        java.util.stream.DoubleStream doubleStream15 = random0.doubles();
        java.util.stream.LongStream longStream17 = random0.longs(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream20 = random0.doubles((double) (short) 10, (double) (-7066843796264617845L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-50, 0]");
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(longStream17);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder18 = builder13.setExtension('x', "zh-TW");
        java.util.Locale.Builder builder19 = builder13.clearExtensions();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder20.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale23 = builder20.build();
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.util.Locale.Builder builder25 = builder13.setLocale(locale23);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        float float11 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random0.doubles(0.9549249021862884d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.7346627f + "'", float11 == 0.7346627f);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Company company7 = faker1.company();
        com.github.javafaker.Book book8 = faker1.book();
        com.github.javafaker.Color color9 = faker1.color;
        com.github.javafaker.Name name10 = faker1.name();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Number number7 = faker1.number();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Number number12 = faker9.number();
        com.github.javafaker.Name name13 = faker9.name();
        faker1.name = name13;
        com.github.javafaker.Lorem lorem15 = faker1.lorem();
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        java.lang.String str19 = faker17.numerify("");
        com.github.javafaker.Number number20 = faker17.number();
        com.github.javafaker.Name name21 = faker17.name();
        faker1.name = name21;
        java.util.Random random23 = new java.util.Random();
        int int25 = random23.nextInt((int) (short) 1);
        random23.setSeed((long) 100);
        java.util.stream.IntStream intStream31 = random23.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean32 = random23.nextBoolean();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Business business34 = faker33.business();
        faker1.business = business34;
        com.github.javafaker.Internet internet36 = faker1.internet;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(business34);
        org.junit.Assert.assertNotNull(internet36);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.LongStream longStream14 = random8.longs((long) (short) 0);
        boolean boolean15 = random8.nextBoolean();
        float float16 = random8.nextFloat();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1 };
        random8.nextBytes(byteArray19);
        random0.nextBytes(byteArray19);
        java.util.Random random22 = new java.util.Random();
        int int24 = random22.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream26 = random22.longs((long) '#');
        java.util.stream.LongStream longStream28 = random22.longs((long) (short) 0);
        boolean boolean29 = random22.nextBoolean();
        float float30 = random22.nextFloat();
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 1 };
        random22.nextBytes(byteArray33);
        random0.nextBytes(byteArray33);
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.2976271f + "'", float16 == 0.2976271f);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-48, -63]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(longStream28);
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8116305f + "'", float30 == 0.8116305f);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-2, 1]");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Canada");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("GBR", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Locale locale14 = new java.util.Locale("");
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale12, locale14, locale15, locale16, locale17 };
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.List<java.util.Locale> localeList21 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList19);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet23);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList24, filteringMode25);
        java.util.Locale locale30 = new java.util.Locale("GBR", "\u82f1\u570b", "eng");
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet31);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localeList21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode25.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList26);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "\u82f1\u570b_eng");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale33 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale41 = java.util.Locale.TAIWAN;
        java.lang.String str42 = locale40.getDisplayScript(locale41);
        java.lang.String str43 = locale41.toLanguageTag();
        java.lang.String str44 = locale41.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet45 = locale41.getUnicodeLocaleKeys();
        java.lang.String str46 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet45);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet48);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh-TW" + "'", str43, "zh-TW");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Chinese" + "'", str44, "Chinese");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strList49);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color4 = faker3.color;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        java.lang.String str8 = faker6.numerify("");
        com.github.javafaker.Book book9 = null;
        faker6.book = book9;
        com.github.javafaker.Internet internet11 = faker6.internet();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker6.phoneNumber();
        faker3.phoneNumber = phoneNumber12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet;
        com.github.javafaker.DateAndTime dateAndTime21 = faker15.date();
        com.github.javafaker.Code code22 = faker15.code;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Color color25 = faker24.color;
        com.github.javafaker.Lorem lorem26 = faker24.lorem();
        com.github.javafaker.Finance finance27 = faker24.finance;
        com.github.javafaker.Number number28 = faker24.number();
        faker15.number = number28;
        faker3.number = number28;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Color color33 = faker32.color;
        java.lang.String str35 = faker32.bothify("");
        com.github.javafaker.Lorem lorem36 = faker32.lorem();
        faker3.lorem = lorem36;
        java.util.Random random38 = null;
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random38);
        java.lang.String str41 = faker39.numerify("");
        com.github.javafaker.Book book42 = null;
        faker39.book = book42;
        com.github.javafaker.Internet internet44 = faker39.internet;
        com.github.javafaker.DateAndTime dateAndTime45 = faker39.date();
        com.github.javafaker.Code code46 = faker39.code;
        java.util.Random random47 = null;
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.Color color49 = faker48.color;
        com.github.javafaker.Name name50 = faker48.name();
        com.github.javafaker.Options options51 = faker48.options;
        java.util.Random random52 = null;
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(random52);
        com.github.javafaker.Color color54 = faker53.color;
        com.github.javafaker.Options options55 = faker53.options();
        com.github.javafaker.Color color56 = faker53.color();
        java.util.Random random57 = null;
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        java.lang.String str60 = faker58.numerify("");
        com.github.javafaker.Book book61 = null;
        faker58.book = book61;
        com.github.javafaker.Internet internet63 = faker58.internet;
        com.github.javafaker.DateAndTime dateAndTime64 = faker58.date();
        faker53.dateAndTime = dateAndTime64;
        faker48.dateAndTime = dateAndTime64;
        faker39.dateAndTime = dateAndTime64;
        faker3.dateAndTime = dateAndTime64;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(dateAndTime21);
        org.junit.Assert.assertNotNull(code22);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(finance27);
        org.junit.Assert.assertNotNull(number28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(internet44);
        org.junit.Assert.assertNotNull(dateAndTime45);
        org.junit.Assert.assertNotNull(code46);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(name50);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(internet63);
        org.junit.Assert.assertNotNull(dateAndTime64);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream7 = random0.ints();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        long long9 = random0.nextLong();
        java.util.Random random10 = new java.util.Random();
        int int12 = random10.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream14 = random10.longs((long) '#');
        java.util.stream.LongStream longStream16 = random10.longs((long) (short) 0);
        boolean boolean17 = random10.nextBoolean();
        float float18 = random10.nextFloat();
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 1 };
        random10.nextBytes(byteArray21);
        random0.nextBytes(byteArray21);
        double double24 = random0.nextGaussian();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8610733158772304481L + "'", long9 == 8610733158772304481L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.4335826f + "'", float18 == 0.4335826f);
        org.junit.Assert.assertNotNull(byteArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-79, 59]");
// flaky:         org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0009248772935098d + "'", double24 == 1.0009248772935098d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Finance finance6 = faker1.finance();
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Color color12 = faker11.color;
        com.github.javafaker.Name name13 = faker11.name();
        faker8.name = name13;
        faker1.name = name13;
        com.github.javafaker.Lorem lorem16 = faker1.lorem();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(lorem16);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.LongStream longStream14 = random8.longs((long) (short) 0);
        boolean boolean15 = random8.nextBoolean();
        float float16 = random8.nextFloat();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1 };
        random8.nextBytes(byteArray19);
        random0.nextBytes(byteArray19);
        java.util.Random random22 = new java.util.Random();
        int int24 = random22.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream26 = random22.longs((long) '#');
        java.util.stream.LongStream longStream28 = random22.longs((long) (short) 0);
        boolean boolean29 = random22.nextBoolean();
        float float30 = random22.nextFloat();
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 1 };
        random22.nextBytes(byteArray33);
        random0.nextBytes(byteArray33);
        long long36 = random0.nextLong();
        java.util.stream.LongStream longStream37 = random0.longs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.54124117f + "'", float16 == 0.54124117f);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-74, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(longStream28);
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.4154327f + "'", float30 == 0.4154327f);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-122, 20]");
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-4790899400971967014L) + "'", long36 == (-4790899400971967014L));
        org.junit.Assert.assertNotNull(longStream37);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Code code8 = faker1.code;
        java.lang.Class<?> wildcardClass9 = faker1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList13);
        java.lang.String str16 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.Category category17 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(category17, locale18);
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet20);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category17.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Japanese", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Finance finance13 = faker10.finance;
        com.github.javafaker.Number number14 = faker10.number();
        faker1.number = number14;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.DateAndTime dateAndTime18 = null;
        faker17.dateAndTime = dateAndTime18;
        com.github.javafaker.Lorem lorem20 = faker17.lorem;
        com.github.javafaker.Address address21 = faker17.address;
        faker1.address = address21;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Color color25 = faker24.color;
        com.github.javafaker.Address address26 = faker24.address;
        com.github.javafaker.Options options27 = faker24.options;
        com.github.javafaker.Business business28 = faker24.business();
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale31 = java.util.Locale.TAIWAN;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.lang.String str33 = locale31.toLanguageTag();
        java.lang.String str34 = locale31.getDisplayLanguage();
        java.util.Random random35 = null;
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale31, random35);
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Color color39 = faker38.color;
        com.github.javafaker.Lorem lorem40 = faker38.lorem();
        com.github.javafaker.Finance finance41 = faker38.finance;
        com.github.javafaker.Number number42 = faker38.number();
        com.github.javafaker.PhoneNumber phoneNumber43 = null;
        faker38.phoneNumber = phoneNumber43;
        com.github.javafaker.service.FakeValuesService fakeValuesService45 = faker38.fakeValuesService;
        faker36.fakeValuesService = fakeValuesService45;
        faker24.fakeValuesService = fakeValuesService45;
        faker1.fakeValuesService = fakeValuesService45;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(lorem20);
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(business28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-TW" + "'", str33, "zh-TW");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u6587" + "'", str34, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(lorem40);
        org.junit.Assert.assertNotNull(finance41);
        org.junit.Assert.assertNotNull(number42);
        org.junit.Assert.assertNotNull(fakeValuesService45);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setUnicodeLocaleKeyword("Chinesisch", "\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Chinesisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getISO3Country();
        boolean boolean6 = locale4.hasExtensions();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setVariant("\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(strSet1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)" + "'", str2, "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("GB", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        com.github.javafaker.Company company7 = faker1.company;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker1.randomService = randomService9;
        com.github.javafaker.Book book11 = faker1.book;
        com.github.javafaker.Business business12 = faker1.business;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        java.lang.String str16 = faker14.numerify("");
        com.github.javafaker.Book book17 = null;
        faker14.book = book17;
        com.github.javafaker.Company company19 = null;
        faker14.company = company19;
        com.github.javafaker.Name name21 = faker14.name;
        com.github.javafaker.Internet internet22 = faker14.internet();
        com.github.javafaker.Lorem lorem23 = faker14.lorem;
        faker1.lorem = lorem23;
        java.lang.String str26 = faker1.bothify("en_GB");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(internet22);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en_GB" + "'", str26, "en_GB");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.util.Locale locale2 = java.util.Locale.UK;
        java.lang.String str3 = locale2.getISO3Country();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.lang.String str7 = locale1.getDisplayScript(locale4);
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str11 = locale8.getDisplayName(locale10);
        java.lang.String str12 = locale8.getDisplayName();
        java.lang.String str13 = locale4.getDisplayName(locale8);
        java.lang.String str14 = locale4.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBR" + "'", str3, "GBR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "United Kingdom" + "'", str6, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English" + "'", str11, "English");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English (United Kingdom)" + "'", str13, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GBR" + "'", str14, "GBR");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder14 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder8.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Book book12 = null;
        faker9.book = book12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.DateAndTime dateAndTime16 = null;
        faker15.dateAndTime = dateAndTime16;
        com.github.javafaker.Lorem lorem18 = faker15.lorem;
        com.github.javafaker.Address address19 = faker15.address;
        com.github.javafaker.Finance finance20 = faker15.finance();
        faker9.finance = finance20;
        java.util.Locale locale22 = java.util.Locale.US;
        java.util.Locale.setDefault(locale22);
        java.lang.String str24 = locale22.getVariant();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale22);
        com.github.javafaker.Options options26 = faker25.options();
        faker9.options = options26;
        com.github.javafaker.Lorem lorem28 = faker9.lorem;
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Random random30 = new java.util.Random();
        int int32 = random30.nextInt((int) (short) 1);
        random30.setSeed((long) 100);
        float float35 = random30.nextFloat();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale29, random30);
        com.github.javafaker.PhoneNumber phoneNumber37 = faker36.phoneNumber;
        faker9.phoneNumber = phoneNumber37;
        faker7.phoneNumber = phoneNumber37;
        com.github.javafaker.Number number40 = faker7.number();
        com.github.javafaker.Finance finance41 = faker7.finance();
        com.github.javafaker.Name name42 = faker7.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lorem18);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(finance20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(lorem28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.7220096f + "'", float35 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber37);
        org.junit.Assert.assertNotNull(number40);
        org.junit.Assert.assertNotNull(finance41);
        org.junit.Assert.assertNotNull(name42);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker1.randomService = randomService9;
        com.github.javafaker.Book book11 = faker1.book;
        com.github.javafaker.Business business12 = faker1.business;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Color color15 = faker14.color;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        java.lang.String str19 = faker17.numerify("");
        com.github.javafaker.Number number20 = faker17.number();
        faker14.number = number20;
        com.github.javafaker.service.RandomService randomService22 = null;
        faker14.randomService = randomService22;
        com.github.javafaker.Book book24 = faker14.book;
        com.github.javafaker.Business business25 = faker14.business;
        faker1.business = business25;
        com.github.javafaker.Address address27 = faker1.address;
        java.lang.String str29 = faker1.numerify("English");
        com.github.javafaker.PhoneNumber phoneNumber30 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(book24);
        org.junit.Assert.assertNotNull(business25);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "English" + "'", str29, "English");
        org.junit.Assert.assertNotNull(phoneNumber30);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        com.github.javafaker.Finance finance2 = faker0.finance;
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(finance2);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder9 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder6.setUnicodeLocaleKeyword("ENG", "Taiwan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ENG [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Name name10 = faker1.name;
        com.github.javafaker.Address address11 = faker1.address();
        com.github.javafaker.service.RandomService randomService12 = faker1.randomService;
        com.github.javafaker.Lorem lorem13 = faker1.lorem();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(lorem13);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        int int11 = random6.nextInt();
        float float12 = random6.nextFloat();
        double double13 = random6.nextDouble();
        random6.setSeed((long) 100);
        java.util.stream.IntStream intStream17 = random6.ints(0L);
        float float18 = random6.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream22 = random6.longs(0L, 7959307406216468554L, (long) (-1035734030));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1555486227) + "'", int11 == (-1555486227));
// flaky:         org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.49124855f + "'", float12 == 0.49124855f);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6600688132519748d + "'", double13 == 0.6600688132519748d);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.7220096f + "'", float18 == 0.7220096f);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker1.randomService = randomService9;
        com.github.javafaker.Book book11 = faker1.book;
        com.github.javafaker.Business business12 = faker1.business;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Color color15 = faker14.color;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        java.lang.String str19 = faker17.numerify("");
        com.github.javafaker.Number number20 = faker17.number();
        faker14.number = number20;
        com.github.javafaker.service.RandomService randomService22 = null;
        faker14.randomService = randomService22;
        com.github.javafaker.Book book24 = faker14.book;
        com.github.javafaker.Business business25 = faker14.business;
        faker1.business = business25;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address28 = faker27.address();
        com.github.javafaker.Color color29 = faker27.color;
        faker1.color = color29;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(book24);
        org.junit.Assert.assertNotNull(business25);
        org.junit.Assert.assertNotNull(address28);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        random0.nextBytes(byteArray10);
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0.0d, (double) 315664383340106314L);
        int int15 = random0.nextInt();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-18, 3]");
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1415234792 + "'", int15 == 1415234792);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.Random random3 = new java.util.Random();
        int int5 = random3.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random3);
        java.util.stream.IntStream intStream7 = random3.ints();
        java.util.stream.IntStream intStream9 = random3.ints(0L);
        java.util.Random random10 = new java.util.Random();
        int int12 = random10.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random10);
        double double14 = random10.nextGaussian();
        java.util.Random random15 = new java.util.Random();
        int int17 = random15.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream19 = random15.longs((long) '#');
        java.util.stream.DoubleStream doubleStream22 = random15.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1 };
        random15.nextBytes(byteArray25);
        random10.nextBytes(byteArray25);
        random3.nextBytes(byteArray25);
        random0.nextBytes(byteArray25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0068687775558036535d + "'", double14 == 0.0068687775558036535d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(byteArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[54, 86]");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream7 = random0.ints();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream10 = random0.ints(10L);
        java.util.stream.LongStream longStream12 = random0.longs((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = random0.nextInt((-1653753823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Name name10 = faker1.name;
        com.github.javafaker.Business business11 = faker1.business();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = locale13.getDisplayScript(locale14);
        java.lang.String str16 = locale14.toLanguageTag();
        java.lang.String str17 = locale14.getDisplayLanguage();
        java.util.Random random18 = new java.util.Random();
        int int20 = random18.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale14, random18);
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale25 = java.util.Locale.TAIWAN;
        java.lang.String str26 = locale24.getDisplayScript(locale25);
        java.lang.String str27 = locale25.toLanguageTag();
        java.lang.String str28 = locale25.getDisplayLanguage();
        java.util.Random random29 = new java.util.Random();
        int int31 = random29.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale25, random29);
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(locale14, random29);
        com.github.javafaker.Lorem lorem35 = faker34.lorem();
        java.lang.String str37 = faker34.numerify("TWN");
        com.github.javafaker.Finance finance38 = faker34.finance;
        com.github.javafaker.PhoneNumber phoneNumber39 = faker34.phoneNumber();
        faker1.phoneNumber = phoneNumber39;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-TW" + "'", str16, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587" + "'", str17, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-TW" + "'", str27, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(lorem35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "TWN" + "'", str37, "TWN");
        org.junit.Assert.assertNotNull(finance38);
        org.junit.Assert.assertNotNull(phoneNumber39);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587");
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str6 = locale4.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        com.github.javafaker.Address address9 = faker5.address;
        faker1.address = address9;
        com.github.javafaker.Name name11 = faker1.name();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business13 = faker12.business;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Company company16 = null;
        faker15.company = company16;
        com.github.javafaker.Name name18 = faker15.name();
        faker12.name = name18;
        com.github.javafaker.Company company20 = faker12.company;
        faker1.company = company20;
        com.github.javafaker.Lorem lorem22 = faker1.lorem;
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertNotNull(lorem22);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Canada", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=52.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Random random4 = new java.util.Random();
        java.util.stream.LongStream longStream5 = random4.longs();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2, random4);
        com.github.javafaker.Finance finance7 = faker6.finance;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        java.lang.String str14 = faker12.numerify("");
        com.github.javafaker.Number number15 = faker12.number();
        faker9.number = number15;
        com.github.javafaker.service.RandomService randomService17 = null;
        faker9.randomService = randomService17;
        com.github.javafaker.Book book19 = faker9.book;
        com.github.javafaker.Business business20 = faker9.business;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Color color23 = faker22.color;
        java.util.Random random24 = null;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        java.lang.String str27 = faker25.numerify("");
        com.github.javafaker.Number number28 = faker25.number();
        faker22.number = number28;
        com.github.javafaker.service.RandomService randomService30 = null;
        faker22.randomService = randomService30;
        com.github.javafaker.Book book32 = faker22.book;
        com.github.javafaker.Business business33 = faker22.business;
        faker9.business = business33;
        faker6.business = business33;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(number15);
        org.junit.Assert.assertNotNull(book19);
        org.junit.Assert.assertNotNull(business20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(number28);
        org.junit.Assert.assertNotNull(book32);
        org.junit.Assert.assertNotNull(business33);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        boolean boolean6 = locale2.hasExtensions();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2);
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker7.fakeValuesService;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Lorem lorem11 = faker9.lorem();
        com.github.javafaker.Finance finance12 = faker9.finance;
        com.github.javafaker.Number number13 = faker9.number();
        com.github.javafaker.PhoneNumber phoneNumber14 = null;
        faker9.phoneNumber = phoneNumber14;
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = faker9.fakeValuesService;
        faker7.fakeValuesService = fakeValuesService16;
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Color color20 = faker19.color;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        java.lang.String str24 = faker22.numerify("");
        com.github.javafaker.Number number25 = faker22.number();
        faker19.number = number25;
        com.github.javafaker.service.RandomService randomService27 = null;
        faker19.randomService = randomService27;
        com.github.javafaker.Business business29 = faker19.business;
        faker7.business = business29;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Book book35 = null;
        faker32.book = book35;
        com.github.javafaker.Internet internet37 = faker32.internet();
        com.github.javafaker.PhoneNumber phoneNumber38 = faker32.phoneNumber();
        faker7.phoneNumber = phoneNumber38;
        com.github.javafaker.Book book40 = faker7.book;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(fakeValuesService16);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(number25);
        org.junit.Assert.assertNotNull(business29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(internet37);
        org.junit.Assert.assertNotNull(phoneNumber38);
        org.junit.Assert.assertNotNull(book40);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream7 = random0.ints();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.LongStream longStream12 = random0.longs((long) 19, (long) 1019255326);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ZHO");
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean5 = locale4.hasExtensions();
        java.lang.String str6 = locale4.getISO3Country();
        java.util.Locale.setDefault(category2, locale4);
        java.util.Locale locale8 = java.util.Locale.getDefault(category2);
        boolean boolean9 = languageRange1.equals((java.lang.Object) category2);
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str9 = locale6.getDisplayName(locale8);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        java.lang.String str12 = locale6.getExtension('u');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setLanguageTag("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Company company7 = faker1.company();
        com.github.javafaker.Book book8 = faker1.book();
        com.github.javafaker.Lorem lorem9 = faker1.lorem;
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.DateAndTime dateAndTime12 = null;
        faker11.dateAndTime = dateAndTime12;
        com.github.javafaker.Lorem lorem14 = faker11.lorem;
        com.github.javafaker.Address address15 = faker11.address;
        com.github.javafaker.Code code16 = faker11.code();
        com.github.javafaker.Company company17 = faker11.company();
        com.github.javafaker.Book book18 = faker11.book();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company20 = faker19.company;
        faker11.company = company20;
        faker1.company = company20;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(lorem14);
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertNotNull(code16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(book18);
        org.junit.Assert.assertNotNull(company20);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Random random4 = new java.util.Random();
        int int6 = random4.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color8 = faker7.color;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        java.lang.String str12 = faker10.numerify("");
        com.github.javafaker.Book book13 = null;
        faker10.book = book13;
        com.github.javafaker.Internet internet15 = faker10.internet();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker10.phoneNumber();
        faker7.phoneNumber = phoneNumber16;
        com.github.javafaker.Number number18 = faker7.number;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Color color21 = faker20.color;
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        java.lang.String str25 = faker23.numerify("");
        com.github.javafaker.Number number26 = faker23.number();
        faker20.number = number26;
        com.github.javafaker.service.RandomService randomService28 = null;
        faker20.randomService = randomService28;
        com.github.javafaker.Book book30 = faker20.book;
        com.github.javafaker.Business business31 = faker20.business;
        java.util.Random random32 = null;
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random32);
        com.github.javafaker.Color color34 = faker33.color;
        java.util.Random random35 = null;
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(random35);
        java.lang.String str38 = faker36.numerify("");
        com.github.javafaker.Number number39 = faker36.number();
        faker33.number = number39;
        com.github.javafaker.service.RandomService randomService41 = null;
        faker33.randomService = randomService41;
        com.github.javafaker.Book book43 = faker33.book;
        com.github.javafaker.Business business44 = faker33.business;
        faker20.business = business44;
        com.github.javafaker.Address address46 = faker20.address;
        faker7.address = address46;
        boolean boolean48 = languageRange1.equals((java.lang.Object) address46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(internet15);
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNotNull(number18);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(number26);
        org.junit.Assert.assertNotNull(book30);
        org.junit.Assert.assertNotNull(business31);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(number39);
        org.junit.Assert.assertNotNull(book43);
        org.junit.Assert.assertNotNull(business44);
        org.junit.Assert.assertNotNull(address46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        random0.setSeed((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        java.util.stream.DoubleStream doubleStream14 = random0.doubles((long) (byte) 100, (double) (-1139614796), (double) 7959307406216468554L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Company company5 = faker1.company;
        com.github.javafaker.Business business6 = faker1.business();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\ud55c\uad6d\uc5b4", (double) 7959307406216468554L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=7.9593074062164685E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream5 = random0.longs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Company company7 = faker1.company();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Book book12 = null;
        faker9.book = book12;
        com.github.javafaker.Internet internet14 = faker9.internet();
        com.github.javafaker.Lorem lorem15 = faker9.lorem();
        faker1.lorem = lorem15;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color19 = faker18.color;
        com.github.javafaker.Lorem lorem20 = faker18.lorem();
        com.github.javafaker.Finance finance21 = faker18.finance;
        com.github.javafaker.Number number22 = faker18.number();
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Company company25 = null;
        faker24.company = company25;
        com.github.javafaker.Name name27 = faker24.name();
        com.github.javafaker.DateAndTime dateAndTime28 = faker24.dateAndTime;
        com.github.javafaker.Finance finance29 = faker24.finance();
        faker18.finance = finance29;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Book book35 = null;
        faker32.book = book35;
        com.github.javafaker.Internet internet37 = faker32.internet;
        com.github.javafaker.DateAndTime dateAndTime38 = faker32.date();
        com.github.javafaker.Code code39 = faker32.code;
        java.util.Random random40 = null;
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(random40);
        com.github.javafaker.Color color42 = faker41.color;
        com.github.javafaker.Lorem lorem43 = faker41.lorem();
        com.github.javafaker.Finance finance44 = faker41.finance;
        com.github.javafaker.Number number45 = faker41.number();
        faker32.number = number45;
        java.util.Random random47 = null;
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.DateAndTime dateAndTime49 = null;
        faker48.dateAndTime = dateAndTime49;
        com.github.javafaker.Lorem lorem51 = faker48.lorem;
        com.github.javafaker.Address address52 = faker48.address;
        faker32.address = address52;
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Random random55 = new java.util.Random();
        int int57 = random55.nextInt((int) (short) 1);
        random55.setSeed((long) 100);
        float float60 = random55.nextFloat();
        com.github.javafaker.Faker faker61 = new com.github.javafaker.Faker(locale54, random55);
        com.github.javafaker.PhoneNumber phoneNumber62 = faker61.phoneNumber;
        faker32.phoneNumber = phoneNumber62;
        faker18.phoneNumber = phoneNumber62;
        faker1.phoneNumber = phoneNumber62;
        com.github.javafaker.PhoneNumber phoneNumber66 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(lorem20);
        org.junit.Assert.assertNotNull(finance21);
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(dateAndTime28);
        org.junit.Assert.assertNotNull(finance29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(internet37);
        org.junit.Assert.assertNotNull(dateAndTime38);
        org.junit.Assert.assertNotNull(code39);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(lorem43);
        org.junit.Assert.assertNotNull(finance44);
        org.junit.Assert.assertNotNull(number45);
        org.junit.Assert.assertNotNull(lorem51);
        org.junit.Assert.assertNotNull(address52);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.7220096f + "'", float60 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber62);
        org.junit.Assert.assertNotNull(phoneNumber66);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Company company7 = faker1.company();
        com.github.javafaker.Book book8 = faker1.book();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company10 = faker9.company;
        faker1.company = company10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address13 = faker12.address();
        faker1.address = address13;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(address13);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        java.lang.String str5 = faker3.numerify("");
        com.github.javafaker.Book book6 = null;
        faker3.book = book6;
        com.github.javafaker.Internet internet8 = faker3.internet;
        com.github.javafaker.Internet internet9 = faker3.internet;
        faker1.internet = internet9;
        com.github.javafaker.service.RandomService randomService11 = faker1.randomService;
        com.github.javafaker.Address address12 = faker1.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(randomService11);
        org.junit.Assert.assertNotNull(address12);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Internet internet8 = faker1.internet;
        com.github.javafaker.Business business9 = faker1.business;
        com.github.javafaker.service.RandomService randomService10 = faker1.randomService;
        com.github.javafaker.Address address11 = faker1.address();
        com.github.javafaker.Code code12 = faker1.code;
        com.github.javafaker.Address address13 = faker1.address();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(address13);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Options options4 = faker3.options();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Color color7 = faker6.color;
        com.github.javafaker.Address address8 = faker6.address;
        com.github.javafaker.Options options9 = faker6.options;
        com.github.javafaker.DateAndTime dateAndTime10 = faker6.dateAndTime;
        com.github.javafaker.Business business11 = faker6.business;
        com.github.javafaker.Company company12 = faker6.company();
        faker3.company = company12;
        java.util.Random random14 = new java.util.Random();
        int int16 = random14.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = null;
        faker17.fakeValuesService = fakeValuesService18;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Color color22 = faker21.color;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        java.lang.String str26 = faker24.numerify("");
        com.github.javafaker.Number number27 = faker24.number();
        faker21.number = number27;
        com.github.javafaker.Options options29 = faker21.options;
        com.github.javafaker.Color color30 = faker21.color;
        faker17.color = color30;
        com.github.javafaker.Book book32 = faker17.book;
        java.util.Random random33 = null;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random33);
        java.lang.String str36 = faker34.numerify("");
        com.github.javafaker.Book book37 = null;
        faker34.book = book37;
        com.github.javafaker.Internet internet39 = faker34.internet;
        com.github.javafaker.DateAndTime dateAndTime40 = faker34.date();
        com.github.javafaker.Code code41 = faker34.code;
        java.util.Random random42 = null;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(random42);
        com.github.javafaker.Color color44 = faker43.color;
        com.github.javafaker.Lorem lorem45 = faker43.lorem();
        com.github.javafaker.Finance finance46 = faker43.finance;
        com.github.javafaker.Number number47 = faker43.number();
        faker34.number = number47;
        faker17.number = number47;
        faker3.number = number47;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(company12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(number27);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(book32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(internet39);
        org.junit.Assert.assertNotNull(dateAndTime40);
        org.junit.Assert.assertNotNull(code41);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(lorem45);
        org.junit.Assert.assertNotNull(finance46);
        org.junit.Assert.assertNotNull(number47);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        random0.setSeed((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        java.util.stream.IntStream intStream13 = random0.ints((-1779109740), 1101885023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u6587");
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.DoubleStream doubleStream7 = random0.doubles();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.util.Locale locale1 = new java.util.Locale("en-GB");
        org.junit.Assert.assertEquals(locale1.toString(), "en-gb");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker1.fakeValuesService;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Color color7 = faker6.color;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Number number12 = faker9.number();
        faker6.number = number12;
        com.github.javafaker.service.RandomService randomService14 = null;
        faker6.randomService = randomService14;
        com.github.javafaker.Business business16 = faker6.business;
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.service.FakeValuesService fakeValuesService21 = null;
        faker20.fakeValuesService = fakeValuesService21;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Color color25 = faker24.color;
        java.util.Random random26 = null;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random26);
        java.lang.String str29 = faker27.numerify("");
        com.github.javafaker.Number number30 = faker27.number();
        faker24.number = number30;
        com.github.javafaker.Options options32 = faker24.options;
        com.github.javafaker.Color color33 = faker24.color;
        faker20.color = color33;
        faker6.color = color33;
        com.github.javafaker.Company company36 = faker6.company();
        faker1.company = company36;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(number30);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(company36);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setVariant("cinese");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getExtension('a');
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayName(locale7);
        java.util.Set<java.lang.Character> charSet11 = locale3.getExtensionKeys();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = locale13.getDisplayScript(locale14);
        java.util.Set<java.lang.String> strSet16 = locale13.getUnicodeLocaleKeys();
        java.lang.String str17 = locale3.getDisplayVariant(locale13);
        java.lang.String str18 = locale0.getDisplayName(locale13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-TW" + "'", str9, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str10, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italian" + "'", str18, "Italian");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Business business6 = faker1.business;
        com.github.javafaker.Company company7 = faker1.company();
        java.lang.String str9 = faker1.numerify("Taiwan");
        com.github.javafaker.Company company10 = faker1.company();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Taiwan" + "'", str9, "Taiwan");
        org.junit.Assert.assertNotNull(company10);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Address address7 = null;
        faker1.address = address7;
        com.github.javafaker.Code code9 = faker1.code();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.DateAndTime dateAndTime8 = null;
        faker7.dateAndTime = dateAndTime8;
        com.github.javafaker.Lorem lorem10 = faker7.lorem;
        com.github.javafaker.Address address11 = faker7.address;
        com.github.javafaker.Finance finance12 = faker7.finance();
        faker1.finance = finance12;
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getVariant();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale14);
        com.github.javafaker.Options options18 = faker17.options();
        faker1.options = options18;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Color color22 = faker21.color;
        com.github.javafaker.Lorem lorem23 = faker21.lorem();
        com.github.javafaker.Finance finance24 = faker21.finance;
        com.github.javafaker.Number number25 = faker21.number();
        com.github.javafaker.Options options26 = faker21.options;
        com.github.javafaker.Finance finance27 = faker21.finance;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.DateAndTime dateAndTime30 = null;
        faker29.dateAndTime = dateAndTime30;
        com.github.javafaker.Lorem lorem32 = faker29.lorem;
        com.github.javafaker.Address address33 = faker29.address;
        com.github.javafaker.Code code34 = faker29.code();
        faker21.code = code34;
        com.github.javafaker.Code code36 = faker21.code;
        faker1.code = code36;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertNotNull(finance24);
        org.junit.Assert.assertNotNull(number25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(finance27);
        org.junit.Assert.assertNotNull(lorem32);
        org.junit.Assert.assertNotNull(address33);
        org.junit.Assert.assertNotNull(code34);
        org.junit.Assert.assertNotNull(code36);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.util.Locale locale3 = new java.util.Locale("GBR", "\u82f1\u570b", "eng");
        java.lang.String str4 = locale3.getDisplayScript();
        java.lang.String str5 = locale3.getISO3Language();
        java.lang.String str6 = locale3.getDisplayScript();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.lang.String str11 = locale9.toLanguageTag();
        java.lang.String str12 = locale9.getDisplayLanguage();
        java.util.Random random13 = new java.util.Random();
        int int15 = random13.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale9, random13);
        int int18 = random13.nextInt();
        float float19 = random13.nextFloat();
        double double20 = random13.nextDouble();
        random13.setSeed((long) 100);
        java.util.stream.IntStream intStream24 = random13.ints(0L);
        float float25 = random13.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale3, random13);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: gbr_??_eng could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u570b_eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-TW" + "'", str11, "zh-TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese" + "'", str12, "Chinese");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1050268466) + "'", int18 == (-1050268466));
// flaky:         org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.38449985f + "'", float19 == 0.38449985f);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.4591827362440548d + "'", double20 == 0.4591827362440548d);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.7220096f + "'", float25 == 0.7220096f);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        random0.setSeed((long) (byte) 1);
        boolean boolean10 = random0.nextBoolean();
        java.util.stream.LongStream longStream12 = random0.longs(2241767268063067838L);
        long long13 = random0.nextLong();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1853403699951111791L + "'", long13 == 1853403699951111791L);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.util.Random random1 = new java.util.Random(2303685030000094928L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder18 = builder13.setExtension('x', "zh-TW");
        java.util.Locale.Builder builder19 = builder13.clearExtensions();
        java.util.Locale.Builder builder20 = builder13.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.UK;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
        java.lang.String str5 = locale1.getDisplayCountry(locale3);
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Taiwan" + "'", str5, "Taiwan");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Address address14 = faker12.address;
        com.github.javafaker.Options options15 = faker12.options;
        com.github.javafaker.Business business16 = faker12.business();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color21 = faker20.color;
        faker12.color = color21;
        faker1.color = color21;
        com.github.javafaker.Finance finance24 = faker1.finance;
        com.github.javafaker.Finance finance25 = faker1.finance;
        com.github.javafaker.service.FakeValuesService fakeValuesService26 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(finance24);
        org.junit.Assert.assertNotNull(finance25);
        org.junit.Assert.assertNotNull(fakeValuesService26);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Company company8 = null;
        faker7.company = company8;
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.DateAndTime dateAndTime11 = faker7.dateAndTime;
        com.github.javafaker.Finance finance12 = faker7.finance();
        faker1.finance = finance12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet;
        com.github.javafaker.DateAndTime dateAndTime21 = faker15.date();
        com.github.javafaker.Code code22 = faker15.code;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Color color25 = faker24.color;
        com.github.javafaker.Lorem lorem26 = faker24.lorem();
        com.github.javafaker.Finance finance27 = faker24.finance;
        com.github.javafaker.Number number28 = faker24.number();
        faker15.number = number28;
        java.util.Random random30 = null;
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.DateAndTime dateAndTime32 = null;
        faker31.dateAndTime = dateAndTime32;
        com.github.javafaker.Lorem lorem34 = faker31.lorem;
        com.github.javafaker.Address address35 = faker31.address;
        faker15.address = address35;
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.util.Random random38 = new java.util.Random();
        int int40 = random38.nextInt((int) (short) 1);
        random38.setSeed((long) 100);
        float float43 = random38.nextFloat();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(locale37, random38);
        com.github.javafaker.PhoneNumber phoneNumber45 = faker44.phoneNumber;
        faker15.phoneNumber = phoneNumber45;
        faker1.phoneNumber = phoneNumber45;
        com.github.javafaker.Internet internet48 = faker1.internet();
        com.github.javafaker.Finance finance49 = faker1.finance();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(dateAndTime21);
        org.junit.Assert.assertNotNull(code22);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(finance27);
        org.junit.Assert.assertNotNull(number28);
        org.junit.Assert.assertNotNull(lorem34);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.7220096f + "'", float43 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber45);
        org.junit.Assert.assertNotNull(internet48);
        org.junit.Assert.assertNotNull(finance49);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        int int11 = random6.nextInt();
        java.util.stream.LongStream longStream12 = random6.longs();
        java.util.stream.LongStream longStream13 = random6.longs();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1049981043) + "'", int11 == (-1049981043));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.FakeValuesService fakeValuesService1 = faker0.fakeValuesService;
        com.github.javafaker.Name name2 = faker0.name();
        org.junit.Assert.assertNotNull(fakeValuesService1);
        org.junit.Assert.assertNotNull(name2);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        long long23 = random17.nextLong();
        java.util.stream.IntStream intStream24 = random17.ints();
        java.util.stream.DoubleStream doubleStream26 = random17.doubles((long) 10);
        boolean boolean27 = random17.nextBoolean();
        random17.setSeed((long) 30);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 8495574453495449626L + "'", long23 == 8495574453495449626L);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(doubleStream26);
// flaky:         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Business business7 = faker1.business();
        com.github.javafaker.Options options8 = faker1.options;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Number number7 = faker1.number();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Number number12 = faker9.number();
        com.github.javafaker.Name name13 = faker9.name();
        faker1.name = name13;
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Company company17 = null;
        faker16.company = company17;
        com.github.javafaker.Name name19 = faker16.name();
        com.github.javafaker.DateAndTime dateAndTime20 = faker16.dateAndTime;
        com.github.javafaker.Finance finance21 = faker16.finance();
        faker1.finance = finance21;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Company company25 = null;
        faker24.company = company25;
        com.github.javafaker.Name name27 = faker24.name();
        com.github.javafaker.DateAndTime dateAndTime28 = faker24.dateAndTime;
        com.github.javafaker.service.RandomService randomService29 = faker24.randomService;
        faker1.randomService = randomService29;
        com.github.javafaker.PhoneNumber phoneNumber31 = faker1.phoneNumber();
        com.github.javafaker.Color color32 = faker1.color;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNotNull(finance21);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(dateAndTime28);
        org.junit.Assert.assertNotNull(randomService29);
        org.junit.Assert.assertNotNull(phoneNumber31);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        com.github.javafaker.Code code7 = faker1.code;
        java.lang.Class<?> wildcardClass8 = faker1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        boolean boolean1 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Company company5 = faker1.company;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale8, random12);
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.Lorem lorem17 = faker15.lorem();
        com.github.javafaker.Finance finance18 = faker15.finance;
        com.github.javafaker.Number number19 = faker15.number();
        com.github.javafaker.PhoneNumber phoneNumber20 = null;
        faker15.phoneNumber = phoneNumber20;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker15.fakeValuesService;
        faker13.fakeValuesService = fakeValuesService22;
        java.util.Random random24 = null;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Color color26 = faker25.color;
        java.util.Random random27 = null;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        java.lang.String str30 = faker28.numerify("");
        com.github.javafaker.Number number31 = faker28.number();
        faker25.number = number31;
        com.github.javafaker.service.RandomService randomService33 = null;
        faker25.randomService = randomService33;
        com.github.javafaker.Business business35 = faker25.business;
        faker13.business = business35;
        com.github.javafaker.Finance finance37 = faker13.finance();
        java.util.Random random38 = null;
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random38);
        com.github.javafaker.Color color40 = faker39.color;
        java.util.Random random41 = null;
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(random41);
        java.lang.String str44 = faker42.numerify("");
        com.github.javafaker.Number number45 = faker42.number();
        faker39.number = number45;
        com.github.javafaker.Company company47 = null;
        faker39.company = company47;
        java.util.Random random49 = null;
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker(random49);
        com.github.javafaker.Color color51 = faker50.color;
        com.github.javafaker.Address address52 = faker50.address;
        com.github.javafaker.Options options53 = faker50.options;
        com.github.javafaker.Business business54 = faker50.business();
        java.util.Random random55 = new java.util.Random();
        int int57 = random55.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random55);
        com.github.javafaker.Color color59 = faker58.color;
        faker50.color = color59;
        faker39.color = color59;
        com.github.javafaker.Finance finance62 = faker39.finance;
        faker13.finance = finance62;
        faker1.finance = finance62;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-TW" + "'", str10, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertNotNull(finance18);
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(number31);
        org.junit.Assert.assertNotNull(business35);
        org.junit.Assert.assertNotNull(finance37);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(number45);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(address52);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(business54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(finance62);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream7 = random0.ints();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream10 = random0.ints(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random0.doubles((-1730680208334655391L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale1.getCountry();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random();
        int int13 = random11.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        java.lang.String str20 = locale18.toLanguageTag();
        java.lang.String str21 = locale18.getDisplayLanguage();
        java.util.Random random22 = new java.util.Random();
        int int24 = random22.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale18, random22);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale7, random22);
        java.lang.String str28 = locale7.getDisplayCountry();
        java.lang.String str29 = locale1.getDisplayLanguage(locale7);
        java.util.Set<java.lang.Character> charSet30 = locale7.getExtensionKeys();
        java.lang.Class<?> wildcardClass31 = locale7.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-TW" + "'", str9, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese" + "'", str10, "Chinese");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh-TW" + "'", str20, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinese" + "'", str21, "Chinese");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Taiwan" + "'", str28, "Taiwan");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale2.getScript();
        boolean boolean4 = locale2.hasExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.lang.String str4 = locale0.getDisplayCountry(locale3);
        java.lang.Object obj5 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Etats-Unis" + "'", str4, "Etats-Unis");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "en_US");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder14 = builder8.clear();
        java.util.Locale.Builder builder16 = builder14.setRegion("en");
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale.Builder builder18 = builder16.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.DateAndTime dateAndTime7 = null;
        faker6.dateAndTime = dateAndTime7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem;
        com.github.javafaker.Address address10 = faker6.address;
        com.github.javafaker.Finance finance11 = faker6.finance();
        com.github.javafaker.Number number12 = faker6.number();
        com.github.javafaker.Name name13 = faker6.name;
        faker1.name = name13;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertNotNull(name13);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getDisplayLanguage(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.lang.String str7 = locale0.getDisplayScript(locale3);
        java.util.Locale locale8 = java.util.Locale.UK;
        java.lang.String str9 = locale3.getDisplayVariant(locale8);
        java.util.Random random10 = new java.util.Random();
        int int12 = random10.nextInt((int) (short) 1);
        random10.setSeed((long) 100);
        float float15 = random10.nextFloat();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale3, random10);
        boolean boolean17 = random10.nextBoolean();
        java.lang.Class<?> wildcardClass18 = random10.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-TW" + "'", str5, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese" + "'", str6, "Chinese");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.7220096f + "'", float15 == 0.7220096f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Code code4 = faker1.code;
        java.util.Random random5 = new java.util.Random();
        int int7 = random5.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Business business10 = faker8.business();
        faker1.business = business10;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Internet internet8 = faker1.internet;
        com.github.javafaker.Business business9 = faker1.business;
        com.github.javafaker.service.RandomService randomService10 = faker1.randomService;
        com.github.javafaker.Address address11 = faker1.address();
        com.github.javafaker.Address address12 = faker1.address;
        java.lang.String str14 = faker1.letterify("GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GB" + "'", str14, "GB");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        long long23 = random17.nextLong();
        java.util.stream.IntStream intStream24 = random17.ints();
        long long25 = random17.nextLong();
        java.util.Random random26 = new java.util.Random();
        int int28 = random26.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream30 = random26.longs((long) '#');
        java.util.stream.LongStream longStream32 = random26.longs((long) (short) 0);
        boolean boolean33 = random26.nextBoolean();
        float float34 = random26.nextFloat();
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 1 };
        random26.nextBytes(byteArray37);
        random17.nextBytes(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream43 = random17.ints((long) (-1910256435), (int) ' ', (-1139614796));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-5942895067702025776L) + "'", long23 == (-5942895067702025776L));
        org.junit.Assert.assertNotNull(intStream24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-9201733243859456893L) + "'", long25 == (-9201733243859456893L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(longStream30);
        org.junit.Assert.assertNotNull(longStream32);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.81670886f + "'", float34 == 0.81670886f);
        org.junit.Assert.assertNotNull(byteArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[68, 73]");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.setExtension('u', "zh-TW");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Book book6 = faker1.book();
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Address address10 = faker8.address;
        com.github.javafaker.Options options11 = faker8.options;
        com.github.javafaker.Business business12 = faker8.business();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        java.lang.String str17 = locale15.toLanguageTag();
        java.lang.String str18 = locale15.getDisplayLanguage();
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale15, random19);
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Color color23 = faker22.color;
        com.github.javafaker.Lorem lorem24 = faker22.lorem();
        com.github.javafaker.Finance finance25 = faker22.finance;
        com.github.javafaker.Number number26 = faker22.number();
        com.github.javafaker.PhoneNumber phoneNumber27 = null;
        faker22.phoneNumber = phoneNumber27;
        com.github.javafaker.service.FakeValuesService fakeValuesService29 = faker22.fakeValuesService;
        faker20.fakeValuesService = fakeValuesService29;
        faker8.fakeValuesService = fakeValuesService29;
        faker1.fakeValuesService = fakeValuesService29;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-TW" + "'", str17, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chinese" + "'", str18, "Chinese");
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(lorem24);
        org.junit.Assert.assertNotNull(finance25);
        org.junit.Assert.assertNotNull(number26);
        org.junit.Assert.assertNotNull(fakeValuesService29);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.DateAndTime dateAndTime7 = null;
        faker6.dateAndTime = dateAndTime7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem;
        com.github.javafaker.Address address10 = faker6.address;
        com.github.javafaker.Code code11 = faker6.code();
        faker1.code = code11;
        com.github.javafaker.Lorem lorem13 = faker1.lorem;
        com.github.javafaker.Address address14 = faker1.address;
        com.github.javafaker.Finance finance15 = faker1.finance;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(finance15);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        boolean boolean6 = locale2.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale9.getCountry();
        java.lang.String str13 = locale7.getDisplayName(locale9);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale14.getDisplayLanguage();
        java.lang.String str17 = locale9.getDisplayCountry(locale14);
        java.lang.String str18 = locale2.getDisplayScript(locale14);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English (Canada)" + "'", str13, "English (Canada)");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English" + "'", str16, "English");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Address address6 = faker1.address();
        com.github.javafaker.Finance finance7 = faker1.finance();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Random random9 = new java.util.Random();
        int int11 = random9.nextInt((int) (short) 1);
        random9.setSeed((long) 100);
        float float14 = random9.nextFloat();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale8, random9);
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Color color18 = faker17.color;
        com.github.javafaker.Options options19 = faker17.options();
        com.github.javafaker.Color color20 = faker17.color();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        java.lang.String str24 = faker22.numerify("");
        com.github.javafaker.Book book25 = null;
        faker22.book = book25;
        com.github.javafaker.Internet internet27 = faker22.internet;
        com.github.javafaker.DateAndTime dateAndTime28 = faker22.date();
        faker17.dateAndTime = dateAndTime28;
        java.util.Locale locale30 = java.util.Locale.US;
        java.util.Locale.setDefault(locale30);
        java.lang.String str32 = locale30.getVariant();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale30);
        com.github.javafaker.Options options34 = faker33.options();
        faker17.options = options34;
        com.github.javafaker.Options options36 = faker17.options();
        faker15.options = options36;
        faker1.options = options36;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.7220096f + "'", float14 == 0.7220096f);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(internet27);
        org.junit.Assert.assertNotNull(dateAndTime28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(options36);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Finance finance6 = faker1.finance();
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        java.lang.String str10 = faker8.numerify("");
        com.github.javafaker.Book book11 = null;
        faker8.book = book11;
        com.github.javafaker.Company company13 = null;
        faker8.company = company13;
        com.github.javafaker.Name name15 = faker8.name;
        faker1.name = name15;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(name15);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.util.Locale locale2 = new java.util.Locale("German", "China");
        org.junit.Assert.assertEquals(locale2.toString(), "german_CHINA");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = null;
        faker3.fakeValuesService = fakeValuesService4;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Color color8 = faker7.color;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        java.lang.String str12 = faker10.numerify("");
        com.github.javafaker.Number number13 = faker10.number();
        faker7.number = number13;
        com.github.javafaker.Options options15 = faker7.options;
        com.github.javafaker.Color color16 = faker7.color;
        faker3.color = color16;
        com.github.javafaker.Business business18 = faker3.business;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(business18);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Color color6 = faker1.color();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random0.doubles((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random0.longs((long) (-672439415));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale2.getCountry();
        java.lang.String str6 = locale0.getDisplayName(locale2);
        java.lang.String str7 = locale2.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (Canada)" + "'", str6, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.util.Set<java.lang.String> strSet14 = locale11.getUnicodeLocaleKeys();
        java.lang.String str15 = locale11.getDisplayVariant();
        java.lang.String str16 = locale1.getDisplayName(locale11);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Options options11 = faker9.options();
        com.github.javafaker.Color color12 = faker9.color();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        java.lang.String str16 = faker14.numerify("");
        com.github.javafaker.Book book17 = null;
        faker14.book = book17;
        com.github.javafaker.Internet internet19 = faker14.internet;
        com.github.javafaker.DateAndTime dateAndTime20 = faker14.date();
        faker9.dateAndTime = dateAndTime20;
        faker1.dateAndTime = dateAndTime20;
        com.github.javafaker.Book book23 = faker1.book;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = book23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = random0.nextInt((-1653753823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company4 = faker3.company;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Color color7 = faker6.color;
        com.github.javafaker.Lorem lorem8 = faker6.lorem();
        com.github.javafaker.Finance finance9 = faker6.finance;
        faker3.finance = finance9;
        com.github.javafaker.Book book11 = faker3.book;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.DateAndTime dateAndTime4 = faker1.date();
        com.github.javafaker.Code code5 = faker1.code;
        org.junit.Assert.assertNull(dateAndTime4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Finance finance13 = faker10.finance;
        com.github.javafaker.Number number14 = faker10.number();
        faker1.number = number14;
        com.github.javafaker.Address address16 = faker1.address();
        com.github.javafaker.Company company17 = faker1.company;
        com.github.javafaker.DateAndTime dateAndTime18 = faker1.dateAndTime;
        com.github.javafaker.Book book19 = faker1.book();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker1.fakeValuesService;
        java.lang.String str6 = faker1.bothify("\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str6, "\uc911\uad6d\uc5b4");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        long long23 = random17.nextLong();
        java.util.stream.IntStream intStream24 = random17.ints();
        java.util.stream.DoubleStream doubleStream26 = random17.doubles((long) 10);
        long long27 = random17.nextLong();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5932538894029640247L + "'", long23 == 5932538894029640247L);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(doubleStream26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 4442217214069690242L + "'", long27 == 4442217214069690242L);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.util.Locale locale3 = new java.util.Locale("Italian", "fr_CA", "Etats-Unis");
        org.junit.Assert.assertEquals(locale3.toString(), "italian_FR_CA_Etats-Unis");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.LongStream longStream8 = random0.longs((long) (-1), (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random0.longs((-2924985980665277209L), 6126480075163852417L, 5932538894029640247L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("TW");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str8 = languageRange7.getRange();
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str11 = languageRange10.getRange();
        java.lang.String str12 = languageRange10.getRange();
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str15 = languageRange14.getRange();
        java.lang.String str16 = languageRange14.getRange();
        java.lang.String str17 = languageRange14.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange7, languageRange10, languageRange14 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, strMap21);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList28);
        java.util.Locale locale32 = new java.util.Locale("");
        java.util.Locale locale34 = new java.util.Locale("");
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.util.Locale locale36 = java.util.Locale.ENGLISH;
        java.util.Locale locale37 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale32, locale34, locale35, locale36, locale37 };
        java.util.ArrayList<java.util.Locale> localeList39 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList39, localeArray38);
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strSet43);
        java.util.Locale.LanguageRange languageRange46 = new java.util.Locale.LanguageRange("GBR");
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] { languageRange46 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList55);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.Locale.FilteringMode filteringMode63 = null;
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList61, filteringMode63);
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList64);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList64);
        java.lang.String str67 = java.util.Locale.lookupTag(languageRangeList22, (java.util.Collection<java.lang.String>) strList66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gbr" + "'", str8, "gbr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "gbr" + "'", str11, "gbr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "gbr" + "'", str12, "gbr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "gbr" + "'", str15, "gbr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "gbr" + "'", str16, "gbr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "gbr" + "'", str17, "gbr");
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.JAPANESE;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale4);
        java.lang.String str13 = locale4.getLanguage();
        java.lang.String str14 = locale2.getDisplayLanguage(locale4);
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str16 = locale4.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-TW" + "'", str10, "zh-TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Japanese" + "'", str14, "Japanese");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale0.getDisplayVariant(locale8);
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale0.getDisplayName(locale11);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean15 = locale14.hasExtensions();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        java.lang.String str20 = locale18.toLanguageTag();
        java.lang.String str21 = locale14.getDisplayCountry(locale18);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.lang.String str24 = locale14.getDisplayLanguage(locale22);
        java.util.Locale locale25 = java.util.Locale.UK;
        java.lang.String str26 = locale25.getISO3Country();
        java.util.Locale locale27 = java.util.Locale.UK;
        java.lang.String str28 = locale27.getISO3Country();
        java.lang.String str29 = locale25.getDisplayCountry(locale27);
        java.lang.String str30 = locale22.getDisplayVariant(locale27);
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.lang.String str34 = locale32.getDisplayScript(locale33);
        java.lang.String str35 = locale33.toLanguageTag();
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        boolean boolean37 = locale36.hasExtensions();
        java.lang.String str38 = locale36.getDisplayScript();
        java.lang.String str39 = locale36.getCountry();
        java.lang.String str40 = locale33.getDisplayLanguage(locale36);
        java.lang.String str41 = locale22.getDisplayLanguage(locale33);
        java.lang.String str42 = locale22.getDisplayScript();
        java.lang.String str43 = locale0.getDisplayScript(locale22);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str7, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English (United States)" + "'", str12, "English (United States)");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh-TW" + "'", str20, "zh-TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GBR" + "'", str26, "GBR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "GBR" + "'", str28, "GBR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "United Kingdom" + "'", str29, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zh-TW" + "'", str35, "zh-TW");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Chinesisch" + "'", str40, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u82f1\u6587" + "'", str41, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        int int11 = random6.nextInt();
        float float12 = random6.nextFloat();
        double double13 = random6.nextDouble();
        random6.setSeed((long) 100);
        java.util.stream.IntStream intStream17 = random6.ints(0L);
        java.util.stream.DoubleStream doubleStream18 = random6.doubles();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-6855816) + "'", int11 == (-6855816));
// flaky:         org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.21365845f + "'", float12 == 0.21365845f);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8422823112682918d + "'", double13 == 0.8422823112682918d);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale4.getDisplayLanguage();
        boolean boolean8 = locale4.hasExtensions();
        java.lang.String str9 = locale0.getDisplayScript(locale4);
        java.lang.String str10 = locale0.toLanguageTag();
        java.lang.String str11 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TWN" + "'", str1, "TWN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-TW" + "'", str10, "zh-TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese (Taiwan)" + "'", str11, "Chinese (Taiwan)");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale locale4 = locale3.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("und", 0.7346627443280227d);
        java.lang.String str3 = languageRange2.getRange();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        java.lang.String str10 = faker8.numerify("");
        com.github.javafaker.Number number11 = faker8.number();
        faker5.number = number11;
        com.github.javafaker.service.RandomService randomService13 = null;
        faker5.randomService = randomService13;
        com.github.javafaker.Business business15 = faker5.business;
        boolean boolean16 = languageRange2.equals((java.lang.Object) business15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(business15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale6.getISO3Country();
        boolean boolean8 = locale6.hasExtensions();
        java.lang.String str9 = locale5.getDisplayVariant(locale6);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GBR" + "'", str7, "GBR");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream7 = random0.ints();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random0.doubles((double) 8367377884186257788L, (double) (-1678470588));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale2.getCountry();
        java.lang.String str6 = locale0.getDisplayName(locale2);
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.lang.String str10 = locale2.getDisplayCountry(locale7);
        java.lang.String str11 = locale2.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (Canada)" + "'", str6, "English (Canada)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBR" + "'", str1, "GBR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u56fd" + "'", str3, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "en_GB");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Color color7 = faker6.color;
        com.github.javafaker.Lorem lorem8 = faker6.lorem();
        com.github.javafaker.Finance finance9 = faker6.finance;
        com.github.javafaker.Number number10 = faker6.number();
        com.github.javafaker.PhoneNumber phoneNumber11 = null;
        faker6.phoneNumber = phoneNumber11;
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker6.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService13;
        com.github.javafaker.Options options15 = faker1.options;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(fakeValuesService13);
        org.junit.Assert.assertNotNull(options15);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Number number4 = faker1.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker1.fakeValuesService;
        com.github.javafaker.Code code6 = faker1.code;
        com.github.javafaker.Lorem lorem7 = faker1.lorem;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream7 = random0.ints((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints(2344386693685015907L, (int) (byte) -1, (-1653753823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder6 = builder3.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setVariant("TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.JAPANESE;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale4);
        java.lang.String str13 = locale4.getLanguage();
        java.lang.String str14 = locale2.getDisplayLanguage(locale4);
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-TW" + "'", str10, "zh-TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Japanese" + "'", str14, "Japanese");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale3.getCountry();
        java.lang.String str7 = locale0.getDisplayLanguage(locale3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-TW" + "'", str5, "zh-TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TW" + "'", str6, "TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.lang.String str4 = locale0.getDisplayCountry(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random();
        int int13 = random11.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        int int16 = random11.nextInt();
        double double17 = random11.nextDouble();
        java.util.stream.DoubleStream doubleStream20 = random11.doubles((-0.7512886166985184d), (double) (short) 0);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale3, random11);
        random11.setSeed((long) 'x');
        double double24 = random11.nextDouble();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-TW" + "'", str9, "zh-TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese" + "'", str10, "Chinese");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-636715060) + "'", int16 == (-636715060));
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9829708072240414d + "'", double17 == 0.9829708072240414d);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.7230846212249419d + "'", double24 == 0.7230846212249419d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        long long8 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) (-1678470588), (double) 0.80353475f, (double) 0.5448365f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 7487152727123452020L + "'", long8 == 7487152727123452020L);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        java.lang.Class<?> wildcardClass5 = finance4.getClass();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream5 = random1.longs((long) '#');
        java.util.stream.LongStream longStream7 = random1.longs((long) (short) 0);
        java.util.stream.IntStream intStream8 = random1.ints();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random1.doubles((double) '#', (double) (-553780171));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale2.getCountry();
        java.lang.String str6 = locale0.getDisplayName(locale2);
        java.lang.String str7 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (Canada)" + "'", str6, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Finance finance13 = faker10.finance;
        com.github.javafaker.Number number14 = faker10.number();
        faker1.number = number14;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.DateAndTime dateAndTime18 = null;
        faker17.dateAndTime = dateAndTime18;
        com.github.javafaker.Lorem lorem20 = faker17.lorem;
        com.github.javafaker.Address address21 = faker17.address;
        faker1.address = address21;
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.util.Random random24 = new java.util.Random();
        int int26 = random24.nextInt((int) (short) 1);
        random24.setSeed((long) 100);
        float float29 = random24.nextFloat();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale23, random24);
        com.github.javafaker.PhoneNumber phoneNumber31 = faker30.phoneNumber;
        faker1.phoneNumber = phoneNumber31;
        com.github.javafaker.Code code33 = faker1.code;
        com.github.javafaker.Code code34 = faker1.code();
        java.lang.Class<?> wildcardClass35 = faker1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(lorem20);
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.7220096f + "'", float29 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber31);
        org.junit.Assert.assertNotNull(code33);
        org.junit.Assert.assertNotNull(code34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale9 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale1.getDisplayLanguage(locale9);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale12.getISO3Country();
        java.util.Locale locale14 = java.util.Locale.UK;
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale12.getDisplayCountry(locale14);
        java.lang.String str17 = locale9.getDisplayVariant(locale14);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.lang.String str21 = locale19.getDisplayScript(locale20);
        java.lang.String str22 = locale20.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        boolean boolean24 = locale23.hasExtensions();
        java.lang.String str25 = locale23.getDisplayScript();
        java.lang.String str26 = locale23.getCountry();
        java.lang.String str27 = locale20.getDisplayLanguage(locale23);
        java.lang.String str28 = locale9.getDisplayLanguage(locale20);
        java.lang.String str29 = locale9.getDisplayScript();
        java.lang.String str30 = locale9.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GBR" + "'", str13, "GBR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GBR" + "'", str15, "GBR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United Kingdom" + "'", str16, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-TW" + "'", str22, "zh-TW");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinesisch" + "'", str27, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u82f1\u6587" + "'", str28, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en_GB" + "'", str30, "en_GB");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("USA", (double) 0.77680176f);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7768017649650574d + "'", double3 == 0.7768017649650574d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale locale11 = builder8.build();
        java.util.Locale.Builder builder13 = builder8.removeUnicodeLocaleAttribute("Italian");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Business business6 = faker1.business;
        com.github.javafaker.Company company7 = faker1.company();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Address address11 = faker9.address;
        com.github.javafaker.Options options12 = faker9.options;
        com.github.javafaker.Business business13 = faker9.business();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str19 = locale16.getDisplayLanguage();
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale16, random20);
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Color color24 = faker23.color;
        com.github.javafaker.Lorem lorem25 = faker23.lorem();
        com.github.javafaker.Finance finance26 = faker23.finance;
        com.github.javafaker.Number number27 = faker23.number();
        com.github.javafaker.PhoneNumber phoneNumber28 = null;
        faker23.phoneNumber = phoneNumber28;
        com.github.javafaker.service.FakeValuesService fakeValuesService30 = faker23.fakeValuesService;
        faker21.fakeValuesService = fakeValuesService30;
        faker9.fakeValuesService = fakeValuesService30;
        com.github.javafaker.Business business33 = faker9.business();
        faker1.business = business33;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-TW" + "'", str18, "zh-TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese" + "'", str19, "Chinese");
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(lorem25);
        org.junit.Assert.assertNotNull(finance26);
        org.junit.Assert.assertNotNull(number27);
        org.junit.Assert.assertNotNull(fakeValuesService30);
        org.junit.Assert.assertNotNull(business33);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        com.github.javafaker.Lorem lorem23 = faker22.lorem();
        java.lang.String str25 = faker22.numerify("TWN");
        com.github.javafaker.DateAndTime dateAndTime26 = faker22.date();
        com.github.javafaker.service.FakeValuesService fakeValuesService27 = faker22.fakeValuesService;
        com.github.javafaker.Address address28 = faker22.address();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "TWN" + "'", str25, "TWN");
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(fakeValuesService27);
        org.junit.Assert.assertNotNull(address28);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Address address10 = faker8.address;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business12 = faker11.business;
        faker8.business = business12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.DateAndTime dateAndTime17 = faker15.dateAndTime;
        com.github.javafaker.service.RandomService randomService18 = faker15.randomService;
        faker8.randomService = randomService18;
        faker1.randomService = randomService18;
        com.github.javafaker.Finance finance21 = null;
        faker1.finance = finance21;
        com.github.javafaker.Book book23 = faker1.book();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(book23);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.LongStream longStream14 = random8.longs((long) (short) 0);
        boolean boolean15 = random8.nextBoolean();
        float float16 = random8.nextFloat();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1 };
        random8.nextBytes(byteArray19);
        random0.nextBytes(byteArray19);
        java.util.stream.IntStream intStream23 = random0.ints(5152437456759013946L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream27 = random0.ints(2303685030000094928L, (-1), (-1193959466));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.3393988f + "'", float16 == 0.3393988f);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[40, 62]");
        org.junit.Assert.assertNotNull(intStream23);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        faker3.color = color6;
        com.github.javafaker.Lorem lorem8 = faker3.lorem;
        com.github.javafaker.Company company9 = faker3.company();
        com.github.javafaker.DateAndTime dateAndTime10 = faker3.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        com.github.javafaker.Code code9 = faker1.code();
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Color color12 = faker11.color;
        com.github.javafaker.DateAndTime dateAndTime13 = faker11.dateAndTime;
        com.github.javafaker.service.RandomService randomService14 = faker11.randomService;
        faker1.randomService = randomService14;
        com.github.javafaker.Lorem lorem16 = faker1.lorem;
        com.github.javafaker.Code code17 = faker1.code;
        com.github.javafaker.DateAndTime dateAndTime18 = faker1.dateAndTime;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(lorem16);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertNotNull(dateAndTime18);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        java.util.Locale locale17 = builder13.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder13.setScript("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Internet internet10 = faker1.internet();
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Lorem lorem14 = faker12.lorem();
        com.github.javafaker.Finance finance15 = faker12.finance;
        com.github.javafaker.Number number16 = faker12.number();
        com.github.javafaker.PhoneNumber phoneNumber17 = null;
        faker12.phoneNumber = phoneNumber17;
        com.github.javafaker.service.FakeValuesService fakeValuesService19 = faker12.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService19;
        com.github.javafaker.Code code21 = faker1.code();
        com.github.javafaker.Name name22 = faker1.name();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(lorem14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(fakeValuesService19);
        org.junit.Assert.assertNotNull(code21);
        org.junit.Assert.assertNotNull(name22);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.service.RandomService randomService8 = faker7.randomService;
        com.github.javafaker.Company company9 = faker7.company();
        com.github.javafaker.Code code10 = faker7.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertNotNull(randomService8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.service.RandomService randomService8 = faker7.randomService;
        com.github.javafaker.Company company9 = faker7.company();
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.util.Random random11 = new java.util.Random();
        int int13 = random11.nextInt((int) (short) 1);
        random11.setSeed((long) 100);
        float float16 = random11.nextFloat();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale10, random11);
        com.github.javafaker.PhoneNumber phoneNumber18 = faker17.phoneNumber;
        com.github.javafaker.Number number19 = faker17.number();
        faker7.number = number19;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertNotNull(randomService8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.7220096f + "'", float16 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber18);
        org.junit.Assert.assertNotNull(number19);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business3 = faker2.business;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Company company6 = null;
        faker5.company = company6;
        com.github.javafaker.Name name8 = faker5.name();
        faker2.name = name8;
        com.github.javafaker.Company company10 = faker2.company;
        faker1.company = company10;
        com.github.javafaker.Company company12 = faker1.company();
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(company12);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.lang.String str4 = locale0.getDisplayCountry(locale3);
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Etats-Unis" + "'", str4, "Etats-Unis");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u82f1\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        com.github.javafaker.Lorem lorem23 = faker22.lorem();
        java.util.Random random24 = null;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Color color26 = faker25.color;
        com.github.javafaker.Options options27 = faker25.options();
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.DateAndTime dateAndTime30 = null;
        faker29.dateAndTime = dateAndTime30;
        com.github.javafaker.Lorem lorem32 = faker29.lorem;
        faker25.lorem = lorem32;
        faker22.lorem = lorem32;
        com.github.javafaker.Lorem lorem35 = null;
        faker22.lorem = lorem35;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(lorem32);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Etats-Unis", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        random0.setSeed((long) (byte) 1);
        boolean boolean10 = random0.nextBoolean();
        java.util.stream.LongStream longStream12 = random0.longs(2241767268063067838L);
        java.util.stream.LongStream longStream13 = random0.longs();
        int int15 = random0.nextInt(19);
        java.util.stream.LongStream longStream16 = random0.longs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder4 = builder0.setLanguage("English");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setLanguageTag("Chinese");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder14 = builder8.clear();
        java.util.Locale.Builder builder16 = builder14.setRegion("en");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setScript("\u82f1\u570b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.FilteringMode filteringMode32 = null;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList30, filteringMode32);
        java.lang.String str34 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList40);
        java.util.Locale locale44 = new java.util.Locale("");
        java.util.Locale locale46 = new java.util.Locale("");
        java.util.Locale locale47 = java.util.Locale.ENGLISH;
        java.util.Locale locale48 = java.util.Locale.ENGLISH;
        java.util.Locale locale49 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale44, locale46, locale47, locale48, locale49 };
        java.util.ArrayList<java.util.Locale> localeList51 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList51, localeArray50);
        java.util.List<java.util.Locale> localeList53 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList51);
        java.util.Locale locale54 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList53);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(localeList53);
        org.junit.Assert.assertNull(locale54);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Code code4 = faker1.code();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker1.fakeValuesService;
        com.github.javafaker.DateAndTime dateAndTime6 = faker1.dateAndTime;
        com.github.javafaker.Options options7 = faker1.options();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Internet internet8 = faker1.internet;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        java.lang.String str12 = faker10.numerify("");
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Color color15 = faker14.color;
        com.github.javafaker.Address address16 = faker14.address;
        faker10.address = address16;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker10.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService18;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(fakeValuesService18);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        long long23 = random17.nextLong();
        float float24 = random17.nextFloat();
        java.util.stream.LongStream longStream25 = random17.longs();
        java.util.stream.DoubleStream doubleStream27 = random17.doubles((long) '4');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1923273391985775357L + "'", long23 == 1923273391985775357L);
// flaky:         org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.3301341f + "'", float24 == 0.3301341f);
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertNotNull(doubleStream27);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale0.getDisplayName(locale2);
        java.util.Random random5 = new java.util.Random();
        int int7 = random5.nextInt((int) (short) 1);
        random5.setSeed((long) 100);
        java.util.stream.IntStream intStream13 = random5.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean14 = random5.nextBoolean();
        java.util.stream.DoubleStream doubleStream16 = random5.doubles((long) (byte) 10);
        java.util.stream.IntStream intStream17 = random5.ints();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale0, random5);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.lang.String str25 = locale23.getDisplayScript(locale24);
        java.lang.String str26 = locale24.toLanguageTag();
        java.lang.String str27 = locale20.getDisplayCountry(locale24);
        java.lang.String str28 = locale0.getDisplayName(locale20);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese (Taiwan)" + "'", str4, "Chinese (Taiwan)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-TW" + "'", str26, "zh-TW");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chinese (Taiwan)" + "'", str28, "Chinese (Taiwan)");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) 10);
        java.util.stream.IntStream intStream8 = random0.ints();
        int int9 = random0.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1139614796) + "'", int9 == (-1139614796));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.util.Locale locale1 = new java.util.Locale("eng");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "eng");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale4.getDisplayLanguage();
        boolean boolean8 = locale4.hasExtensions();
        java.lang.String str9 = locale0.getDisplayScript(locale4);
        java.lang.String str10 = locale4.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale4.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TWN" + "'", str1, "TWN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random0.longs((long) (short) 10, (long) (-2137023216));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getCountry();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getDisplayCountry(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GB" + "'", str2, "GB");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("gbr");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList11);
        java.util.Locale locale15 = new java.util.Locale("");
        java.util.Locale locale17 = new java.util.Locale("");
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray21 = new java.util.Locale[] { locale15, locale17, locale18, locale19, locale20 };
        java.util.ArrayList<java.util.Locale> localeList22 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList22, localeArray21);
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale locale34 = new java.util.Locale("");
        java.util.Locale locale36 = new java.util.Locale("");
        java.util.Locale locale37 = java.util.Locale.ENGLISH;
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.util.Locale locale39 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale34, locale36, locale37, locale38, locale39 };
        java.util.ArrayList<java.util.Locale> localeList41 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList41, localeArray40);
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList41);
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList43);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList50);
        java.util.Locale locale54 = new java.util.Locale("");
        java.util.Locale locale56 = new java.util.Locale("");
        java.util.Locale locale57 = java.util.Locale.ENGLISH;
        java.util.Locale locale58 = java.util.Locale.ENGLISH;
        java.util.Locale locale59 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale54, locale56, locale57, locale58, locale59 };
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList61);
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, (java.util.Collection<java.lang.String>) strList69);
        java.util.Locale locale73 = new java.util.Locale("");
        java.util.Locale locale75 = new java.util.Locale("");
        java.util.Locale locale76 = java.util.Locale.ENGLISH;
        java.util.Locale locale77 = java.util.Locale.ENGLISH;
        java.util.Locale locale78 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray79 = new java.util.Locale[] { locale73, locale75, locale76, locale77, locale78 };
        java.util.ArrayList<java.util.Locale> localeList80 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList80, localeArray79);
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale locale85 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList82);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(localeList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localeList63);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertNull(locale85);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getISO3Country();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale5);
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.DateAndTime dateAndTime13 = null;
        faker12.dateAndTime = dateAndTime13;
        com.github.javafaker.Lorem lorem15 = faker12.lorem;
        com.github.javafaker.Address address16 = faker12.address;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color19 = faker18.color;
        com.github.javafaker.DateAndTime dateAndTime20 = faker18.dateAndTime;
        com.github.javafaker.service.RandomService randomService21 = faker18.randomService;
        faker12.randomService = randomService21;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Color color25 = faker24.color;
        java.util.Random random26 = null;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random26);
        java.lang.String str29 = faker27.numerify("");
        com.github.javafaker.Number number30 = faker27.number();
        faker24.number = number30;
        com.github.javafaker.service.RandomService randomService32 = null;
        faker24.randomService = randomService32;
        com.github.javafaker.Book book34 = faker24.book;
        com.github.javafaker.Business business35 = faker24.business;
        java.util.Random random36 = null;
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.Color color38 = faker37.color;
        java.util.Random random39 = null;
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random39);
        java.lang.String str42 = faker40.numerify("");
        com.github.javafaker.Number number43 = faker40.number();
        faker37.number = number43;
        com.github.javafaker.service.RandomService randomService45 = null;
        faker37.randomService = randomService45;
        com.github.javafaker.Book book47 = faker37.book;
        com.github.javafaker.Business business48 = faker37.business;
        faker24.business = business48;
        com.github.javafaker.Address address50 = faker24.address;
        faker12.address = address50;
        com.github.javafaker.Number number52 = faker12.number;
        faker10.number = number52;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TWN" + "'", str9, "TWN");
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNotNull(randomService21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(number30);
        org.junit.Assert.assertNotNull(book34);
        org.junit.Assert.assertNotNull(business35);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(number43);
        org.junit.Assert.assertNotNull(book47);
        org.junit.Assert.assertNotNull(business48);
        org.junit.Assert.assertNotNull(address50);
        org.junit.Assert.assertNotNull(number52);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        random0.setSeed((long) (-1020261286));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream16 = random0.longs((-582069258542454676L), (long) (-1020261286), (long) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Company company8 = null;
        faker7.company = company8;
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.DateAndTime dateAndTime11 = faker7.dateAndTime;
        com.github.javafaker.Finance finance12 = faker7.finance();
        faker1.finance = finance12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet;
        com.github.javafaker.DateAndTime dateAndTime21 = faker15.date();
        com.github.javafaker.Code code22 = faker15.code;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Color color25 = faker24.color;
        com.github.javafaker.Lorem lorem26 = faker24.lorem();
        com.github.javafaker.Finance finance27 = faker24.finance;
        com.github.javafaker.Number number28 = faker24.number();
        faker15.number = number28;
        java.util.Random random30 = null;
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.DateAndTime dateAndTime32 = null;
        faker31.dateAndTime = dateAndTime32;
        com.github.javafaker.Lorem lorem34 = faker31.lorem;
        com.github.javafaker.Address address35 = faker31.address;
        faker15.address = address35;
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.util.Random random38 = new java.util.Random();
        int int40 = random38.nextInt((int) (short) 1);
        random38.setSeed((long) 100);
        float float43 = random38.nextFloat();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(locale37, random38);
        com.github.javafaker.PhoneNumber phoneNumber45 = faker44.phoneNumber;
        faker15.phoneNumber = phoneNumber45;
        faker1.phoneNumber = phoneNumber45;
        com.github.javafaker.Finance finance48 = faker1.finance;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(dateAndTime21);
        org.junit.Assert.assertNotNull(code22);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(finance27);
        org.junit.Assert.assertNotNull(number28);
        org.junit.Assert.assertNotNull(lorem34);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.7220096f + "'", float43 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber45);
        org.junit.Assert.assertNotNull(finance48);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Company company7 = faker1.company();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Address address12 = faker9.address;
        com.github.javafaker.Options options13 = faker9.options();
        faker1.options = options13;
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        java.lang.String str18 = faker16.numerify("");
        com.github.javafaker.Book book19 = null;
        faker16.book = book19;
        com.github.javafaker.Internet internet21 = faker16.internet;
        com.github.javafaker.Internet internet22 = faker16.internet;
        com.github.javafaker.Lorem lorem23 = faker16.lorem();
        java.util.Random random24 = null;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Color color26 = faker25.color;
        java.util.Random random27 = null;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        java.lang.String str30 = faker28.numerify("");
        com.github.javafaker.Number number31 = faker28.number();
        faker25.number = number31;
        faker16.number = number31;
        com.github.javafaker.Code code34 = faker16.code;
        faker1.code = code34;
        java.util.Random random36 = null;
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random36);
        java.lang.String str39 = faker37.numerify("");
        com.github.javafaker.Book book40 = null;
        faker37.book = book40;
        java.util.Random random42 = null;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(random42);
        com.github.javafaker.DateAndTime dateAndTime44 = null;
        faker43.dateAndTime = dateAndTime44;
        com.github.javafaker.Lorem lorem46 = faker43.lorem;
        com.github.javafaker.Address address47 = faker43.address;
        com.github.javafaker.Finance finance48 = faker43.finance();
        faker37.finance = finance48;
        faker1.finance = finance48;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(internet21);
        org.junit.Assert.assertNotNull(internet22);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(number31);
        org.junit.Assert.assertNotNull(code34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(lorem46);
        org.junit.Assert.assertNotNull(address47);
        org.junit.Assert.assertNotNull(finance48);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints((long) 1415234792, (-651874858), (-1049981043));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Random random4 = new java.util.Random();
        java.util.stream.LongStream longStream5 = random4.longs();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2, random4);
        long long7 = random4.nextLong();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1148288786617761183L + "'", long7 == 1148288786617761183L);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = null;
        faker1.company = company2;
        com.github.javafaker.Name name4 = faker1.name();
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Name name6 = faker1.name();
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.LongStream longStream8 = random0.longs((long) (-1), (long) (byte) 1);
        int int9 = random0.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1139614796) + "'", int9 == (-1139614796));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream8 = random0.ints((-1637860121), 10);
        int int9 = random0.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1139614796) + "'", int9 == (-1139614796));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        java.util.stream.LongStream longStream25 = random17.longs((long) 'x', 1923273391985775357L);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(longStream25);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayScript();
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.lang.String str5 = locale1.getDisplayCountry(locale4);
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        java.lang.String str7 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str4 = languageRange3.getRange();
        java.lang.String str5 = languageRange3.getRange();
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("und", 0.7346627443280227d);
        java.lang.String str9 = languageRange8.getRange();
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("GBR");
        double double12 = languageRange11.getWeight();
        java.lang.String str13 = languageRange11.getRange();
        java.lang.String str14 = languageRange11.getRange();
        java.util.Locale.LanguageRange languageRange16 = new java.util.Locale.LanguageRange("Chinese");
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("ZHO");
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("ZHO");
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("Chinese");
        java.util.Locale.LanguageRange languageRange25 = new java.util.Locale.LanguageRange("USA", (double) 0.77680176f);
        java.util.Locale.LanguageRange languageRange27 = new java.util.Locale.LanguageRange("GBR");
        double double28 = languageRange27.getWeight();
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("eng");
        double double31 = languageRange30.getWeight();
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("TW");
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("Chinese");
        java.util.Locale.LanguageRange languageRange38 = new java.util.Locale.LanguageRange("und", 0.7346627443280227d);
        java.lang.String str39 = languageRange38.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3, languageRange8, languageRange11, languageRange16, languageRange18, languageRange20, languageRange22, languageRange25, languageRange27, languageRange30, languageRange33, languageRange35, languageRange38 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, strMap43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gbr" + "'", str4, "gbr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "und" + "'", str9, "und");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gbr" + "'", str13, "gbr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gbr" + "'", str14, "gbr");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "und" + "'", str39, "und");
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(languageRangeList44);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        java.lang.String str8 = locale0.getDisplayCountry();
        java.util.Locale.setDefault(locale0);
        java.lang.String str10 = locale0.getDisplayVariant();
        java.lang.String str11 = locale0.getISO3Language();
        java.lang.String str12 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "kor" + "'", str11, "kor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ko" + "'", str12, "ko");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uc774\ud0c8\ub9ac\uc544" + "'", str1, "\uc774\ud0c8\ub9ac\uc544");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ub3c5\uc77c" + "'", str1, "\ub3c5\uc77c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de-DE" + "'", str2, "de-DE");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        java.lang.String str10 = faker8.numerify("");
        com.github.javafaker.Book book11 = null;
        faker8.book = book11;
        com.github.javafaker.Internet internet13 = faker8.internet;
        com.github.javafaker.Internet internet14 = faker8.internet;
        com.github.javafaker.Code code15 = faker8.code;
        faker1.code = code15;
        com.github.javafaker.Company company17 = faker1.company;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(internet13);
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(company17);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber6 = null;
        faker1.phoneNumber = phoneNumber6;
        com.github.javafaker.Finance finance8 = faker1.finance;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        faker1.color = color11;
        com.github.javafaker.Address address13 = faker1.address();
        com.github.javafaker.Internet internet14 = faker1.internet;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(address13);
        org.junit.Assert.assertNotNull(internet14);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale2.getDisplayScript(locale8);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale10.getVariant();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean15 = locale14.hasExtensions();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        java.lang.String str20 = locale18.toLanguageTag();
        java.lang.String str21 = locale14.getDisplayCountry(locale18);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.lang.String str24 = locale14.getDisplayLanguage(locale22);
        java.lang.String str25 = locale10.getDisplayVariant(locale22);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        java.lang.String str29 = locale27.getDisplayScript(locale28);
        java.lang.String str30 = locale27.getDisplayScript();
        java.lang.String str31 = locale27.getCountry();
        java.lang.String str32 = locale27.getCountry();
        java.lang.String str33 = locale27.getDisplayName();
        java.lang.String str34 = locale22.getDisplayScript(locale27);
        java.lang.String str35 = locale8.getDisplayLanguage(locale27);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str5, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh-TW" + "'", str20, "zh-TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getISO3Country();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale5);
        java.lang.String str11 = locale5.getDisplayCountry();
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale12.getCountry();
        java.lang.String str14 = locale5.getDisplayCountry(locale12);
        java.util.Set<java.lang.String> strSet15 = locale12.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TWN" + "'", str9, "TWN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ub300\ub9cc" + "'", str11, "\ub300\ub9cc");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CA" + "'", str13, "CA");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Taiwan" + "'", str14, "Taiwan");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((long) (short) 10, (double) 10.0f, (double) '4');
        java.util.Random random9 = new java.util.Random();
        int int11 = random9.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream13 = random9.longs((long) '#');
        java.util.stream.LongStream longStream15 = random9.longs((long) (short) 0);
        boolean boolean16 = random9.nextBoolean();
        random9.setSeed((long) 1);
        double double19 = random9.nextGaussian();
        java.util.Random random20 = new java.util.Random();
        int int22 = random20.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream24 = random20.longs((long) '#');
        java.util.stream.LongStream longStream26 = random20.longs((long) (short) 0);
        boolean boolean27 = random20.nextBoolean();
        float float28 = random20.nextFloat();
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) 1 };
        random20.nextBytes(byteArray31);
        random9.nextBytes(byteArray31);
        random0.nextBytes(byteArray31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.561581040188955d + "'", double19 == 1.561581040188955d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertNotNull(longStream26);
// flaky:         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.4937576f + "'", float28 == 0.4937576f);
        org.junit.Assert.assertNotNull(byteArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-114, -34]");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.numerify("");
        com.github.javafaker.Book book8 = null;
        faker5.book = book8;
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        faker1.phoneNumber = phoneNumber11;
        com.github.javafaker.DateAndTime dateAndTime13 = faker1.dateAndTime;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet();
        com.github.javafaker.Lorem lorem21 = faker15.lorem;
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.DateAndTime dateAndTime24 = null;
        faker23.dateAndTime = dateAndTime24;
        com.github.javafaker.Lorem lorem26 = faker23.lorem;
        faker15.lorem = lorem26;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Color color30 = faker29.color;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Number number35 = faker32.number();
        faker29.number = number35;
        com.github.javafaker.Company company37 = null;
        faker29.company = company37;
        com.github.javafaker.Options options39 = faker29.options;
        com.github.javafaker.Code code40 = faker29.code;
        faker15.code = code40;
        faker1.code = code40;
        java.util.Random random43 = null;
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        java.lang.String str46 = faker44.numerify("");
        com.github.javafaker.Book book47 = null;
        faker44.book = book47;
        com.github.javafaker.Internet internet49 = faker44.internet;
        com.github.javafaker.DateAndTime dateAndTime50 = faker44.date();
        com.github.javafaker.Code code51 = faker44.code;
        java.util.Random random52 = null;
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(random52);
        com.github.javafaker.Color color54 = faker53.color;
        com.github.javafaker.Lorem lorem55 = faker53.lorem();
        com.github.javafaker.Finance finance56 = faker53.finance;
        com.github.javafaker.Number number57 = faker53.number();
        faker44.number = number57;
        com.github.javafaker.Address address59 = faker44.address();
        com.github.javafaker.Company company60 = faker44.company;
        faker1.company = company60;
        com.github.javafaker.Book book62 = faker1.book();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(lorem21);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(number35);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(code40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(internet49);
        org.junit.Assert.assertNotNull(dateAndTime50);
        org.junit.Assert.assertNotNull(code51);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(lorem55);
        org.junit.Assert.assertNotNull(finance56);
        org.junit.Assert.assertNotNull(number57);
        org.junit.Assert.assertNotNull(address59);
        org.junit.Assert.assertNotNull(company60);
        org.junit.Assert.assertNotNull(book62);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getCountry();
        java.util.Random random10 = new java.util.Random();
        int int12 = random10.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream14 = random10.longs((long) '#');
        java.util.stream.LongStream longStream16 = random10.longs((long) (short) 0);
        boolean boolean17 = random10.nextBoolean();
        float float18 = random10.nextFloat();
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 1 };
        random10.nextBytes(byteArray21);
        java.util.stream.IntStream intStream26 = random10.ints((long) (short) 100, (int) (byte) -1, (int) (byte) 100);
        double double27 = random10.nextDouble();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale5, random10);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TW" + "'", str9, "TW");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8040548f + "'", float18 == 0.8040548f);
        org.junit.Assert.assertNotNull(byteArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[63, 39]");
        org.junit.Assert.assertNotNull(intStream26);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.8072610057339751d + "'", double27 == 0.8072610057339751d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.53235507f + "'", float2 == 0.53235507f);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address;
        com.github.javafaker.Address address4 = faker0.address();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Color color7 = faker6.color;
        com.github.javafaker.Lorem lorem8 = faker6.lorem();
        com.github.javafaker.Finance finance9 = faker6.finance;
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Color color12 = faker11.color;
        com.github.javafaker.Lorem lorem13 = faker11.lorem();
        com.github.javafaker.Finance finance14 = faker11.finance;
        com.github.javafaker.Number number15 = faker11.number();
        com.github.javafaker.PhoneNumber phoneNumber16 = null;
        faker11.phoneNumber = phoneNumber16;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker11.fakeValuesService;
        faker6.fakeValuesService = fakeValuesService18;
        faker0.fakeValuesService = fakeValuesService18;
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNotNull(number15);
        org.junit.Assert.assertNotNull(fakeValuesService18);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        double double23 = random17.nextDouble();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.015733131761604846d + "'", double23 == 0.015733131761604846d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("allemand");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.LongStream longStream14 = random8.longs((long) (short) 0);
        boolean boolean15 = random8.nextBoolean();
        float float16 = random8.nextFloat();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1 };
        random8.nextBytes(byteArray19);
        random0.nextBytes(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream23 = random0.longs((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8164393f + "'", float16 == 0.8164393f);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-23, 65]");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        java.lang.String str5 = faker3.numerify("");
        com.github.javafaker.Book book6 = null;
        faker3.book = book6;
        com.github.javafaker.Internet internet8 = faker3.internet;
        com.github.javafaker.DateAndTime dateAndTime9 = faker3.date();
        com.github.javafaker.Code code10 = faker3.code;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Name name14 = faker12.name();
        com.github.javafaker.Options options15 = faker12.options;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Color color18 = faker17.color;
        com.github.javafaker.Options options19 = faker17.options();
        com.github.javafaker.Color color20 = faker17.color();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        java.lang.String str24 = faker22.numerify("");
        com.github.javafaker.Book book25 = null;
        faker22.book = book25;
        com.github.javafaker.Internet internet27 = faker22.internet;
        com.github.javafaker.DateAndTime dateAndTime28 = faker22.date();
        faker17.dateAndTime = dateAndTime28;
        faker12.dateAndTime = dateAndTime28;
        faker3.dateAndTime = dateAndTime28;
        faker0.dateAndTime = dateAndTime28;
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(internet27);
        org.junit.Assert.assertNotNull(dateAndTime28);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguage("\uc774\ud0c8\ub9ac\uc544");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.String str3 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        int int11 = random6.nextInt();
        float float12 = random6.nextFloat();
        java.util.stream.IntStream intStream14 = random6.ints((long) (byte) 100);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1786923775 + "'", int11 == 1786923775);
// flaky:         org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.86807615f + "'", float12 == 0.86807615f);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getDisplayLanguage();
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.lang.String str6 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de" + "'", str6, "de");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Address address10 = faker8.address;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business12 = faker11.business;
        faker8.business = business12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.DateAndTime dateAndTime17 = faker15.dateAndTime;
        com.github.javafaker.service.RandomService randomService18 = faker15.randomService;
        faker8.randomService = randomService18;
        faker1.randomService = randomService18;
        com.github.javafaker.Finance finance21 = null;
        faker1.finance = finance21;
        com.github.javafaker.Internet internet23 = faker1.internet;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(internet23);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.util.Locale locale1 = new java.util.Locale("USA");
        org.junit.Assert.assertEquals(locale1.toString(), "usa");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.util.Locale locale1 = new java.util.Locale("\uc601\uc5b4");
        org.junit.Assert.assertEquals(locale1.toString(), "\uc601\uc5b4");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setLanguage("\u82f1\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Lorem lorem7 = faker1.lorem;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.DateAndTime dateAndTime10 = null;
        faker9.dateAndTime = dateAndTime10;
        com.github.javafaker.Lorem lorem12 = faker9.lorem;
        faker1.lorem = lorem12;
        java.lang.String str15 = faker1.numerify("Korean");
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business17 = faker16.business;
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Company company20 = null;
        faker19.company = company20;
        com.github.javafaker.Name name22 = faker19.name();
        faker16.name = name22;
        com.github.javafaker.Lorem lorem24 = faker16.lorem();
        com.github.javafaker.service.RandomService randomService25 = faker16.randomService;
        faker1.randomService = randomService25;
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.lang.String str30 = locale28.getDisplayScript(locale29);
        java.lang.String str31 = locale29.toLanguageTag();
        java.lang.String str32 = locale29.getDisplayLanguage();
        java.util.Random random33 = null;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(locale29, random33);
        java.util.Random random35 = null;
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(random35);
        com.github.javafaker.Color color37 = faker36.color;
        com.github.javafaker.Lorem lorem38 = faker36.lorem();
        com.github.javafaker.Finance finance39 = faker36.finance;
        com.github.javafaker.Number number40 = faker36.number();
        com.github.javafaker.PhoneNumber phoneNumber41 = null;
        faker36.phoneNumber = phoneNumber41;
        com.github.javafaker.service.FakeValuesService fakeValuesService43 = faker36.fakeValuesService;
        faker34.fakeValuesService = fakeValuesService43;
        java.util.Random random45 = null;
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker(random45);
        com.github.javafaker.Color color47 = faker46.color;
        java.util.Random random48 = null;
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(random48);
        java.lang.String str51 = faker49.numerify("");
        com.github.javafaker.Number number52 = faker49.number();
        faker46.number = number52;
        com.github.javafaker.service.RandomService randomService54 = null;
        faker46.randomService = randomService54;
        com.github.javafaker.Business business56 = faker46.business;
        faker34.business = business56;
        com.github.javafaker.Finance finance58 = faker34.finance();
        faker1.finance = finance58;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Korean" + "'", str15, "Korean");
        org.junit.Assert.assertNotNull(business17);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(lorem24);
        org.junit.Assert.assertNotNull(randomService25);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-TW" + "'", str31, "zh-TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Chinese" + "'", str32, "Chinese");
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(lorem38);
        org.junit.Assert.assertNotNull(finance39);
        org.junit.Assert.assertNotNull(number40);
        org.junit.Assert.assertNotNull(fakeValuesService43);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(number52);
        org.junit.Assert.assertNotNull(business56);
        org.junit.Assert.assertNotNull(finance58);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Lorem lorem8 = faker1.lorem();
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        java.lang.String str15 = faker13.numerify("");
        com.github.javafaker.Number number16 = faker13.number();
        faker10.number = number16;
        faker1.number = number16;
        com.github.javafaker.Code code19 = faker1.code;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Color color22 = faker21.color;
        com.github.javafaker.Lorem lorem23 = faker21.lorem();
        com.github.javafaker.Book book24 = faker21.book();
        faker1.book = book24;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertNotNull(book24);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.util.Locale locale1 = new java.util.Locale("\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)");
        org.junit.Assert.assertEquals(locale1.toString(), "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder4 = builder0.setLanguage("English");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("English");
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale9.getDisplayName();
        java.util.Locale.Builder builder12 = builder8.setLocale(locale9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "United States" + "'", str10, "United States");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English (United States)" + "'", str11, "English (United States)");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Company company4 = null;
        faker3.company = company4;
        com.github.javafaker.Name name6 = faker3.name();
        faker0.name = name6;
        com.github.javafaker.Color color8 = faker0.color();
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Options options12 = faker10.options();
        faker0.options = options12;
        com.github.javafaker.DateAndTime dateAndTime14 = faker0.dateAndTime;
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(dateAndTime14);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale1.getCountry();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale6.getDisplayVariant();
        java.lang.Object obj8 = locale6.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Company company4 = null;
        faker3.company = company4;
        com.github.javafaker.Name name6 = faker3.name();
        faker0.name = name6;
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Company company9 = faker0.company();
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(company9);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = null;
        faker1.company = company2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker1.phoneNumber();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.DateAndTime dateAndTime7 = null;
        faker6.dateAndTime = dateAndTime7;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.DateAndTime dateAndTime11 = null;
        faker10.dateAndTime = dateAndTime11;
        com.github.javafaker.Lorem lorem13 = faker10.lorem;
        com.github.javafaker.Address address14 = faker10.address;
        faker6.address = address14;
        com.github.javafaker.Name name16 = faker6.name();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business18 = faker17.business;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Company company21 = null;
        faker20.company = company21;
        com.github.javafaker.Name name23 = faker20.name();
        faker17.name = name23;
        com.github.javafaker.Company company25 = faker17.company;
        faker6.company = company25;
        com.github.javafaker.Company company27 = faker6.company();
        faker1.company = company27;
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(business18);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(company25);
        org.junit.Assert.assertNotNull(company27);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Company company4 = null;
        faker3.company = company4;
        com.github.javafaker.Name name6 = faker3.name();
        faker0.name = name6;
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale8.getVariant();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale8);
        com.github.javafaker.Options options12 = faker11.options();
        faker0.options = options12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.Options options17 = faker15.options();
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.DateAndTime dateAndTime20 = null;
        faker19.dateAndTime = dateAndTime20;
        com.github.javafaker.Lorem lorem22 = faker19.lorem;
        faker15.lorem = lorem22;
        com.github.javafaker.Name name24 = faker15.name;
        com.github.javafaker.Address address25 = faker15.address();
        com.github.javafaker.Number number26 = faker15.number;
        com.github.javafaker.Book book27 = faker15.book;
        faker0.book = book27;
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(lorem22);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(address25);
        org.junit.Assert.assertNotNull(number26);
        org.junit.Assert.assertNotNull(book27);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale2.getISO3Country();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean8 = locale7.hasExtensions();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.lang.String str13 = locale11.toLanguageTag();
        java.lang.String str14 = locale7.getDisplayCountry(locale11);
        java.lang.String str15 = locale11.getISO3Country();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale11);
        java.util.Locale.setDefault(category0, locale11);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean21 = locale20.hasExtensions();
        java.lang.String str22 = locale20.getISO3Country();
        java.util.Locale.setDefault(category18, locale20);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean26 = locale25.hasExtensions();
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.lang.String str30 = locale28.getDisplayScript(locale29);
        java.lang.String str31 = locale29.toLanguageTag();
        java.lang.String str32 = locale25.getDisplayCountry(locale29);
        java.lang.String str33 = locale29.getISO3Country();
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(locale29);
        java.util.Locale.setDefault(category18, locale29);
        java.lang.String str36 = locale29.getCountry();
        java.util.Locale.setDefault(category0, locale29);
        java.util.Locale locale38 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-TW" + "'", str13, "zh-TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "TWN" + "'", str15, "TWN");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-TW" + "'", str31, "zh-TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "TWN" + "'", str33, "TWN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "TW" + "'", str36, "TW");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream4 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) 0, 1L);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = random0.nextInt((-1129572628));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        java.lang.String str23 = locale2.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "TWN" + "'", str23, "TWN");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address;
        com.github.javafaker.Address address4 = faker0.address();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        java.lang.String str8 = faker6.numerify("");
        com.github.javafaker.Book book9 = null;
        faker6.book = book9;
        com.github.javafaker.Internet internet11 = faker6.internet;
        com.github.javafaker.DateAndTime dateAndTime12 = faker6.date();
        com.github.javafaker.Code code13 = faker6.code;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.Lorem lorem17 = faker15.lorem();
        com.github.javafaker.Finance finance18 = faker15.finance;
        com.github.javafaker.Number number19 = faker15.number();
        faker6.number = number19;
        faker0.number = number19;
        com.github.javafaker.DateAndTime dateAndTime22 = faker0.date();
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(code13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertNotNull(finance18);
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertNotNull(dateAndTime22);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("TWN");
        java.util.Locale.Builder builder13 = builder11.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setUnicodeLocaleKeyword("Chinese", "gbr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Chinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.setExtension('u', "zh-TW");
        java.util.Locale.Builder builder8 = builder0.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en_GB");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_gb");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh_CN", 0.9449636221296464d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_cn");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Address address6 = faker1.address();
        com.github.javafaker.Finance finance7 = faker1.finance();
        com.github.javafaker.Lorem lorem8 = faker1.lorem();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.LongStream longStream14 = random8.longs((long) (short) 0);
        boolean boolean15 = random8.nextBoolean();
        float float16 = random8.nextFloat();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1 };
        random8.nextBytes(byteArray19);
        random0.nextBytes(byteArray19);
        java.util.Random random22 = new java.util.Random();
        int int24 = random22.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream26 = random22.longs((long) '#');
        java.util.stream.LongStream longStream28 = random22.longs((long) (short) 0);
        boolean boolean29 = random22.nextBoolean();
        float float30 = random22.nextFloat();
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 1 };
        random22.nextBytes(byteArray33);
        random0.nextBytes(byteArray33);
        long long36 = random0.nextLong();
        java.util.stream.IntStream intStream37 = random0.ints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.59842414f + "'", float16 == 0.59842414f);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[39, 14]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(longStream28);
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.19999516f + "'", float30 == 0.19999516f);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[53, 99]");
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5386219568769741876L + "'", long36 == 5386219568769741876L);
        org.junit.Assert.assertNotNull(intStream37);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.String str3 = locale0.getCountry();
        java.lang.String str4 = locale0.getDisplayCountry();
        java.lang.String str5 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clear();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale9.getISO3Country();
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getISO3Country();
        java.lang.String str13 = locale9.getDisplayCountry(locale11);
        java.lang.String str14 = locale8.getDisplayScript(locale11);
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str18 = locale15.getDisplayName(locale17);
        java.lang.String str19 = locale15.getDisplayName();
        java.lang.String str20 = locale11.getDisplayName(locale15);
        java.util.Locale.Builder builder21 = builder0.setLocale(locale15);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.lang.String str23 = locale22.getDisplayCountry();
        boolean boolean24 = locale22.hasExtensions();
        java.util.Locale.Builder builder25 = builder21.setLocale(locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder21.addUnicodeLocaleAttribute("fr_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr_CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GBR" + "'", str10, "GBR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GBR" + "'", str12, "GBR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "United Kingdom" + "'", str13, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English" + "'", str19, "English");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English (United Kingdom)" + "'", str20, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "United Kingdom" + "'", str23, "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Finance finance13 = faker10.finance;
        com.github.javafaker.Number number14 = faker10.number();
        faker1.number = number14;
        com.github.javafaker.Address address16 = faker1.address();
        com.github.javafaker.Finance finance17 = faker1.finance;
        com.github.javafaker.Name name18 = faker1.name();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(finance17);
        org.junit.Assert.assertNotNull(name18);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        com.github.javafaker.Address address9 = faker5.address;
        faker1.address = address9;
        com.github.javafaker.Name name11 = faker1.name();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business13 = faker12.business;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Company company16 = null;
        faker15.company = company16;
        com.github.javafaker.Name name18 = faker15.name();
        faker12.name = name18;
        com.github.javafaker.Company company20 = faker12.company;
        faker1.company = company20;
        com.github.javafaker.service.RandomService randomService22 = faker1.randomService;
        com.github.javafaker.Options options23 = faker1.options;
        com.github.javafaker.DateAndTime dateAndTime24 = faker1.date();
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertNotNull(randomService22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNull(dateAndTime24);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clear();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale9.getISO3Country();
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getISO3Country();
        java.lang.String str13 = locale9.getDisplayCountry(locale11);
        java.lang.String str14 = locale8.getDisplayScript(locale11);
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str18 = locale15.getDisplayName(locale17);
        java.lang.String str19 = locale15.getDisplayName();
        java.lang.String str20 = locale11.getDisplayName(locale15);
        java.util.Locale.Builder builder21 = builder0.setLocale(locale15);
        java.lang.String str22 = locale15.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GBR" + "'", str10, "GBR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GBR" + "'", str12, "GBR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "United Kingdom" + "'", str13, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English" + "'", str19, "English");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English (United Kingdom)" + "'", str20, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        int int9 = random0.nextInt();
        java.util.Random random10 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random10.doubles(315664383340106314L);
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.util.Random random14 = new java.util.Random();
        int int16 = random14.nextInt((int) (short) 1);
        random14.setSeed((long) 100);
        float float19 = random14.nextFloat();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale13, random14);
        java.util.Random random21 = new java.util.Random();
        int int23 = random21.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream25 = random21.longs((long) '#');
        java.util.stream.LongStream longStream27 = random21.longs((long) (short) 0);
        boolean boolean28 = random21.nextBoolean();
        java.util.Random random29 = new java.util.Random();
        int int31 = random29.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream33 = random29.longs((long) '#');
        java.util.stream.DoubleStream doubleStream36 = random29.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray39 = new byte[] { (byte) 100, (byte) 1 };
        random29.nextBytes(byteArray39);
        random21.nextBytes(byteArray39);
        random14.nextBytes(byteArray39);
        random10.nextBytes(byteArray39);
        random0.nextBytes(byteArray39);
        double double45 = random0.nextGaussian();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1193959466) + "'", int9 == (-1193959466));
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.7220096f + "'", float19 == 0.7220096f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertNotNull(longStream27);
// flaky:         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(longStream33);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-76, -37]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0565816491790574d) + "'", double45 == (-1.0565816491790574d));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.DateAndTime dateAndTime9 = faker7.dateAndTime;
        com.github.javafaker.service.RandomService randomService10 = faker7.randomService;
        faker1.randomService = randomService10;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        java.lang.String str15 = faker13.numerify("");
        com.github.javafaker.Address address16 = faker13.address;
        com.github.javafaker.DateAndTime dateAndTime17 = faker13.dateAndTime;
        faker1.dateAndTime = dateAndTime17;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business22 = faker21.business;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Company company25 = null;
        faker24.company = company25;
        com.github.javafaker.Name name27 = faker24.name();
        faker21.name = name27;
        com.github.javafaker.Company company29 = faker21.company;
        faker20.company = company29;
        com.github.javafaker.Book book31 = faker20.book();
        faker1.book = book31;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(business22);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(company29);
        org.junit.Assert.assertNotNull(book31);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet20);
        java.util.Locale.LanguageRange languageRange23 = new java.util.Locale.LanguageRange("GBR");
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] { languageRange23 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList32);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = null;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.lang.String str42 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList41);
        java.util.Locale locale46 = new java.util.Locale("GBR", "zho");
        java.lang.String str47 = locale46.getLanguage();
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale50 = java.util.Locale.TAIWAN;
        java.lang.String str51 = locale49.getDisplayScript(locale50);
        java.util.Random random52 = new java.util.Random();
        java.util.stream.LongStream longStream53 = random52.longs();
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker(locale50, random52);
        java.lang.String str55 = locale50.getScript();
        java.lang.String str56 = locale46.getDisplayCountry(locale50);
        java.util.Set<java.lang.String> strSet57 = locale50.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet57);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals(locale46.toString(), "gbr_ZHO");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "gbr" + "'", str47, "gbr");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(longStream53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ZHO" + "'", str56, "ZHO");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(strList58);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getISO3Country();
        java.lang.String str3 = locale0.toLanguageTag();
        java.util.Locale locale4 = null;
        java.lang.String str5 = null; // flaky: locale0.getDisplayScript(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-GB" + "'", str3, "en-GB");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayScript();
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale.setDefault(locale5);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.lang.String str11 = locale9.toLanguageTag();
        java.lang.String str12 = locale5.getDisplayName(locale9);
        java.util.Locale locale13 = null;
        java.lang.String str14 = locale5.getDisplayVariant(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale1.getDisplayCountry(locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Taiwan" + "'", str3, "Taiwan");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-TW" + "'", str11, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str12, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.lang.String str7 = locale2.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        java.lang.String str9 = faker7.numerify("");
        com.github.javafaker.Book book10 = null;
        faker7.book = book10;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.DateAndTime dateAndTime14 = null;
        faker13.dateAndTime = dateAndTime14;
        com.github.javafaker.Lorem lorem16 = faker13.lorem;
        com.github.javafaker.Address address17 = faker13.address;
        com.github.javafaker.Finance finance18 = faker13.finance();
        faker7.finance = finance18;
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Locale.setDefault(locale20);
        java.lang.String str22 = locale20.getVariant();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale20);
        com.github.javafaker.Options options24 = faker23.options();
        faker7.options = options24;
        java.util.Random random26 = null;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.DateAndTime dateAndTime28 = null;
        faker27.dateAndTime = dateAndTime28;
        com.github.javafaker.Lorem lorem30 = faker27.lorem;
        com.github.javafaker.Address address31 = faker27.address;
        com.github.javafaker.Code code32 = faker27.code();
        com.github.javafaker.Company company33 = faker27.company();
        com.github.javafaker.Book book34 = faker27.book();
        faker7.book = book34;
        com.github.javafaker.Internet internet36 = faker7.internet;
        faker1.internet = internet36;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(lorem16);
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertNotNull(finance18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(lorem30);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(code32);
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(book34);
        org.junit.Assert.assertNotNull(internet36);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale33 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList40, strMap41);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeList42);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.UK;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
        java.lang.String str5 = locale1.getDisplayCountry(locale3);
        java.lang.Object obj6 = locale1.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Taiwan" + "'", str5, "Taiwan");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "zh_TW");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker1.fakeValuesService;
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale5.getVariant();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.service.RandomService randomService9 = faker8.randomService;
        faker1.randomService = randomService9;
        java.lang.String str12 = faker1.bothify("English (United States)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English (United States)" + "'", str12, "English (United States)");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("TWN");
        java.util.Locale locale12 = builder11.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "twn");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker1.fakeValuesService;
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker1.fakeValuesService;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getISO3Country();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale5);
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Number number18 = faker15.number();
        faker12.number = number18;
        com.github.javafaker.service.RandomService randomService20 = null;
        faker12.randomService = randomService20;
        com.github.javafaker.Business business22 = faker12.business;
        java.util.Random random23 = new java.util.Random();
        int int25 = random23.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.service.FakeValuesService fakeValuesService27 = null;
        faker26.fakeValuesService = fakeValuesService27;
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Color color31 = faker30.color;
        java.util.Random random32 = null;
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random32);
        java.lang.String str35 = faker33.numerify("");
        com.github.javafaker.Number number36 = faker33.number();
        faker30.number = number36;
        com.github.javafaker.Options options38 = faker30.options;
        com.github.javafaker.Color color39 = faker30.color;
        faker26.color = color39;
        faker12.color = color39;
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business43 = faker42.business;
        java.util.Random random44 = null;
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(random44);
        com.github.javafaker.Company company46 = null;
        faker45.company = company46;
        com.github.javafaker.Name name48 = faker45.name();
        faker42.name = name48;
        com.github.javafaker.Color color50 = faker42.color();
        java.util.Random random51 = null;
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(random51);
        com.github.javafaker.Color color53 = faker52.color;
        com.github.javafaker.Options options54 = faker52.options();
        faker42.options = options54;
        faker12.options = options54;
        boolean boolean57 = locale5.equals((java.lang.Object) options54);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TWN" + "'", str9, "TWN");
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(number18);
        org.junit.Assert.assertNotNull(business22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(number36);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(business43);
        org.junit.Assert.assertNotNull(name48);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.String str3 = locale0.getCountry();
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getDisplayCountry(locale4);
        java.lang.String str7 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        random0.nextBytes(byteArray10);
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0.0d, (double) 315664383340106314L);
        java.util.stream.DoubleStream doubleStream17 = random0.doubles((double) 1.0f, (double) 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-69, 64]");
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random0.doubles((long) 1101885023, (double) 2241767268063067838L, (double) 1979298273);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-GB", (double) (-2404379187718129166L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-2.4043791877181292E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Internet internet10 = faker1.internet();
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Lorem lorem14 = faker12.lorem();
        com.github.javafaker.Finance finance15 = faker12.finance;
        com.github.javafaker.Number number16 = faker12.number();
        com.github.javafaker.PhoneNumber phoneNumber17 = null;
        faker12.phoneNumber = phoneNumber17;
        com.github.javafaker.service.FakeValuesService fakeValuesService19 = faker12.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService19;
        com.github.javafaker.Code code21 = faker1.code();
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        java.lang.String str25 = faker23.numerify("");
        com.github.javafaker.Book book26 = null;
        faker23.book = book26;
        com.github.javafaker.Address address28 = faker23.address;
        faker1.address = address28;
        java.lang.String str31 = faker1.numerify("\u5fb7\u570b");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(lorem14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(fakeValuesService19);
        org.junit.Assert.assertNotNull(code21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(address28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u5fb7\u570b" + "'", str31, "\u5fb7\u570b");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\uc601\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        double double6 = random0.nextDouble();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7649627190891247d + "'", double6 == 0.7649627190891247d);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.lang.String str4 = faker1.bothify("");
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        com.github.javafaker.DateAndTime dateAndTime6 = faker1.date();
        com.github.javafaker.Business business7 = faker1.business;
        com.github.javafaker.Lorem lorem8 = faker1.lorem();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("English");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "english");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setScript("Canada");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Canada [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.util.Random random1 = new java.util.Random((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream3 = random1.longs((long) (-1129572628));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.util.Locale locale2 = new java.util.Locale("Japanese", "English");
        org.junit.Assert.assertEquals(locale2.toString(), "japanese_ENGLISH");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        boolean boolean2 = locale0.hasExtensions();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_US" + "'", str3, "en_US");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Lorem lorem11 = faker9.lorem();
        com.github.javafaker.Finance finance12 = faker9.finance;
        com.github.javafaker.Number number13 = faker9.number();
        com.github.javafaker.PhoneNumber phoneNumber14 = null;
        faker9.phoneNumber = phoneNumber14;
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = faker9.fakeValuesService;
        faker7.fakeValuesService = fakeValuesService16;
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Color color20 = faker19.color;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        java.lang.String str24 = faker22.numerify("");
        com.github.javafaker.Number number25 = faker22.number();
        faker19.number = number25;
        com.github.javafaker.service.RandomService randomService27 = null;
        faker19.randomService = randomService27;
        com.github.javafaker.Business business29 = faker19.business;
        faker7.business = business29;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Book book35 = null;
        faker32.book = book35;
        com.github.javafaker.Internet internet37 = faker32.internet();
        com.github.javafaker.PhoneNumber phoneNumber38 = faker32.phoneNumber();
        faker7.phoneNumber = phoneNumber38;
        com.github.javafaker.Lorem lorem40 = faker7.lorem;
        java.lang.Class<?> wildcardClass41 = faker7.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(fakeValuesService16);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(number25);
        org.junit.Assert.assertNotNull(business29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(internet37);
        org.junit.Assert.assertNotNull(phoneNumber38);
        org.junit.Assert.assertNotNull(lorem40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream7 = random0.ints();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream10 = random0.ints(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream14 = random0.ints((long) (byte) 100, 10, (-1678470588));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.util.Random random1 = new java.util.Random((-4894608278020295867L));
        java.util.Random random2 = new java.util.Random();
        int int4 = random2.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream6 = random2.longs((long) '#');
        java.util.stream.LongStream longStream8 = random2.longs((long) (short) 0);
        boolean boolean9 = random2.nextBoolean();
        float float10 = random2.nextFloat();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1 };
        random2.nextBytes(byteArray13);
        random1.nextBytes(byteArray13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.111328006f + "'", float10 == 0.111328006f);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[11, -121]");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Code code5 = faker1.code();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Address address9 = faker7.address;
        com.github.javafaker.Options options10 = faker7.options;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.DateAndTime dateAndTime13 = null;
        faker12.dateAndTime = dateAndTime13;
        com.github.javafaker.Lorem lorem15 = faker12.lorem;
        com.github.javafaker.Address address16 = faker12.address;
        com.github.javafaker.Code code17 = faker12.code();
        faker7.code = code17;
        faker1.code = code17;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker1.fakeValuesService;
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale23.toLanguageTag();
        java.lang.String str26 = locale23.getDisplayLanguage();
        java.util.Random random27 = null;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale23, random27);
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Color color31 = faker30.color;
        com.github.javafaker.Lorem lorem32 = faker30.lorem();
        com.github.javafaker.Finance finance33 = faker30.finance;
        com.github.javafaker.Number number34 = faker30.number();
        com.github.javafaker.PhoneNumber phoneNumber35 = null;
        faker30.phoneNumber = phoneNumber35;
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker30.fakeValuesService;
        faker28.fakeValuesService = fakeValuesService37;
        java.util.Random random39 = null;
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random39);
        com.github.javafaker.Color color41 = faker40.color;
        java.util.Random random42 = null;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(random42);
        java.lang.String str45 = faker43.numerify("");
        com.github.javafaker.Number number46 = faker43.number();
        faker40.number = number46;
        com.github.javafaker.service.RandomService randomService48 = null;
        faker40.randomService = randomService48;
        com.github.javafaker.Business business50 = faker40.business;
        faker28.business = business50;
        com.github.javafaker.Address address52 = faker28.address;
        faker1.address = address52;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-TW" + "'", str25, "zh-TW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chinese" + "'", str26, "Chinese");
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(lorem32);
        org.junit.Assert.assertNotNull(finance33);
        org.junit.Assert.assertNotNull(number34);
        org.junit.Assert.assertNotNull(fakeValuesService37);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(number46);
        org.junit.Assert.assertNotNull(business50);
        org.junit.Assert.assertNotNull(address52);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.service.RandomService randomService4 = faker1.randomService;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(randomService4);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business5 = faker4.business;
        com.github.javafaker.Finance finance6 = faker4.finance();
        com.github.javafaker.Address address7 = faker4.address;
        com.github.javafaker.Address address8 = faker4.address();
        faker1.address = address8;
        java.util.Random random10 = new java.util.Random();
        int int12 = random10.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = null;
        faker13.fakeValuesService = fakeValuesService14;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Color color18 = faker17.color;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        java.lang.String str22 = faker20.numerify("");
        com.github.javafaker.Number number23 = faker20.number();
        faker17.number = number23;
        com.github.javafaker.Options options25 = faker17.options;
        com.github.javafaker.Color color26 = faker17.color;
        faker13.color = color26;
        faker1.color = color26;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(number23);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        java.lang.String str7 = faker1.letterify("United Kingdom");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "United Kingdom" + "'", str7, "United Kingdom");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("GBR", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Locale locale14 = new java.util.Locale("");
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale12, locale14, locale15, locale16, locale17 };
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.List<java.util.Locale> localeList21 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList19);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet23);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList24, filteringMode25);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList32);
        java.util.Locale locale36 = new java.util.Locale("");
        java.util.Locale locale38 = new java.util.Locale("");
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.util.Locale locale41 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale36, locale38, locale39, locale40, locale41 };
        java.util.ArrayList<java.util.Locale> localeList43 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList43, localeArray42);
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList43);
        java.util.Locale locale46 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList52);
        java.util.Locale locale56 = new java.util.Locale("");
        java.util.Locale locale58 = new java.util.Locale("");
        java.util.Locale locale59 = java.util.Locale.ENGLISH;
        java.util.Locale locale60 = java.util.Locale.ENGLISH;
        java.util.Locale locale61 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale56, locale58, locale59, locale60, locale61 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Locale locale66 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strSet67);
        java.util.Locale.LanguageRange languageRange70 = new java.util.Locale.LanguageRange("GBR");
        java.util.Locale.LanguageRange[] languageRangeArray71 = new java.util.Locale.LanguageRange[] { languageRange70 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList72 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList72, languageRangeArray71);
        java.util.Locale.LanguageRange[] languageRangeArray74 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList75 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75, languageRangeArray74);
        java.lang.String[] strArray78 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, (java.util.Collection<java.lang.String>) strList79);
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        java.util.Locale.FilteringMode filteringMode87 = null;
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, (java.util.Collection<java.lang.String>) strList85, filteringMode87);
        java.lang.String str89 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, (java.util.Collection<java.lang.String>) strList88);
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList88);
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList90);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localeList21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode25.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(languageRangeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(languageRangeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertNotNull(strList91);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Code code8 = faker1.code;
        com.github.javafaker.service.RandomService randomService9 = faker1.randomService;
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.dateAndTime;
        java.lang.String str12 = faker1.letterify("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.util.Random random1 = new java.util.Random((-4894608278020295867L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = random1.ints((long) 748666197, (int) 'x', (-1205452174));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("und", 0.7346627443280227d);
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.DateAndTime dateAndTime5 = null;
        faker4.dateAndTime = dateAndTime5;
        com.github.javafaker.Lorem lorem7 = faker4.lorem;
        com.github.javafaker.Address address8 = faker4.address;
        com.github.javafaker.Code code9 = faker4.code();
        com.github.javafaker.Address address10 = null;
        faker4.address = address10;
        java.util.Random random12 = new java.util.Random();
        int int14 = random12.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = null;
        faker15.fakeValuesService = fakeValuesService16;
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Color color20 = faker19.color;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        java.lang.String str24 = faker22.numerify("");
        com.github.javafaker.Number number25 = faker22.number();
        faker19.number = number25;
        com.github.javafaker.Options options27 = faker19.options;
        com.github.javafaker.Color color28 = faker19.color;
        faker15.color = color28;
        com.github.javafaker.Book book30 = faker15.book;
        faker4.book = book30;
        boolean boolean32 = languageRange2.equals((java.lang.Object) book30);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(number25);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(book30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        int int3 = random1.nextInt(573332084);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 421922945 + "'", int3 == 421922945);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.util.Locale locale3 = new java.util.Locale("English (Canada)", "kor", "Etats-Unis");
        org.junit.Assert.assertEquals(locale3.toString(), "english (canada)_KOR_Etats-Unis");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale3 = builder0.build();
        java.lang.String str4 = locale3.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("gbr");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        java.util.Collection<java.util.Locale> localeCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter(languageRangeList3, localeCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Business business6 = faker1.business;
        com.github.javafaker.Company company7 = faker1.company();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Address address11 = faker9.address;
        com.github.javafaker.Options options12 = faker9.options;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.DateAndTime dateAndTime15 = null;
        faker14.dateAndTime = dateAndTime15;
        com.github.javafaker.Lorem lorem17 = faker14.lorem;
        com.github.javafaker.Address address18 = faker14.address;
        com.github.javafaker.Code code19 = faker14.code();
        faker9.code = code19;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Color color23 = faker22.color;
        com.github.javafaker.Address address24 = faker22.address;
        com.github.javafaker.Options options25 = faker22.options;
        com.github.javafaker.DateAndTime dateAndTime26 = faker22.dateAndTime;
        faker9.dateAndTime = dateAndTime26;
        faker1.dateAndTime = dateAndTime26;
        com.github.javafaker.Finance finance29 = faker1.finance;
        com.github.javafaker.Internet internet30 = faker1.internet();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(address24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(finance29);
        org.junit.Assert.assertNotNull(internet30);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.LongStream longStream14 = random8.longs((long) (short) 0);
        boolean boolean15 = random8.nextBoolean();
        float float16 = random8.nextFloat();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1 };
        random8.nextBytes(byteArray19);
        random0.nextBytes(byteArray19);
        java.util.stream.IntStream intStream24 = random0.ints((int) (byte) 0, (int) (short) 1);
        java.util.stream.DoubleStream doubleStream25 = random0.doubles();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.82002366f + "'", float16 == 0.82002366f);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-30, 42]");
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(doubleStream25);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        com.github.javafaker.Lorem lorem23 = faker22.lorem();
        java.lang.String str25 = faker22.numerify("TWN");
        com.github.javafaker.Finance finance26 = faker22.finance;
        java.util.Random random27 = null;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.DateAndTime dateAndTime29 = null;
        faker28.dateAndTime = dateAndTime29;
        com.github.javafaker.Lorem lorem31 = faker28.lorem;
        com.github.javafaker.Address address32 = faker28.address;
        com.github.javafaker.Code code33 = faker28.code();
        com.github.javafaker.Address address34 = null;
        faker28.address = address34;
        java.util.Random random36 = new java.util.Random();
        int int38 = random36.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.service.FakeValuesService fakeValuesService40 = null;
        faker39.fakeValuesService = fakeValuesService40;
        java.util.Random random42 = null;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(random42);
        com.github.javafaker.Color color44 = faker43.color;
        java.util.Random random45 = null;
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker(random45);
        java.lang.String str48 = faker46.numerify("");
        com.github.javafaker.Number number49 = faker46.number();
        faker43.number = number49;
        com.github.javafaker.Options options51 = faker43.options;
        com.github.javafaker.Color color52 = faker43.color;
        faker39.color = color52;
        com.github.javafaker.Book book54 = faker39.book;
        faker28.book = book54;
        faker22.book = book54;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "TWN" + "'", str25, "TWN");
        org.junit.Assert.assertNotNull(finance26);
        org.junit.Assert.assertNotNull(lorem31);
        org.junit.Assert.assertNotNull(address32);
        org.junit.Assert.assertNotNull(code33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(number49);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(book54);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.FilteringMode filteringMode32 = null;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList30, filteringMode32);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList33);
        java.util.Collection<java.lang.String> strCollection35 = null;
        java.lang.String str36 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection35);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        faker3.color = color6;
        com.github.javafaker.Lorem lorem8 = faker3.lorem;
        com.github.javafaker.Company company9 = faker3.company();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker3.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Company company7 = faker1.company();
        com.github.javafaker.Book book8 = faker1.book();
        com.github.javafaker.Lorem lorem9 = faker1.lorem;
        com.github.javafaker.Address address10 = faker1.address;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        com.github.javafaker.Name name9 = faker1.name();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(name9);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        random0.nextBytes(byteArray10);
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0.0d, (double) 315664383340106314L);
        java.util.stream.LongStream longStream16 = random0.longs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-38, 82]");
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker1.fakeValuesService;
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale5.getVariant();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.service.RandomService randomService9 = faker8.randomService;
        faker1.randomService = randomService9;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = faker1.fakeValuesService;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business13 = faker12.business;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Company company16 = null;
        faker15.company = company16;
        com.github.javafaker.Name name18 = faker15.name();
        faker12.name = name18;
        com.github.javafaker.Business business20 = faker12.business;
        faker1.business = business20;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertNotNull(fakeValuesService11);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(business20);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Company company4 = null;
        faker3.company = company4;
        com.github.javafaker.Name name6 = faker3.name();
        faker0.name = name6;
        com.github.javafaker.Color color8 = faker0.color();
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Options options12 = faker10.options();
        faker0.options = options12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.Options options17 = faker15.options();
        com.github.javafaker.Color color18 = faker15.color();
        com.github.javafaker.Options options19 = faker15.options();
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Code code22 = faker21.code;
        com.github.javafaker.Address address23 = faker21.address;
        com.github.javafaker.Color color24 = faker21.color();
        faker15.color = color24;
        com.github.javafaker.Address address26 = faker15.address;
        faker0.address = address26;
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(code22);
        org.junit.Assert.assertNotNull(address23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(address26);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder4 = builder0.setLanguage("English");
        java.util.Locale locale5 = builder0.build();
        java.lang.String str6 = locale5.getISO3Country();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "english");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder3.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Address address7 = null;
        faker1.address = address7;
        com.github.javafaker.PhoneNumber phoneNumber9 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        long long23 = random17.nextLong();
        java.util.stream.IntStream intStream24 = random17.ints();
        long long25 = random17.nextLong();
        java.util.stream.LongStream longStream28 = random17.longs((long) (short) 10, 7959307406216468554L);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 6768065473041940447L + "'", long23 == 6768065473041940447L);
        org.junit.Assert.assertNotNull(intStream24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 7004844084507315529L + "'", long25 == 7004844084507315529L);
        org.junit.Assert.assertNotNull(longStream28);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("gbr");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strList9);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Address address6 = faker1.address;
        java.util.Random random7 = new java.util.Random();
        int int9 = random7.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color11 = faker10.color;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        java.lang.String str15 = faker13.numerify("");
        com.github.javafaker.Book book16 = null;
        faker13.book = book16;
        com.github.javafaker.Internet internet18 = faker13.internet();
        com.github.javafaker.PhoneNumber phoneNumber19 = faker13.phoneNumber();
        faker10.phoneNumber = phoneNumber19;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        java.lang.String str24 = faker22.numerify("");
        com.github.javafaker.Book book25 = null;
        faker22.book = book25;
        com.github.javafaker.Internet internet27 = faker22.internet;
        com.github.javafaker.DateAndTime dateAndTime28 = faker22.date();
        com.github.javafaker.Code code29 = faker22.code;
        java.util.Random random30 = null;
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Color color32 = faker31.color;
        com.github.javafaker.Lorem lorem33 = faker31.lorem();
        com.github.javafaker.Finance finance34 = faker31.finance;
        com.github.javafaker.Number number35 = faker31.number();
        faker22.number = number35;
        faker10.number = number35;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business39 = faker38.business;
        java.util.Random random40 = null;
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(random40);
        com.github.javafaker.Company company42 = null;
        faker41.company = company42;
        com.github.javafaker.Name name44 = faker41.name();
        faker38.name = name44;
        java.util.Locale locale46 = java.util.Locale.US;
        java.util.Locale.setDefault(locale46);
        java.lang.String str48 = locale46.getVariant();
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale46);
        com.github.javafaker.Options options50 = faker49.options();
        faker38.options = options50;
        faker10.options = options50;
        faker1.options = options50;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(internet18);
        org.junit.Assert.assertNotNull(phoneNumber19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(internet27);
        org.junit.Assert.assertNotNull(dateAndTime28);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(lorem33);
        org.junit.Assert.assertNotNull(finance34);
        org.junit.Assert.assertNotNull(number35);
        org.junit.Assert.assertNotNull(business39);
        org.junit.Assert.assertNotNull(name44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(options50);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code2 = faker1.code;
        com.github.javafaker.Address address3 = faker1.address;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.Lorem lorem9 = faker5.lorem();
        faker1.lorem = lorem9;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = null;
        faker1.fakeValuesService = fakeValuesService11;
        com.github.javafaker.Finance finance13 = faker1.finance;
        com.github.javafaker.Book book14 = faker1.book();
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(book14);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet20);
        java.util.Collection<java.util.Locale> localeCollection22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.parse("gbr");
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
        java.util.Locale locale42 = new java.util.Locale("");
        java.util.Locale locale44 = new java.util.Locale("");
        java.util.Locale locale45 = java.util.Locale.ENGLISH;
        java.util.Locale locale46 = java.util.Locale.ENGLISH;
        java.util.Locale locale47 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale42, locale44, locale45, locale46, locale47 };
        java.util.ArrayList<java.util.Locale> localeList49 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList49, localeArray48);
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList49);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.lang.String>) strList57);
        java.util.Locale locale61 = new java.util.Locale("");
        java.util.Locale locale63 = new java.util.Locale("");
        java.util.Locale locale64 = java.util.Locale.ENGLISH;
        java.util.Locale locale65 = java.util.Locale.ENGLISH;
        java.util.Locale locale66 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray67 = new java.util.Locale[] { locale61, locale63, locale64, locale65, locale66 };
        java.util.ArrayList<java.util.Locale> localeList68 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList68, localeArray67);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.util.Locale>) localeList68);
        java.util.Locale.LanguageRange[] languageRangeArray71 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList72 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList72, languageRangeArray71);
        java.lang.String[] strArray75 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, (java.util.Collection<java.lang.String>) strList76);
        java.util.Locale locale80 = new java.util.Locale("");
        java.util.Locale locale82 = new java.util.Locale("");
        java.util.Locale locale83 = java.util.Locale.ENGLISH;
        java.util.Locale locale84 = java.util.Locale.ENGLISH;
        java.util.Locale locale85 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale80, locale82, locale83, locale84, locale85 };
        java.util.ArrayList<java.util.Locale> localeList87 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList87, localeArray86);
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.Locale.FilteringMode filteringMode91 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList89, filteringMode91);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList24, (java.util.Collection<java.lang.String>) strList32, filteringMode91);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection22, filteringMode91);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeList24);
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
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(languageRangeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertTrue("'" + filteringMode91 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode91.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(localeList94);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Address address10 = faker8.address;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business12 = faker11.business;
        faker8.business = business12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.DateAndTime dateAndTime17 = faker15.dateAndTime;
        com.github.javafaker.service.RandomService randomService18 = faker15.randomService;
        faker8.randomService = randomService18;
        faker1.randomService = randomService18;
        com.github.javafaker.Finance finance21 = null;
        faker1.finance = finance21;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = faker1.resolve("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(randomService18);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        com.github.javafaker.Options options11 = faker1.options;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        com.github.javafaker.DateAndTime dateAndTime15 = faker13.dateAndTime;
        com.github.javafaker.service.RandomService randomService16 = faker13.randomService;
        com.github.javafaker.Code code17 = faker13.code();
        faker1.code = code17;
        com.github.javafaker.Code code19 = faker1.code();
        com.github.javafaker.Book book20 = faker1.book;
        com.github.javafaker.Book book21 = faker1.book;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(randomService16);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(book20);
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Locale locale8 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Name name7 = faker1.name();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Book book12 = null;
        faker9.book = book12;
        com.github.javafaker.Internet internet14 = faker9.internet;
        com.github.javafaker.DateAndTime dateAndTime15 = faker9.date();
        com.github.javafaker.Code code16 = faker9.code;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color19 = faker18.color;
        com.github.javafaker.Lorem lorem20 = faker18.lorem();
        com.github.javafaker.Finance finance21 = faker18.finance;
        com.github.javafaker.Number number22 = faker18.number();
        faker9.number = number22;
        com.github.javafaker.Address address24 = faker9.address();
        com.github.javafaker.Company company25 = faker9.company;
        faker1.company = company25;
        java.util.Locale locale27 = java.util.Locale.US;
        java.util.Locale.setDefault(locale27);
        java.lang.String str29 = locale27.getVariant();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale27);
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Color color33 = faker32.color;
        faker30.color = color33;
        com.github.javafaker.Lorem lorem35 = faker30.lorem;
        java.util.Random random36 = null;
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.Code code38 = faker37.code;
        com.github.javafaker.Address address39 = faker37.address;
        java.util.Random random40 = null;
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(random40);
        com.github.javafaker.Color color42 = faker41.color;
        java.lang.String str44 = faker41.bothify("");
        com.github.javafaker.Lorem lorem45 = faker41.lorem();
        faker37.lorem = lorem45;
        com.github.javafaker.Color color47 = faker37.color;
        faker30.color = color47;
        faker1.color = color47;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(code16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(lorem20);
        org.junit.Assert.assertNotNull(finance21);
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(address24);
        org.junit.Assert.assertNotNull(company25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(lorem35);
        org.junit.Assert.assertNotNull(code38);
        org.junit.Assert.assertNotNull(address39);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(lorem45);
        org.junit.Assert.assertNotNull(color47);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random8);
        java.util.stream.IntStream intStream12 = random8.ints();
        java.util.stream.IntStream intStream14 = random8.ints(0L);
        java.util.Random random15 = new java.util.Random();
        int int17 = random15.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random15);
        double double19 = random15.nextGaussian();
        java.util.Random random20 = new java.util.Random();
        int int22 = random20.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream24 = random20.longs((long) '#');
        java.util.stream.DoubleStream doubleStream27 = random20.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 1 };
        random20.nextBytes(byteArray30);
        random15.nextBytes(byteArray30);
        random8.nextBytes(byteArray30);
        java.util.stream.DoubleStream doubleStream36 = random8.doubles(0.0d, (double) 0.7346627f);
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(locale5, random8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.4216678149430998d) + "'", double19 == (-0.4216678149430998d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(byteArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[126, -88]");
        org.junit.Assert.assertNotNull(doubleStream36);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United States" + "'", str1, "United States");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United States)" + "'", str2, "English (United States)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-US" + "'", str3, "en-US");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Name name10 = faker1.name;
        com.github.javafaker.Name name11 = faker1.name;
        com.github.javafaker.Internet internet12 = faker1.internet;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(internet12);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.util.Locale locale1 = new java.util.Locale("de");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("ITA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ITA");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "de");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United States" + "'", str1, "United States");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United States)" + "'", str2, "English (United States)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English (United States)" + "'", str3, "English (United States)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en_US" + "'", str4, "en_US");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Number number7 = faker1.number();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Address address11 = faker9.address;
        com.github.javafaker.Code code12 = faker9.code();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker9.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService13;
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.DateAndTime dateAndTime17 = null;
        faker16.dateAndTime = dateAndTime17;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.DateAndTime dateAndTime21 = null;
        faker20.dateAndTime = dateAndTime21;
        com.github.javafaker.Lorem lorem23 = faker20.lorem;
        com.github.javafaker.Address address24 = faker20.address;
        faker16.address = address24;
        com.github.javafaker.Name name26 = faker16.name();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business28 = faker27.business;
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Company company31 = null;
        faker30.company = company31;
        com.github.javafaker.Name name33 = faker30.name();
        faker27.name = name33;
        com.github.javafaker.Company company35 = faker27.company;
        faker16.company = company35;
        faker1.company = company35;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertNotNull(address24);
        org.junit.Assert.assertNotNull(name26);
        org.junit.Assert.assertNotNull(business28);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertNotNull(company35);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.DateAndTime dateAndTime8 = null;
        faker7.dateAndTime = dateAndTime8;
        com.github.javafaker.Lorem lorem10 = faker7.lorem;
        com.github.javafaker.Address address11 = faker7.address;
        com.github.javafaker.Finance finance12 = faker7.finance();
        faker1.finance = finance12;
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getVariant();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale14);
        com.github.javafaker.Options options18 = faker17.options();
        faker1.options = options18;
        com.github.javafaker.PhoneNumber phoneNumber20 = faker1.phoneNumber();
        com.github.javafaker.Name name21 = faker1.name();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(phoneNumber20);
        org.junit.Assert.assertNotNull(name21);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.util.Locale locale3 = new java.util.Locale("CA", "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)", "");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("allemand");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.lang.String str8 = locale6.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.lang.String str4 = locale0.getDisplayCountry(locale3);
        java.lang.String str5 = locale3.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Etats-Unis" + "'", str4, "Etats-Unis");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "French" + "'", str5, "French");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        com.github.javafaker.Address address9 = faker5.address;
        faker1.address = address9;
        com.github.javafaker.Name name11 = faker1.name();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business13 = faker12.business;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Company company16 = null;
        faker15.company = company16;
        com.github.javafaker.Name name18 = faker15.name();
        faker12.name = name18;
        com.github.javafaker.Company company20 = faker12.company;
        faker1.company = company20;
        com.github.javafaker.service.RandomService randomService22 = faker1.randomService;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker1.phoneNumber;
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertNotNull(randomService22);
        org.junit.Assert.assertNotNull(phoneNumber23);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale9 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale1.getDisplayLanguage(locale9);
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale1.getDisplayVariant(locale12);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        boolean boolean4 = languageRange1.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = null;
        faker1.company = company2;
        com.github.javafaker.Internet internet4 = faker1.internet();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Company company7 = null;
        faker6.company = company7;
        com.github.javafaker.Name name9 = faker6.name();
        com.github.javafaker.DateAndTime dateAndTime10 = faker6.dateAndTime;
        com.github.javafaker.Finance finance11 = faker6.finance();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business13 = faker12.business;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Company company16 = null;
        faker15.company = company16;
        com.github.javafaker.Name name18 = faker15.name();
        faker12.name = name18;
        faker6.name = name18;
        faker1.name = name18;
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(name18);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayCountry(locale8);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale4.getDisplayLanguage(locale12);
        java.lang.String str15 = locale0.getDisplayVariant(locale12);
        java.lang.String str16 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-TW" + "'", str10, "zh-TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fr-FR" + "'", str16, "fr-FR");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker1.randomService = randomService9;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Number number18 = faker15.number();
        faker12.number = number18;
        com.github.javafaker.Company company20 = null;
        faker12.company = company20;
        java.lang.String str23 = faker12.numerify("zho");
        com.github.javafaker.PhoneNumber phoneNumber24 = faker12.phoneNumber();
        faker1.phoneNumber = phoneNumber24;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(number18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zho" + "'", str23, "zho");
        org.junit.Assert.assertNotNull(phoneNumber24);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale3 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("\uc601\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Options options7 = faker1.options;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u82f1\u6587");
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str3 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale locale4 = builder0.build();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(100L, (double) 0.14228916f, (double) 164160068);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.LongStream longStream8 = random0.longs(0L, (long) 732850921);
        java.util.stream.IntStream intStream11 = random0.ints(304207773, 1786923775);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale1.getDisplayScript(locale4);
        java.util.Random random7 = new java.util.Random((long) '4');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale4, random7);
        java.lang.Object obj9 = locale4.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "it");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company4 = faker3.company;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Color color7 = faker6.color;
        com.github.javafaker.Lorem lorem8 = faker6.lorem();
        com.github.javafaker.Finance finance9 = faker6.finance;
        faker3.finance = finance9;
        com.github.javafaker.Finance finance11 = faker3.finance();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.numerify("");
        com.github.javafaker.Book book8 = null;
        faker5.book = book8;
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        faker1.phoneNumber = phoneNumber11;
        com.github.javafaker.DateAndTime dateAndTime13 = faker1.dateAndTime;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet();
        com.github.javafaker.Lorem lorem21 = faker15.lorem;
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.DateAndTime dateAndTime24 = null;
        faker23.dateAndTime = dateAndTime24;
        com.github.javafaker.Lorem lorem26 = faker23.lorem;
        faker15.lorem = lorem26;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Color color30 = faker29.color;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Number number35 = faker32.number();
        faker29.number = number35;
        com.github.javafaker.Company company37 = null;
        faker29.company = company37;
        com.github.javafaker.Options options39 = faker29.options;
        com.github.javafaker.Code code40 = faker29.code;
        faker15.code = code40;
        faker1.code = code40;
        com.github.javafaker.Name name43 = faker1.name();
        com.github.javafaker.service.FakeValuesService fakeValuesService44 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(lorem21);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(number35);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(code40);
        org.junit.Assert.assertNotNull(name43);
        org.junit.Assert.assertNotNull(fakeValuesService44);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.service.RandomService randomService4 = faker3.randomService;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Color color7 = faker6.color;
        com.github.javafaker.Lorem lorem8 = faker6.lorem();
        com.github.javafaker.Finance finance9 = faker6.finance;
        com.github.javafaker.Number number10 = faker6.number();
        com.github.javafaker.Options options11 = faker6.options;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        com.github.javafaker.Address address15 = faker13.address;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business17 = faker16.business;
        faker13.business = business17;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Color color21 = faker20.color;
        com.github.javafaker.DateAndTime dateAndTime22 = faker20.dateAndTime;
        com.github.javafaker.service.RandomService randomService23 = faker20.randomService;
        faker13.randomService = randomService23;
        faker6.randomService = randomService23;
        com.github.javafaker.PhoneNumber phoneNumber26 = faker6.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber27 = faker6.phoneNumber;
        faker3.phoneNumber = phoneNumber27;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertNotNull(business17);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(dateAndTime22);
        org.junit.Assert.assertNotNull(randomService23);
        org.junit.Assert.assertNotNull(phoneNumber26);
        org.junit.Assert.assertNotNull(phoneNumber27);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale6 = java.util.Locale.US;
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale10.toLanguageTag();
        java.lang.String str13 = locale6.getDisplayName(locale10);
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getVariant();
        java.lang.String str17 = locale14.getISO3Language();
        java.lang.String str18 = locale6.getDisplayScript(locale14);
        java.lang.String str19 = locale6.getScript();
        java.util.Locale.setDefault(category0, locale6);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-TW" + "'", str12, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str13, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eng" + "'", str17, "eng");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.util.Locale locale2 = new java.util.Locale("Chinese", "eng");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_ENG");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        random0.nextBytes(byteArray10);
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0.0d, (double) 315664383340106314L);
        java.util.stream.DoubleStream doubleStream15 = random0.doubles();
        java.util.stream.LongStream longStream17 = random0.longs(0L);
        java.util.stream.DoubleStream doubleStream18 = random0.doubles();
        java.util.stream.DoubleStream doubleStream22 = random0.doubles((long) (short) 0, (double) (-553780171), (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-14, 116]");
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(doubleStream22);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder18 = builder13.setExtension('x', "zh-TW");
        java.util.Locale.Builder builder19 = builder13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder13.addUnicodeLocaleAttribute("en-US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        com.github.javafaker.Options options11 = faker1.options;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        com.github.javafaker.DateAndTime dateAndTime15 = faker13.dateAndTime;
        com.github.javafaker.service.RandomService randomService16 = faker13.randomService;
        com.github.javafaker.Code code17 = faker13.code();
        faker1.code = code17;
        com.github.javafaker.Internet internet19 = faker1.internet;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(randomService16);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertNotNull(internet19);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clear();
        java.util.Locale.Builder builder8 = builder0.setLanguageTag("de-DE");
        java.util.Locale.Builder builder9 = builder8.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.DateAndTime dateAndTime8 = null;
        faker7.dateAndTime = dateAndTime8;
        com.github.javafaker.Lorem lorem10 = faker7.lorem;
        com.github.javafaker.Address address11 = faker7.address;
        com.github.javafaker.Finance finance12 = faker7.finance();
        faker1.finance = finance12;
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getVariant();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale14);
        com.github.javafaker.Options options18 = faker17.options();
        faker1.options = options18;
        com.github.javafaker.PhoneNumber phoneNumber20 = faker1.phoneNumber();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Color color23 = faker22.color;
        java.lang.String str25 = faker22.bothify("");
        com.github.javafaker.Lorem lorem26 = faker22.lorem();
        com.github.javafaker.Name name27 = faker22.name;
        faker1.name = name27;
        com.github.javafaker.PhoneNumber phoneNumber29 = faker1.phoneNumber;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(phoneNumber20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(phoneNumber29);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) 10);
        float float8 = random0.nextFloat();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.7346627f + "'", float8 == 0.7346627f);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Code code4 = faker1.code;
        com.github.javafaker.Name name5 = faker1.name;
        com.github.javafaker.Company company6 = faker1.company();
        com.github.javafaker.Lorem lorem7 = null;
        faker1.lorem = lorem7;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder13.setVariant("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("TW");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str8 = languageRange7.getRange();
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str11 = languageRange10.getRange();
        java.lang.String str12 = languageRange10.getRange();
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str15 = languageRange14.getRange();
        java.lang.String str16 = languageRange14.getRange();
        java.lang.String str17 = languageRange14.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange7, languageRange10, languageRange14 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, strMap21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList22, strMap23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gbr" + "'", str8, "gbr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "gbr" + "'", str11, "gbr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "gbr" + "'", str12, "gbr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "gbr" + "'", str15, "gbr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "gbr" + "'", str16, "gbr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "gbr" + "'", str17, "gbr");
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u53f0\u7063");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        int int10 = random0.nextInt();
        double double11 = random0.nextDouble();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1139614796) + "'", int10 == (-1139614796));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.19497605734770518d + "'", double11 == 0.19497605734770518d);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.Locale locale3 = new java.util.Locale("", "", "GBR");
        java.util.Random random4 = new java.util.Random();
        int int6 = random4.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream8 = random4.longs((long) '#');
        java.util.stream.LongStream longStream10 = random4.longs((long) (short) 0);
        java.util.stream.IntStream intStream11 = random4.ints();
        float float12 = random4.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale3, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(intStream11);
// flaky:         org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.23272872f + "'", float12 == 0.23272872f);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker1.fakeValuesService;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        java.lang.String str10 = faker8.numerify("");
        com.github.javafaker.Number number11 = faker8.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker8.fakeValuesService;
        com.github.javafaker.Code code13 = faker8.code;
        faker1.code = code13;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertNotNull(code13);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Book book12 = null;
        faker9.book = book12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.DateAndTime dateAndTime16 = null;
        faker15.dateAndTime = dateAndTime16;
        com.github.javafaker.Lorem lorem18 = faker15.lorem;
        com.github.javafaker.Address address19 = faker15.address;
        com.github.javafaker.Finance finance20 = faker15.finance();
        faker9.finance = finance20;
        java.util.Locale locale22 = java.util.Locale.US;
        java.util.Locale.setDefault(locale22);
        java.lang.String str24 = locale22.getVariant();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale22);
        com.github.javafaker.Options options26 = faker25.options();
        faker9.options = options26;
        com.github.javafaker.Lorem lorem28 = faker9.lorem;
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Random random30 = new java.util.Random();
        int int32 = random30.nextInt((int) (short) 1);
        random30.setSeed((long) 100);
        float float35 = random30.nextFloat();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale29, random30);
        com.github.javafaker.PhoneNumber phoneNumber37 = faker36.phoneNumber;
        faker9.phoneNumber = phoneNumber37;
        faker7.phoneNumber = phoneNumber37;
        java.util.Random random40 = null;
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(random40);
        java.lang.String str43 = faker41.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService44 = faker41.fakeValuesService;
        java.util.Locale locale45 = java.util.Locale.US;
        java.util.Locale.setDefault(locale45);
        java.lang.String str47 = locale45.getVariant();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(locale45);
        com.github.javafaker.service.RandomService randomService49 = faker48.randomService;
        faker41.randomService = randomService49;
        com.github.javafaker.service.FakeValuesService fakeValuesService51 = faker41.fakeValuesService;
        faker7.fakeValuesService = fakeValuesService51;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lorem18);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(finance20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(lorem28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.7220096f + "'", float35 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(fakeValuesService44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(randomService49);
        org.junit.Assert.assertNotNull(fakeValuesService51);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber6 = null;
        faker1.phoneNumber = phoneNumber6;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker1.fakeValuesService;
        com.github.javafaker.Address address9 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Internet internet8 = faker1.internet;
        com.github.javafaker.Business business9 = faker1.business;
        com.github.javafaker.service.RandomService randomService10 = faker1.randomService;
        com.github.javafaker.Address address11 = faker1.address();
        com.github.javafaker.Finance finance12 = faker1.finance;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Color color15 = faker14.color;
        com.github.javafaker.Name name16 = faker14.name();
        com.github.javafaker.PhoneNumber phoneNumber17 = faker14.phoneNumber;
        faker1.phoneNumber = phoneNumber17;
        com.github.javafaker.Code code19 = faker1.code();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(code19);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        java.lang.String str8 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Name name10 = faker1.name;
        com.github.javafaker.Name name11 = faker1.name;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        com.github.javafaker.Lorem lorem15 = faker13.lorem();
        com.github.javafaker.Finance finance16 = faker13.finance;
        com.github.javafaker.Number number17 = faker13.number();
        com.github.javafaker.Options options18 = faker13.options;
        com.github.javafaker.Business business19 = faker13.business();
        java.lang.String str21 = faker13.numerify("\u4e2d\u6587");
        com.github.javafaker.Address address22 = faker13.address;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker13.phoneNumber();
        com.github.javafaker.service.RandomService randomService24 = faker13.randomService;
        faker1.randomService = randomService24;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertNotNull(finance16);
        org.junit.Assert.assertNotNull(number17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(business19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u6587" + "'", str21, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(address22);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(randomService24);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Finance finance13 = faker10.finance;
        com.github.javafaker.Number number14 = faker10.number();
        faker1.number = number14;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.DateAndTime dateAndTime18 = null;
        faker17.dateAndTime = dateAndTime18;
        com.github.javafaker.Lorem lorem20 = faker17.lorem;
        com.github.javafaker.Address address21 = faker17.address;
        faker1.address = address21;
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.util.Random random24 = new java.util.Random();
        int int26 = random24.nextInt((int) (short) 1);
        random24.setSeed((long) 100);
        float float29 = random24.nextFloat();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale23, random24);
        com.github.javafaker.PhoneNumber phoneNumber31 = faker30.phoneNumber;
        faker1.phoneNumber = phoneNumber31;
        com.github.javafaker.Name name33 = faker1.name;
        java.util.Random random34 = null;
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.Color color36 = faker35.color;
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        java.lang.String str40 = faker38.numerify("");
        com.github.javafaker.Number number41 = faker38.number();
        faker35.number = number41;
        com.github.javafaker.Company company43 = null;
        faker35.company = company43;
        com.github.javafaker.Options options45 = faker35.options;
        java.util.Random random46 = null;
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(random46);
        com.github.javafaker.Color color48 = faker47.color;
        com.github.javafaker.DateAndTime dateAndTime49 = faker47.dateAndTime;
        com.github.javafaker.service.RandomService randomService50 = faker47.randomService;
        com.github.javafaker.Code code51 = faker47.code();
        faker35.code = code51;
        java.util.Random random53 = null;
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker(random53);
        com.github.javafaker.Code code55 = faker54.code;
        faker35.code = code55;
        faker1.code = code55;
        com.github.javafaker.PhoneNumber phoneNumber58 = faker1.phoneNumber;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(lorem20);
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.7220096f + "'", float29 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber31);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(number41);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(dateAndTime49);
        org.junit.Assert.assertNotNull(randomService50);
        org.junit.Assert.assertNotNull(code51);
        org.junit.Assert.assertNotNull(code55);
        org.junit.Assert.assertNotNull(phoneNumber58);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.LongStream longStream8 = random0.longs(0L, (long) 732850921);
        double double9 = random0.nextDouble();
        java.util.stream.LongStream longStream11 = random0.longs((long) 'x');
        boolean boolean12 = random0.nextBoolean();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7346627443280227d + "'", double9 == 0.7346627443280227d);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Locale locale2 = java.util.Locale.US;
        java.util.Locale.setDefault(locale2);
        java.lang.String str4 = locale2.getVariant();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.lang.String str6 = locale2.getISO3Country();
        java.lang.String str7 = locale0.getDisplayLanguage(locale2);
        java.lang.String str8 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "USA" + "'", str6, "USA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean" + "'", str7, "Korean");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ko" + "'", str8, "ko");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.numerify("");
        com.github.javafaker.Book book8 = null;
        faker5.book = book8;
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        faker1.phoneNumber = phoneNumber11;
        com.github.javafaker.Number number13 = faker1.number();
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet;
        com.github.javafaker.DateAndTime dateAndTime21 = faker15.date();
        com.github.javafaker.Code code22 = faker15.code;
        com.github.javafaker.Code code23 = faker15.code();
        java.util.Random random24 = null;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Color color26 = faker25.color;
        com.github.javafaker.DateAndTime dateAndTime27 = faker25.dateAndTime;
        com.github.javafaker.service.RandomService randomService28 = faker25.randomService;
        faker15.randomService = randomService28;
        com.github.javafaker.Address address30 = faker15.address();
        faker1.address = address30;
        com.github.javafaker.Finance finance32 = faker1.finance;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(dateAndTime21);
        org.junit.Assert.assertNotNull(code22);
        org.junit.Assert.assertNotNull(code23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(dateAndTime27);
        org.junit.Assert.assertNotNull(randomService28);
        org.junit.Assert.assertNotNull(address30);
        org.junit.Assert.assertNotNull(finance32);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Lorem lorem7 = faker1.lorem();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Address address11 = faker9.address;
        com.github.javafaker.Address address12 = faker9.address;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        java.lang.String str16 = faker14.numerify("");
        com.github.javafaker.Book book17 = null;
        faker14.book = book17;
        com.github.javafaker.Internet internet19 = faker14.internet;
        com.github.javafaker.DateAndTime dateAndTime20 = faker14.date();
        com.github.javafaker.Code code21 = faker14.code;
        com.github.javafaker.Code code22 = faker14.code();
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Color color25 = faker24.color;
        com.github.javafaker.DateAndTime dateAndTime26 = faker24.dateAndTime;
        com.github.javafaker.service.RandomService randomService27 = faker24.randomService;
        faker14.randomService = randomService27;
        faker9.randomService = randomService27;
        faker1.randomService = randomService27;
        java.lang.String str32 = faker1.letterify("");
        com.github.javafaker.Company company33 = faker1.company;
        com.github.javafaker.Company company34 = faker1.company;
        com.github.javafaker.Internet internet35 = faker1.internet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNotNull(code21);
        org.junit.Assert.assertNotNull(code22);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(randomService27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(company34);
        org.junit.Assert.assertNotNull(internet35);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Lorem lorem7 = faker1.lorem;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.DateAndTime dateAndTime10 = null;
        faker9.dateAndTime = dateAndTime10;
        com.github.javafaker.Lorem lorem12 = faker9.lorem;
        faker1.lorem = lorem12;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = null;
        faker1.fakeValuesService = fakeValuesService14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = faker1.letterify("en_US");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem12);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet20);
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale25 = java.util.Locale.TAIWAN;
        java.lang.String str26 = locale24.getDisplayScript(locale25);
        java.lang.String str27 = locale24.getCountry();
        java.lang.String str28 = locale22.getDisplayName(locale24);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        java.lang.String str31 = locale29.getDisplayLanguage();
        java.lang.String str32 = locale24.getDisplayCountry(locale29);
        java.util.Set<java.lang.String> strSet33 = locale24.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet33, filteringMode34);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "English (Canada)" + "'", str28, "English (Canada)");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "English" + "'", str31, "English");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode34.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.util.Locale locale2 = new java.util.Locale("ENG", "Italian");
        org.junit.Assert.assertEquals(locale2.toString(), "eng_ITALIAN");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        java.util.Locale locale10 = new java.util.Locale("English (United States)", "TWN");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale11.getDisplayScript();
        java.lang.String str13 = locale10.getDisplayScript(locale11);
        java.lang.String str14 = locale0.getDisplayCountry(locale11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
        org.junit.Assert.assertEquals(locale10.toString(), "english (united states)_TWN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream4 = random0.ints();
        java.util.stream.IntStream intStream6 = random0.ints(0L);
        long long7 = random0.nextLong();
        boolean boolean8 = random0.nextBoolean();
        java.util.stream.IntStream intStream9 = random0.ints();
        java.util.stream.LongStream longStream11 = random0.longs((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1548015038710272857L + "'", long7 == 1548015038710272857L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        faker3.color = color6;
        com.github.javafaker.PhoneNumber phoneNumber8 = faker3.phoneNumber;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale0.getDisplayVariant(locale9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        com.github.javafaker.Company company23 = faker22.company;
        com.github.javafaker.Color color24 = faker22.color;
        com.github.javafaker.PhoneNumber phoneNumber25 = faker22.phoneNumber;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(company23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(phoneNumber25);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.DateAndTime dateAndTime3 = faker1.dateAndTime;
        com.github.javafaker.service.RandomService randomService4 = faker1.randomService;
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Color color6 = faker1.color;
        com.github.javafaker.Internet internet7 = faker1.internet;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Name name10 = faker1.name;
        com.github.javafaker.Address address11 = faker1.address();
        com.github.javafaker.service.RandomService randomService12 = faker1.randomService;
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L, (double) (byte) 0, (double) 'a');
        java.util.stream.LongStream longStream11 = random0.longs(3228892242683521876L, 315664383340106314L, 1548015038710272857L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Number number7 = faker1.number();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Address address11 = faker9.address;
        com.github.javafaker.Code code12 = faker9.code();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker9.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService13;
        com.github.javafaker.Company company15 = faker1.company;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
        org.junit.Assert.assertNotNull(company15);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Address address14 = faker12.address;
        com.github.javafaker.Options options15 = faker12.options;
        com.github.javafaker.Business business16 = faker12.business();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color21 = faker20.color;
        faker12.color = color21;
        faker1.color = color21;
        com.github.javafaker.Finance finance24 = faker1.finance;
        com.github.javafaker.Finance finance25 = faker1.finance;
        com.github.javafaker.Address address26 = faker1.address;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(finance24);
        org.junit.Assert.assertNotNull(finance25);
        org.junit.Assert.assertNotNull(address26);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.lang.String str4 = faker1.bothify("");
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        com.github.javafaker.DateAndTime dateAndTime6 = faker1.date();
        com.github.javafaker.Business business7 = faker1.business;
        com.github.javafaker.Business business8 = faker1.business();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clear();
        java.util.Locale.Builder builder8 = builder0.setLanguageTag("de-DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("\u82f1\u570b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Address address4 = faker1.address;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        java.lang.String str8 = faker6.numerify("");
        com.github.javafaker.Book book9 = null;
        faker6.book = book9;
        com.github.javafaker.Internet internet11 = faker6.internet;
        com.github.javafaker.DateAndTime dateAndTime12 = faker6.date();
        com.github.javafaker.Code code13 = faker6.code;
        com.github.javafaker.Code code14 = faker6.code();
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Color color17 = faker16.color;
        com.github.javafaker.DateAndTime dateAndTime18 = faker16.dateAndTime;
        com.github.javafaker.service.RandomService randomService19 = faker16.randomService;
        faker6.randomService = randomService19;
        faker1.randomService = randomService19;
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Color color24 = faker23.color;
        java.lang.String str26 = faker23.bothify("");
        com.github.javafaker.Lorem lorem27 = faker23.lorem();
        faker1.lorem = lorem27;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(code13);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(lorem27);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.util.Locale locale2 = new java.util.Locale("GBR", "zho");
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "gbr_ZHO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.numerify("");
        com.github.javafaker.Book book8 = null;
        faker5.book = book8;
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        faker1.phoneNumber = phoneNumber11;
        com.github.javafaker.DateAndTime dateAndTime13 = faker1.dateAndTime;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet();
        com.github.javafaker.Lorem lorem21 = faker15.lorem;
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.DateAndTime dateAndTime24 = null;
        faker23.dateAndTime = dateAndTime24;
        com.github.javafaker.Lorem lorem26 = faker23.lorem;
        faker15.lorem = lorem26;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Color color30 = faker29.color;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Number number35 = faker32.number();
        faker29.number = number35;
        com.github.javafaker.Company company37 = null;
        faker29.company = company37;
        com.github.javafaker.Options options39 = faker29.options;
        com.github.javafaker.Code code40 = faker29.code;
        faker15.code = code40;
        faker1.code = code40;
        java.util.Random random43 = null;
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        java.lang.String str46 = faker44.numerify("");
        com.github.javafaker.Book book47 = null;
        faker44.book = book47;
        com.github.javafaker.Internet internet49 = faker44.internet;
        com.github.javafaker.DateAndTime dateAndTime50 = faker44.date();
        com.github.javafaker.Code code51 = faker44.code;
        java.util.Random random52 = null;
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(random52);
        com.github.javafaker.Color color54 = faker53.color;
        com.github.javafaker.Lorem lorem55 = faker53.lorem();
        com.github.javafaker.Finance finance56 = faker53.finance;
        com.github.javafaker.Number number57 = faker53.number();
        faker44.number = number57;
        com.github.javafaker.Address address59 = faker44.address();
        com.github.javafaker.Company company60 = faker44.company;
        faker1.company = company60;
        java.lang.String str63 = faker1.bothify("\u7f8e\u570b");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(lorem21);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(number35);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(code40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(internet49);
        org.junit.Assert.assertNotNull(dateAndTime50);
        org.junit.Assert.assertNotNull(code51);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(lorem55);
        org.junit.Assert.assertNotNull(finance56);
        org.junit.Assert.assertNotNull(number57);
        org.junit.Assert.assertNotNull(address59);
        org.junit.Assert.assertNotNull(company60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u7f8e\u570b" + "'", str63, "\u7f8e\u570b");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        float float8 = random0.nextFloat();
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1 };
        random0.nextBytes(byteArray11);
        java.util.stream.IntStream intStream16 = random0.ints((long) (short) 100, (int) (byte) -1, (int) (byte) 100);
        float float17 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream21 = random0.doubles(7959307406216468554L, (double) (-8792295023431898345L), (double) 164160068);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.73268515f + "'", float8 == 0.73268515f);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-73, -62]");
        org.junit.Assert.assertNotNull(intStream16);
// flaky:         org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.41822904f + "'", float17 == 0.41822904f);
        org.junit.Assert.assertNotNull(doubleStream21);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Lorem lorem7 = faker1.lorem;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.DateAndTime dateAndTime10 = null;
        faker9.dateAndTime = dateAndTime10;
        com.github.javafaker.Lorem lorem12 = faker9.lorem;
        faker1.lorem = lorem12;
        java.lang.String str15 = faker1.numerify("Korean");
        com.github.javafaker.Lorem lorem16 = faker1.lorem();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Korean" + "'", str15, "Korean");
        org.junit.Assert.assertNotNull(lorem16);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Lorem lorem11 = faker9.lorem();
        com.github.javafaker.Finance finance12 = faker9.finance;
        com.github.javafaker.Number number13 = faker9.number();
        com.github.javafaker.PhoneNumber phoneNumber14 = null;
        faker9.phoneNumber = phoneNumber14;
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = faker9.fakeValuesService;
        faker7.fakeValuesService = fakeValuesService16;
        com.github.javafaker.Company company18 = faker7.company;
        com.github.javafaker.Code code19 = faker7.code();
        com.github.javafaker.Code code20 = faker7.code();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.DateAndTime dateAndTime23 = null;
        faker22.dateAndTime = dateAndTime23;
        com.github.javafaker.Lorem lorem25 = faker22.lorem;
        com.github.javafaker.Address address26 = faker22.address;
        com.github.javafaker.Finance finance27 = faker22.finance();
        com.github.javafaker.Number number28 = faker22.number();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        java.lang.String str32 = faker30.numerify("");
        com.github.javafaker.Number number33 = faker30.number();
        com.github.javafaker.Name name34 = faker30.name();
        faker22.name = name34;
        java.util.Random random36 = null;
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.Company company38 = null;
        faker37.company = company38;
        com.github.javafaker.Name name40 = faker37.name();
        com.github.javafaker.DateAndTime dateAndTime41 = faker37.dateAndTime;
        com.github.javafaker.Finance finance42 = faker37.finance();
        faker22.finance = finance42;
        java.util.Random random44 = null;
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(random44);
        com.github.javafaker.Company company46 = null;
        faker45.company = company46;
        com.github.javafaker.Name name48 = faker45.name();
        com.github.javafaker.DateAndTime dateAndTime49 = faker45.dateAndTime;
        com.github.javafaker.service.RandomService randomService50 = faker45.randomService;
        faker22.randomService = randomService50;
        com.github.javafaker.PhoneNumber phoneNumber52 = faker22.phoneNumber();
        faker7.phoneNumber = phoneNumber52;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(fakeValuesService16);
        org.junit.Assert.assertNotNull(company18);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertNotNull(lorem25);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertNotNull(finance27);
        org.junit.Assert.assertNotNull(number28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(number33);
        org.junit.Assert.assertNotNull(name34);
        org.junit.Assert.assertNotNull(name40);
        org.junit.Assert.assertNotNull(dateAndTime41);
        org.junit.Assert.assertNotNull(finance42);
        org.junit.Assert.assertNotNull(name48);
        org.junit.Assert.assertNotNull(dateAndTime49);
        org.junit.Assert.assertNotNull(randomService50);
        org.junit.Assert.assertNotNull(phoneNumber52);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        int int10 = random0.nextInt();
        java.util.stream.IntStream intStream11 = random0.ints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1139614796) + "'", int10 == (-1139614796));
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Random random3 = new java.util.Random((-5242502877531146137L));
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.util.Locale locale2 = new java.util.Locale("en-US", "eng");
        org.junit.Assert.assertEquals(locale2.toString(), "en-us_ENG");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Options options7 = faker1.options();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        java.util.Set<java.lang.Character> charSet8 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
        org.junit.Assert.assertNotNull(charSet8);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Color color4 = faker1.color();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        java.lang.String str8 = faker6.numerify("");
        com.github.javafaker.Book book9 = null;
        faker6.book = book9;
        com.github.javafaker.Internet internet11 = faker6.internet;
        com.github.javafaker.DateAndTime dateAndTime12 = faker6.date();
        faker1.dateAndTime = dateAndTime12;
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getVariant();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale14);
        com.github.javafaker.Options options18 = faker17.options();
        faker1.options = options18;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Color color22 = faker21.color;
        com.github.javafaker.Lorem lorem23 = faker21.lorem();
        com.github.javafaker.Finance finance24 = faker21.finance;
        java.util.Random random25 = null;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Color color27 = faker26.color;
        com.github.javafaker.Options options28 = faker26.options();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.DateAndTime dateAndTime31 = null;
        faker30.dateAndTime = dateAndTime31;
        com.github.javafaker.Lorem lorem33 = faker30.lorem;
        faker26.lorem = lorem33;
        com.github.javafaker.Name name35 = faker26.name;
        com.github.javafaker.Internet internet36 = faker26.internet();
        faker21.internet = internet36;
        faker1.internet = internet36;
        com.github.javafaker.Code code39 = faker1.code;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertNotNull(finance24);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(lorem33);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(internet36);
        org.junit.Assert.assertNotNull(code39);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getCountry();
        java.lang.String str6 = locale0.getDisplayVariant();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale10 = builder7.build();
        java.lang.String str11 = locale0.getDisplayCountry(locale10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale2.getISO3Country();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean8 = locale7.hasExtensions();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.lang.String str13 = locale11.toLanguageTag();
        java.lang.String str14 = locale7.getDisplayCountry(locale11);
        java.lang.String str15 = locale11.getISO3Country();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale11);
        java.util.Locale.setDefault(category0, locale11);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean21 = locale20.hasExtensions();
        java.lang.String str22 = locale20.getISO3Country();
        java.util.Locale.setDefault(category18, locale20);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean26 = locale25.hasExtensions();
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.lang.String str30 = locale28.getDisplayScript(locale29);
        java.lang.String str31 = locale29.toLanguageTag();
        java.lang.String str32 = locale25.getDisplayCountry(locale29);
        java.lang.String str33 = locale29.getISO3Country();
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(locale29);
        java.util.Locale.setDefault(category18, locale29);
        java.lang.String str36 = locale29.getCountry();
        java.util.Locale.setDefault(category0, locale29);
        java.util.Locale locale38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-TW" + "'", str13, "zh-TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "TWN" + "'", str15, "TWN");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-TW" + "'", str31, "zh-TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "TWN" + "'", str33, "TWN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "TW" + "'", str36, "TW");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder4 = builder0.setLanguage("English");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale8 = new java.util.Locale("\u82f1\u56fd", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "\u82f1\u56fd");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getCountry();
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        java.lang.String str9 = locale2.getUnicodeLocaleType("zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TW" + "'", str5, "TW");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Company company7 = faker1.company();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Address address12 = faker9.address;
        com.github.javafaker.Options options13 = faker9.options();
        faker1.options = options13;
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        java.lang.String str18 = faker16.numerify("");
        com.github.javafaker.Book book19 = null;
        faker16.book = book19;
        com.github.javafaker.Company company21 = null;
        faker16.company = company21;
        com.github.javafaker.Name name23 = faker16.name;
        com.github.javafaker.Color color24 = faker16.color;
        faker1.color = color24;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getDisplayVariant();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        boolean boolean7 = locale5.hasExtensions();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.util.Random random9 = new java.util.Random();
        int int11 = random9.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream13 = random9.longs((long) '#');
        java.util.stream.LongStream longStream15 = random9.longs((long) (short) 0);
        boolean boolean16 = random9.nextBoolean();
        float float17 = random9.nextFloat();
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 1 };
        random9.nextBytes(byteArray20);
        java.util.stream.IntStream intStream25 = random9.ints((long) (short) 100, (int) (byte) -1, (int) (byte) 100);
        float float26 = random9.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale1, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8642966f + "'", float17 == 0.8642966f);
        org.junit.Assert.assertNotNull(byteArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-96, -62]");
        org.junit.Assert.assertNotNull(intStream25);
// flaky:         org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.29932553f + "'", float26 == 0.29932553f);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.LongStream longStream14 = random8.longs((long) (short) 0);
        boolean boolean15 = random8.nextBoolean();
        float float16 = random8.nextFloat();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1 };
        random8.nextBytes(byteArray19);
        random0.nextBytes(byteArray19);
        java.util.Random random22 = new java.util.Random();
        int int24 = random22.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream26 = random22.longs((long) '#');
        java.util.stream.LongStream longStream28 = random22.longs((long) (short) 0);
        boolean boolean29 = random22.nextBoolean();
        float float30 = random22.nextFloat();
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 1 };
        random22.nextBytes(byteArray33);
        random0.nextBytes(byteArray33);
        java.util.stream.LongStream longStream38 = random0.longs((long) (-1779109740), (long) (-1139614796));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.9355031f + "'", float16 == 0.9355031f);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[107, 39]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(longStream28);
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.20747137f + "'", float30 == 0.20747137f);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[9, 64]");
        org.junit.Assert.assertNotNull(longStream38);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale1.getDisplayScript(locale4);
        java.lang.String str6 = locale1.getCountry();
        java.lang.String str7 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Number number7 = faker1.number();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Number number12 = faker9.number();
        com.github.javafaker.Name name13 = faker9.name();
        faker1.name = name13;
        com.github.javafaker.Lorem lorem15 = faker1.lorem();
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        java.lang.String str19 = faker17.numerify("");
        com.github.javafaker.Number number20 = faker17.number();
        com.github.javafaker.Name name21 = faker17.name();
        faker1.name = name21;
        java.util.Random random23 = new java.util.Random();
        int int25 = random23.nextInt((int) (short) 1);
        random23.setSeed((long) 100);
        java.util.stream.IntStream intStream31 = random23.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean32 = random23.nextBoolean();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Business business34 = faker33.business();
        faker1.business = business34;
        com.github.javafaker.Internet internet36 = faker1.internet();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(business34);
        org.junit.Assert.assertNotNull(internet36);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Locale locale6 = new java.util.Locale("Chinese", "eng");
        java.lang.String str7 = locale6.getCountry();
        java.lang.String str9 = locale6.getExtension('x');
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale10.getDisplayName();
        java.lang.String str13 = locale10.getDisplayName();
        java.lang.String str14 = locale6.getDisplayScript(locale10);
        java.lang.String str15 = locale6.getDisplayScript();
        java.lang.String str16 = locale2.getDisplayName(locale6);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale6.toString(), "chinese_ENG");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ENG" + "'", str7, "ENG");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "United States" + "'", str11, "United States");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English (United States)" + "'", str12, "English (United States)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English (United States)" + "'", str13, "English (United States)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese (Taiwan)" + "'", str16, "Chinese (Taiwan)");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Company company4 = null;
        faker3.company = company4;
        com.github.javafaker.Name name6 = faker3.name();
        faker0.name = name6;
        com.github.javafaker.Business business8 = faker0.business;
        java.lang.String str10 = faker0.bothify("\ub3c5\uc77c");
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ub3c5\uc77c" + "'", str10, "\ub3c5\uc77c");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Company company6 = null;
        faker1.company = company6;
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Internet internet9 = faker1.internet();
        com.github.javafaker.Lorem lorem10 = faker1.lorem;
        com.github.javafaker.Color color11 = faker1.color();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code2 = faker1.code;
        com.github.javafaker.Address address3 = faker1.address;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.Lorem lorem9 = faker5.lorem();
        faker1.lorem = lorem9;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = null;
        faker1.fakeValuesService = fakeValuesService11;
        com.github.javafaker.Finance finance13 = faker1.finance;
        com.github.javafaker.Number number14 = faker1.number();
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(number14);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("TWN");
        java.util.Locale.Builder builder13 = builder11.setLanguageTag("kor");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder16 = builder13.setExtension('x', "gbr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.removeUnicodeLocaleAttribute("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Finance finance13 = faker10.finance;
        com.github.javafaker.Number number14 = faker10.number();
        faker1.number = number14;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.DateAndTime dateAndTime18 = null;
        faker17.dateAndTime = dateAndTime18;
        com.github.javafaker.Lorem lorem20 = faker17.lorem;
        com.github.javafaker.Address address21 = faker17.address;
        faker1.address = address21;
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.util.Random random24 = new java.util.Random();
        int int26 = random24.nextInt((int) (short) 1);
        random24.setSeed((long) 100);
        float float29 = random24.nextFloat();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale23, random24);
        com.github.javafaker.PhoneNumber phoneNumber31 = faker30.phoneNumber;
        faker1.phoneNumber = phoneNumber31;
        com.github.javafaker.Name name33 = faker1.name;
        com.github.javafaker.DateAndTime dateAndTime34 = faker1.date();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(lorem20);
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.7220096f + "'", float29 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber31);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertNotNull(dateAndTime34);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Lorem lorem7 = faker1.lorem;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.DateAndTime dateAndTime10 = null;
        faker9.dateAndTime = dateAndTime10;
        com.github.javafaker.Lorem lorem12 = faker9.lorem;
        faker1.lorem = lorem12;
        java.lang.String str15 = faker1.numerify("Korean");
        com.github.javafaker.Options options16 = faker1.options;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Korean" + "'", str15, "Korean");
        org.junit.Assert.assertNotNull(options16);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] { languageRange1 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Locale.FilteringMode filteringMode18 = null;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList16, filteringMode18);
        java.lang.String str20 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList19);
        java.util.Locale.LanguageRange languageRange23 = new java.util.Locale.LanguageRange("und", 0.7346627443280227d);
        java.util.Locale.LanguageRange languageRange25 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str26 = languageRange25.getRange();
        java.lang.String str27 = languageRange25.getRange();
        java.lang.String str28 = languageRange25.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] { languageRange23, languageRange25 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList37);
        java.util.Locale locale41 = new java.util.Locale("");
        java.util.Locale locale43 = new java.util.Locale("");
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.util.Locale locale45 = java.util.Locale.ENGLISH;
        java.util.Locale locale46 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale41, locale43, locale44, locale45, locale46 };
        java.util.ArrayList<java.util.Locale> localeList48 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList48, localeArray47);
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList48);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList56);
        java.util.Locale locale60 = new java.util.Locale("");
        java.util.Locale locale62 = new java.util.Locale("");
        java.util.Locale locale63 = java.util.Locale.ENGLISH;
        java.util.Locale locale64 = java.util.Locale.ENGLISH;
        java.util.Locale locale65 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale60, locale62, locale63, locale64, locale65 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale locale70 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale.FilteringMode filteringMode71 = null;
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList67, filteringMode71);
        java.util.Locale locale73 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList72);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "gbr" + "'", str26, "gbr");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "gbr" + "'", str27, "gbr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "gbr" + "'", str28, "gbr");
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNull(locale70);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNull(locale73);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("TWN");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.util.Set<java.lang.Character> charSet8 = locale0.getExtensionKeys();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleKeys();
        java.lang.String str14 = locale0.getDisplayVariant(locale10);
        java.util.Locale locale15 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str7, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        faker3.color = color6;
        com.github.javafaker.Lorem lorem8 = faker3.lorem;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.DateAndTime dateAndTime11 = null;
        faker10.dateAndTime = dateAndTime11;
        com.github.javafaker.Lorem lorem13 = faker10.lorem;
        com.github.javafaker.Address address14 = faker10.address;
        com.github.javafaker.Code code15 = faker10.code();
        com.github.javafaker.Company company16 = faker10.company();
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        java.lang.String str20 = faker18.numerify("");
        com.github.javafaker.Code code21 = faker18.code;
        faker10.code = code21;
        faker3.code = code21;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(company16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(code21);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Company company4 = null;
        faker3.company = company4;
        com.github.javafaker.Name name6 = faker3.name();
        faker0.name = name6;
        com.github.javafaker.Lorem lorem8 = faker0.lorem();
        com.github.javafaker.service.RandomService randomService9 = faker0.randomService;
        java.lang.String str11 = faker0.bothify("fr-FR");
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr-FR" + "'", str11, "fr-FR");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream7 = random0.ints((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random0.longs((long) 'u', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.setExtension('u', "zh-TW");
        java.util.Locale locale8 = builder7.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Address address10 = faker8.address;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business12 = faker11.business;
        faker8.business = business12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.DateAndTime dateAndTime17 = faker15.dateAndTime;
        com.github.javafaker.service.RandomService randomService18 = faker15.randomService;
        faker8.randomService = randomService18;
        faker1.randomService = randomService18;
        com.github.javafaker.PhoneNumber phoneNumber21 = faker1.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber22 = faker1.phoneNumber;
        com.github.javafaker.Number number23 = faker1.number();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(phoneNumber21);
        org.junit.Assert.assertNotNull(phoneNumber22);
        org.junit.Assert.assertNotNull(number23);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.FilteringMode filteringMode32 = null;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList30, filteringMode32);
        java.lang.String str34 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean37 = locale36.hasExtensions();
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale40 = java.util.Locale.TAIWAN;
        java.lang.String str41 = locale39.getDisplayScript(locale40);
        java.lang.String str42 = locale40.toLanguageTag();
        java.lang.String str43 = locale36.getDisplayCountry(locale40);
        java.util.Locale locale44 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet45 = locale44.getExtensionKeys();
        java.lang.String str46 = locale36.getDisplayLanguage(locale44);
        java.util.Locale locale47 = java.util.Locale.UK;
        java.lang.String str48 = locale47.getISO3Country();
        java.util.Locale locale49 = java.util.Locale.UK;
        java.lang.String str50 = locale49.getISO3Country();
        java.lang.String str51 = locale47.getDisplayCountry(locale49);
        java.lang.String str52 = locale44.getDisplayVariant(locale49);
        java.util.Set<java.lang.String> strSet53 = locale44.getUnicodeLocaleKeys();
        java.lang.String str54 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet53);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "zh-TW" + "'", str42, "zh-TW");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "GBR" + "'", str48, "GBR");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "GBR" + "'", str50, "GBR");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "United Kingdom" + "'", str51, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Address address14 = faker12.address;
        com.github.javafaker.Options options15 = faker12.options;
        com.github.javafaker.Business business16 = faker12.business();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color21 = faker20.color;
        faker12.color = color21;
        faker1.color = color21;
        java.lang.String str25 = faker1.letterify("English (United States)");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "English (United States)" + "'", str25, "English (United States)");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business5 = faker4.business;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Company company8 = null;
        faker7.company = company8;
        com.github.javafaker.Name name10 = faker7.name();
        faker4.name = name10;
        com.github.javafaker.Color color12 = faker4.color();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Color color15 = faker14.color;
        com.github.javafaker.Options options16 = faker14.options();
        faker4.options = options16;
        faker1.options = options16;
        com.github.javafaker.Code code19 = faker1.code;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(code19);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.LongStream longStream8 = random0.longs(0L, (long) 732850921);
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((long) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company;
        com.github.javafaker.Business business2 = faker0.business();
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertNotNull(business2);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Company company4 = null;
        faker3.company = company4;
        com.github.javafaker.Name name6 = faker3.name();
        faker0.name = name6;
        com.github.javafaker.Business business8 = faker0.business;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        java.lang.String str15 = faker13.numerify("");
        com.github.javafaker.Number number16 = faker13.number();
        faker10.number = number16;
        com.github.javafaker.Options options18 = faker10.options;
        com.github.javafaker.Color color19 = faker10.color;
        com.github.javafaker.Internet internet20 = faker10.internet();
        faker0.internet = internet20;
        com.github.javafaker.Book book22 = faker0.book;
        com.github.javafaker.Company company23 = faker0.company;
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(book22);
        org.junit.Assert.assertNotNull(company23);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        boolean boolean4 = locale2.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBR" + "'", str1, "GBR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u56fd" + "'", str3, "\u82f1\u56fd");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        float float8 = random0.nextFloat();
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1 };
        random0.nextBytes(byteArray11);
        java.util.stream.IntStream intStream16 = random0.ints((long) (short) 100, (int) (byte) -1, (int) (byte) 100);
        double double17 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream21 = random0.doubles((long) 19, (double) 100L, (double) 1374145625);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8526287f + "'", float8 == 0.8526287f);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[115, -59]");
        org.junit.Assert.assertNotNull(intStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.1633473985919084d + "'", double17 == 0.1633473985919084d);
        org.junit.Assert.assertNotNull(doubleStream21);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.numerify("");
        com.github.javafaker.Book book8 = null;
        faker5.book = book8;
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        faker1.phoneNumber = phoneNumber11;
        com.github.javafaker.Number number13 = faker1.number();
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet;
        com.github.javafaker.DateAndTime dateAndTime21 = faker15.date();
        com.github.javafaker.Code code22 = faker15.code;
        com.github.javafaker.Code code23 = faker15.code();
        java.util.Random random24 = null;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Color color26 = faker25.color;
        com.github.javafaker.DateAndTime dateAndTime27 = faker25.dateAndTime;
        com.github.javafaker.service.RandomService randomService28 = faker25.randomService;
        faker15.randomService = randomService28;
        com.github.javafaker.Address address30 = faker15.address();
        faker1.address = address30;
        com.github.javafaker.Number number32 = faker1.number;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(dateAndTime21);
        org.junit.Assert.assertNotNull(code22);
        org.junit.Assert.assertNotNull(code23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(dateAndTime27);
        org.junit.Assert.assertNotNull(randomService28);
        org.junit.Assert.assertNotNull(address30);
        org.junit.Assert.assertNotNull(number32);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address;
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Address address5 = faker0.address;
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(address5);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.numerify("");
        com.github.javafaker.Book book8 = null;
        faker5.book = book8;
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        faker1.phoneNumber = phoneNumber11;
        com.github.javafaker.DateAndTime dateAndTime13 = faker1.dateAndTime;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet();
        com.github.javafaker.Lorem lorem21 = faker15.lorem;
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.DateAndTime dateAndTime24 = null;
        faker23.dateAndTime = dateAndTime24;
        com.github.javafaker.Lorem lorem26 = faker23.lorem;
        faker15.lorem = lorem26;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Color color30 = faker29.color;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Number number35 = faker32.number();
        faker29.number = number35;
        com.github.javafaker.Company company37 = null;
        faker29.company = company37;
        com.github.javafaker.Options options39 = faker29.options;
        com.github.javafaker.Code code40 = faker29.code;
        faker15.code = code40;
        faker1.code = code40;
        com.github.javafaker.service.RandomService randomService43 = faker1.randomService;
        com.github.javafaker.Number number44 = faker1.number();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(lorem21);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(number35);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(code40);
        org.junit.Assert.assertNotNull(randomService43);
        org.junit.Assert.assertNotNull(number44);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Address address2 = faker1.address;
        com.github.javafaker.Address address3 = faker1.address;
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(address3);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u56fd", "China", "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u56fd\u4e2d\u6587");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str3 = locale1.getDisplayScript();
        java.lang.String str4 = locale1.getDisplayVariant();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale.setDefault(locale5);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.lang.String str11 = locale9.toLanguageTag();
        java.lang.String str12 = locale5.getDisplayName(locale9);
        java.util.Locale.setDefault(locale5);
        java.lang.String str14 = locale3.getDisplayScript(locale5);
        java.lang.String str15 = locale0.getDisplayScript(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-TW" + "'", str11, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str12, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("gbr");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray17 = new java.util.Locale[] { locale11, locale13, locale14, locale15, locale16 };
        java.util.ArrayList<java.util.Locale> localeList18 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList18, localeArray17);
        java.util.List<java.util.Locale> localeList20 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale32 = new java.util.Locale("");
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.util.Locale locale35 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale30, locale32, locale33, locale34, locale35 };
        java.util.ArrayList<java.util.Locale> localeList37 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList37, localeArray36);
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale locale50 = new java.util.Locale("");
        java.util.Locale locale52 = new java.util.Locale("");
        java.util.Locale locale53 = java.util.Locale.ENGLISH;
        java.util.Locale locale54 = java.util.Locale.ENGLISH;
        java.util.Locale locale55 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale50, locale52, locale53, locale54, locale55 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strList65);
        java.util.Locale locale69 = new java.util.Locale("");
        java.util.Locale locale71 = new java.util.Locale("");
        java.util.Locale locale72 = java.util.Locale.ENGLISH;
        java.util.Locale locale73 = java.util.Locale.ENGLISH;
        java.util.Locale locale74 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale69, locale71, locale72, locale73, locale74 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Locale locale81 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap82 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList83 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap82);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localeList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNull(locale81);
        org.junit.Assert.assertNotNull(languageRangeList83);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker1.randomService = randomService9;
        com.github.javafaker.Business business11 = faker1.business;
        com.github.javafaker.Internet internet12 = faker1.internet();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Color color15 = faker14.color;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        java.lang.String str19 = faker17.numerify("");
        com.github.javafaker.Number number20 = faker17.number();
        faker14.number = number20;
        com.github.javafaker.Company company22 = null;
        faker14.company = company22;
        com.github.javafaker.Options options24 = faker14.options;
        java.util.Random random25 = null;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Color color27 = faker26.color;
        com.github.javafaker.DateAndTime dateAndTime28 = faker26.dateAndTime;
        com.github.javafaker.service.RandomService randomService29 = faker26.randomService;
        faker14.randomService = randomService29;
        faker1.randomService = randomService29;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(dateAndTime28);
        org.junit.Assert.assertNotNull(randomService29);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Book book12 = null;
        faker9.book = book12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.DateAndTime dateAndTime16 = null;
        faker15.dateAndTime = dateAndTime16;
        com.github.javafaker.Lorem lorem18 = faker15.lorem;
        com.github.javafaker.Address address19 = faker15.address;
        com.github.javafaker.Finance finance20 = faker15.finance();
        faker9.finance = finance20;
        java.util.Locale locale22 = java.util.Locale.US;
        java.util.Locale.setDefault(locale22);
        java.lang.String str24 = locale22.getVariant();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale22);
        com.github.javafaker.Options options26 = faker25.options();
        faker9.options = options26;
        com.github.javafaker.Lorem lorem28 = faker9.lorem;
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Random random30 = new java.util.Random();
        int int32 = random30.nextInt((int) (short) 1);
        random30.setSeed((long) 100);
        float float35 = random30.nextFloat();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale29, random30);
        com.github.javafaker.PhoneNumber phoneNumber37 = faker36.phoneNumber;
        faker9.phoneNumber = phoneNumber37;
        faker7.phoneNumber = phoneNumber37;
        com.github.javafaker.Number number40 = faker7.number();
        com.github.javafaker.Finance finance41 = faker7.finance();
        com.github.javafaker.Book book42 = faker7.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lorem18);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(finance20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(lorem28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.7220096f + "'", float35 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber37);
        org.junit.Assert.assertNotNull(number40);
        org.junit.Assert.assertNotNull(finance41);
        org.junit.Assert.assertNotNull(book42);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str3 = locale1.getDisplayScript();
        java.lang.String str4 = locale1.getDisplayVariant();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random();
        int int13 = random11.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        java.lang.String str20 = locale18.toLanguageTag();
        java.lang.String str21 = locale18.getDisplayLanguage();
        java.util.Random random22 = new java.util.Random();
        int int24 = random22.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale18, random22);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale7, random22);
        boolean boolean28 = locale7.hasExtensions();
        java.lang.String str29 = locale1.getDisplayScript(locale7);
        java.lang.String str31 = locale7.getExtension('u');
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-TW" + "'", str9, "zh-TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese" + "'", str10, "Chinese");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh-TW" + "'", str20, "zh-TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinese" + "'", str21, "Chinese");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.util.Locale locale2 = new java.util.Locale("GBR", "zho");
        java.lang.String str3 = locale2.getLanguage();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale6 = java.util.Locale.TAIWAN;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        java.util.Random random8 = new java.util.Random();
        java.util.stream.LongStream longStream9 = random8.longs();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale6, random8);
        java.lang.String str11 = locale6.getScript();
        java.lang.String str12 = locale2.getDisplayCountry(locale6);
        java.util.Locale locale13 = locale6.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "gbr_ZHO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ZHO" + "'", str12, "ZHO");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.util.Locale locale2 = java.util.Locale.UK;
        java.lang.String str3 = locale2.getISO3Country();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.lang.String str7 = locale1.getDisplayScript(locale4);
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str11 = locale8.getDisplayName(locale10);
        java.lang.String str12 = locale8.getDisplayName();
        java.lang.String str13 = locale4.getDisplayName(locale8);
        boolean boolean14 = locale8.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBR" + "'", str3, "GBR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "United Kingdom" + "'", str6, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English" + "'", str11, "English");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English (United Kingdom)" + "'", str13, "English (United Kingdom)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Lorem lorem7 = faker1.lorem;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.DateAndTime dateAndTime10 = null;
        faker9.dateAndTime = dateAndTime10;
        com.github.javafaker.Lorem lorem12 = faker9.lorem;
        faker1.lorem = lorem12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        java.lang.String str20 = faker18.numerify("");
        com.github.javafaker.Number number21 = faker18.number();
        faker15.number = number21;
        com.github.javafaker.Company company23 = null;
        faker15.company = company23;
        com.github.javafaker.Options options25 = faker15.options;
        com.github.javafaker.Code code26 = faker15.code;
        faker1.code = code26;
        com.github.javafaker.Book book28 = faker1.book();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(number21);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(code26);
        org.junit.Assert.assertNull(book28);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Business business6 = faker1.business;
        com.github.javafaker.Company company7 = faker1.company();
        com.github.javafaker.Company company8 = faker1.company();
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        java.lang.String str16 = faker14.numerify("");
        com.github.javafaker.Book book17 = null;
        faker14.book = book17;
        com.github.javafaker.Internet internet19 = faker14.internet();
        com.github.javafaker.PhoneNumber phoneNumber20 = faker14.phoneNumber();
        faker10.phoneNumber = phoneNumber20;
        com.github.javafaker.DateAndTime dateAndTime22 = faker10.dateAndTime;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        java.lang.String str26 = faker24.numerify("");
        com.github.javafaker.Book book27 = null;
        faker24.book = book27;
        com.github.javafaker.Internet internet29 = faker24.internet();
        com.github.javafaker.Lorem lorem30 = faker24.lorem;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.DateAndTime dateAndTime33 = null;
        faker32.dateAndTime = dateAndTime33;
        com.github.javafaker.Lorem lorem35 = faker32.lorem;
        faker24.lorem = lorem35;
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Color color39 = faker38.color;
        java.util.Random random40 = null;
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(random40);
        java.lang.String str43 = faker41.numerify("");
        com.github.javafaker.Number number44 = faker41.number();
        faker38.number = number44;
        com.github.javafaker.Company company46 = null;
        faker38.company = company46;
        com.github.javafaker.Options options48 = faker38.options;
        com.github.javafaker.Code code49 = faker38.code;
        faker24.code = code49;
        faker10.code = code49;
        faker1.code = code49;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(phoneNumber20);
        org.junit.Assert.assertNotNull(dateAndTime22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(internet29);
        org.junit.Assert.assertNotNull(lorem30);
        org.junit.Assert.assertNotNull(lorem35);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(number44);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(code49);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        java.lang.String str5 = faker3.numerify("");
        com.github.javafaker.Address address6 = faker3.address;
        com.github.javafaker.DateAndTime dateAndTime7 = faker3.dateAndTime;
        com.github.javafaker.Lorem lorem8 = faker3.lorem;
        faker0.lorem = lorem8;
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Color color12 = faker11.color;
        com.github.javafaker.Lorem lorem13 = faker11.lorem();
        com.github.javafaker.Finance finance14 = faker11.finance;
        com.github.javafaker.Number number15 = faker11.number();
        com.github.javafaker.Options options16 = faker11.options;
        com.github.javafaker.Finance finance17 = faker11.finance;
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.DateAndTime dateAndTime20 = null;
        faker19.dateAndTime = dateAndTime20;
        com.github.javafaker.Lorem lorem22 = faker19.lorem;
        com.github.javafaker.Address address23 = faker19.address;
        com.github.javafaker.Code code24 = faker19.code();
        faker11.code = code24;
        com.github.javafaker.service.FakeValuesService fakeValuesService26 = faker11.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService26;
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNotNull(number15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(finance17);
        org.junit.Assert.assertNotNull(lorem22);
        org.junit.Assert.assertNotNull(address23);
        org.junit.Assert.assertNotNull(code24);
        org.junit.Assert.assertNotNull(fakeValuesService26);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.util.Locale locale2 = new java.util.Locale("\uc601\uc5b4", "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\uc601\uc5b4\u4e2d\u6587");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str9 = locale6.getDisplayName(locale8);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str19 = locale12.getDisplayCountry(locale16);
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = locale12.getDisplayLanguage(locale20);
        java.lang.String str23 = locale6.getDisplayLanguage(locale20);
        java.lang.String str24 = locale6.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-TW" + "'", str18, "zh-TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "English" + "'", str23, "English");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = null;
        faker1.company = company2;
        com.github.javafaker.Name name4 = faker1.name();
        com.github.javafaker.Internet internet5 = faker1.internet();
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.lang.String str3 = locale2.getISO3Country();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.lang.String str5 = locale2.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBR" + "'", str1, "GBR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBR" + "'", str3, "GBR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "United Kingdom" + "'", str4, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        com.github.javafaker.Lorem lorem7 = faker5.lorem();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Book book12 = null;
        faker9.book = book12;
        com.github.javafaker.Internet internet14 = faker9.internet();
        com.github.javafaker.PhoneNumber phoneNumber15 = faker9.phoneNumber();
        faker5.phoneNumber = phoneNumber15;
        faker1.phoneNumber = phoneNumber15;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business19 = faker18.business;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Company company22 = null;
        faker21.company = company22;
        com.github.javafaker.Name name24 = faker21.name();
        faker18.name = name24;
        com.github.javafaker.Company company26 = faker18.company;
        com.github.javafaker.Options options27 = faker18.options;
        faker1.options = options27;
        com.github.javafaker.Color color29 = faker1.color;
        com.github.javafaker.Internet internet30 = faker1.internet();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertNotNull(phoneNumber15);
        org.junit.Assert.assertNotNull(business19);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(company26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(internet30);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguage("\u5fb7\u570b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Random random4 = new java.util.Random();
        java.util.stream.LongStream longStream5 = random4.longs();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2, random4);
        com.github.javafaker.Book book7 = faker6.book;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(book7);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = null;
        faker1.company = company2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker1.phoneNumber;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.DateAndTime dateAndTime7 = null;
        faker6.dateAndTime = dateAndTime7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem;
        com.github.javafaker.Address address10 = faker6.address;
        com.github.javafaker.Finance finance11 = faker6.finance();
        com.github.javafaker.Number number12 = faker6.number();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        java.lang.String str16 = faker14.numerify("");
        com.github.javafaker.Number number17 = faker14.number();
        com.github.javafaker.Name name18 = faker14.name();
        faker6.name = name18;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Company company22 = null;
        faker21.company = company22;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.DateAndTime dateAndTime25 = faker21.dateAndTime;
        com.github.javafaker.Finance finance26 = faker21.finance();
        faker6.finance = finance26;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Company company30 = null;
        faker29.company = company30;
        com.github.javafaker.Name name32 = faker29.name();
        com.github.javafaker.DateAndTime dateAndTime33 = faker29.dateAndTime;
        com.github.javafaker.service.RandomService randomService34 = faker29.randomService;
        faker6.randomService = randomService34;
        faker1.randomService = randomService34;
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(number17);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(dateAndTime25);
        org.junit.Assert.assertNotNull(finance26);
        org.junit.Assert.assertNotNull(name32);
        org.junit.Assert.assertNotNull(dateAndTime33);
        org.junit.Assert.assertNotNull(randomService34);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder7 = builder2.setExtension('a', "TWN");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("und");
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder15 = builder10.setExtension('a', "zho");
        java.util.Locale.Builder builder17 = builder15.setLanguageTag("en");
        java.util.Locale.Builder builder18 = builder15.clearExtensions();
        java.util.Locale locale19 = builder15.build();
        java.util.Locale.setDefault(category0, locale19);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.util.Locale locale11 = new java.util.Locale("GBR", "\u82f1\u570b", "eng");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale6.getDisplayScript(locale11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "\u82f1\u570b_eng");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.LongStream longStream8 = random0.longs((long) (-1), (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = random0.nextInt((-1816352593));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.LongStream longStream8 = random0.longs(0L, (long) 732850921);
        java.util.stream.IntStream intStream10 = random0.ints((long) 1979298273);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United States" + "'", str1, "United States");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United States)" + "'", str2, "English (United States)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en_US" + "'", str4, "en_US");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Color color4 = faker1.color();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        java.lang.String str8 = faker6.numerify("");
        com.github.javafaker.Book book9 = null;
        faker6.book = book9;
        com.github.javafaker.Internet internet11 = faker6.internet;
        com.github.javafaker.DateAndTime dateAndTime12 = faker6.date();
        faker1.dateAndTime = dateAndTime12;
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getVariant();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale14);
        com.github.javafaker.Options options18 = faker17.options();
        faker1.options = options18;
        com.github.javafaker.Options options20 = faker1.options();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        java.lang.String str24 = faker22.numerify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService25 = faker22.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService25;
        com.github.javafaker.Color color27 = faker1.color();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(fakeValuesService25);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.util.Locale locale3 = new java.util.Locale("", "eng", "");
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Random random5 = new java.util.Random();
        int int7 = random5.nextInt((int) (short) 1);
        random5.setSeed((long) 100);
        float float10 = random5.nextFloat();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale4, random5);
        java.lang.String str12 = locale4.getDisplayCountry();
        java.lang.String str13 = locale3.getDisplayLanguage(locale4);
        java.util.Random random14 = new java.util.Random();
        int int16 = random14.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream18 = random14.longs((long) '#');
        java.util.stream.LongStream longStream20 = random14.longs((long) (short) 0);
        java.util.stream.LongStream longStream22 = random14.longs((long) '4');
        java.util.stream.DoubleStream doubleStream26 = random14.doubles((long) (short) 1, (double) 0.9741725f, (double) 2241767268063067838L);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale4, random14);
        com.github.javafaker.Book book28 = faker27.book();
        org.junit.Assert.assertEquals(locale3.toString(), "_ENG");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.7220096f + "'", float10 == 0.7220096f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(book28);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.util.Locale locale8 = locale6.stripExtensions();
        java.lang.String str9 = locale6.getScript();
        java.lang.String str10 = locale6.getDisplayScript();
        java.util.Locale locale11 = locale6.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.util.Set<java.lang.Character> charSet8 = locale0.getExtensionKeys();
        java.lang.String str9 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str7, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Name name10 = faker1.name;
        com.github.javafaker.Internet internet11 = faker1.internet();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker1.phoneNumber();
        com.github.javafaker.Book book13 = faker1.book();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(book13);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder18 = builder13.setExtension('x', "zh-TW");
        java.util.Locale.Builder builder19 = builder13.clearExtensions();
        java.util.Locale locale20 = builder13.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Book book6 = faker1.book();
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        java.lang.String str10 = faker8.numerify("");
        com.github.javafaker.Book book11 = null;
        faker8.book = book11;
        com.github.javafaker.Internet internet13 = faker8.internet;
        com.github.javafaker.Internet internet14 = faker8.internet;
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Color color17 = faker16.color;
        com.github.javafaker.Options options18 = faker16.options();
        com.github.javafaker.Color color19 = faker16.color();
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        java.lang.String str23 = faker21.numerify("");
        com.github.javafaker.Book book24 = null;
        faker21.book = book24;
        com.github.javafaker.Internet internet26 = faker21.internet;
        com.github.javafaker.DateAndTime dateAndTime27 = faker21.date();
        faker16.dateAndTime = dateAndTime27;
        faker8.dateAndTime = dateAndTime27;
        com.github.javafaker.Book book30 = faker8.book;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Book book35 = null;
        faker32.book = book35;
        com.github.javafaker.Internet internet37 = faker32.internet;
        com.github.javafaker.DateAndTime dateAndTime38 = faker32.date();
        com.github.javafaker.Internet internet39 = faker32.internet;
        com.github.javafaker.Business business40 = faker32.business;
        com.github.javafaker.service.RandomService randomService41 = faker32.randomService;
        com.github.javafaker.Address address42 = faker32.address();
        faker8.address = address42;
        faker1.address = address42;
        com.github.javafaker.Finance finance45 = faker1.finance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(internet13);
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(internet26);
        org.junit.Assert.assertNotNull(dateAndTime27);
        org.junit.Assert.assertNull(book30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(internet37);
        org.junit.Assert.assertNotNull(dateAndTime38);
        org.junit.Assert.assertNotNull(internet39);
        org.junit.Assert.assertNotNull(business40);
        org.junit.Assert.assertNotNull(randomService41);
        org.junit.Assert.assertNotNull(address42);
        org.junit.Assert.assertNotNull(finance45);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.numerify("");
        com.github.javafaker.Book book8 = null;
        faker5.book = book8;
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        faker1.phoneNumber = phoneNumber11;
        com.github.javafaker.DateAndTime dateAndTime13 = faker1.dateAndTime;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet();
        com.github.javafaker.Lorem lorem21 = faker15.lorem;
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.DateAndTime dateAndTime24 = null;
        faker23.dateAndTime = dateAndTime24;
        com.github.javafaker.Lorem lorem26 = faker23.lorem;
        faker15.lorem = lorem26;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Color color30 = faker29.color;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Number number35 = faker32.number();
        faker29.number = number35;
        com.github.javafaker.Company company37 = null;
        faker29.company = company37;
        com.github.javafaker.Options options39 = faker29.options;
        com.github.javafaker.Code code40 = faker29.code;
        faker15.code = code40;
        faker1.code = code40;
        com.github.javafaker.Name name43 = faker1.name();
        com.github.javafaker.Company company44 = faker1.company;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(lorem21);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(number35);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(code40);
        org.junit.Assert.assertNotNull(name43);
        org.junit.Assert.assertNotNull(company44);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.util.Locale locale1 = new java.util.Locale("und");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "und");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "und");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "und");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "und");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Options options10 = faker8.options();
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Lorem lorem14 = faker12.lorem();
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        java.lang.String str18 = faker16.numerify("");
        com.github.javafaker.Book book19 = null;
        faker16.book = book19;
        com.github.javafaker.Internet internet21 = faker16.internet();
        com.github.javafaker.PhoneNumber phoneNumber22 = faker16.phoneNumber();
        faker12.phoneNumber = phoneNumber22;
        faker8.phoneNumber = phoneNumber22;
        faker1.phoneNumber = phoneNumber22;
        com.github.javafaker.Color color26 = faker1.color;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(lorem14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(internet21);
        org.junit.Assert.assertNotNull(phoneNumber22);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Code code9 = faker8.code;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        boolean boolean6 = locale5.hasExtensions();
        java.lang.String str7 = locale5.getDisplayScript();
        java.lang.String str8 = locale5.getCountry();
        java.lang.String str9 = locale2.getDisplayLanguage(locale5);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale5.getDisplayName(locale10);
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinesisch" + "'", str9, "Chinesisch");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.DateAndTime dateAndTime3 = faker1.dateAndTime;
        com.github.javafaker.service.RandomService randomService4 = faker1.randomService;
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        java.lang.String str9 = faker7.numerify("");
        com.github.javafaker.Book book10 = null;
        faker7.book = book10;
        com.github.javafaker.Internet internet12 = faker7.internet;
        com.github.javafaker.DateAndTime dateAndTime13 = faker7.date();
        com.github.javafaker.Code code14 = faker7.code;
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Color color17 = faker16.color;
        com.github.javafaker.Lorem lorem18 = faker16.lorem();
        com.github.javafaker.Finance finance19 = faker16.finance;
        com.github.javafaker.Number number20 = faker16.number();
        faker7.number = number20;
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.DateAndTime dateAndTime24 = null;
        faker23.dateAndTime = dateAndTime24;
        com.github.javafaker.Lorem lorem26 = faker23.lorem;
        com.github.javafaker.Address address27 = faker23.address;
        faker7.address = address27;
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Random random30 = new java.util.Random();
        int int32 = random30.nextInt((int) (short) 1);
        random30.setSeed((long) 100);
        float float35 = random30.nextFloat();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale29, random30);
        com.github.javafaker.PhoneNumber phoneNumber37 = faker36.phoneNumber;
        faker7.phoneNumber = phoneNumber37;
        com.github.javafaker.Code code39 = faker7.code;
        com.github.javafaker.Code code40 = faker7.code();
        faker1.code = code40;
        com.github.javafaker.Finance finance42 = faker1.finance;
        com.github.javafaker.Number number43 = faker1.number();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(lorem18);
        org.junit.Assert.assertNotNull(finance19);
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.7220096f + "'", float35 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber37);
        org.junit.Assert.assertNotNull(code39);
        org.junit.Assert.assertNotNull(code40);
        org.junit.Assert.assertNotNull(finance42);
        org.junit.Assert.assertNotNull(number43);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Random random4 = new java.util.Random();
        java.util.stream.LongStream longStream5 = random4.longs();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2, random4);
        com.github.javafaker.Finance finance7 = faker6.finance;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Book book12 = null;
        faker9.book = book12;
        com.github.javafaker.Internet internet14 = faker9.internet;
        com.github.javafaker.DateAndTime dateAndTime15 = faker9.date();
        com.github.javafaker.Internet internet16 = faker9.internet;
        com.github.javafaker.Business business17 = faker9.business;
        com.github.javafaker.service.RandomService randomService18 = faker9.randomService;
        com.github.javafaker.Address address19 = faker9.address();
        faker6.address = address19;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(internet16);
        org.junit.Assert.assertNotNull(business17);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(address19);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.numerify("");
        com.github.javafaker.Book book8 = null;
        faker5.book = book8;
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        faker1.phoneNumber = phoneNumber11;
        com.github.javafaker.DateAndTime dateAndTime13 = faker1.dateAndTime;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet();
        com.github.javafaker.Lorem lorem21 = faker15.lorem;
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.DateAndTime dateAndTime24 = null;
        faker23.dateAndTime = dateAndTime24;
        com.github.javafaker.Lorem lorem26 = faker23.lorem;
        faker15.lorem = lorem26;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Color color30 = faker29.color;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Number number35 = faker32.number();
        faker29.number = number35;
        com.github.javafaker.Company company37 = null;
        faker29.company = company37;
        com.github.javafaker.Options options39 = faker29.options;
        com.github.javafaker.Code code40 = faker29.code;
        faker15.code = code40;
        faker1.code = code40;
        java.util.Random random43 = null;
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        java.lang.String str46 = faker44.numerify("");
        com.github.javafaker.Book book47 = null;
        faker44.book = book47;
        com.github.javafaker.Internet internet49 = faker44.internet;
        com.github.javafaker.DateAndTime dateAndTime50 = faker44.date();
        com.github.javafaker.Code code51 = faker44.code;
        java.util.Random random52 = null;
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(random52);
        com.github.javafaker.Color color54 = faker53.color;
        com.github.javafaker.Lorem lorem55 = faker53.lorem();
        com.github.javafaker.Finance finance56 = faker53.finance;
        com.github.javafaker.Number number57 = faker53.number();
        faker44.number = number57;
        com.github.javafaker.Address address59 = faker44.address();
        com.github.javafaker.Company company60 = faker44.company;
        faker1.company = company60;
        java.util.Random random62 = null;
        com.github.javafaker.Faker faker63 = new com.github.javafaker.Faker(random62);
        java.lang.String str65 = faker63.numerify("");
        com.github.javafaker.Book book66 = null;
        faker63.book = book66;
        com.github.javafaker.Internet internet68 = faker63.internet();
        com.github.javafaker.Business business69 = faker63.business;
        com.github.javafaker.Business business70 = faker63.business();
        faker1.business = business70;
        com.github.javafaker.Code code72 = faker1.code();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(lorem21);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(number35);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(code40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(internet49);
        org.junit.Assert.assertNotNull(dateAndTime50);
        org.junit.Assert.assertNotNull(code51);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(lorem55);
        org.junit.Assert.assertNotNull(finance56);
        org.junit.Assert.assertNotNull(number57);
        org.junit.Assert.assertNotNull(address59);
        org.junit.Assert.assertNotNull(company60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(internet68);
        org.junit.Assert.assertNotNull(business69);
        org.junit.Assert.assertNotNull(business70);
        org.junit.Assert.assertNotNull(code72);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles(315664383340106314L);
        java.util.stream.LongStream longStream3 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (-1779109740));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }
}
