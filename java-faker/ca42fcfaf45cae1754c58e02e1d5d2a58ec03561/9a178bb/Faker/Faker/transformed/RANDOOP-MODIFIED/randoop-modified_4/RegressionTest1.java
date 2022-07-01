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
        java.util.Random random1 = new java.util.Random(1L);
        double double2 = random1.nextGaussian();
        long long3 = random1.nextLong();
        java.util.stream.LongStream longStream7 = random1.longs(100L, (long) (-1167796541), (-1L));
        java.util.stream.LongStream longStream8 = random1.longs();
        boolean boolean9 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.561581040188955d + "'", double2 == 1.561581040188955d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3831662765844904176L + "'", long3 == 3831662765844904176L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale3.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English (United Kingdom)", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united kingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.util.Locale locale1 = new java.util.Locale("fran\347ais");
        org.junit.Assert.assertEquals(locale1.toString(), "fran\347ais");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random2 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream5 = random2.longs((long) (short) 0, (long) (byte) 1);
        java.util.Random random7 = new java.util.Random((long) (byte) 1);
        byte[] byteArray9 = new byte[] { (byte) -1 };
        random7.nextBytes(byteArray9);
        random2.nextBytes(byteArray9);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-46]");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.util.Locale locale2 = new java.util.Locale("fra", "fr-fr");
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale5 = new java.util.Locale("fr_FR");
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str7 = locale2.getDisplayName(locale5);
        org.junit.Assert.assertEquals(locale2.toString(), "fra_FR-FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertEquals(locale5.toString(), "fr_fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr_fr" + "'", str6, "fr_fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fra (FR-FR)" + "'", str7, "fra (FR-FR)");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = random0.nextInt((-753608540));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5061608175574449d + "'", double1 == 0.5061608175574449d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08766404540774464d + "'", double5 == 0.08766404540774464d);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale9 = new java.util.Locale("fr", "");
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        com.github.javafaker.DateAndTime dateAndTime8 = faker5.date();
        java.lang.String str10 = faker5.bothify("fran\347ais");
        com.github.javafaker.Code code11 = faker5.code;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7967400273272999d + "'", double1 == 0.7967400273272999d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(code11);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setUnicodeLocaleKeyword("hi!", "fr-x-lvariant-eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet5 = locale1.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.util.Locale locale3 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str5 = locale3.getExtension('u');
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale7.getVariant();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale7.getDisplayVariant(locale9);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale9);
        java.lang.String str12 = locale3.getDisplayLanguage(locale9);
        java.lang.String str13 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!_EN-US_en-US" + "'", str13, "hi!_EN-US_en-US");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 10L, 0.8615675545806825d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder12 = builder10.setLanguage("ja");
        java.util.Locale locale16 = new java.util.Locale("japonais", "und", "Japanese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder10.setLocale(locale16);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: UND [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals(locale16.toString(), "japonais_UND_Japanese");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.service.RandomService randomService3 = faker2.randomService;
        com.github.javafaker.Number number4 = faker2.number;
        com.github.javafaker.Finance finance5 = faker2.finance();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number7 = faker6.number;
        com.github.javafaker.Business business8 = faker6.business();
        faker2.business = business8;
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale10, random11);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale10);
        com.github.javafaker.PhoneNumber phoneNumber14 = faker13.phoneNumber();
        faker2.phoneNumber = phoneNumber14;
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        java.util.Random random20 = new java.util.Random();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Lorem lorem22 = null;
        faker21.lorem = lorem22;
        java.lang.String str25 = faker21.numerify("");
        com.github.javafaker.Company company26 = faker21.company;
        com.github.javafaker.Number number27 = faker21.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService28 = faker21.fakeValuesService;
        faker17.fakeValuesService = fakeValuesService28;
        com.github.javafaker.Company company30 = faker17.company();
        faker2.company = company30;
        org.junit.Assert.assertNotNull(randomService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(company26);
        org.junit.Assert.assertNotNull(number27);
        org.junit.Assert.assertNotNull(fakeValuesService28);
        org.junit.Assert.assertNotNull(company30);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) 1.0f, 0.8174569157875892d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker1.randomService = randomService12;
        com.github.javafaker.Finance finance14 = faker1.finance();
        com.github.javafaker.Lorem lorem15 = faker1.lorem();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker1.phoneNumber();
        com.github.javafaker.Address address17 = faker1.address;
        com.github.javafaker.Name name18 = faker1.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.201085737245691d + "'", double8 == 0.201085737245691d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNull(lorem15);
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertNotNull(name18);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("jpn");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.util.Locale locale21 = new java.util.Locale("hi!");
        java.lang.String str22 = locale21.getVariant();
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleKeys();
        java.lang.String str24 = locale19.getDisplayLanguage(locale21);
        java.lang.String str25 = locale19.getLanguage();
        java.util.Set<java.lang.String> strSet26 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet26);
        java.util.Locale.LanguageRange languageRange29 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange31 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] { languageRange29, languageRange31 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList42);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList50);
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, (java.util.Collection<java.lang.String>) strList58);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList66);
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, (java.util.Collection<java.lang.String>) strList66);
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList69, filteringMode70);
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList42, filteringMode70);
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList72);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode70.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.Name name5 = faker1.name;
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Internet internet10 = null;
        faker7.internet = internet10;
        java.lang.String str13 = faker7.bothify("");
        com.github.javafaker.Book book14 = faker7.book();
        faker1.book = book14;
        com.github.javafaker.Lorem lorem16 = faker1.lorem();
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNull(lorem16);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.LongStream longStream4 = random1.longs(1L);
        java.util.stream.IntStream intStream5 = random1.ints();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        java.lang.String str13 = faker9.numerify("");
        com.github.javafaker.Business business14 = faker9.business;
        faker1.business = business14;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(business14);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.lang.String str4 = locale1.getDisplayVariant();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.util.Locale locale3 = new java.util.Locale("fr-FR", "", "France");
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr-fr__France");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker1.randomService = randomService12;
        com.github.javafaker.Finance finance14 = faker1.finance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = faker1.resolve("Japanese");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.742651911810447d + "'", double8 == 0.742651911810447d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(finance14);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream6 = random1.longs((long) 1, (long) 1, 100L);
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        double double9 = random7.nextGaussian();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        random7.nextBytes(byteArray15);
        random1.nextBytes(byteArray15);
        java.util.stream.IntStream intStream18 = random1.ints();
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.1593674159655354d + "'", double9 == 1.1593674159655354d);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[115, -43, 26, -69, -40]");
        org.junit.Assert.assertNotNull(intStream18);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chinese (taiwan) (FRA)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese (taiwan) (fra)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.util.Locale locale2 = new java.util.Locale("fran\347ais (EN-GB)", "German");
        org.junit.Assert.assertEquals(locale2.toString(), "fran\347ais (en-gb)_GERMAN");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("it");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        double double6 = random0.nextDouble();
        java.util.stream.LongStream longStream10 = random0.longs(0L, 0L, (long) 1877394549);
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34083720686285923d + "'", double1 == 0.34083720686285923d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5542597503784752d + "'", double5 == 0.5542597503784752d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6628853200482784d + "'", double6 == 0.6628853200482784d);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker1.randomService = randomService12;
        com.github.javafaker.Finance finance14 = faker1.finance();
        com.github.javafaker.Options options15 = faker1.options;
        com.github.javafaker.Book book16 = faker1.book();
        com.github.javafaker.Address address17 = faker1.address;
        com.github.javafaker.Code code18 = faker1.code();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14696019825318063d + "'", double8 == 0.14696019825318063d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertNotNull(code18);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number6 = faker5.number;
        com.github.javafaker.Number number7 = faker5.number();
        java.lang.String str9 = faker5.bothify("en-GB");
        com.github.javafaker.Name name10 = faker5.name();
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getVariant();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = locale12.getDisplayVariant(locale14);
        java.lang.String str16 = locale14.getCountry();
        java.util.Random random17 = new java.util.Random();
        double double18 = random17.nextDouble();
        int int20 = random17.nextInt(1);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale14, random17);
        com.github.javafaker.Business business22 = faker21.business;
        java.lang.String str24 = faker21.bothify("en-US");
        com.github.javafaker.Number number25 = faker21.number();
        java.lang.String str27 = faker21.numerify("");
        java.util.Random random28 = new java.util.Random();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Lorem lorem30 = null;
        faker29.lorem = lorem30;
        java.lang.String str33 = faker29.numerify("");
        java.util.Random random34 = new java.util.Random();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.Lorem lorem36 = null;
        faker35.lorem = lorem36;
        com.github.javafaker.Color color38 = faker35.color;
        faker29.color = color38;
        faker21.color = color38;
        faker5.color = color38;
        faker1.color = color38;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-GB" + "'", str9, "en-GB");
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FR" + "'", str16, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2975775321795342d + "'", double18 == 0.2975775321795342d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(business22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-US" + "'", str24, "en-US");
        org.junit.Assert.assertNotNull(number25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(color38);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream2 = random1.ints();
        boolean boolean3 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = random1.nextInt((-753608540));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Business business2 = faker0.business();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Lorem lorem5 = null;
        faker4.lorem = lorem5;
        com.github.javafaker.Color color7 = faker4.color;
        com.github.javafaker.Finance finance8 = faker4.finance();
        com.github.javafaker.Address address9 = faker4.address;
        faker0.address = address9;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        com.github.javafaker.Finance finance15 = faker12.finance;
        faker0.finance = finance15;
        com.github.javafaker.Options options17 = faker0.options;
        java.util.Random random18 = new java.util.Random();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Lorem lorem20 = null;
        faker19.lorem = lorem20;
        com.github.javafaker.Internet internet22 = null;
        faker19.internet = internet22;
        java.util.Random random24 = new java.util.Random();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Lorem lorem26 = null;
        faker25.lorem = lorem26;
        java.lang.String str29 = faker25.numerify("");
        com.github.javafaker.PhoneNumber phoneNumber30 = faker25.phoneNumber;
        faker19.phoneNumber = phoneNumber30;
        faker0.phoneNumber = phoneNumber30;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(phoneNumber30);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.util.Locale locale2 = new java.util.Locale("FR", "fr_FR");
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
        java.lang.String str4 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr_FR_FR" + "'", str4, "fr_FR_FR");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.util.Locale locale2 = new java.util.Locale("English (United Kingdom)", "French (France)");
        java.lang.String str3 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "english (united kingdom)_FRENCH (FRANCE)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Book book3 = faker0.book;
        com.github.javafaker.Lorem lorem4 = faker0.lorem;
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-GB", 0.44412765809522514d);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.util.Locale locale3 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale3);
        com.github.javafaker.Finance finance13 = faker12.finance();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number15 = faker14.number;
        com.github.javafaker.Business business16 = faker14.business();
        com.github.javafaker.Business business17 = faker14.business();
        faker12.business = business17;
        org.junit.Assert.assertEquals(locale3.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(number15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(business17);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Address address6 = faker1.address;
        com.github.javafaker.Code code7 = faker1.code;
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        com.github.javafaker.Business business11 = faker0.business();
        com.github.javafaker.Book book12 = faker0.book;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        long long3 = random0.nextLong();
        java.util.stream.LongStream longStream6 = random0.longs((long) 7, (long) 431529176);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2449849814389515d + "'", double2 == 1.2449849814389515d);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2348491452138091259L) + "'", long3 == (-2348491452138091259L));
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber();
        com.github.javafaker.Options options7 = faker1.options();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker10.phoneNumber;
        faker8.phoneNumber = phoneNumber13;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        com.github.javafaker.PhoneNumber phoneNumber20 = faker17.phoneNumber;
        faker15.phoneNumber = phoneNumber20;
        com.github.javafaker.Options options22 = faker15.options;
        faker8.options = options22;
        com.github.javafaker.Internet internet24 = faker8.internet();
        java.util.Random random25 = new java.util.Random();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Lorem lorem27 = null;
        faker26.lorem = lorem27;
        java.lang.String str30 = faker26.numerify("hi!");
        com.github.javafaker.Lorem lorem31 = faker26.lorem;
        com.github.javafaker.Book book32 = faker26.book;
        faker8.book = book32;
        com.github.javafaker.Finance finance34 = faker8.finance;
        faker1.finance = finance34;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(phoneNumber20);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(internet24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(lorem31);
        org.junit.Assert.assertNotNull(book32);
        org.junit.Assert.assertNotNull(finance34);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italian", (double) (short) 1);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        double double5 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italian" + "'", str4, "italian");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.util.Locale locale1 = new java.util.Locale("English (United Kingdom)");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "english (united kingdom)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english (united kingdom)" + "'", str2, "english (united kingdom)");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Options options7 = faker1.options();
        java.util.Random random8 = new java.util.Random();
        double double9 = random8.nextDouble();
        java.util.stream.IntStream intStream12 = random8.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Code code14 = faker13.code();
        com.github.javafaker.Color color15 = faker13.color;
        faker1.color = color15;
        com.github.javafaker.Color color17 = faker1.color;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(options7);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3526960124663705d + "'", double9 == 0.3526960124663705d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        java.util.Random random12 = new java.util.Random();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Lorem lorem14 = null;
        faker13.lorem = lorem14;
        java.lang.String str17 = faker13.numerify("");
        com.github.javafaker.Company company18 = faker13.company;
        com.github.javafaker.Options options19 = faker13.options();
        faker1.options = options19;
        com.github.javafaker.PhoneNumber phoneNumber21 = faker1.phoneNumber();
        com.github.javafaker.Finance finance22 = faker1.finance;
        com.github.javafaker.Lorem lorem23 = faker1.lorem;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(company18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(phoneNumber21);
        org.junit.Assert.assertNotNull(finance22);
        org.junit.Assert.assertNull(lorem23);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.util.Locale locale3 = new java.util.Locale("anglais (Royaume-Uni)", "fran\347ais (EN-GB)", "fr_FR");
        org.junit.Assert.assertEquals(locale3.toString(), "anglais (royaume-uni)_FRAN\347AIS (EN-GB)_fr_FR");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('x', "");
        java.util.Locale locale7 = builder3.build();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number7 = faker6.number;
        com.github.javafaker.Number number8 = faker6.number();
        java.lang.String str10 = faker6.bothify("en-GB");
        com.github.javafaker.Name name11 = faker6.name();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code13 = null;
        faker12.code = code13;
        com.github.javafaker.Lorem lorem15 = faker12.lorem();
        faker6.lorem = lorem15;
        com.github.javafaker.Business business17 = faker6.business();
        com.github.javafaker.Company company18 = faker6.company;
        com.github.javafaker.Internet internet19 = faker6.internet();
        faker1.internet = internet19;
        com.github.javafaker.Finance finance21 = faker1.finance();
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GB" + "'", str10, "en-GB");
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertNotNull(business17);
        org.junit.Assert.assertNotNull(company18);
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(finance21);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("en-GB", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Internet internet11 = null;
        faker8.internet = internet11;
        java.lang.String str14 = faker8.bothify("");
        com.github.javafaker.Code code15 = null;
        faker8.code = code15;
        com.github.javafaker.DateAndTime dateAndTime17 = faker8.date();
        faker5.dateAndTime = dateAndTime17;
        java.util.Random random19 = new java.util.Random();
        double double20 = random19.nextDouble();
        java.util.stream.IntStream intStream23 = random19.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Code code25 = faker24.code();
        com.github.javafaker.DateAndTime dateAndTime26 = faker24.date();
        faker5.dateAndTime = dateAndTime26;
        com.github.javafaker.Book book28 = faker5.book();
        com.github.javafaker.Address address29 = faker5.address();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11377486050083119d + "'", double1 == 0.11377486050083119d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(dateAndTime17);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.1741777545207881d + "'", double20 == 0.1741777545207881d);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(code25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(book28);
        org.junit.Assert.assertNotNull(address29);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        boolean boolean7 = locale6.hasExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        boolean boolean4 = random0.nextBoolean();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        com.github.javafaker.Finance finance11 = faker7.finance();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker7.phoneNumber();
        com.github.javafaker.Options options13 = faker7.options();
        faker5.options = options13;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4773319902282358d + "'", double1 == 0.4773319902282358d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(options13);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.util.Set<java.lang.Character> charSet9 = locale5.getExtensionKeys();
        java.lang.String str10 = locale5.getVariant();
        java.lang.String str11 = locale5.getISO3Country();
        java.lang.String str12 = locale5.getISO3Country();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.Locale locale1 = new java.util.Locale("en_US");
        org.junit.Assert.assertEquals(locale1.toString(), "en_us");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = null; // flaky: locale1.getISO3Language();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet5 = locale1.getExtensionKeys();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder6.setScript("");
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder12 = builder9.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayScript();
        java.util.Locale.Builder builder17 = builder12.setLocale(locale15);
        java.lang.String str18 = locale1.getDisplayName(locale15);
        boolean boolean19 = locale15.hasExtensions();
        java.util.Random random21 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream24 = random21.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random21);
        java.util.stream.IntStream intStream26 = random21.ints();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale15, random21);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertNotNull(intStream26);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.util.Locale locale3 = new java.util.Locale("canada", "und", "fr");
        org.junit.Assert.assertEquals(locale3.toString(), "canada_UND_fr");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Canada", 0.48677034025376165d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String str4 = locale2.toLanguageTag();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("en-us", "English (United Kingdom)");
        java.util.Locale.setDefault(category0, locale3);
        java.lang.String str5 = locale3.getDisplayLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "en-us_ENGLISH (UNITED KINGDOM)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-us" + "'", str5, "en-us");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3, random4);
        java.lang.String str6 = locale3.getISO3Language();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Set<java.lang.String> strSet8 = locale3.getUnicodeLocaleKeys();
        java.lang.String str9 = locale3.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en-us_ENGLISH (UNITED KINGDOM)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en-us_ENGLISH (UNITED KINGDOM)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra" + "'", str6, "fra");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Options options7 = faker0.options();
        com.github.javafaker.service.RandomService randomService8 = faker0.randomService;
        com.github.javafaker.DateAndTime dateAndTime9 = faker0.date();
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Lorem lorem12 = null;
        faker11.lorem = lorem12;
        java.lang.String str15 = faker11.numerify("hi!");
        com.github.javafaker.Lorem lorem16 = faker11.lorem;
        java.util.Random random17 = new java.util.Random();
        double double18 = random17.nextDouble();
        int int20 = random17.nextInt(1);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.service.RandomService randomService22 = faker21.randomService;
        faker11.randomService = randomService22;
        com.github.javafaker.Finance finance24 = faker11.finance();
        com.github.javafaker.Options options25 = faker11.options;
        com.github.javafaker.Options options26 = faker11.options();
        java.util.Random random27 = new java.util.Random();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Lorem lorem29 = null;
        faker28.lorem = lorem29;
        java.lang.String str32 = faker28.numerify("hi!");
        com.github.javafaker.Lorem lorem33 = faker28.lorem;
        java.util.Random random34 = new java.util.Random();
        double double35 = random34.nextDouble();
        int int37 = random34.nextInt(1);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.service.RandomService randomService39 = faker38.randomService;
        faker28.randomService = randomService39;
        com.github.javafaker.Finance finance41 = faker28.finance();
        com.github.javafaker.Options options42 = faker28.options;
        com.github.javafaker.Book book43 = faker28.book();
        com.github.javafaker.Address address44 = faker28.address;
        faker11.address = address44;
        faker0.address = address44;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(randomService8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(lorem16);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.185896065682151d + "'", double18 == 0.185896065682151d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(randomService22);
        org.junit.Assert.assertNotNull(finance24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(lorem33);
// flaky:         org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.3896604844606705d + "'", double35 == 0.3896604844606705d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(randomService39);
        org.junit.Assert.assertNotNull(finance41);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(book43);
        org.junit.Assert.assertNotNull(address44);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale.Builder builder8 = builder1.removeUnicodeLocaleAttribute("Canada");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale9 = new java.util.Locale("fr", "");
        java.util.Locale.setDefault(category0, locale9);
        java.lang.String str11 = locale9.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream10 = random1.longs();
        double double11 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = random1.ints((long) 100, (-1), (-1155484576));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.1582019008178337d) + "'", double11 == (-1.1582019008178337d));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        java.lang.String str9 = faker5.numerify("");
        com.github.javafaker.Company company10 = faker5.company;
        com.github.javafaker.Number number11 = faker5.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker5.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService12;
        com.github.javafaker.Company company14 = faker1.company();
        java.util.Random random15 = new java.util.Random();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Lorem lorem17 = null;
        faker16.lorem = lorem17;
        com.github.javafaker.PhoneNumber phoneNumber19 = faker16.phoneNumber;
        com.github.javafaker.Color color20 = faker16.color();
        faker1.color = color20;
        com.github.javafaker.Company company22 = faker1.company;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(phoneNumber19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(company22);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream6 = random1.longs((long) 1, (long) 1, 100L);
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        double double9 = random7.nextGaussian();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        random7.nextBytes(byteArray15);
        random1.nextBytes(byteArray15);
        byte[] byteArray19 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray19);
        int int22 = random1.nextInt(45);
        double double23 = random1.nextDouble();
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.1834304251853986d + "'", double9 == 1.1834304251853986d);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[115, -43, 26, -69, -40]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[111]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 33 + "'", int22 == 33);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.20771484130971707d + "'", double23 == 0.20771484130971707d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        java.lang.String str16 = faker10.numerify("");
        java.lang.String str18 = faker10.letterify("x-lvariant-eng");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        java.util.Random random20 = new java.util.Random();
        double double21 = random20.nextDouble();
        int int23 = random20.nextInt(1);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Book book25 = faker24.book();
        faker19.book = book25;
        com.github.javafaker.Address address27 = faker19.address;
        faker10.address = address27;
        com.github.javafaker.Finance finance29 = faker10.finance;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.085638551502348d + "'", double7 == 0.085638551502348d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "x-lvariant-eng" + "'", str18, "x-lvariant-eng");
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.09200410755437205d + "'", double21 == 0.09200410755437205d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(book25);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertNotNull(finance29);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("fra (FR-FR)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fra (FR-FR) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fr");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale2, random3);
        java.util.stream.DoubleStream doubleStream5 = random3.doubles();
        java.util.stream.IntStream intStream8 = random3.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream11 = random3.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream12 = random3.longs();
        java.util.stream.LongStream longStream15 = random3.longs((long) (byte) -1, (long) (byte) 1);
        java.util.Random random17 = new java.util.Random((long) (byte) 1);
        byte[] byteArray19 = new byte[] { (byte) -1 };
        random17.nextBytes(byteArray19);
        random3.nextBytes(byteArray19);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale1, random3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-108]");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber();
        com.github.javafaker.Options options7 = faker1.options();
        com.github.javafaker.Address address8 = faker1.address;
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        java.lang.String str14 = faker10.numerify("hi!");
        com.github.javafaker.Lorem lorem15 = faker10.lorem;
        com.github.javafaker.Color color16 = faker10.color();
        com.github.javafaker.Company company17 = faker10.company();
        com.github.javafaker.Code code18 = faker10.code();
        faker1.code = code18;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(lorem15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(code18);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setScript("FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Random random13 = new java.util.Random(1L);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale11, random13);
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Name name16 = faker14.name;
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        com.github.javafaker.Finance finance21 = faker18.finance;
        faker14.finance = finance21;
        faker1.finance = finance21;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(finance21);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("english (united kingdom)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.util.Random random1 = new java.util.Random(6785130368950820155L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random1.ints((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number11 = faker10.number;
        faker1.number = number11;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker1.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker1.phoneNumber;
        java.util.Random random15 = new java.util.Random();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Lorem lorem17 = null;
        faker16.lorem = lorem17;
        com.github.javafaker.Internet internet19 = null;
        faker16.internet = internet19;
        java.lang.String str22 = faker16.bothify("");
        com.github.javafaker.Name name23 = faker16.name;
        com.github.javafaker.Internet internet24 = faker16.internet();
        com.github.javafaker.Address address25 = faker16.address();
        faker1.address = address25;
        com.github.javafaker.Book book27 = faker1.book;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNull(internet24);
        org.junit.Assert.assertNotNull(address25);
        org.junit.Assert.assertNotNull(book27);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem12 = faker11.lorem;
        com.github.javafaker.Color color13 = faker11.color();
        faker1.color = color13;
        java.util.Random random15 = new java.util.Random();
        double double16 = random15.nextDouble();
        java.util.stream.IntStream intStream19 = random15.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Code code21 = faker20.code();
        com.github.javafaker.Address address22 = faker20.address;
        java.util.Random random23 = new java.util.Random();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Lorem lorem25 = null;
        faker24.lorem = lorem25;
        com.github.javafaker.Internet internet27 = null;
        faker24.internet = internet27;
        java.lang.String str30 = faker24.bothify("");
        com.github.javafaker.Business business31 = faker24.business;
        faker20.business = business31;
        com.github.javafaker.Lorem lorem33 = faker20.lorem;
        faker1.lorem = lorem33;
        org.junit.Assert.assertNull(internet6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.27416624289612734d + "'", double8 == 0.27416624289612734d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(color13);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4085522279274888d + "'", double16 == 0.4085522279274888d);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(code21);
        org.junit.Assert.assertNotNull(address22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(business31);
        org.junit.Assert.assertNotNull(lorem33);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.util.Locale locale3 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-US" + "'", str4, "en-US");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        com.github.javafaker.Business business11 = faker0.business();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker0.phoneNumber;
        java.lang.String str14 = faker0.letterify("");
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Options options7 = faker0.options();
        com.github.javafaker.Options options8 = faker0.options;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.util.Locale locale3 = new java.util.Locale("", "", "France");
        boolean boolean4 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.util.Locale locale3 = new java.util.Locale("TW", "hi! (Taiwan)", "fr");
        org.junit.Assert.assertEquals(locale3.toString(), "tw_HI! (TAIWAN)_fr");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.util.Locale locale2 = new java.util.Locale("fra", "fr-fr");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra_FR-FR could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "fra_FR-FR");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("EN-US", 0.9521456500792339d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!_EN-US_en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!_en-us_en-us");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company5 = faker4.company;
        com.github.javafaker.Number number6 = faker4.number;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5168614200588209d + "'", double1 == 0.5168614200588209d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet5 = locale1.getExtensionKeys();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder6.setScript("");
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder12 = builder9.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayScript();
        java.util.Locale.Builder builder17 = builder12.setLocale(locale15);
        java.lang.String str18 = locale1.getDisplayName(locale15);
        boolean boolean19 = locale15.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = locale15.getUnicodeLocaleType("Franz\366sisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Franzo?sisch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (EN-US,en-US)" + "'", str18, "hi! (EN-US,en-US)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.util.Locale locale3 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale3);
        com.github.javafaker.Number number13 = faker12.number;
        org.junit.Assert.assertEquals(locale3.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(number13);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        double double5 = random4.nextDouble();
        java.util.stream.IntStream intStream8 = random4.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Code code10 = faker9.code();
        faker1.code = code10;
        com.github.javafaker.Lorem lorem12 = faker1.lorem();
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Lorem lorem15 = null;
        faker14.lorem = lorem15;
        com.github.javafaker.PhoneNumber phoneNumber17 = faker14.phoneNumber;
        faker1.phoneNumber = phoneNumber17;
        com.github.javafaker.PhoneNumber phoneNumber19 = faker1.phoneNumber();
        com.github.javafaker.Code code20 = faker1.code;
        com.github.javafaker.Name name21 = faker1.name();
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.708235631594465d + "'", double5 == 0.708235631594465d);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNull(lorem12);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(phoneNumber19);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertNotNull(name21);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Finance finance6 = faker1.finance;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream7 = random0.longs((long) (short) 1);
        random0.setSeed((long) (-753608540));
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3672190452364319d + "'", double1 == 0.3672190452364319d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Internet internet7 = faker1.internet();
        com.github.javafaker.Options options8 = faker1.options;
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number();
        com.github.javafaker.Color color2 = faker0.color;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Company company8 = faker1.company;
        java.lang.Class<?> wildcardClass9 = faker1.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        double double6 = random0.nextDouble();
        long long7 = random0.nextLong();
        boolean boolean8 = random0.nextBoolean();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6788518720543109d + "'", double1 == 0.6788518720543109d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3463572515316925d + "'", double5 == 0.3463572515316925d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9977374400117838d + "'", double6 == 0.9977374400117838d);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1160159540625517451L + "'", long7 == 1160159540625517451L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        com.github.javafaker.DateAndTime dateAndTime8 = faker5.date();
        com.github.javafaker.Options options9 = faker5.options();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7301614959553429d + "'", double1 == 0.7301614959553429d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.util.Locale locale3 = new java.util.Locale("it_IT", "it", "france");
        org.junit.Assert.assertEquals(locale3.toString(), "it_it_IT_france");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        float float11 = random6.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random6.doubles();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12425470018575002d + "'", double7 == 0.12425470018575002d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.57588696f + "'", float11 == 0.57588696f);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("French (France)");
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber();
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        java.lang.String str14 = faker10.numerify("hi!");
        com.github.javafaker.Lorem lorem15 = faker10.lorem;
        java.util.Random random16 = new java.util.Random();
        double double17 = random16.nextDouble();
        int int19 = random16.nextInt(1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.service.RandomService randomService21 = faker20.randomService;
        faker10.randomService = randomService21;
        faker1.randomService = randomService21;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (France)" + "'", str7, "French (France)");
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(lorem15);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.41615813299285886d + "'", double17 == 0.41615813299285886d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(randomService21);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream14 = random11.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        com.github.javafaker.Business business16 = faker15.business();
        java.lang.String str18 = faker15.numerify("fran\347ais");
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Japanese" + "'", str9, "Japanese");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais" + "'", str18, "fran\347ais");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale3.getUnicodeLocaleType("GBR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: GBR");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.Class<?> wildcardClass2 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker9.phoneNumber;
        faker7.phoneNumber = phoneNumber12;
        com.github.javafaker.Options options14 = faker7.options;
        faker0.options = options14;
        com.github.javafaker.Internet internet16 = faker0.internet();
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        java.lang.String str22 = faker18.numerify("hi!");
        com.github.javafaker.Color color23 = faker18.color;
        com.github.javafaker.Business business24 = faker18.business();
        faker0.business = business24;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(internet16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(business24);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream6 = random0.longs((long) ' ', (long) (byte) 100, (long) 'u');
        double double7 = random0.nextGaussian();
        java.util.stream.IntStream intStream8 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random0.ints((long) (short) -1, (-1780303639), 79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.25557335701082d) + "'", double7 == (-0.25557335701082d));
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("fr-x-lvariant-eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fr-x-lvariant-eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Internet internet11 = faker10.internet();
        com.github.javafaker.Finance finance12 = faker10.finance;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3166323681948129d + "'", double7 == 0.3166323681948129d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(finance12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale2.getISO3Country();
        java.lang.String str4 = locale1.getDisplayScript(locale2);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRA" + "'", str3, "FRA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Color color7 = faker5.color;
        java.util.Random random9 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Code code11 = faker10.code;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker10.phoneNumber();
        faker5.phoneNumber = phoneNumber12;
        com.github.javafaker.Lorem lorem14 = faker5.lorem;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7420995283202376d + "'", double1 == 0.7420995283202376d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(lorem14);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        com.github.javafaker.Internet internet8 = null;
        faker5.internet = internet8;
        java.lang.String str11 = faker5.bothify("");
        com.github.javafaker.Code code12 = null;
        faker5.code = code12;
        com.github.javafaker.Number number14 = faker5.number();
        faker1.number = number14;
        com.github.javafaker.Book book16 = faker1.book();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(book16);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random3);
        java.util.stream.LongStream longStream6 = random3.longs((long) (byte) 1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-GB" + "'", str1, "en-GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United Kingdom)" + "'", str2, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setVariant("fr-x-lvariant-eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fr-x-lvariant-eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Business business2 = faker0.business();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Lorem lorem5 = null;
        faker4.lorem = lorem5;
        com.github.javafaker.Color color7 = faker4.color;
        com.github.javafaker.Finance finance8 = faker4.finance();
        com.github.javafaker.Address address9 = faker4.address;
        faker0.address = address9;
        com.github.javafaker.Code code11 = faker0.code;
        com.github.javafaker.Number number12 = faker0.number();
        com.github.javafaker.Color color13 = faker0.color();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale3.getDisplayCountry(locale9);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.util.Locale locale18 = new java.util.Locale("hi!");
        java.lang.String str19 = locale18.getVariant();
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleKeys();
        java.lang.String str21 = locale16.getDisplayLanguage(locale18);
        java.lang.String str22 = locale16.getLanguage();
        java.lang.String str23 = locale12.getDisplayCountry(locale16);
        java.lang.String str24 = locale3.getDisplayLanguage(locale12);
        java.util.Set<java.lang.Character> charSet25 = locale3.getExtensionKeys();
        java.lang.String str26 = locale3.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals(locale18.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Franz\366sisch" + "'", str24, "Franz\366sisch");
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fr_FR" + "'", str26, "fr_FR");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.util.Locale locale2 = new java.util.Locale("hi!_EN-US_en-US", "und");
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_en-us_en-us_UND");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.util.Random random1 = new java.util.Random(7665646735745377215L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.util.Locale locale3 = new java.util.Locale("france", "Italian", "en_US");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: france_ITALIAN_en_US could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "france_ITALIAN_en_US");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("jpn");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.util.Locale locale1 = new java.util.Locale("canada");
        org.junit.Assert.assertEquals(locale1.toString(), "canada");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "jpn", "jpn");
        java.util.Random random4 = new java.util.Random();
        double double5 = random4.nextDouble();
        java.util.stream.DoubleStream doubleStream6 = random4.doubles();
        java.util.stream.LongStream longStream10 = random4.longs((long) 431529176, (long) (-1780303639), 1853403699951111791L);
        double double11 = random4.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale3, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fr_fr_JPN_jpn could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fr_fr_JPN_jpn");
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9500751992823615d + "'", double5 == 0.9500751992823615d);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.25579179200265223d + "'", double11 == 0.25579179200265223d);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.util.Locale locale3 = new java.util.Locale("japonais", "japonais", "japonais");
        org.junit.Assert.assertEquals(locale3.toString(), "japonais_JAPONAIS_japonais");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        double double3 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7485889724938741d + "'", double3 == 0.7485889724938741d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setRegion("fra (FR-FR)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fra (FR-FR) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Options options7 = faker0.options();
        com.github.javafaker.service.RandomService randomService8 = faker0.randomService;
        com.github.javafaker.DateAndTime dateAndTime9 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime10 = faker0.dateAndTime;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(randomService8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale6.getDisplayLanguage();
        java.lang.String str9 = locale5.getDisplayName(locale6);
        java.lang.String str10 = locale6.getDisplayName();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "German" + "'", str8, "German");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "German" + "'", str10, "German");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("eng");
        java.util.Locale locale8 = builder0.build();
        java.util.Locale.Builder builder9 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder0.setVariant("fr_FR_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fr_FR_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('x', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setScript("TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.dateAndTime;
        com.github.javafaker.Finance finance7 = faker0.finance();
        com.github.javafaker.Finance finance8 = faker0.finance;
        com.github.javafaker.Internet internet9 = faker0.internet();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(internet9);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        java.lang.String str8 = faker0.bothify("Canada");
        com.github.javafaker.Book book9 = faker0.book;
        com.github.javafaker.Name name10 = faker0.name;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Canada" + "'", str8, "Canada");
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem12 = faker11.lorem;
        com.github.javafaker.Color color13 = faker11.color();
        faker1.color = color13;
        com.github.javafaker.Color color15 = faker1.color();
        org.junit.Assert.assertNull(internet6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.09042226406564224d + "'", double8 == 0.09042226406564224d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        random0.setSeed((long) (-1));
        java.util.stream.IntStream intStream8 = random0.ints();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.343045748602236d + "'", double1 == 0.343045748602236d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14610917799272594d + "'", double5 == 0.14610917799272594d);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        boolean boolean7 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        long long10 = random1.nextLong();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream8);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3289610560948171332L + "'", long10 == 3289610560948171332L);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.IntStream intStream6 = random1.ints((long) 'u', 0, (int) (short) 1);
        long long7 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4964420948893066024L) + "'", long7 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.removeUnicodeLocaleAttribute("anglais (Royaume-Uni)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: anglais (Royaume-Uni) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale1.getDisplayScript();
        java.util.Locale.setDefault(locale1);
        java.lang.String str7 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        java.lang.String str11 = faker7.numerify("");
        com.github.javafaker.PhoneNumber phoneNumber12 = faker7.phoneNumber;
        faker1.phoneNumber = phoneNumber12;
        com.github.javafaker.Color color14 = faker1.color;
        java.util.Random random15 = new java.util.Random();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Lorem lorem17 = null;
        faker16.lorem = lorem17;
        com.github.javafaker.Internet internet19 = null;
        faker16.internet = internet19;
        java.util.Random random21 = new java.util.Random();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem23 = null;
        faker22.lorem = lorem23;
        java.lang.String str26 = faker22.numerify("");
        com.github.javafaker.PhoneNumber phoneNumber27 = faker22.phoneNumber;
        faker16.phoneNumber = phoneNumber27;
        faker1.phoneNumber = phoneNumber27;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(phoneNumber27);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.util.Locale locale3 = new java.util.Locale("fran\347ais (EN-GB)", "en-us (ENGLISH (UNITED KINGDOM))", "");
        org.junit.Assert.assertEquals(locale3.toString(), "fran\347ais (en-gb)_EN-US (ENGLISH (UNITED KINGDOM))");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode5 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList6 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet4, filteringMode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + filteringMode5 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode5.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
        com.github.javafaker.Business business6 = faker5.business();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker5.resolve("en-us (ENGLISH (UNITED KINGDOM))");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        com.github.javafaker.Options options8 = faker5.options();
        java.lang.String str10 = faker5.letterify("fra (FR-FR)");
        com.github.javafaker.Number number11 = faker5.number();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4408826316272414d + "'", double1 == 0.4408826316272414d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra (FR-FR)" + "'", str10, "fra (FR-FR)");
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.util.Random random1 = new java.util.Random(1L);
        double double2 = random1.nextGaussian();
        long long3 = random1.nextLong();
        java.util.stream.LongStream longStream7 = random1.longs(100L, (long) (-1167796541), (-1L));
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random1.ints((-4972683369271453960L), (-1167796541), (-2088678643));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.561581040188955d + "'", double2 == 1.561581040188955d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3831662765844904176L + "'", long3 == 3831662765844904176L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.util.Random random1 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale.Builder builder8 = builder1.removeUnicodeLocaleAttribute("Canada");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder1.setLanguage("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fr_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.util.Locale locale1 = new java.util.Locale("GBR");
        org.junit.Assert.assertEquals(locale1.toString(), "gbr");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("french");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("EN-US");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getLanguage();
        boolean boolean3 = locale1.hasExtensions();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream6 = random0.longs((long) ' ', (long) (byte) 100, (long) 'u');
        double double7 = random0.nextGaussian();
        random0.setSeed((long) 'a');
        java.util.stream.IntStream intStream10 = random0.ints();
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.9365975173306708d) + "'", double7 == (-0.9365975173306708d));
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: franc?ais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en_us", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=52.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        com.github.javafaker.Business business11 = faker0.business();
        com.github.javafaker.Company company12 = faker0.company;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number14 = faker13.number;
        com.github.javafaker.Number number15 = faker13.number();
        java.lang.String str17 = faker13.bothify("en-GB");
        com.github.javafaker.Name name18 = faker13.name();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code20 = null;
        faker19.code = code20;
        com.github.javafaker.Lorem lorem22 = faker19.lorem();
        faker13.lorem = lorem22;
        java.util.Random random24 = new java.util.Random();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Lorem lorem26 = null;
        faker25.lorem = lorem26;
        java.lang.String str29 = faker25.numerify("");
        java.util.Random random30 = new java.util.Random();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Lorem lorem32 = null;
        faker31.lorem = lorem32;
        com.github.javafaker.Color color34 = faker31.color;
        faker25.color = color34;
        com.github.javafaker.PhoneNumber phoneNumber36 = faker25.phoneNumber;
        faker13.phoneNumber = phoneNumber36;
        java.util.Locale locale39 = new java.util.Locale("hi!");
        java.lang.String str40 = locale39.getVariant();
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.lang.String str42 = locale39.getDisplayVariant(locale41);
        java.lang.String str43 = locale41.getCountry();
        java.util.Random random44 = new java.util.Random();
        double double45 = random44.nextDouble();
        int int47 = random44.nextInt(1);
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(locale41, random44);
        com.github.javafaker.Internet internet49 = faker48.internet();
        faker13.internet = internet49;
        com.github.javafaker.Company company51 = faker13.company;
        java.util.Random random52 = new java.util.Random();
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(random52);
        com.github.javafaker.Lorem lorem54 = null;
        faker53.lorem = lorem54;
        com.github.javafaker.Internet internet56 = null;
        faker53.internet = internet56;
        java.lang.String str59 = faker53.bothify("");
        com.github.javafaker.Name name60 = faker53.name;
        com.github.javafaker.Internet internet61 = faker53.internet();
        com.github.javafaker.Address address62 = faker53.address();
        faker13.address = address62;
        java.util.Locale locale65 = new java.util.Locale("hi!");
        java.lang.String str66 = locale65.getVariant();
        java.util.Locale locale67 = java.util.Locale.FRANCE;
        java.lang.String str68 = locale65.getDisplayVariant(locale67);
        java.lang.String str69 = locale67.getCountry();
        java.lang.String str70 = locale67.getDisplayLanguage();
        java.util.Locale locale71 = java.util.Locale.JAPANESE;
        java.lang.String str72 = locale67.getDisplayScript(locale71);
        java.lang.String str73 = locale71.getDisplayLanguage();
        java.util.Random random75 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream78 = random75.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker79 = new com.github.javafaker.Faker(locale71, random75);
        com.github.javafaker.Business business80 = faker79.business();
        com.github.javafaker.service.FakeValuesService fakeValuesService81 = faker79.fakeValuesService;
        faker13.fakeValuesService = fakeValuesService81;
        faker0.fakeValuesService = fakeValuesService81;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(company12);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(number15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-GB" + "'", str17, "en-GB");
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(lorem22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(phoneNumber36);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "FR" + "'", str43, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.5700059674370281d + "'", double45 == 0.5700059674370281d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(internet49);
        org.junit.Assert.assertNotNull(company51);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(name60);
        org.junit.Assert.assertNull(internet61);
        org.junit.Assert.assertNotNull(address62);
        org.junit.Assert.assertEquals(locale65.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "FR" + "'", str69, "FR");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "French" + "'", str70, "French");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Japanese" + "'", str73, "Japanese");
        org.junit.Assert.assertNotNull(longStream78);
        org.junit.Assert.assertNotNull(business80);
        org.junit.Assert.assertNotNull(fakeValuesService81);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker1.phoneNumber;
        com.github.javafaker.Lorem lorem13 = faker1.lorem;
        com.github.javafaker.Name name14 = faker1.name;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNull(lorem13);
        org.junit.Assert.assertNotNull(name14);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.PhoneNumber phoneNumber10 = faker7.phoneNumber;
        com.github.javafaker.Color color11 = faker7.color();
        faker0.color = color11;
        com.github.javafaker.Color color13 = faker0.color();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        int int4 = random1.nextInt(1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book6 = faker5.book();
        faker0.book = book6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number9 = faker8.number;
        com.github.javafaker.Number number10 = faker8.number();
        java.lang.String str12 = faker8.bothify("en-GB");
        com.github.javafaker.Book book13 = faker8.book();
        java.util.Random random14 = new java.util.Random();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Lorem lorem16 = null;
        faker15.lorem = lorem16;
        com.github.javafaker.Internet internet18 = null;
        faker15.internet = internet18;
        java.lang.String str21 = faker15.bothify("");
        com.github.javafaker.Code code22 = null;
        faker15.code = code22;
        com.github.javafaker.DateAndTime dateAndTime24 = faker15.date();
        faker8.dateAndTime = dateAndTime24;
        faker0.dateAndTime = dateAndTime24;
        java.util.Random random27 = new java.util.Random();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Lorem lorem29 = null;
        faker28.lorem = lorem29;
        java.lang.String str32 = faker28.numerify("");
        com.github.javafaker.Company company33 = faker28.company;
        faker0.company = company33;
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8314859129001281d + "'", double2 == 0.8314859129001281d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-GB" + "'", str12, "en-GB");
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(dateAndTime24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(company33);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Number number6 = faker1.number;
        com.github.javafaker.Address address7 = faker1.address;
        java.lang.String str9 = faker1.numerify("fra (FR-FR)");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fra (FR-FR)" + "'", str9, "fra (FR-FR)");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "ja");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "ja");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "ja");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.Name name5 = faker1.name;
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Internet internet10 = null;
        faker7.internet = internet10;
        java.lang.String str13 = faker7.bothify("");
        com.github.javafaker.Book book14 = faker7.book();
        faker1.book = book14;
        com.github.javafaker.Business business16 = faker1.business;
        com.github.javafaker.Book book17 = faker1.book;
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(book17);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.util.Locale locale3 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale3);
        com.github.javafaker.Finance finance13 = faker12.finance();
        java.util.Random random14 = new java.util.Random();
        double double15 = random14.nextDouble();
        java.util.stream.IntStream intStream18 = random14.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Code code20 = faker19.code();
        java.util.Random random21 = new java.util.Random();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem23 = null;
        faker22.lorem = lorem23;
        com.github.javafaker.Internet internet25 = null;
        faker22.internet = internet25;
        java.lang.String str28 = faker22.bothify("");
        com.github.javafaker.Code code29 = null;
        faker22.code = code29;
        com.github.javafaker.DateAndTime dateAndTime31 = faker22.date();
        faker19.dateAndTime = dateAndTime31;
        java.util.Random random33 = new java.util.Random();
        double double34 = random33.nextDouble();
        java.util.stream.IntStream intStream37 = random33.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.Code code39 = faker38.code();
        com.github.javafaker.DateAndTime dateAndTime40 = faker38.date();
        faker19.dateAndTime = dateAndTime40;
        com.github.javafaker.Book book42 = faker19.book();
        java.util.Random random43 = new java.util.Random();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        com.github.javafaker.Lorem lorem45 = null;
        faker44.lorem = lorem45;
        com.github.javafaker.Internet internet47 = null;
        faker44.internet = internet47;
        java.lang.String str50 = faker44.bothify("");
        com.github.javafaker.Code code51 = null;
        faker44.code = code51;
        com.github.javafaker.DateAndTime dateAndTime53 = faker44.date();
        java.util.Random random54 = new java.util.Random();
        com.github.javafaker.Faker faker55 = new com.github.javafaker.Faker(random54);
        com.github.javafaker.DateAndTime dateAndTime56 = null;
        faker55.dateAndTime = dateAndTime56;
        com.github.javafaker.Business business58 = faker55.business;
        faker44.business = business58;
        com.github.javafaker.Code code60 = faker44.code();
        java.util.Random random61 = new java.util.Random();
        com.github.javafaker.Faker faker62 = new com.github.javafaker.Faker(random61);
        com.github.javafaker.Lorem lorem63 = null;
        faker62.lorem = lorem63;
        com.github.javafaker.Color color65 = faker62.color;
        com.github.javafaker.Finance finance66 = faker62.finance();
        com.github.javafaker.PhoneNumber phoneNumber67 = faker62.phoneNumber();
        com.github.javafaker.Options options68 = faker62.options();
        faker44.options = options68;
        faker19.options = options68;
        faker12.options = options68;
        com.github.javafaker.Book book72 = faker12.book;
        org.junit.Assert.assertEquals(locale3.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(finance13);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9558929939355366d + "'", double15 == 0.9558929939355366d);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(dateAndTime31);
// flaky:         org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.3432309766981677d + "'", double34 == 0.3432309766981677d);
        org.junit.Assert.assertNotNull(intStream37);
        org.junit.Assert.assertNotNull(code39);
        org.junit.Assert.assertNotNull(dateAndTime40);
        org.junit.Assert.assertNotNull(book42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(dateAndTime53);
        org.junit.Assert.assertNotNull(business58);
        org.junit.Assert.assertNull(code60);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(finance66);
        org.junit.Assert.assertNotNull(phoneNumber67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(book72);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream14 = random11.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        java.lang.String str21 = faker17.numerify("hi!");
        com.github.javafaker.Color color22 = faker17.color;
        java.util.Random random23 = new java.util.Random();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Lorem lorem25 = null;
        faker24.lorem = lorem25;
        java.lang.String str28 = faker24.numerify("");
        com.github.javafaker.Company company29 = faker24.company;
        com.github.javafaker.Options options30 = faker24.options();
        faker17.options = options30;
        faker15.options = options30;
        java.util.Random random33 = new java.util.Random();
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.Lorem lorem35 = null;
        faker34.lorem = lorem35;
        java.lang.String str38 = faker34.numerify("");
        com.github.javafaker.Business business39 = faker34.business;
        faker15.business = business39;
        com.github.javafaker.Color color41 = faker15.color();
        java.util.Random random42 = new java.util.Random();
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(random42);
        com.github.javafaker.Lorem lorem44 = null;
        faker43.lorem = lorem44;
        com.github.javafaker.Name name46 = faker43.name;
        java.util.Random random47 = new java.util.Random();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.Lorem lorem49 = null;
        faker48.lorem = lorem49;
        com.github.javafaker.Finance finance51 = faker48.finance;
        faker43.finance = finance51;
        faker15.finance = finance51;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Japanese" + "'", str9, "Japanese");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(company29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(business39);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(name46);
        org.junit.Assert.assertNotNull(finance51);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.util.Locale locale2 = new java.util.Locale("Canada", "fr_FR");
        java.lang.String str3 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "canada_FR_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Business business2 = faker0.business();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Lorem lorem5 = null;
        faker4.lorem = lorem5;
        java.lang.String str8 = faker4.numerify("hi!");
        com.github.javafaker.Color color9 = faker4.color;
        com.github.javafaker.Business business10 = faker4.business();
        java.util.Random random11 = new java.util.Random();
        double double12 = random11.nextDouble();
        int int14 = random11.nextInt(1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Internet internet16 = faker15.internet();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        java.util.Random random18 = new java.util.Random();
        double double19 = random18.nextDouble();
        int int21 = random18.nextInt(1);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Book book23 = faker22.book();
        faker17.book = book23;
        com.github.javafaker.Address address25 = faker17.address;
        faker15.address = address25;
        faker4.address = address25;
        faker0.address = address25;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(business10);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.21958032344615286d + "'", double12 == 0.21958032344615286d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(internet16);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.39995816906109916d + "'", double19 == 0.39995816906109916d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(book23);
        org.junit.Assert.assertNotNull(address25);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi! (Taiwan)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!(taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        java.lang.String str16 = faker10.numerify("");
        com.github.javafaker.Company company17 = faker10.company;
        java.util.Random random18 = new java.util.Random();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Lorem lorem20 = null;
        faker19.lorem = lorem20;
        com.github.javafaker.Name name22 = faker19.name;
        com.github.javafaker.Address address23 = faker19.address();
        faker10.address = address23;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8121672546119978d + "'", double7 == 0.8121672546119978d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(address23);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.util.Locale locale2 = new java.util.Locale("FR", "fr_FR");
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
        com.github.javafaker.Business business4 = faker3.business;
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR_FR");
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        java.lang.String str13 = faker1.bothify("fr_fr_HI!_eng");
        java.lang.String str15 = faker1.numerify("eng");
        com.github.javafaker.Lorem lorem16 = faker1.lorem;
        java.lang.String str18 = faker1.numerify("FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr_fr_HI!_eng" + "'", str13, "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eng" + "'", str15, "eng");
        org.junit.Assert.assertNull(lorem16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FR" + "'", str18, "FR");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale7 = new java.util.Locale("France", "Chinese (Taiwan)");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setLocale(locale7);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CHINESE (TAIWAN) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "france_CHINESE (TAIWAN)");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.util.Locale locale3 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayLanguage(locale7);
        java.lang.Object obj11 = locale7.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "fr_FR");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.lang.String str7 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("eng");
        java.util.Locale locale8 = builder0.build();
        java.util.Locale.Builder builder9 = builder0.clear();
        java.util.Locale.Builder builder11 = builder0.setLanguageTag("france");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder0.setExtension(' ', "it_IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.IntStream intStream6 = random1.ints((long) 'u', 0, (int) (short) 1);
        random1.setSeed((long) (short) -1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number6 = faker5.number;
        com.github.javafaker.Business business7 = faker5.business();
        com.github.javafaker.Business business8 = faker5.business();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker5.phoneNumber();
        faker0.phoneNumber = phoneNumber9;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.util.Locale locale3 = new java.util.Locale("france", "Italian", "en_US");
        java.lang.String str4 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "france_ITALIAN_en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en,US" + "'", str4, "en,US");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        java.lang.String str9 = faker5.numerify("");
        com.github.javafaker.Company company10 = faker5.company;
        com.github.javafaker.Number number11 = faker5.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker5.fakeValuesService;
        faker2.fakeValuesService = fakeValuesService12;
        com.github.javafaker.Book book14 = faker2.book();
        com.github.javafaker.Code code15 = faker2.code();
        com.github.javafaker.Code code16 = faker2.code();
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(code16);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.util.Locale locale2 = new java.util.Locale("Japanese", "fr");
        org.junit.Assert.assertEquals(locale2.toString(), "japanese_FR");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (-0.4004305974356774d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.4004305974356774");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker1.fakeValuesService;
        com.github.javafaker.Options options9 = faker1.options;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("eng");
        java.util.Locale locale8 = builder0.build();
        java.util.Locale.Builder builder9 = builder0.clear();
        java.util.Locale.Builder builder11 = builder0.setLanguageTag("france");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setVariant("deu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: deu [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        java.lang.String str13 = faker1.bothify("fr_fr_HI!_eng");
        java.lang.String str15 = faker1.numerify("eng");
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        com.github.javafaker.Internet internet20 = null;
        faker17.internet = internet20;
        java.lang.String str23 = faker17.bothify("");
        com.github.javafaker.Code code24 = null;
        faker17.code = code24;
        com.github.javafaker.DateAndTime dateAndTime26 = faker17.date();
        faker1.dateAndTime = dateAndTime26;
        java.util.Random random28 = new java.util.Random();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Lorem lorem30 = null;
        faker29.lorem = lorem30;
        java.lang.String str33 = faker29.numerify("hi!");
        com.github.javafaker.Lorem lorem34 = faker29.lorem;
        java.util.Random random35 = new java.util.Random();
        double double36 = random35.nextDouble();
        int int38 = random35.nextInt(1);
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random35);
        com.github.javafaker.service.RandomService randomService40 = faker39.randomService;
        faker29.randomService = randomService40;
        faker1.randomService = randomService40;
        java.util.Random random43 = new java.util.Random();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        com.github.javafaker.Lorem lorem45 = null;
        faker44.lorem = lorem45;
        java.lang.String str48 = faker44.numerify("");
        com.github.javafaker.PhoneNumber phoneNumber49 = faker44.phoneNumber;
        java.util.Random random50 = new java.util.Random();
        com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(random50);
        com.github.javafaker.Lorem lorem52 = null;
        faker51.lorem = lorem52;
        com.github.javafaker.Color color54 = faker51.color;
        com.github.javafaker.Finance finance55 = faker51.finance();
        com.github.javafaker.PhoneNumber phoneNumber56 = faker51.phoneNumber();
        faker44.phoneNumber = phoneNumber56;
        faker1.phoneNumber = phoneNumber56;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr_fr_HI!_eng" + "'", str13, "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eng" + "'", str15, "eng");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(lorem34);
// flaky:         org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.6236165275978542d + "'", double36 == 0.6236165275978542d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(randomService40);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(phoneNumber49);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(finance55);
        org.junit.Assert.assertNotNull(phoneNumber56);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 0, (long) (byte) 1);
        java.util.Random random6 = new java.util.Random((long) (byte) 1);
        byte[] byteArray8 = new byte[] { (byte) -1 };
        random6.nextBytes(byteArray8);
        random1.nextBytes(byteArray8);
        java.util.stream.IntStream intStream11 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream15 = random1.longs((-5067015723494352422L), (long) 100, (-5067015723494352422L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-46]");
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book5 = faker4.book();
        java.lang.Class<?> wildcardClass6 = book5.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5011655608656801d + "'", double1 == 0.5011655608656801d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] { languageRange10, languageRange12 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList37);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList40, filteringMode41);
        java.lang.String str43 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap44);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList51);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags(languageRangeList45, (java.util.Collection<java.lang.String>) strList51);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strList60);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList68);
        java.util.Locale.LanguageRange[] languageRangeArray71 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList72 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList72, languageRangeArray71);
        java.lang.String[] strArray75 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, (java.util.Collection<java.lang.String>) strList76);
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList76);
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strList79, filteringMode80);
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags(languageRangeList45, (java.util.Collection<java.lang.String>) strList79);
        java.lang.String str83 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList82);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode41.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(languageRangeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode80.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-eng" + "'", str4, "x-lvariant-eng");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr_fr (HI!,eng)" + "'", str5, "fr_fr (HI!,eng)");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.util.Random random1 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code3 = faker2.code;
        com.github.javafaker.Internet internet4 = faker2.internet;
        java.util.Random random5 = new java.util.Random();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Lorem lorem7 = null;
        faker6.lorem = lorem7;
        java.lang.String str10 = faker6.numerify("");
        com.github.javafaker.Company company11 = faker6.company;
        com.github.javafaker.Company company12 = faker6.company();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        java.util.Random random14 = new java.util.Random();
        double double15 = random14.nextDouble();
        int int17 = random14.nextInt(1);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Book book19 = faker18.book();
        faker13.book = book19;
        java.util.Random random21 = new java.util.Random();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem23 = null;
        faker22.lorem = lorem23;
        com.github.javafaker.Internet internet25 = null;
        faker22.internet = internet25;
        java.lang.String str28 = faker22.bothify("");
        com.github.javafaker.Code code29 = null;
        faker22.code = code29;
        com.github.javafaker.DateAndTime dateAndTime31 = faker22.date();
        faker13.dateAndTime = dateAndTime31;
        faker6.dateAndTime = dateAndTime31;
        com.github.javafaker.Finance finance34 = faker6.finance;
        faker2.finance = finance34;
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(company11);
        org.junit.Assert.assertNotNull(company12);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.04408720972611735d + "'", double15 == 0.04408720972611735d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(book19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(dateAndTime31);
        org.junit.Assert.assertNotNull(finance34);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        double double6 = random0.nextDouble();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        random0.nextBytes(byteArray10);
        long long12 = random0.nextLong();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08660640490875882d + "'", double1 == 0.08660640490875882d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6442761796623659d + "'", double5 == 0.6442761796623659d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9695594689080177d + "'", double6 == 0.9695594689080177d);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[93, 45, -47]");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3309070468795520424L + "'", long12 == 3309070468795520424L);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getVariant();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.lang.String str9 = locale4.getDisplayLanguage(locale6);
        java.lang.String str10 = locale4.getLanguage();
        java.lang.String str11 = locale0.getDisplayCountry(locale4);
        java.lang.String str12 = locale0.getDisplayVariant();
        java.lang.String str13 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "German" + "'", str13, "German");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.util.Locale locale1 = new java.util.Locale("French");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.util.Locale locale2 = new java.util.Locale("Chinese (Taiwan)", "fra");
        java.lang.String str3 = locale2.getDisplayVariant();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese (taiwan)_FRA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("fra");
        java.util.Locale.Builder builder8 = builder3.setExtension('u', "und");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.util.Random random1 = new java.util.Random(6491242495114442290L);
        int int3 = random1.nextInt(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.util.Locale locale2 = new java.util.Locale("hi!", "French");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_FRENCH");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_FRENCH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRENCH" + "'", str4, "FRENCH");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        java.lang.String str16 = faker12.numerify("");
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        com.github.javafaker.Color color21 = faker18.color;
        faker12.color = color21;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker12.phoneNumber;
        faker0.phoneNumber = phoneNumber23;
        java.util.Locale locale26 = new java.util.Locale("hi!");
        java.lang.String str27 = locale26.getVariant();
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale26.getDisplayVariant(locale28);
        java.lang.String str30 = locale28.getCountry();
        java.util.Random random31 = new java.util.Random();
        double double32 = random31.nextDouble();
        int int34 = random31.nextInt(1);
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale28, random31);
        com.github.javafaker.Internet internet36 = faker35.internet();
        faker0.internet = internet36;
        com.github.javafaker.Company company38 = faker0.company;
        com.github.javafaker.DateAndTime dateAndTime39 = faker0.date();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FR" + "'", str30, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.155023403064526d + "'", double32 == 0.155023403064526d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(internet36);
        org.junit.Assert.assertNotNull(company38);
        org.junit.Assert.assertNotNull(dateAndTime39);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("eng");
        java.util.Locale locale8 = builder0.build();
        java.util.Locale.Builder builder9 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder0.setUnicodeLocaleKeyword("en-US", "en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: en-US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("EN-US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: EN-US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("x-lvariant-eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: x-lvariant-eng");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Locale.Builder builder11 = builder6.setLocale(locale9);
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder11.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.util.Locale locale2 = new java.util.Locale("english (united kingdom)", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: eng");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "english (united kingdom)");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        java.lang.String str16 = faker12.numerify("");
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        com.github.javafaker.Color color21 = faker18.color;
        faker12.color = color21;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker12.phoneNumber;
        faker0.phoneNumber = phoneNumber23;
        java.util.Locale locale26 = new java.util.Locale("hi!");
        java.lang.String str27 = locale26.getVariant();
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale26.getDisplayVariant(locale28);
        java.lang.String str30 = locale28.getCountry();
        java.util.Random random31 = new java.util.Random();
        double double32 = random31.nextDouble();
        int int34 = random31.nextInt(1);
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale28, random31);
        com.github.javafaker.Internet internet36 = faker35.internet();
        faker0.internet = internet36;
        com.github.javafaker.Company company38 = faker0.company;
        java.util.Random random39 = new java.util.Random();
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random39);
        com.github.javafaker.Lorem lorem41 = null;
        faker40.lorem = lorem41;
        com.github.javafaker.Internet internet43 = null;
        faker40.internet = internet43;
        java.lang.String str46 = faker40.bothify("");
        com.github.javafaker.Name name47 = faker40.name;
        com.github.javafaker.Internet internet48 = faker40.internet();
        com.github.javafaker.Address address49 = faker40.address();
        faker0.address = address49;
        java.lang.String str52 = faker0.bothify("GBR");
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FR" + "'", str30, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.25670769868597487d + "'", double32 == 0.25670769868597487d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(internet36);
        org.junit.Assert.assertNotNull(company38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(name47);
        org.junit.Assert.assertNull(internet48);
        org.junit.Assert.assertNotNull(address49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "GBR" + "'", str52, "GBR");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream14 = random11.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        java.util.stream.IntStream intStream16 = random11.ints();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Japanese" + "'", str9, "Japanese");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker1.randomService = randomService12;
        com.github.javafaker.Finance finance14 = faker1.finance();
        com.github.javafaker.Lorem lorem15 = faker1.lorem();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker1.phoneNumber();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        java.util.Random random18 = new java.util.Random();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Lorem lorem20 = null;
        faker19.lorem = lorem20;
        com.github.javafaker.PhoneNumber phoneNumber22 = faker19.phoneNumber;
        faker17.phoneNumber = phoneNumber22;
        com.github.javafaker.Options options24 = faker17.options;
        com.github.javafaker.Book book25 = faker17.book;
        faker1.book = book25;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7906140716223358d + "'", double8 == 0.7906140716223358d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNull(lorem15);
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNotNull(phoneNumber22);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(book25);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italian", 0.0d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian" + "'", str3, "italian");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "tw");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "twi" + "'", str2, "twi");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "tw");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tw" + "'", str4, "tw");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getDisplayLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "tw");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Twi" + "'", str3, "Twi");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.service.RandomService randomService3 = faker2.randomService;
        com.github.javafaker.Number number4 = faker2.number;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number6 = faker5.number;
        com.github.javafaker.Number number7 = faker5.number();
        java.lang.String str9 = faker5.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = faker5.fakeValuesService;
        faker2.fakeValuesService = fakeValuesService10;
        org.junit.Assert.assertNotNull(randomService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-GB" + "'", str9, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService10);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fra (FR-FR)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fra(fr-fr)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setRegion("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguage("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fr_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.setScript("");
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.getDisplayScript();
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale18 = java.util.Locale.getDefault(category0);
        java.lang.String str19 = locale18.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "tw");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "tw");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.util.Locale locale3 = new java.util.Locale("chinese (taiwan) (FRA)", "Chinese (Taiwan)", "it_IT");
        org.junit.Assert.assertEquals(locale3.toString(), "chinese (taiwan) (fra)_CHINESE (TAIWAN)_it_IT");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.util.Random random1 = new java.util.Random((long) 349248668);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.util.Locale locale3 = new java.util.Locale("x-lvariant-eng", "", "");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str7 = locale3.getDisplayCountry(locale5);
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        double double10 = random8.nextGaussian();
        long long11 = random8.nextLong();
        float float12 = random8.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale5, random8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "x-lvariant-eng");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0111371386905181d + "'", double10 == 1.0111371386905181d);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4654917020238119153L + "'", long11 == 4654917020238119153L);
// flaky:         org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.023655236f + "'", float12 == 0.023655236f);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French (France)", 0.6937006709621266d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (france)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.util.Locale locale1 = new java.util.Locale("EN-US");
        org.junit.Assert.assertEquals(locale1.toString(), "en-us");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str6 = locale3.getExtension('a');
        java.lang.String str7 = locale3.toLanguageTag();
        java.util.Random random9 = new java.util.Random((long) (short) 10);
        int int11 = random9.nextInt((int) (byte) 1);
        float float12 = random9.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale3, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fr_fr_HI!_eng could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-eng" + "'", str4, "x-lvariant-eng");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "x-lvariant-eng" + "'", str7, "x-lvariant-eng");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.44563425f + "'", float12 == 0.44563425f);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale3.getDisplayCountry(locale9);
        java.lang.String str11 = locale9.getDisplayLanguage();
        java.lang.String str12 = locale9.toLanguageTag();
        java.lang.String str14 = locale9.getUnicodeLocaleType("fr");
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French" + "'", str11, "French");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setExtension('a', "Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Chinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.DateAndTime dateAndTime13 = null;
        faker12.dateAndTime = dateAndTime13;
        com.github.javafaker.Business business15 = faker12.business;
        faker1.business = business15;
        com.github.javafaker.Finance finance17 = faker1.finance;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(business15);
        org.junit.Assert.assertNotNull(finance17);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("TW", 0.7160155117030577d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker1.randomService = randomService12;
        com.github.javafaker.Finance finance14 = faker1.finance();
        com.github.javafaker.Lorem lorem15 = faker1.lorem();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker1.phoneNumber();
        com.github.javafaker.Address address17 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime18 = faker1.dateAndTime;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8563203537100015d + "'", double8 == 0.8563203537100015d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNull(lorem15);
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertNotNull(dateAndTime18);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("hi!", "en-US");
        java.lang.String str10 = locale3.getDisplayName(locale9);
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getVariant();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = locale12.getDisplayVariant(locale14);
        java.lang.String str16 = locale14.getCountry();
        java.lang.String str17 = locale14.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.lang.String str19 = locale14.getDisplayScript(locale18);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale14.getDisplayCountry(locale20);
        java.util.Set<java.lang.String> strSet22 = locale14.getUnicodeLocaleAttributes();
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.lang.String str30 = locale29.getVariant();
        java.util.Set<java.lang.String> strSet31 = locale29.getUnicodeLocaleKeys();
        java.lang.String str32 = locale27.getDisplayLanguage(locale29);
        java.lang.String str33 = locale27.getLanguage();
        java.lang.String str34 = locale23.getDisplayCountry(locale27);
        java.lang.String str35 = locale14.getDisplayLanguage(locale23);
        java.lang.String str36 = locale9.getDisplayScript(locale23);
        java.lang.Object obj37 = locale9.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_EN-US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (France)" + "'", str10, "French (France)");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FR" + "'", str16, "FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "France" + "'", str21, "France");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Franz\366sisch" + "'", str35, "Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "hi!_EN-US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "hi!_EN-US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "hi!_EN-US");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.Locale locale2 = new java.util.Locale("French", "eng");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getDisplayLanguage();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Locale locale9 = new java.util.Locale("hi!", "French");
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale6.getDisplayCountry(locale9);
        java.lang.String str12 = locale2.getDisplayVariant(locale9);
        org.junit.Assert.assertEquals(locale2.toString(), "french_ENG");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "french" + "'", str4, "french");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_FRENCH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        com.github.javafaker.Options options15 = faker10.options;
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        java.lang.String str21 = faker17.numerify("hi!");
        com.github.javafaker.Lorem lorem22 = faker17.lorem;
        java.util.Random random23 = new java.util.Random();
        double double24 = random23.nextDouble();
        int int26 = random23.nextInt(1);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.service.RandomService randomService28 = faker27.randomService;
        faker17.randomService = randomService28;
        com.github.javafaker.Finance finance30 = faker17.finance();
        com.github.javafaker.Options options31 = faker17.options;
        com.github.javafaker.Options options32 = faker17.options();
        faker10.options = options32;
        java.util.Random random34 = new java.util.Random();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.Lorem lorem36 = null;
        faker35.lorem = lorem36;
        com.github.javafaker.Name name38 = faker35.name;
        com.github.javafaker.Book book39 = faker35.book;
        faker10.book = book39;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.711711324953965d + "'", double7 == 0.711711324953965d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(lorem22);
// flaky:         org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.7816688981089374d + "'", double24 == 0.7816688981089374d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(randomService28);
        org.junit.Assert.assertNotNull(finance30);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(name38);
        org.junit.Assert.assertNotNull(book39);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 0, (long) (byte) 1);
        java.util.Random random6 = new java.util.Random((long) (byte) 1);
        byte[] byteArray8 = new byte[] { (byte) -1 };
        random6.nextBytes(byteArray8);
        random1.nextBytes(byteArray8);
        java.util.stream.IntStream intStream11 = random1.ints();
        int int13 = random1.nextInt((int) (byte) 100);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-46]");
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 80 + "'", int13 == 80);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale3.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRA" + "'", str9, "FRA");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.util.Random random1 = new java.util.Random(1L);
        double double2 = random1.nextGaussian();
        long long3 = random1.nextLong();
        java.util.stream.LongStream longStream7 = random1.longs(100L, (long) (-1167796541), (-1L));
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        double double10 = random8.nextGaussian();
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        random8.nextBytes(byteArray16);
        random1.nextBytes(byteArray16);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.561581040188955d + "'", double2 == 1.561581040188955d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3831662765844904176L + "'", long3 == 3831662765844904176L);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.621528691822783d) + "'", double10 == (-0.621528691822783d));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-27, -15, 44, 85, -35]");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder5 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("fra", "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: fra [at index 0]");
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale6.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale6.getDisplayCountry(locale12);
        java.lang.String str14 = locale1.getDisplayScript(locale6);
        java.lang.String str15 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR" + "'", str8, "FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French" + "'", str9, "French");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "France" + "'", str13, "France");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese (taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("deu", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream6 = random0.longs((long) ' ', (long) (byte) 100, (long) 'u');
        java.util.stream.IntStream intStream7 = random0.ints();
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str2 = locale0.getVariant();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.lang.String str4 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.setLanguageTag("fr-fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder1.addUnicodeLocaleAttribute("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber;
        com.github.javafaker.Color color9 = faker1.color;
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.lang.String str10 = locale7.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Japanese" + "'", str9, "Japanese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ja" + "'", str10, "ja");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream10 = random1.longs();
        java.util.stream.LongStream longStream13 = random1.longs((long) (byte) -1, (long) (byte) 1);
        double double14 = random1.nextGaussian();
        java.util.stream.IntStream intStream17 = random1.ints(62, 90);
        double double18 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.4423664718404032d) + "'", double14 == (-0.4423664718404032d));
        org.junit.Assert.assertNotNull(intStream17);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.07234359782638254d + "'", double18 == 0.07234359782638254d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap9);
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] { languageRange13, languageRange15 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList40);
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList40);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList43, filteringMode44);
        java.lang.String str46 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap47);
        java.util.Locale.LanguageRange languageRange50 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange52 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] { languageRange50, languageRange52 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, strMap56);
        java.util.Locale locale58 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet59 = locale58.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet60 = locale58.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode61 = null;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags(languageRangeList57, (java.util.Collection<java.lang.String>) strSet60, filteringMode61);
        java.lang.String str63 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList62);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags(languageRangeList10, (java.util.Collection<java.lang.String>) strList62);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode44.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(languageRangeList57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "de");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(strList64);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.util.Locale locale1 = new java.util.Locale("French (France)");
        java.lang.String str2 = locale1.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "french (france)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number9 = faker8.number;
        com.github.javafaker.Number number10 = faker8.number();
        java.lang.String str12 = faker8.bothify("en-GB");
        com.github.javafaker.Name name13 = faker8.name();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code15 = null;
        faker14.code = code15;
        com.github.javafaker.Lorem lorem17 = faker14.lorem();
        faker8.lorem = lorem17;
        com.github.javafaker.Business business19 = faker8.business();
        com.github.javafaker.Company company20 = faker8.company;
        com.github.javafaker.Internet internet21 = faker8.internet();
        faker1.internet = internet21;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-GB" + "'", str12, "en-GB");
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertNotNull(business19);
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertNotNull(internet21);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.util.Locale locale21 = new java.util.Locale("hi!");
        java.lang.String str22 = locale21.getVariant();
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleKeys();
        java.lang.String str24 = locale19.getDisplayLanguage(locale21);
        java.lang.String str25 = locale19.getLanguage();
        java.util.Set<java.lang.String> strSet26 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList29, strMap30);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(languageRangeList31);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        com.github.javafaker.Internet internet8 = null;
        faker5.internet = internet8;
        com.github.javafaker.Number number10 = faker5.number;
        com.github.javafaker.Number number11 = faker5.number;
        faker3.number = number11;
        com.github.javafaker.Book book13 = faker3.book;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(book13);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("eng");
        java.util.Locale locale8 = builder0.build();
        java.util.Locale.Builder builder9 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder0.addUnicodeLocaleAttribute("de");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: de [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker1.fakeValuesService;
        com.github.javafaker.Options options13 = faker1.options;
        com.github.javafaker.Code code14 = faker1.code();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(code14);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        random0.setSeed((long) (-1));
        java.util.stream.DoubleStream doubleStream8 = random0.doubles();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10404603824463454d + "'", double1 == 0.10404603824463454d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.310978447532014d + "'", double5 == 0.310978447532014d);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        boolean boolean4 = random0.nextBoolean();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Name name10 = faker7.name;
        com.github.javafaker.Book book11 = faker7.book;
        faker5.book = book11;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        java.util.Random random14 = new java.util.Random();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Lorem lorem16 = null;
        faker15.lorem = lorem16;
        com.github.javafaker.PhoneNumber phoneNumber18 = faker15.phoneNumber;
        faker13.phoneNumber = phoneNumber18;
        com.github.javafaker.Options options20 = faker13.options;
        faker5.options = options20;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9381360368775851d + "'", double1 == 0.9381360368775851d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(phoneNumber18);
        org.junit.Assert.assertNotNull(options20);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.util.Locale locale3 = new java.util.Locale("fr", "en-us", "France");
        org.junit.Assert.assertEquals(locale3.toString(), "fr_EN-US_France");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("French (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (france)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet6 = faker5.internet;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker9.phoneNumber;
        faker7.phoneNumber = phoneNumber12;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        java.util.Random random15 = new java.util.Random();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Lorem lorem17 = null;
        faker16.lorem = lorem17;
        com.github.javafaker.PhoneNumber phoneNumber19 = faker16.phoneNumber;
        faker14.phoneNumber = phoneNumber19;
        com.github.javafaker.Options options21 = faker14.options;
        faker7.options = options21;
        com.github.javafaker.Internet internet23 = faker7.internet();
        java.util.Random random24 = new java.util.Random();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Lorem lorem26 = null;
        faker25.lorem = lorem26;
        java.lang.String str29 = faker25.numerify("hi!");
        com.github.javafaker.Lorem lorem30 = faker25.lorem;
        com.github.javafaker.Book book31 = faker25.book;
        faker7.book = book31;
        faker5.book = book31;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9155178891264337d + "'", double1 == 0.9155178891264337d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(phoneNumber19);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(internet23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(lorem30);
        org.junit.Assert.assertNotNull(book31);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Business business6 = faker1.business;
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker1.fakeValuesService;
        com.github.javafaker.Address address8 = faker1.address();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English (United Kingdom)", 0.5869777270444049d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united kingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.util.Locale locale2 = new java.util.Locale("japonais", "Franz\366sisch");
        org.junit.Assert.assertEquals(locale2.toString(), "japonais_FRANZ\366SISCH");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles();
        java.util.stream.IntStream intStream4 = random0.ints((long) 'x');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3375047117651905d + "'", double1 == 0.3375047117651905d);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fran\347ais (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franc?ais (france)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.util.Locale locale2 = new java.util.Locale("it_IT", "FRENCH");
        org.junit.Assert.assertEquals(locale2.toString(), "it_it_FRENCH");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.util.Locale locale2 = new java.util.Locale("TW", "");
        org.junit.Assert.assertEquals(locale2.toString(), "tw");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.util.Random random1 = new java.util.Random((long) 34);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.util.Locale locale3 = new java.util.Locale("hi! (Taiwan)", "fr-FR", "en-GB");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "hi! (taiwan)_FR-FR_en-GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! (taiwan)_FR-FR_en-GB" + "'", str4, "hi! (taiwan)_FR-FR_en-GB");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7);
        com.github.javafaker.Business business10 = faker9.business();
        faker0.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number13 = faker12.number;
        com.github.javafaker.Number number14 = faker12.number();
        java.lang.String str16 = faker12.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker12.fakeValuesService;
        java.util.Random random18 = new java.util.Random();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Lorem lorem20 = null;
        faker19.lorem = lorem20;
        com.github.javafaker.PhoneNumber phoneNumber22 = faker19.phoneNumber;
        com.github.javafaker.Color color23 = faker19.color();
        faker12.color = color23;
        com.github.javafaker.Color color25 = faker12.color;
        faker0.color = color25;
        java.lang.Class<?> wildcardClass27 = color25.getClass();
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en-GB" + "'", str16, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(phoneNumber22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        float float11 = random6.nextFloat();
        int int12 = random6.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random6.doubles();
        java.util.stream.IntStream intStream14 = random6.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream18 = random6.ints((long) 431529176, 1891812663, 1891812663);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.478862331723947d + "'", double7 == 0.478862331723947d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.16937178f + "'", float11 == 0.16937178f);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-337193342) + "'", int12 == (-337193342));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.Name name5 = faker1.name;
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Internet internet10 = null;
        faker7.internet = internet10;
        java.lang.String str13 = faker7.bothify("");
        com.github.javafaker.Book book14 = faker7.book();
        faker1.book = book14;
        com.github.javafaker.Code code16 = faker1.code;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number18 = faker17.number;
        com.github.javafaker.Number number19 = faker17.number();
        java.lang.String str21 = faker17.bothify("en-GB");
        com.github.javafaker.Name name22 = faker17.name();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code24 = null;
        faker23.code = code24;
        com.github.javafaker.Lorem lorem26 = faker23.lorem();
        faker17.lorem = lorem26;
        java.util.Random random28 = new java.util.Random();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Lorem lorem30 = null;
        faker29.lorem = lorem30;
        java.lang.String str33 = faker29.numerify("");
        java.util.Random random34 = new java.util.Random();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.Lorem lorem36 = null;
        faker35.lorem = lorem36;
        com.github.javafaker.Color color38 = faker35.color;
        faker29.color = color38;
        com.github.javafaker.PhoneNumber phoneNumber40 = faker29.phoneNumber;
        faker17.phoneNumber = phoneNumber40;
        java.util.Locale locale43 = new java.util.Locale("hi!");
        java.lang.String str44 = locale43.getVariant();
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.lang.String str46 = locale43.getDisplayVariant(locale45);
        java.lang.String str47 = locale45.getCountry();
        java.util.Random random48 = new java.util.Random();
        double double49 = random48.nextDouble();
        int int51 = random48.nextInt(1);
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(locale45, random48);
        com.github.javafaker.Internet internet53 = faker52.internet();
        faker17.internet = internet53;
        com.github.javafaker.Address address55 = faker17.address;
        faker1.address = address55;
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(code16);
        org.junit.Assert.assertNotNull(number18);
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en-GB" + "'", str21, "en-GB");
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(phoneNumber40);
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "FR" + "'", str47, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.9327768804887909d + "'", double49 == 0.9327768804887909d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(internet53);
        org.junit.Assert.assertNotNull(address55);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.service.RandomService randomService5 = faker1.randomService;
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(randomService5);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        java.lang.String str16 = faker10.numerify("");
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        java.lang.String str22 = faker18.numerify("");
        java.util.Random random23 = new java.util.Random();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Lorem lorem25 = null;
        faker24.lorem = lorem25;
        com.github.javafaker.Color color27 = faker24.color;
        faker18.color = color27;
        faker10.color = color27;
        java.util.Random random30 = new java.util.Random();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Lorem lorem32 = null;
        faker31.lorem = lorem32;
        com.github.javafaker.Internet internet34 = null;
        faker31.internet = internet34;
        java.lang.String str37 = faker31.bothify("");
        com.github.javafaker.Name name38 = faker31.name;
        com.github.javafaker.Color color39 = faker31.color;
        faker10.color = color39;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7526714999341546d + "'", double7 == 0.7526714999341546d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(name38);
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale5, random6);
        java.util.stream.DoubleStream doubleStream8 = random6.doubles();
        java.util.stream.IntStream intStream11 = random6.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream14 = random6.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream15 = random6.longs();
        java.util.stream.LongStream longStream18 = random6.longs((long) (byte) -1, (long) (byte) 1);
        java.util.Random random20 = new java.util.Random((long) (byte) 1);
        byte[] byteArray22 = new byte[] { (byte) -1 };
        random20.nextBytes(byteArray22);
        random6.nextBytes(byteArray22);
        float float25 = random6.nextFloat();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale0, random6);
        com.github.javafaker.Name name27 = faker26.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(byteArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[6]");
// flaky:         org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.046363294f + "'", float25 == 0.046363294f);
        org.junit.Assert.assertNotNull(name27);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        java.lang.String str16 = faker12.numerify("");
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        com.github.javafaker.Color color21 = faker18.color;
        faker12.color = color21;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker12.phoneNumber;
        faker0.phoneNumber = phoneNumber23;
        com.github.javafaker.Code code25 = faker0.code();
        java.lang.String str27 = faker0.letterify("en_us");
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(code25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en_us" + "'", str27, "en_us");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange4 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList32, filteringMode33);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList37, strMap38);
        java.util.Locale.LanguageRange languageRange42 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange44 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] { languageRange42, languageRange44 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList53);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strList61);
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, (java.util.Collection<java.lang.String>) strList69);
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strList69);
        java.util.Locale.FilteringMode filteringMode73 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList72, filteringMode73);
        java.lang.String str75 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList72);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap76);
        java.util.Locale.LanguageRange languageRange79 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange81 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray82 = new java.util.Locale.LanguageRange[] { languageRange79, languageRange81 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList83 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83, languageRangeArray82);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap85 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList86 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList83, strMap85);
        java.util.Locale locale87 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet88 = locale87.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet89 = locale87.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode90 = null;
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags(languageRangeList86, (java.util.Collection<java.lang.String>) strSet89, filteringMode90);
        java.lang.String str92 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList91);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList39, (java.util.Collection<java.lang.String>) strList91);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode33.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertTrue("'" + filteringMode73 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode73.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(languageRangeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(languageRangeList86);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "de");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNotNull(strList93);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.util.Locale.setDefault(locale1);
        java.util.Random random7 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Code code9 = faker8.code;
        com.github.javafaker.PhoneNumber phoneNumber10 = faker8.phoneNumber();
        com.github.javafaker.Name name11 = faker8.name();
        boolean boolean12 = locale1.equals((java.lang.Object) faker8);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.util.Random random1 = new java.util.Random(542193845530091636L);
        boolean boolean2 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Internet internet10 = null;
        faker7.internet = internet10;
        java.lang.String str13 = faker7.bothify("");
        com.github.javafaker.Code code14 = null;
        faker7.code = code14;
        com.github.javafaker.DateAndTime dateAndTime16 = faker7.date();
        faker0.dateAndTime = dateAndTime16;
        com.github.javafaker.Lorem lorem18 = faker0.lorem();
        com.github.javafaker.Internet internet19 = faker0.internet();
        com.github.javafaker.Internet internet20 = faker0.internet();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(dateAndTime16);
        org.junit.Assert.assertNotNull(lorem18);
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(internet20);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.util.Random random1 = new java.util.Random((long) 'a');
        boolean boolean2 = random1.nextBoolean();
        java.util.stream.LongStream longStream4 = random1.longs((long) (byte) 10);
        double double5 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4796372950430358d + "'", double5 == 0.4796372950430358d);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.util.Locale locale1 = new java.util.Locale("twi");
        org.junit.Assert.assertEquals(locale1.toString(), "twi");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        java.lang.String str9 = faker5.numerify("");
        com.github.javafaker.Company company10 = faker5.company;
        com.github.javafaker.Number number11 = faker5.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker5.fakeValuesService;
        faker1.fakeValuesService = fakeValuesService12;
        java.util.Random random14 = new java.util.Random();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Lorem lorem16 = null;
        faker15.lorem = lorem16;
        java.lang.String str19 = faker15.numerify("hi!");
        com.github.javafaker.Lorem lorem20 = faker15.lorem;
        java.util.Random random21 = new java.util.Random();
        double double22 = random21.nextDouble();
        int int24 = random21.nextInt(1);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.service.RandomService randomService26 = faker25.randomService;
        faker15.randomService = randomService26;
        com.github.javafaker.Finance finance28 = faker15.finance();
        com.github.javafaker.Options options29 = faker15.options;
        com.github.javafaker.Book book30 = faker15.book();
        faker1.book = book30;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(lorem20);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.7261528817533974d + "'", double22 == 0.7261528817533974d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(randomService26);
        org.junit.Assert.assertNotNull(finance28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(book30);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Business business6 = faker1.business();
        com.github.javafaker.Address address7 = faker1.address();
        com.github.javafaker.Name name8 = faker1.name();
        com.github.javafaker.Business business9 = faker1.business;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        com.github.javafaker.DateAndTime dateAndTime8 = faker5.date();
        java.lang.String str10 = faker5.bothify("fran\347ais");
        com.github.javafaker.DateAndTime dateAndTime11 = faker5.dateAndTime;
        java.lang.Class<?> wildcardClass12 = faker5.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7524507449926071d + "'", double1 == 0.7524507449926071d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.dateAndTime;
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker0.fakeValuesService;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.Internet internet12 = null;
        faker9.internet = internet12;
        java.lang.String str15 = faker9.bothify("");
        com.github.javafaker.Book book16 = faker9.book();
        faker0.book = book16;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        java.util.Random random19 = new java.util.Random();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Lorem lorem21 = null;
        faker20.lorem = lorem21;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker20.phoneNumber;
        faker18.phoneNumber = phoneNumber23;
        com.github.javafaker.Options options25 = faker18.options;
        faker0.options = options25;
        com.github.javafaker.DateAndTime dateAndTime27 = faker0.dateAndTime;
        java.lang.Class<?> wildcardClass28 = faker0.getClass();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(dateAndTime27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList9, strMap10);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number11 = faker10.number;
        faker1.number = number11;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker1.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker1.phoneNumber;
        com.github.javafaker.Internet internet15 = faker1.internet;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertNull(internet15);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Random random9 = new java.util.Random();
        double double10 = random9.nextDouble();
        int int12 = random9.nextInt(1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random9);
        double double14 = random9.nextDouble();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale3, random9);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random9);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6478740143246523d + "'", double10 == 0.6478740143246523d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5442308465991819d + "'", double14 == 0.5442308465991819d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getLanguage();
        boolean boolean3 = locale1.hasExtensions();
        java.lang.String str4 = locale1.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = new java.util.Locale("fr_FR");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale locale12 = java.util.Locale.getDefault(category10);
        java.util.Locale locale15 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category10, locale15);
        java.util.Locale locale18 = new java.util.Locale("fr_FR");
        java.util.Locale.setDefault(category10, locale18);
        java.util.Locale locale20 = java.util.Locale.getDefault(category10);
        java.lang.String str21 = locale8.getDisplayCountry(locale20);
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.lang.String str24 = locale23.getVariant();
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = locale23.getDisplayVariant(locale25);
        java.lang.String str27 = locale25.getCountry();
        java.util.Random random28 = new java.util.Random();
        double double29 = random28.nextDouble();
        int int31 = random28.nextInt(1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale25, random28);
        double double33 = random28.nextGaussian();
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random28);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale8, random28);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fr_fr could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale8.toString(), "fr_fr");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_fr");
        org.junit.Assert.assertEquals(locale15.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale18.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "FR" + "'", str27, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.8394623720356716d + "'", double29 == 0.8394623720356716d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.07506086729154224d) + "'", double33 == (-0.07506086729154224d));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.util.Locale locale3 = new java.util.Locale("fran\347ais (EN-GB)", "french", "en-GB");
        org.junit.Assert.assertEquals(locale3.toString(), "fran\347ais (en-gb)_FRENCH_en-GB");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.util.Locale locale2 = new java.util.Locale("fran\347ais (France)", "x-lvariant-eng");
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale2.getDisplayName(locale3);
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = locale6.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "fran\347ais (france)_X-LVARIANT-ENG");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Japanese" + "'", str4, "Japanese");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fran\347ais (france) (X-LVARIANT-ENG)" + "'", str5, "fran\347ais (france) (X-LVARIANT-ENG)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fran\347ais (france)_X-LVARIANT-ENG");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fran\347ais (france) (X-LVARIANT-ENG)" + "'", str7, "fran\347ais (france) (X-LVARIANT-ENG)");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.util.Locale locale3 = new java.util.Locale("hi! (Taiwan)", "fr-FR", "en-GB");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! (taiwan)_FR-FR_en-GB could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi! (taiwan)_FR-FR_en-GB");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        double double6 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random0.ints((long) (short) 10, 80, (-1347056262));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4840605755394073d + "'", double1 == 0.4840605755394073d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9926585605448938d + "'", double5 == 0.9926585605448938d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6868623419686457d + "'", double6 == 0.6868623419686457d);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Color color6 = faker1.color;
        com.github.javafaker.Business business7 = faker1.business();
        com.github.javafaker.Book book8 = faker1.book;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        java.util.Random random12 = new java.util.Random();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Lorem lorem14 = null;
        faker13.lorem = lorem14;
        java.lang.String str17 = faker13.numerify("");
        com.github.javafaker.Company company18 = faker13.company;
        com.github.javafaker.Options options19 = faker13.options();
        faker1.options = options19;
        com.github.javafaker.PhoneNumber phoneNumber21 = faker1.phoneNumber();
        com.github.javafaker.Finance finance22 = faker1.finance;
        java.util.Random random23 = new java.util.Random();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Lorem lorem25 = null;
        faker24.lorem = lorem25;
        java.util.Random random27 = new java.util.Random();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Lorem lorem29 = null;
        faker28.lorem = lorem29;
        java.lang.String str32 = faker28.numerify("");
        com.github.javafaker.Company company33 = faker28.company;
        com.github.javafaker.Number number34 = faker28.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService35 = faker28.fakeValuesService;
        faker24.fakeValuesService = fakeValuesService35;
        com.github.javafaker.Company company37 = faker24.company();
        java.util.Random random38 = new java.util.Random();
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random38);
        com.github.javafaker.Lorem lorem40 = null;
        faker39.lorem = lorem40;
        com.github.javafaker.PhoneNumber phoneNumber42 = faker39.phoneNumber;
        com.github.javafaker.Color color43 = faker39.color();
        faker24.color = color43;
        faker1.color = color43;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(company18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(phoneNumber21);
        org.junit.Assert.assertNotNull(finance22);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(number34);
        org.junit.Assert.assertNotNull(fakeValuesService35);
        org.junit.Assert.assertNotNull(company37);
        org.junit.Assert.assertNotNull(phoneNumber42);
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.util.Locale locale1 = new java.util.Locale("fr_FR");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Random random4 = new java.util.Random((long) 100);
        double double5 = random4.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale1, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fr_fr could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "fr_fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6246292191371761d + "'", double5 == 0.6246292191371761d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        random0.setSeed((long) (-1));
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        java.util.Random random13 = new java.util.Random();
        double double14 = random13.nextDouble();
        java.util.stream.IntStream intStream17 = random13.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Code code19 = faker18.code();
        faker10.code = code19;
        com.github.javafaker.Lorem lorem21 = faker10.lorem();
        java.util.Random random22 = new java.util.Random();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Lorem lorem24 = null;
        faker23.lorem = lorem24;
        com.github.javafaker.PhoneNumber phoneNumber26 = faker23.phoneNumber;
        faker10.phoneNumber = phoneNumber26;
        com.github.javafaker.PhoneNumber phoneNumber28 = faker10.phoneNumber();
        com.github.javafaker.Code code29 = faker10.code;
        com.github.javafaker.Name name30 = faker10.name();
        faker8.name = name30;
        java.util.Locale locale33 = new java.util.Locale("hi!");
        java.lang.String str34 = locale33.getVariant();
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.lang.String str36 = locale33.getDisplayVariant(locale35);
        java.lang.String str37 = locale35.getCountry();
        java.util.Random random38 = new java.util.Random();
        double double39 = random38.nextDouble();
        int int41 = random38.nextInt(1);
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(locale35, random38);
        com.github.javafaker.Business business43 = faker42.business;
        java.lang.String str45 = faker42.bothify("en-US");
        com.github.javafaker.Number number46 = faker42.number();
        com.github.javafaker.PhoneNumber phoneNumber47 = faker42.phoneNumber;
        java.util.Random random48 = new java.util.Random();
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(random48);
        com.github.javafaker.Lorem lorem50 = null;
        faker49.lorem = lorem50;
        com.github.javafaker.Color color52 = faker49.color;
        com.github.javafaker.Finance finance53 = faker49.finance();
        com.github.javafaker.Address address54 = faker49.address;
        com.github.javafaker.Code code55 = faker49.code;
        java.util.Random random56 = new java.util.Random();
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker(random56);
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random56);
        com.github.javafaker.Finance finance59 = faker58.finance;
        faker49.finance = finance59;
        faker42.finance = finance59;
        faker8.finance = finance59;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10619151690541939d + "'", double1 == 0.10619151690541939d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.22267091192889088d + "'", double5 == 0.22267091192889088d);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6279315191116523d + "'", double14 == 0.6279315191116523d);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNull(lorem21);
        org.junit.Assert.assertNotNull(phoneNumber26);
        org.junit.Assert.assertNotNull(phoneNumber28);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(name30);
        org.junit.Assert.assertEquals(locale33.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "FR" + "'", str37, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.6433865772474529d + "'", double39 == 0.6433865772474529d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(business43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "en-US" + "'", str45, "en-US");
        org.junit.Assert.assertNotNull(number46);
        org.junit.Assert.assertNotNull(phoneNumber47);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(finance53);
        org.junit.Assert.assertNotNull(address54);
        org.junit.Assert.assertNotNull(code55);
        org.junit.Assert.assertNotNull(finance59);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber;
        com.github.javafaker.Business business9 = faker1.business();
        java.util.Random random10 = new java.util.Random();
        double double11 = random10.nextDouble();
        int int13 = random10.nextInt(1);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Book book15 = faker14.book();
        faker1.book = book15;
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        com.github.javafaker.Internet internet21 = null;
        faker18.internet = internet21;
        java.lang.String str24 = faker18.bothify("");
        com.github.javafaker.Code code25 = null;
        faker18.code = code25;
        com.github.javafaker.DateAndTime dateAndTime27 = faker18.date();
        java.util.Random random28 = new java.util.Random();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.DateAndTime dateAndTime30 = null;
        faker29.dateAndTime = dateAndTime30;
        com.github.javafaker.Business business32 = faker29.business;
        faker18.business = business32;
        com.github.javafaker.Code code34 = faker18.code();
        java.util.Random random35 = new java.util.Random();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(random35);
        com.github.javafaker.Lorem lorem37 = null;
        faker36.lorem = lorem37;
        com.github.javafaker.Color color39 = faker36.color;
        com.github.javafaker.Finance finance40 = faker36.finance();
        com.github.javafaker.PhoneNumber phoneNumber41 = faker36.phoneNumber();
        com.github.javafaker.Options options42 = faker36.options();
        faker18.options = options42;
        faker1.options = options42;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(business9);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9338334850046607d + "'", double11 == 0.9338334850046607d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(dateAndTime27);
        org.junit.Assert.assertNotNull(business32);
        org.junit.Assert.assertNull(code34);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(finance40);
        org.junit.Assert.assertNotNull(phoneNumber41);
        org.junit.Assert.assertNotNull(options42);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.util.Locale locale2 = new java.util.Locale("france", "hi! (Taiwan)");
        org.junit.Assert.assertEquals(locale2.toString(), "france_HI! (TAIWAN)");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.util.Random random1 = new java.util.Random((long) 49);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Random random2 = new java.util.Random((long) 'a');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.Locale locale3 = new java.util.Locale("fr_FR_FR", "fr_FR", "fr-FR");
        org.junit.Assert.assertEquals(locale3.toString(), "fr_fr_fr_FR_FR_fr-FR");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder9.setScript("");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.getISO3Language();
        java.lang.String str16 = locale3.getDisplayCountry(locale14);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Random random18 = new java.util.Random();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale17, random18);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles();
        java.util.stream.IntStream intStream23 = random18.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream26 = random18.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream27 = random18.longs();
        boolean boolean28 = random18.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale14, random18);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(longStream27);
// flaky:         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-x-lvariant-eng", 0.10619151690541939d);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.lang.String str9 = locale5.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setRegion("fr");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("japonais", 0.233656874384779d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "japonais" + "'", str3, "japonais");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", (double) (byte) 0);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number4 = faker3.number;
        com.github.javafaker.Number number5 = faker3.number();
        java.lang.String str7 = faker3.bothify("en-GB");
        com.github.javafaker.Name name8 = faker3.name();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code10 = null;
        faker9.code = code10;
        com.github.javafaker.Lorem lorem12 = faker9.lorem();
        faker3.lorem = lorem12;
        java.util.Random random14 = new java.util.Random();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Lorem lorem16 = null;
        faker15.lorem = lorem16;
        java.lang.String str19 = faker15.numerify("");
        java.util.Random random20 = new java.util.Random();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Lorem lorem22 = null;
        faker21.lorem = lorem22;
        com.github.javafaker.Color color24 = faker21.color;
        faker15.color = color24;
        com.github.javafaker.PhoneNumber phoneNumber26 = faker15.phoneNumber;
        faker3.phoneNumber = phoneNumber26;
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.lang.String str30 = locale29.getVariant();
        java.util.Locale locale31 = java.util.Locale.FRANCE;
        java.lang.String str32 = locale29.getDisplayVariant(locale31);
        java.lang.String str33 = locale31.getCountry();
        java.util.Random random34 = new java.util.Random();
        double double35 = random34.nextDouble();
        int int37 = random34.nextInt(1);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(locale31, random34);
        com.github.javafaker.Internet internet39 = faker38.internet();
        faker3.internet = internet39;
        com.github.javafaker.Company company41 = faker3.company;
        boolean boolean42 = languageRange2.equals((java.lang.Object) company41);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-GB" + "'", str7, "en-GB");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(phoneNumber26);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "FR" + "'", str33, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.8524430127151381d + "'", double35 == 0.8524430127151381d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(internet39);
        org.junit.Assert.assertNotNull(company41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ENGLISH (UNITED KINGDOM)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english(unitedkingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        boolean boolean7 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = random1.nextInt((-753608540));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream14 = random11.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        java.lang.String str16 = locale7.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais" + "'", str6, "fran\347ais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "japonais" + "'", str9, "japonais");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ja" + "'", str16, "ja");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        int int4 = random1.nextInt(1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book6 = faker5.book();
        faker0.book = book6;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.Internet internet12 = null;
        faker9.internet = internet12;
        java.lang.String str15 = faker9.bothify("");
        com.github.javafaker.Code code16 = null;
        faker9.code = code16;
        com.github.javafaker.DateAndTime dateAndTime18 = faker9.date();
        faker0.dateAndTime = dateAndTime18;
        com.github.javafaker.Internet internet20 = faker0.internet;
        java.util.Random random21 = new java.util.Random();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem23 = null;
        faker22.lorem = lorem23;
        java.lang.String str26 = faker22.numerify("");
        com.github.javafaker.Company company27 = faker22.company;
        com.github.javafaker.Company company28 = faker22.company();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        java.util.Random random30 = new java.util.Random();
        double double31 = random30.nextDouble();
        int int33 = random30.nextInt(1);
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Book book35 = faker34.book();
        faker29.book = book35;
        java.util.Random random37 = new java.util.Random();
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Lorem lorem39 = null;
        faker38.lorem = lorem39;
        com.github.javafaker.Internet internet41 = null;
        faker38.internet = internet41;
        java.lang.String str44 = faker38.bothify("");
        com.github.javafaker.Code code45 = null;
        faker38.code = code45;
        com.github.javafaker.DateAndTime dateAndTime47 = faker38.date();
        faker29.dateAndTime = dateAndTime47;
        faker22.dateAndTime = dateAndTime47;
        com.github.javafaker.PhoneNumber phoneNumber50 = faker22.phoneNumber();
        faker0.phoneNumber = phoneNumber50;
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07741458036317794d + "'", double2 == 0.07741458036317794d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(company27);
        org.junit.Assert.assertNotNull(company28);
// flaky:         org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.003218485114712233d + "'", double31 == 0.003218485114712233d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(book35);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(dateAndTime47);
        org.junit.Assert.assertNotNull(phoneNumber50);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.lang.String str6 = null; // flaky: locale5.getISO3Language();
        java.util.Set<java.lang.Character> charSet7 = locale5.getExtensionKeys();
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleKeys();
        java.lang.String str9 = locale1.getDisplayCountry(locale5);
        java.lang.String str10 = locale5.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra" + "'", str6, "fra");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream10 = random1.longs();
        java.util.stream.LongStream longStream13 = random1.longs((long) (byte) -1, (long) (byte) 1);
        java.util.Random random15 = new java.util.Random((long) (byte) 1);
        byte[] byteArray17 = new byte[] { (byte) -1 };
        random15.nextBytes(byteArray17);
        random1.nextBytes(byteArray17);
        float float20 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = random1.nextInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(byteArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[95]");
// flaky:         org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8208239f + "'", float20 == 0.8208239f);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Random random3 = new java.util.Random(1L);
        com.github.javafaker.Faker faker4 = null; // flaky: new com.github.javafaker.Faker(locale1, random3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random3.doubles((long) 'x', (double) 7, (double) 0.99821526f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles();
        java.util.stream.LongStream longStream6 = random0.longs((long) 431529176, (long) (-1780303639), 1853403699951111791L);
        double double7 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random0.ints(0, (-753608540));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7536543728694101d + "'", double1 == 0.7536543728694101d);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.49851409729446094d + "'", double7 == 0.49851409729446094d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.util.Locale locale2 = new java.util.Locale("fran\347ais (France)", "x-lvariant-eng");
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale2.getDisplayName(locale3);
        java.lang.String str6 = locale3.getVariant();
        java.lang.Object obj7 = locale3.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "fran\347ais (france)_X-LVARIANT-ENG");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "japonais" + "'", str4, "japonais");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fran\347ais (france) (X-LVARIANT-ENG)" + "'", str5, "fran\347ais (france) (X-LVARIANT-ENG)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "ja");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "ja");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "ja");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        java.lang.String str12 = faker8.numerify("");
        com.github.javafaker.Company company13 = faker8.company;
        com.github.javafaker.Number number14 = faker8.number();
        com.github.javafaker.PhoneNumber phoneNumber15 = faker8.phoneNumber;
        com.github.javafaker.Color color16 = faker8.color;
        faker5.color = color16;
        com.github.javafaker.Finance finance18 = faker5.finance();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2606352200554475d + "'", double1 == 0.2606352200554475d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(phoneNumber15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(finance18);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        com.github.javafaker.DateAndTime dateAndTime8 = faker5.date();
        java.lang.String str10 = faker5.bothify("fran\347ais");
        com.github.javafaker.DateAndTime dateAndTime11 = faker5.dateAndTime;
        com.github.javafaker.Internet internet12 = faker5.internet;
        java.lang.String str14 = faker5.bothify("fra");
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker5.fakeValuesService;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7724288302017599d + "'", double1 == 0.7724288302017599d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fra" + "'", str14, "fra");
        org.junit.Assert.assertNotNull(fakeValuesService15);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Random random4 = new java.util.Random((long) ' ');
        int int5 = random4.nextInt();
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        double double8 = random6.nextGaussian();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        random6.nextBytes(byteArray14);
        random4.nextBytes(byteArray14);
        java.util.stream.DoubleStream doubleStream17 = random4.doubles();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale1, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1167796541) + "'", int5 == (-1167796541));
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.45848996867037123d) + "'", double8 == (-0.45848996867037123d));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[55, -59, -62, 112, 34]");
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker5.fakeValuesService;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker5.resolve("fr_FR_FR");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.85431455074363d + "'", double1 == 0.85431455074363d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        byte[] byteArray3 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        float float6 = random1.nextFloat();
        java.util.stream.LongStream longStream7 = random1.longs();
        java.util.stream.DoubleStream doubleStream11 = random1.doubles((long) 1133645844, (double) (byte) -1, 0.78606644586214d);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[115]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.100473166f + "'", float6 == 0.100473166f);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        com.github.javafaker.DateAndTime dateAndTime8 = faker5.date();
        com.github.javafaker.Address address9 = faker5.address;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9333500191553219d + "'", double1 == 0.9333500191553219d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(address9);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number11 = faker10.number;
        faker1.number = number11;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker1.phoneNumber();
        java.lang.String str15 = faker1.bothify("fr-x-lvariant-eng");
        com.github.javafaker.Company company16 = faker1.company;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fr-x-lvariant-eng" + "'", str15, "fr-x-lvariant-eng");
        org.junit.Assert.assertNotNull(company16);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.util.Locale locale3 = new java.util.Locale("canada", "fr", "France");
        org.junit.Assert.assertEquals(locale3.toString(), "canada_FR_France");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("Japanese");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.Number number6 = faker0.number;
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker0.phoneNumber;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles();
        java.util.stream.LongStream longStream6 = random0.longs((long) 431529176, (long) (-1780303639), 1853403699951111791L);
        double double7 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100);
        float float10 = random0.nextFloat();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3318580795403048d + "'", double1 == 0.3318580795403048d);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5991047796680377d + "'", double7 == 0.5991047796680377d);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.60575265f + "'", float10 == 0.60575265f);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Business business6 = faker1.business();
        com.github.javafaker.Address address7 = faker1.address();
        com.github.javafaker.Name name8 = faker1.name();
        com.github.javafaker.Code code9 = faker1.code();
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale3.getDisplayCountry(locale9);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale3.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais" + "'", str6, "fran\347ais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker1.phoneNumber;
        com.github.javafaker.Address address5 = faker1.address();
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Company company7 = faker1.company();
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.Internet internet12 = null;
        faker9.internet = internet12;
        java.lang.String str15 = faker9.bothify("");
        com.github.javafaker.Business business16 = faker9.business;
        faker5.business = business16;
        com.github.javafaker.Internet internet18 = faker5.internet();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3088457477602705d + "'", double1 == 0.3088457477602705d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(internet18);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.util.Random random1 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code3 = faker2.code;
        java.lang.String str5 = faker2.letterify("anglais (Royaume-Uni)");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anglais (Royaume-Uni)" + "'", str5, "anglais (Royaume-Uni)");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        java.lang.String str11 = faker7.numerify("hi!");
        com.github.javafaker.Lorem lorem12 = faker7.lorem;
        com.github.javafaker.Book book13 = faker7.book;
        com.github.javafaker.Code code14 = faker7.code();
        com.github.javafaker.Company company15 = faker7.company;
        faker1.company = company15;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(lorem12);
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(company15);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Name name4 = faker1.name;
        com.github.javafaker.Company company5 = faker1.company();
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("hi!", "en-US");
        java.lang.String str10 = locale3.getDisplayName(locale9);
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getVariant();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = locale12.getDisplayVariant(locale14);
        java.lang.String str16 = locale14.getCountry();
        java.lang.String str17 = locale14.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.lang.String str19 = locale14.getDisplayScript(locale18);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale14.getDisplayCountry(locale20);
        java.util.Set<java.lang.String> strSet22 = locale14.getUnicodeLocaleAttributes();
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.lang.String str30 = locale29.getVariant();
        java.util.Set<java.lang.String> strSet31 = locale29.getUnicodeLocaleKeys();
        java.lang.String str32 = locale27.getDisplayLanguage(locale29);
        java.lang.String str33 = locale27.getLanguage();
        java.lang.String str34 = locale23.getDisplayCountry(locale27);
        java.lang.String str35 = locale14.getDisplayLanguage(locale23);
        java.lang.String str36 = locale9.getDisplayScript(locale23);
        java.lang.String str37 = locale9.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_EN-US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (France)" + "'", str10, "French (France)");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FR" + "'", str16, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais" + "'", str17, "fran\347ais");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "France" + "'", str21, "France");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Franz\366sisch" + "'", str35, "Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EN-US" + "'", str37, "EN-US");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder7.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.setUnicodeLocaleKeyword("fr_fr (HI!,eng)", "en-us (english (united kingdom))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: fr_fr (HI!,eng) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.util.Locale locale2 = new java.util.Locale("Franz\366sisch", "FR");
        org.junit.Assert.assertEquals(locale2.toString(), "franz\366sisch_FR");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.util.Locale locale2 = new java.util.Locale("EN-US", "fr-FR");
        org.junit.Assert.assertEquals(locale2.toString(), "en-us_FR-FR");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.util.Random random1 = new java.util.Random((long) 0);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deu");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.toLanguageTag();
        java.lang.String str9 = locale1.getDisplayCountry(locale6);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fr-FR" + "'", str8, "fr-FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number11 = faker10.number;
        faker1.number = number11;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker1.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker1.phoneNumber;
        com.github.javafaker.service.RandomService randomService15 = faker1.randomService;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertNotNull(randomService15);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.util.Random random1 = new java.util.Random((long) 7);
        float float2 = random1.nextFloat();
        boolean boolean3 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.730699f + "'", float2 == 0.730699f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale6 = new java.util.Locale("fra (FR-FR)");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setLocale(locale6);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fra (fr-fr) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale6.toString(), "fra (fr-fr)");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.util.Locale locale3 = new java.util.Locale("fran\347ais (EN-GB)", "TW", "und_EN_US_eng");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("france");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: france");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fran\347ais (en-gb)_TW_und_EN_US_eng");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.util.Locale locale2 = new java.util.Locale("english (united kingdom)", "");
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.util.Random random9 = new java.util.Random();
        double double10 = random9.nextDouble();
        int int12 = random9.nextInt(1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale6, random9);
        float float14 = random9.nextFloat();
        java.util.stream.IntStream intStream16 = random9.ints((long) 1);
        random9.setSeed((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale2, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: english (united kingdom) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "english (united kingdom)");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR" + "'", str8, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8250135217322002d + "'", double10 == 0.8250135217322002d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.22255188f + "'", float14 == 0.22255188f);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fran\347ais (france) (X-LVARIANT-ENG)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franc?ais (france) (x-lvariant-eng)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        boolean boolean7 = random1.nextBoolean();
        java.util.stream.IntStream intStream8 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random1.ints(844792170, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream6 = random1.longs((long) 1, (long) 1, 100L);
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        double double9 = random7.nextGaussian();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        random7.nextBytes(byteArray15);
        random1.nextBytes(byteArray15);
        byte[] byteArray19 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray19);
        int int22 = random1.nextInt(45);
        float float23 = random1.nextFloat();
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.3446730987623446d) + "'", double9 == (-0.3446730987623446d));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[115, -43, 26, -69, -40]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[111]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 33 + "'", int22 == 33);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.2077148f + "'", float23 == 0.2077148f);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream14 = random11.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        java.lang.String str21 = faker17.numerify("hi!");
        com.github.javafaker.Color color22 = faker17.color;
        java.util.Random random23 = new java.util.Random();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Lorem lorem25 = null;
        faker24.lorem = lorem25;
        java.lang.String str28 = faker24.numerify("");
        com.github.javafaker.Company company29 = faker24.company;
        com.github.javafaker.Options options30 = faker24.options();
        faker17.options = options30;
        faker15.options = options30;
        com.github.javafaker.Number number33 = faker15.number();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais" + "'", str6, "fran\347ais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "japonais" + "'", str9, "japonais");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(company29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(number33);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        java.lang.String str9 = faker5.numerify("");
        com.github.javafaker.Company company10 = faker5.company;
        com.github.javafaker.Number number11 = faker5.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker5.fakeValuesService;
        faker2.fakeValuesService = fakeValuesService12;
        com.github.javafaker.Book book14 = faker2.book();
        com.github.javafaker.Code code15 = faker2.code();
        java.lang.String str17 = faker2.bothify("french");
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "french" + "'", str17, "french");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream4 = random1.ints((int) (byte) 1, (int) 'x');
        java.util.stream.LongStream longStream5 = random1.longs();
        random1.setSeed((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random1.doubles((long) (short) 1, 0.04330437804913012d, (-1.5586271593613603d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (byte) 100, 0.5819794877433786d, (double) 'x');
        long long6 = random1.nextLong();
        java.util.stream.LongStream longStream8 = random1.longs(3831662765844904176L);
        float float9 = random1.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-4964420948893066024L) + "'", long6 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.4100808f + "'", float9 == 0.4100808f);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.dateAndTime;
        com.github.javafaker.Finance finance7 = faker0.finance();
        com.github.javafaker.Finance finance8 = faker0.finance;
        com.github.javafaker.Options options9 = faker0.options;
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Lorem lorem12 = null;
        faker11.lorem = lorem12;
        com.github.javafaker.Color color14 = faker11.color;
        com.github.javafaker.Finance finance15 = faker11.finance();
        com.github.javafaker.Address address16 = faker11.address;
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        java.lang.String str22 = faker18.numerify("");
        com.github.javafaker.Company company23 = faker18.company;
        com.github.javafaker.Number number24 = faker18.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService25 = faker18.fakeValuesService;
        faker11.fakeValuesService = fakeValuesService25;
        faker0.fakeValuesService = fakeValuesService25;
        java.util.Random random28 = new java.util.Random();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Lorem lorem30 = null;
        faker29.lorem = lorem30;
        com.github.javafaker.Options options32 = faker29.options;
        com.github.javafaker.Name name33 = faker29.name;
        java.util.Random random34 = new java.util.Random();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.Lorem lorem36 = null;
        faker35.lorem = lorem36;
        com.github.javafaker.Internet internet38 = null;
        faker35.internet = internet38;
        java.lang.String str41 = faker35.bothify("");
        com.github.javafaker.Book book42 = faker35.book();
        faker29.book = book42;
        com.github.javafaker.Business business44 = faker29.business;
        faker0.business = business44;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(company23);
        org.junit.Assert.assertNotNull(number24);
        org.junit.Assert.assertNotNull(fakeValuesService25);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(name33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(book42);
        org.junit.Assert.assertNotNull(business44);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.lang.String str9 = locale7.getLanguage();
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.lang.String str12 = locale11.getLanguage();
        java.util.Locale locale13 = locale11.stripExtensions();
        java.lang.String str14 = locale13.getVariant();
        java.lang.String str15 = locale7.getDisplayName(locale13);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (EN-US,en-US)" + "'", str15, "hi! (EN-US,en-US)");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Locale locale19 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str20 = locale19.toLanguageTag();
        java.util.Set<java.lang.String> strSet21 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str22 = java.util.Locale.lookupTag(languageRangeList15, (java.util.Collection<java.lang.String>) strSet21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList15, strMap23);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "x-lvariant-eng" + "'", str20, "x-lvariant-eng");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(languageRangeList24);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("France", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList10);
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet17);
        java.util.Locale locale22 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale24 = new java.util.Locale("hi!");
        java.lang.String str25 = locale24.getVariant();
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.lang.String str27 = locale24.getDisplayVariant(locale26);
        java.lang.String str28 = locale26.toLanguageTag();
        java.lang.String str29 = locale22.getDisplayLanguage(locale26);
        java.util.Set<java.lang.String> strSet30 = locale22.getUnicodeLocaleAttributes();
        java.util.Locale locale31 = java.util.Locale.FRANCE;
        java.util.Random random32 = new java.util.Random();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale31, random32);
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = new java.util.Locale("", "", "");
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.lang.String str41 = locale40.getVariant();
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleKeys();
        java.lang.String str43 = locale38.getDisplayLanguage(locale40);
        java.lang.String str44 = locale38.getLanguage();
        java.lang.String str45 = locale34.getDisplayCountry(locale38);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale50 = new java.util.Locale("", "", "");
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.lang.String str53 = locale52.getVariant();
        java.util.Set<java.lang.String> strSet54 = locale52.getUnicodeLocaleKeys();
        java.lang.String str55 = locale50.getDisplayLanguage(locale52);
        java.lang.String str56 = locale50.getLanguage();
        java.lang.String str57 = locale46.getDisplayCountry(locale50);
        java.lang.String str58 = locale46.getDisplayVariant();
        java.lang.String str59 = locale46.getISO3Language();
        java.util.Locale locale60 = java.util.Locale.JAPANESE;
        java.lang.String str61 = locale60.getDisplayScript();
        java.util.Locale locale62 = java.util.Locale.ITALY;
        java.lang.String str63 = locale62.getDisplayLanguage();
        java.util.Locale locale65 = new java.util.Locale("hi!");
        java.lang.String str66 = locale65.getVariant();
        java.util.Locale locale67 = java.util.Locale.FRANCE;
        java.lang.String str68 = locale65.getDisplayVariant(locale67);
        com.github.javafaker.Faker faker69 = new com.github.javafaker.Faker(locale67);
        java.lang.String str70 = locale67.toLanguageTag();
        java.util.Locale locale74 = new java.util.Locale("Franz\366sisch", "japonais", "en_US");
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale22, locale31, locale34, locale46, locale60, locale62, locale67, locale74 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.Locale locale78 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Locale locale79 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList76);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale24.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr-FR" + "'", str28, "fr-FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "fran\347ais" + "'", str29, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "de");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "deu" + "'", str59, "deu");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "italien" + "'", str63, "italien");
        org.junit.Assert.assertEquals(locale65.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "fr-FR" + "'", str70, "fr-FR");
        org.junit.Assert.assertEquals(locale74.toString(), "franz\366sisch_JAPONAIS_en_US");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(locale78);
        org.junit.Assert.assertNull(locale79);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints((long) (byte) 100);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number6 = faker5.number;
        com.github.javafaker.Number number7 = faker5.number();
        java.lang.String str9 = faker5.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = faker5.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService10;
        com.github.javafaker.Company company12 = faker0.company();
        com.github.javafaker.service.RandomService randomService13 = faker0.randomService;
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-GB" + "'", str9, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(company12);
        org.junit.Assert.assertNotNull(randomService13);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale9 = new java.util.Locale("eng", "x-lvariant-eng");
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale.setDefault(category0, locale10);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale9.toString(), "eng_X-LVARIANT-ENG");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "eng_X-LVARIANT-ENG");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker1.phoneNumber;
        com.github.javafaker.Color color5 = faker1.color();
        com.github.javafaker.Number number6 = faker1.number;
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        int int3 = random1.nextInt((int) (byte) 1);
        java.util.stream.IntStream intStream4 = random1.ints();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Internet internet4 = faker1.internet();
        java.util.Random random5 = new java.util.Random();
        double double6 = random5.nextDouble();
        java.util.stream.IntStream intStream9 = random5.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Code code11 = faker10.code();
        com.github.javafaker.Address address12 = faker10.address;
        com.github.javafaker.DateAndTime dateAndTime13 = faker10.date();
        java.lang.String str15 = faker10.bothify("fran\347ais");
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        java.lang.String str21 = faker17.numerify("");
        com.github.javafaker.Company company22 = faker17.company;
        faker10.company = company22;
        faker1.company = company22;
        com.github.javafaker.Company company25 = faker1.company();
        java.util.Random random26 = new java.util.Random();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Lorem lorem28 = null;
        faker27.lorem = lorem28;
        com.github.javafaker.Color color30 = faker27.color;
        com.github.javafaker.Finance finance31 = faker27.finance();
        com.github.javafaker.Business business32 = faker27.business();
        com.github.javafaker.DateAndTime dateAndTime33 = faker27.dateAndTime;
        com.github.javafaker.PhoneNumber phoneNumber34 = faker27.phoneNumber();
        com.github.javafaker.Internet internet35 = faker27.internet();
        faker1.internet = internet35;
        org.junit.Assert.assertNotNull(internet4);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.10583711781339755d + "'", double6 == 0.10583711781339755d);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fran\347ais" + "'", str15, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(company22);
        org.junit.Assert.assertNotNull(company25);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(finance31);
        org.junit.Assert.assertNotNull(business32);
        org.junit.Assert.assertNotNull(dateAndTime33);
        org.junit.Assert.assertNotNull(phoneNumber34);
        org.junit.Assert.assertNotNull(internet35);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        double double3 = random0.nextDouble();
        int int4 = random0.nextInt();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8042994371104697d + "'", double2 == 0.8042994371104697d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8681563057105596d + "'", double3 == 0.8681563057105596d);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-100852159) + "'", int4 == (-100852159));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.util.Locale locale3 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale3);
        com.github.javafaker.Finance finance13 = faker12.finance();
        java.util.Random random14 = new java.util.Random();
        double double15 = random14.nextDouble();
        java.util.stream.IntStream intStream18 = random14.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Code code20 = faker19.code();
        java.util.Random random21 = new java.util.Random();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem23 = null;
        faker22.lorem = lorem23;
        com.github.javafaker.Internet internet25 = null;
        faker22.internet = internet25;
        java.lang.String str28 = faker22.bothify("");
        com.github.javafaker.Code code29 = null;
        faker22.code = code29;
        com.github.javafaker.DateAndTime dateAndTime31 = faker22.date();
        faker19.dateAndTime = dateAndTime31;
        java.util.Random random33 = new java.util.Random();
        double double34 = random33.nextDouble();
        java.util.stream.IntStream intStream37 = random33.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.Code code39 = faker38.code();
        com.github.javafaker.DateAndTime dateAndTime40 = faker38.date();
        faker19.dateAndTime = dateAndTime40;
        com.github.javafaker.Book book42 = faker19.book();
        java.util.Random random43 = new java.util.Random();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        com.github.javafaker.Lorem lorem45 = null;
        faker44.lorem = lorem45;
        com.github.javafaker.Internet internet47 = null;
        faker44.internet = internet47;
        java.lang.String str50 = faker44.bothify("");
        com.github.javafaker.Code code51 = null;
        faker44.code = code51;
        com.github.javafaker.DateAndTime dateAndTime53 = faker44.date();
        java.util.Random random54 = new java.util.Random();
        com.github.javafaker.Faker faker55 = new com.github.javafaker.Faker(random54);
        com.github.javafaker.DateAndTime dateAndTime56 = null;
        faker55.dateAndTime = dateAndTime56;
        com.github.javafaker.Business business58 = faker55.business;
        faker44.business = business58;
        com.github.javafaker.Code code60 = faker44.code();
        java.util.Random random61 = new java.util.Random();
        com.github.javafaker.Faker faker62 = new com.github.javafaker.Faker(random61);
        com.github.javafaker.Lorem lorem63 = null;
        faker62.lorem = lorem63;
        com.github.javafaker.Color color65 = faker62.color;
        com.github.javafaker.Finance finance66 = faker62.finance();
        com.github.javafaker.PhoneNumber phoneNumber67 = faker62.phoneNumber();
        com.github.javafaker.Options options68 = faker62.options();
        faker44.options = options68;
        faker19.options = options68;
        faker12.options = options68;
        com.github.javafaker.Finance finance72 = faker12.finance;
        com.github.javafaker.Business business73 = faker12.business();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(finance13);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6145930391517688d + "'", double15 == 0.6145930391517688d);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(dateAndTime31);
// flaky:         org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.9074686447367963d + "'", double34 == 0.9074686447367963d);
        org.junit.Assert.assertNotNull(intStream37);
        org.junit.Assert.assertNotNull(code39);
        org.junit.Assert.assertNotNull(dateAndTime40);
        org.junit.Assert.assertNotNull(book42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(dateAndTime53);
        org.junit.Assert.assertNotNull(business58);
        org.junit.Assert.assertNull(code60);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(finance66);
        org.junit.Assert.assertNotNull(phoneNumber67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(finance72);
        org.junit.Assert.assertNotNull(business73);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Color color7 = faker5.color;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        java.util.Random random12 = new java.util.Random();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Lorem lorem14 = null;
        faker13.lorem = lorem14;
        com.github.javafaker.Internet internet16 = null;
        faker13.internet = internet16;
        java.lang.String str19 = faker13.bothify("");
        com.github.javafaker.Code code20 = null;
        faker13.code = code20;
        com.github.javafaker.Number number22 = faker13.number();
        faker9.number = number22;
        com.github.javafaker.Color color24 = faker9.color();
        faker5.color = color24;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12161554835124933d + "'", double1 == 0.12161554835124933d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        java.util.stream.IntStream intStream9 = random0.ints(4406628851294932275L, (int) (short) 10, (int) 'x');
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.606564769833303d + "'", double1 == 0.606564769833303d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.07770743963031623d + "'", double5 == 0.07770743963031623d);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.util.Locale locale3 = new java.util.Locale("fr", "italien", "it");
        org.junit.Assert.assertEquals(locale3.toString(), "fr_ITALIEN_it");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("english (united kingdom)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: english (united kingdom) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.util.Locale locale2 = new java.util.Locale("fra", "Chinese (Taiwan)");
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.lang.String str11 = locale10.getVariant();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.lang.String str13 = locale10.getDisplayVariant(locale12);
        java.lang.String str14 = locale12.getCountry();
        java.lang.String str15 = locale12.getDisplayLanguage();
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale12.getDisplayScript(locale16);
        java.util.Random random18 = new java.util.Random();
        double double19 = random18.nextDouble();
        int int21 = random18.nextInt(1);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random18);
        double double23 = random18.nextDouble();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale12, random18);
        java.lang.String str25 = locale4.getDisplayScript(locale12);
        java.lang.String str26 = locale2.getDisplayName(locale12);
        org.junit.Assert.assertEquals(locale2.toString(), "fra_CHINESE (TAIWAN)");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FR" + "'", str14, "FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "French" + "'", str15, "French");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.16539641720863874d + "'", double19 == 0.16539641720863874d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.029450015458291845d + "'", double23 == 0.029450015458291845d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fra (CHINESE (TAIWAN))" + "'", str26, "fra (CHINESE (TAIWAN))");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Address address6 = faker1.address;
        com.github.javafaker.Options options7 = faker1.options();
        com.github.javafaker.Finance finance8 = faker1.finance;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number10 = faker9.number;
        com.github.javafaker.Number number11 = faker9.number();
        java.lang.String str13 = faker9.bothify("en-GB");
        com.github.javafaker.Name name14 = faker9.name();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code16 = null;
        faker15.code = code16;
        com.github.javafaker.Lorem lorem18 = faker15.lorem();
        faker9.lorem = lorem18;
        java.util.Random random20 = new java.util.Random();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Lorem lorem22 = null;
        faker21.lorem = lorem22;
        java.lang.String str25 = faker21.numerify("");
        java.util.Random random26 = new java.util.Random();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Lorem lorem28 = null;
        faker27.lorem = lorem28;
        com.github.javafaker.Color color30 = faker27.color;
        faker21.color = color30;
        com.github.javafaker.PhoneNumber phoneNumber32 = faker21.phoneNumber;
        faker9.phoneNumber = phoneNumber32;
        java.util.Locale locale35 = new java.util.Locale("hi!");
        java.lang.String str36 = locale35.getVariant();
        java.util.Locale locale37 = java.util.Locale.FRANCE;
        java.lang.String str38 = locale35.getDisplayVariant(locale37);
        java.lang.String str39 = locale37.getCountry();
        java.util.Random random40 = new java.util.Random();
        double double41 = random40.nextDouble();
        int int43 = random40.nextInt(1);
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(locale37, random40);
        com.github.javafaker.Internet internet45 = faker44.internet();
        faker9.internet = internet45;
        com.github.javafaker.Company company47 = faker9.company;
        java.util.Random random48 = new java.util.Random();
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(random48);
        com.github.javafaker.Lorem lorem50 = null;
        faker49.lorem = lorem50;
        com.github.javafaker.Internet internet52 = null;
        faker49.internet = internet52;
        java.lang.String str55 = faker49.bothify("");
        com.github.javafaker.Name name56 = faker49.name;
        com.github.javafaker.Internet internet57 = faker49.internet();
        com.github.javafaker.Address address58 = faker49.address();
        faker9.address = address58;
        java.util.Locale locale61 = new java.util.Locale("hi!");
        java.lang.String str62 = locale61.getVariant();
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.lang.String str64 = locale61.getDisplayVariant(locale63);
        java.lang.String str65 = locale63.getCountry();
        java.lang.String str66 = locale63.getDisplayLanguage();
        java.util.Locale locale67 = java.util.Locale.JAPANESE;
        java.lang.String str68 = locale63.getDisplayScript(locale67);
        java.lang.String str69 = locale67.getDisplayLanguage();
        java.util.Random random71 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream74 = random71.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker75 = new com.github.javafaker.Faker(locale67, random71);
        com.github.javafaker.Business business76 = faker75.business();
        com.github.javafaker.service.FakeValuesService fakeValuesService77 = faker75.fakeValuesService;
        faker9.fakeValuesService = fakeValuesService77;
        faker1.fakeValuesService = fakeValuesService77;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-GB" + "'", str13, "en-GB");
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(lorem18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(phoneNumber32);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "FR" + "'", str39, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.6729028878781855d + "'", double41 == 0.6729028878781855d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(internet45);
        org.junit.Assert.assertNotNull(company47);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(name56);
        org.junit.Assert.assertNull(internet57);
        org.junit.Assert.assertNotNull(address58);
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "FR" + "'", str65, "FR");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "French" + "'", str66, "French");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Japanese" + "'", str69, "Japanese");
        org.junit.Assert.assertNotNull(longStream74);
        org.junit.Assert.assertNotNull(business76);
        org.junit.Assert.assertNotNull(fakeValuesService77);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Color color7 = faker5.color;
        java.util.Random random9 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Code code11 = faker10.code;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker10.phoneNumber();
        faker5.phoneNumber = phoneNumber12;
        com.github.javafaker.Internet internet14 = faker5.internet();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6337436313715625d + "'", double1 == 0.6337436313715625d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(internet14);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        com.github.javafaker.Book book12 = faker1.book;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.lang.String str9 = locale3.getLanguage();
        java.util.Set<java.lang.String> strSet10 = locale3.getUnicodeLocaleAttributes();
        boolean boolean11 = locale3.hasExtensions();
        java.lang.String str12 = locale3.getDisplayScript();
        java.lang.String str13 = locale3.getDisplayLanguage();
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.lang.String str16 = locale14.getVariant();
        java.util.Set<java.lang.Character> charSet17 = locale14.getExtensionKeys();
        java.lang.String str18 = locale3.getDisplayScript(locale14);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        double double6 = random0.nextDouble();
        double double7 = random0.nextGaussian();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9126017836260234d + "'", double1 == 0.9126017836260234d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7976798599825407d + "'", double5 == 0.7976798599825407d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.725566923999284d + "'", double6 == 0.725566923999284d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.20875197656318056d) + "'", double7 == (-0.20875197656318056d));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.util.Locale locale1 = new java.util.Locale("chinese (taiwan)");
        org.junit.Assert.assertEquals(locale1.toString(), "chinese (taiwan)");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("english (united kingdom)", 0.7544800016038189d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united kingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.util.Locale locale2 = new java.util.Locale("en-GB", "fr_FR");
        org.junit.Assert.assertEquals(locale2.toString(), "en-gb_FR_FR");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Franz\366sisch", 0.36559560304110084d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franzo?sisch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.util.Locale locale2 = new java.util.Locale("Chinese (Taiwan)", "fra");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.lang.Object obj8 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese (taiwan)_FRA");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chinese (taiwan) (FRA)" + "'", str7, "chinese (taiwan) (FRA)");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "chinese (taiwan)_FRA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "chinese (taiwan)_FRA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "chinese (taiwan)_FRA");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Options options3 = faker0.options;
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(randomService4);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        com.github.javafaker.service.RandomService randomService7 = faker1.randomService;
        com.github.javafaker.Book book8 = faker1.book();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        com.github.javafaker.Business business11 = faker0.business();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker0.phoneNumber;
        com.github.javafaker.Number number13 = faker0.number();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(number13);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet6 = faker5.internet;
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getVariant();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        java.lang.String str12 = locale10.getCountry();
        java.util.Random random13 = new java.util.Random();
        double double14 = random13.nextDouble();
        int int16 = random13.nextInt(1);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale10, random13);
        com.github.javafaker.Business business18 = faker17.business;
        java.lang.String str20 = faker17.bothify("en-US");
        com.github.javafaker.Number number21 = faker17.number();
        java.lang.String str23 = faker17.numerify("");
        java.lang.String str25 = faker17.letterify("x-lvariant-eng");
        com.github.javafaker.Code code26 = faker17.code;
        faker5.code = code26;
        java.util.Random random28 = new java.util.Random();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Lorem lorem30 = null;
        faker29.lorem = lorem30;
        com.github.javafaker.Color color32 = faker29.color;
        com.github.javafaker.Finance finance33 = faker29.finance();
        com.github.javafaker.Business business34 = faker29.business();
        com.github.javafaker.Address address35 = faker29.address();
        faker5.address = address35;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14029439144684186d + "'", double1 == 0.14029439144684186d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FR" + "'", str12, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5954494983889025d + "'", double14 == 0.5954494983889025d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(business18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en-US" + "'", str20, "en-US");
        org.junit.Assert.assertNotNull(number21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "x-lvariant-eng" + "'", str25, "x-lvariant-eng");
        org.junit.Assert.assertNotNull(code26);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(finance33);
        org.junit.Assert.assertNotNull(business34);
        org.junit.Assert.assertNotNull(address35);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.IntStream intStream3 = random1.ints();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles(10L);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet5 = faker4.internet();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Book book12 = faker11.book();
        faker6.book = book12;
        com.github.javafaker.Address address14 = faker6.address;
        faker4.address = address14;
        com.github.javafaker.Address address16 = faker4.address();
        com.github.javafaker.Company company17 = faker4.company;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.426388606959166d + "'", double1 == 0.426388606959166d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(internet5);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.04259706503534377d + "'", double8 == 0.04259706503534377d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(book12);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(company17);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale locale8 = new java.util.Locale("fra (FR-FR)");
        java.lang.String str9 = locale5.getDisplayCountry(locale8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale8.toString(), "fra (fr-fr)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.Locale locale2 = new java.util.Locale("English (United Kingdom)", "French (France)");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "english (united kingdom)_FRENCH (FRANCE)");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.getISO3Language();
        boolean boolean4 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        com.github.javafaker.Options options8 = faker5.options();
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        com.github.javafaker.Color color13 = faker10.color;
        com.github.javafaker.Finance finance14 = faker10.finance();
        com.github.javafaker.Address address15 = faker10.address;
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        java.lang.String str21 = faker17.numerify("");
        com.github.javafaker.Company company22 = faker17.company;
        com.github.javafaker.Number number23 = faker17.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService24 = faker17.fakeValuesService;
        faker10.fakeValuesService = fakeValuesService24;
        com.github.javafaker.Color color26 = faker10.color();
        faker5.color = color26;
        com.github.javafaker.Address address28 = faker5.address();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8967630937016706d + "'", double1 == 0.8967630937016706d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(company22);
        org.junit.Assert.assertNotNull(number23);
        org.junit.Assert.assertNotNull(fakeValuesService24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(address28);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(10L);
        java.util.stream.DoubleStream doubleStream7 = random0.doubles();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9715488096683279d + "'", double1 == 0.9715488096683279d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number8 = faker7.number();
        faker0.number = number8;
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Lorem lorem12 = null;
        faker11.lorem = lorem12;
        com.github.javafaker.Internet internet14 = null;
        faker11.internet = internet14;
        java.lang.String str17 = faker11.bothify("");
        com.github.javafaker.Name name18 = faker11.name;
        faker0.name = name18;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(name18);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getVariant();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        java.lang.String str12 = locale10.toLanguageTag();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale10.getDisplayScript(locale17);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr-FR" + "'", str12, "fr-FR");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        java.lang.String str16 = faker12.numerify("");
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        com.github.javafaker.Color color21 = faker18.color;
        faker12.color = color21;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker12.phoneNumber;
        faker0.phoneNumber = phoneNumber23;
        com.github.javafaker.Code code25 = faker0.code();
        com.github.javafaker.Color color26 = faker0.color();
        java.util.Random random27 = new java.util.Random();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Lorem lorem29 = null;
        faker28.lorem = lorem29;
        java.lang.String str32 = faker28.numerify("");
        com.github.javafaker.Company company33 = faker28.company;
        faker0.company = company33;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(code25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(company33);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("hi!", "en-US");
        java.lang.String str10 = locale3.getDisplayName(locale9);
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getVariant();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = locale12.getDisplayVariant(locale14);
        java.lang.String str16 = locale14.getCountry();
        java.lang.String str17 = locale14.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.lang.String str19 = locale14.getDisplayScript(locale18);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale14.getDisplayCountry(locale20);
        java.util.Set<java.lang.String> strSet22 = locale14.getUnicodeLocaleAttributes();
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.lang.String str30 = locale29.getVariant();
        java.util.Set<java.lang.String> strSet31 = locale29.getUnicodeLocaleKeys();
        java.lang.String str32 = locale27.getDisplayLanguage(locale29);
        java.lang.String str33 = locale27.getLanguage();
        java.lang.String str34 = locale23.getDisplayCountry(locale27);
        java.lang.String str35 = locale14.getDisplayLanguage(locale23);
        java.lang.String str36 = locale9.getDisplayScript(locale23);
        java.lang.String str37 = locale23.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_EN-US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (France)" + "'", str10, "French (France)");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FR" + "'", str16, "FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "France" + "'", str21, "France");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Franz\366sisch" + "'", str35, "Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        com.github.javafaker.Address address7 = faker1.address();
        java.lang.String str9 = faker1.letterify("hi!");
        com.github.javafaker.Name name10 = faker1.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.Name name5 = faker1.name;
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Internet internet10 = null;
        faker7.internet = internet10;
        java.lang.String str13 = faker7.bothify("");
        com.github.javafaker.Book book14 = faker7.book();
        faker1.book = book14;
        com.github.javafaker.Code code16 = faker1.code;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(code16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Random random11 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream14 = random11.longs((long) (short) 0, (long) (byte) 1);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random11);
        java.util.Set<java.lang.String> strSet16 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale locale19 = new java.util.Locale("fr", "");
        java.lang.String str20 = locale7.getDisplayName(locale19);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Japanese" + "'", str9, "Japanese");
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "japonais" + "'", str20, "japonais");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number10 = faker9.number;
        com.github.javafaker.Number number11 = faker9.number();
        java.lang.String str13 = faker9.bothify("en-GB");
        com.github.javafaker.Name name14 = faker9.name();
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.lang.String str17 = locale16.getVariant();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.lang.String str19 = locale16.getDisplayVariant(locale18);
        java.lang.String str20 = locale18.getCountry();
        java.util.Random random21 = new java.util.Random();
        double double22 = random21.nextDouble();
        int int24 = random21.nextInt(1);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale18, random21);
        com.github.javafaker.Business business26 = faker25.business;
        java.lang.String str28 = faker25.bothify("en-US");
        com.github.javafaker.Number number29 = faker25.number();
        java.lang.String str31 = faker25.numerify("");
        java.util.Random random32 = new java.util.Random();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random32);
        com.github.javafaker.Lorem lorem34 = null;
        faker33.lorem = lorem34;
        java.lang.String str37 = faker33.numerify("");
        java.util.Random random38 = new java.util.Random();
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random38);
        com.github.javafaker.Lorem lorem40 = null;
        faker39.lorem = lorem40;
        com.github.javafaker.Color color42 = faker39.color;
        faker33.color = color42;
        faker25.color = color42;
        faker9.color = color42;
        java.util.Random random46 = new java.util.Random();
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(random46);
        com.github.javafaker.Lorem lorem48 = null;
        faker47.lorem = lorem48;
        java.lang.String str51 = faker47.numerify("");
        com.github.javafaker.Company company52 = faker47.company;
        com.github.javafaker.Number number53 = faker47.number();
        faker9.number = number53;
        faker1.number = number53;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-GB" + "'", str13, "en-GB");
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FR" + "'", str20, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.08648238466210867d + "'", double22 == 0.08648238466210867d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(business26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en-US" + "'", str28, "en-US");
        org.junit.Assert.assertNotNull(number29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(company52);
        org.junit.Assert.assertNotNull(number53);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr_FR" + "'", str3, "fr_FR");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.service.RandomService randomService3 = faker2.randomService;
        com.github.javafaker.Number number4 = faker2.number();
        org.junit.Assert.assertNotNull(randomService3);
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextDouble();
        double double6 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles(0.5353098109072375d, 0.7368204893875002d);
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4911474147410865d + "'", double1 == 0.4911474147410865d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5770030216318041d + "'", double5 == 0.5770030216318041d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3361883981160536d + "'", double6 == 0.3361883981160536d);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        int int4 = random1.nextInt(1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book6 = faker5.book();
        faker0.book = book6;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.Internet internet12 = null;
        faker9.internet = internet12;
        java.lang.String str15 = faker9.bothify("");
        com.github.javafaker.Code code16 = null;
        faker9.code = code16;
        com.github.javafaker.DateAndTime dateAndTime18 = faker9.date();
        faker0.dateAndTime = dateAndTime18;
        java.util.Random random20 = new java.util.Random();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Lorem lorem22 = null;
        faker21.lorem = lorem22;
        com.github.javafaker.PhoneNumber phoneNumber24 = faker21.phoneNumber;
        com.github.javafaker.Address address25 = faker21.address();
        com.github.javafaker.Internet internet26 = faker21.internet;
        faker0.internet = internet26;
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7093697330331853d + "'", double2 == 0.7093697330331853d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(phoneNumber24);
        org.junit.Assert.assertNotNull(address25);
        org.junit.Assert.assertNotNull(internet26);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.setScript("");
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.getDisplayScript();
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale18 = java.util.Locale.getDefault(category0);
        java.lang.String str19 = locale18.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setExtension('#', "fr-fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder7.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setLanguage("en-us (ENGLISH (UNITED KINGDOM))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: en-us (ENGLISH (UNITED KINGDOM)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.util.Locale locale1 = new java.util.Locale("TW");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "tw");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tw" + "'", str2, "tw");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", (double) (byte) 0);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-fr" + "'", str3, "fr-fr");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr-fr" + "'", str5, "fr-fr");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Random random10 = new java.util.Random(6785130368950820155L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale8, random10);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.util.Locale locale2 = new java.util.Locale("fr_FR", "Italian");
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_ITALIAN");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italien", 0.4530635358173125d);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str2 = locale0.getVariant();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.Locale locale2 = new java.util.Locale("en-us (ENGLISH (UNITED KINGDOM))", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "en-us (english (united kingdom))");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setExtension(' ', "japonais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        com.github.javafaker.Business business12 = faker10.business;
        com.github.javafaker.Business business13 = faker10.business();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5841221901819039d + "'", double7 == 0.5841221901819039d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(business13);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        com.github.javafaker.Color color15 = faker12.color;
        com.github.javafaker.Finance finance16 = faker12.finance();
        com.github.javafaker.Address address17 = faker12.address;
        com.github.javafaker.Options options18 = faker12.options();
        com.github.javafaker.Finance finance19 = faker12.finance;
        com.github.javafaker.Options options20 = faker12.options;
        faker10.options = options20;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.49965414481536885d + "'", double7 == 0.49965414481536885d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(finance16);
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(finance19);
        org.junit.Assert.assertNotNull(options20);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles();
        java.util.stream.IntStream intStream4 = random0.ints((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random0.doubles(0.9484865455756918d, 0.38543640525157874d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40376574669615983d + "'", double1 == 0.40376574669615983d);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setScript("en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.util.Random random1 = new java.util.Random((long) 100);
        double double2 = random1.nextGaussian();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color4 = faker3.color();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en-US");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Book book3 = faker0.book;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        faker0.randomService = randomService6;
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(randomService6);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.util.Locale locale2 = new java.util.Locale("hi!", "French");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_FRENCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Code code5 = faker4.code;
        com.github.javafaker.service.RandomService randomService6 = faker4.randomService;
        java.lang.String str8 = faker4.letterify("und");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-GB" + "'", str1, "en-GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United Kingdom)" + "'", str2, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange4 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList32, filteringMode33);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap36);
        java.util.Collection<java.lang.String> strCollection38 = null;
        java.util.Locale.FilteringMode filteringMode39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strCollection38, filteringMode39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode33.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeList37);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        java.lang.String str16 = faker12.numerify("");
        java.util.Random random17 = new java.util.Random();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Lorem lorem19 = null;
        faker18.lorem = lorem19;
        com.github.javafaker.Color color21 = faker18.color;
        faker12.color = color21;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker12.phoneNumber;
        faker0.phoneNumber = phoneNumber23;
        com.github.javafaker.Code code25 = faker0.code();
        java.util.Random random26 = new java.util.Random();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Lorem lorem28 = null;
        faker27.lorem = lorem28;
        java.lang.String str31 = faker27.numerify("");
        java.util.Random random32 = new java.util.Random();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random32);
        com.github.javafaker.Lorem lorem34 = null;
        faker33.lorem = lorem34;
        com.github.javafaker.Color color36 = faker33.color;
        faker27.color = color36;
        java.lang.String str39 = faker27.bothify("fr_fr_HI!_eng");
        java.util.Random random40 = new java.util.Random();
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(random40);
        com.github.javafaker.Lorem lorem42 = null;
        faker41.lorem = lorem42;
        com.github.javafaker.Internet internet44 = null;
        faker41.internet = internet44;
        java.lang.String str47 = faker41.bothify("");
        com.github.javafaker.Name name48 = faker41.name;
        com.github.javafaker.Internet internet49 = faker41.internet();
        com.github.javafaker.Number number50 = faker41.number();
        faker27.number = number50;
        faker0.number = number50;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(code25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "fr_fr_HI!_eng" + "'", str39, "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(name48);
        org.junit.Assert.assertNull(internet49);
        org.junit.Assert.assertNotNull(number50);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.util.Locale locale1 = new java.util.Locale("it");
        java.lang.String str2 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("jpn", 0.6582316333380164d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        java.util.stream.IntStream intStream3 = random0.ints();
        boolean boolean4 = random0.nextBoolean();
        float float5 = random0.nextFloat();
        int int6 = random0.nextInt();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7919812619044678d + "'", double2 == 0.7919812619044678d);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.19271433f + "'", float5 == 0.19271433f);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1306293597 + "'", int6 == 1306293597);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        com.github.javafaker.Internet internet8 = null;
        faker5.internet = internet8;
        java.lang.String str11 = faker5.bothify("");
        com.github.javafaker.Code code12 = null;
        faker5.code = code12;
        com.github.javafaker.Number number14 = faker5.number();
        faker1.number = number14;
        java.lang.String str17 = faker1.numerify("German");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "German" + "'", str17, "German");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.util.Random random1 = new java.util.Random((long) (-1));
        java.util.stream.LongStream longStream5 = random1.longs((long) 1133645844, (long) (-1347056262), (long) (-785009243));
        java.util.stream.DoubleStream doubleStream7 = random1.doubles(3309070468795520424L);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setScript("en-us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en-us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        boolean boolean4 = random1.nextBoolean();
        double double5 = random1.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Options options7 = faker6.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9725596278430494d + "'", double5 == 0.9725596278430494d);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.util.Random random1 = new java.util.Random(10L);
        float float2 = random1.nextFloat();
        int int3 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73043025f + "'", float2 == 0.73043025f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1913984760 + "'", int3 == 1913984760);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
        com.github.javafaker.Internet internet6 = faker5.internet();
        com.github.javafaker.Business business7 = faker5.business();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setVariant("hi! (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream6 = random1.ints((-938122935), 19);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.Internet internet12 = null;
        faker9.internet = internet12;
        java.lang.String str15 = faker9.bothify("");
        com.github.javafaker.Business business16 = faker9.business;
        faker5.business = business16;
        com.github.javafaker.Lorem lorem18 = faker5.lorem;
        com.github.javafaker.DateAndTime dateAndTime19 = faker5.date();
        java.util.Random random20 = new java.util.Random();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Lorem lorem22 = null;
        faker21.lorem = lorem22;
        java.lang.String str25 = faker21.numerify("");
        com.github.javafaker.Company company26 = faker21.company;
        com.github.javafaker.Number number27 = faker21.number();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number29 = faker28.number;
        com.github.javafaker.Business business30 = faker28.business();
        java.util.Random random31 = new java.util.Random();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Lorem lorem33 = null;
        faker32.lorem = lorem33;
        com.github.javafaker.Color color35 = faker32.color;
        com.github.javafaker.Finance finance36 = faker32.finance();
        com.github.javafaker.Address address37 = faker32.address;
        faker28.address = address37;
        faker21.address = address37;
        faker5.address = address37;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8096679728442764d + "'", double1 == 0.8096679728442764d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(lorem18);
        org.junit.Assert.assertNotNull(dateAndTime19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(company26);
        org.junit.Assert.assertNotNull(number27);
        org.junit.Assert.assertNotNull(number29);
        org.junit.Assert.assertNotNull(business30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(finance36);
        org.junit.Assert.assertNotNull(address37);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.util.Locale locale1 = new java.util.Locale("x-lvariant-eng");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale5 = new java.util.Locale("fr-x-lvariant-eng");
        java.util.Locale locale8 = new java.util.Locale("en-US", "en");
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = locale5.getDisplayScript(locale8);
        java.lang.String str11 = locale2.getDisplayVariant(locale8);
        org.junit.Assert.assertEquals(locale1.toString(), "x-lvariant-eng");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-lvariant-eng" + "'", str3, "x-lvariant-eng");
        org.junit.Assert.assertEquals(locale5.toString(), "fr-x-lvariant-eng");
        org.junit.Assert.assertEquals(locale8.toString(), "en-us_EN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-us" + "'", str9, "en-us");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Random random9 = new java.util.Random();
        double double10 = random9.nextDouble();
        int int12 = random9.nextInt(1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random9);
        double double14 = random9.nextDouble();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale3, random9);
        java.util.stream.LongStream longStream16 = random9.longs();
        long long17 = random9.nextLong();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5679605786822399d + "'", double10 == 0.5679605786822399d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3710255013133662d + "'", double14 == 0.3710255013133662d);
        org.junit.Assert.assertNotNull(longStream16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-50769653685806655L) + "'", long17 == (-50769653685806655L));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Address address6 = faker1.address;
        com.github.javafaker.service.RandomService randomService7 = faker1.randomService;
        com.github.javafaker.Name name8 = faker1.name;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertNotNull(name8);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale3.getDisplayCountry(locale9);
        java.lang.String str11 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French (France)" + "'", str11, "French (France)");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.util.Random random1 = new java.util.Random((long) (-2088678643));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.util.Locale locale3 = new java.util.Locale("hi! (EN-US,en-US)", "und", "fr_FR_FR");
        org.junit.Assert.assertEquals(locale3.toString(), "hi! (en-us,en-us)_UND_fr_FR_FR");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Canada", 0.7105720708090496d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.util.Locale locale1 = new java.util.Locale("en");
        java.util.Random random2 = new java.util.Random();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        double double4 = random2.nextGaussian();
        java.util.stream.IntStream intStream5 = random2.ints();
        boolean boolean6 = random2.nextBoolean();
        float float7 = random2.nextFloat();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random2);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.080769786068945d + "'", double4 == 2.080769786068945d);
        org.junit.Assert.assertNotNull(intStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.31153864f + "'", float7 == 0.31153864f);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.util.Locale locale1 = new java.util.Locale("fr_FR");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleKeys();
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        java.util.Set<java.lang.String> strSet11 = locale8.getUnicodeLocaleKeys();
        java.lang.String str12 = locale4.getDisplayCountry(locale8);
        java.lang.String str13 = locale1.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!_FRENCH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        byte[] byteArray3 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray3);
        double double5 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[115]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.8673886034754649d) + "'", double5 == (-0.8673886034754649d));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale9 = new java.util.Locale("fra", "fr-fr");
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Locale.setDefault(category0, locale9);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_fr");
        org.junit.Assert.assertEquals(locale5.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals(locale9.toString(), "fra_FR-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", 0.18383286203839433d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-fr" + "'", str3, "fr-fr");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        int int4 = random1.nextInt(1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book6 = faker5.book();
        faker0.book = book6;
        com.github.javafaker.Address address8 = faker0.address;
        com.github.javafaker.Book book9 = faker0.book();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9512224639849804d + "'", double2 == 0.9512224639849804d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet5 = faker4.internet();
        com.github.javafaker.Code code6 = faker4.code();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5632162176850929d + "'", double1 == 0.5632162176850929d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        float float5 = random1.nextFloat();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.38156074f + "'", float5 == 0.38156074f);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Finance finance3 = faker2.finance;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker2.phoneNumber;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number6 = faker5.number;
        com.github.javafaker.Number number7 = faker5.number();
        java.lang.String str9 = faker5.bothify("en-GB");
        com.github.javafaker.Book book10 = faker5.book();
        com.github.javafaker.DateAndTime dateAndTime11 = faker5.dateAndTime;
        com.github.javafaker.Finance finance12 = faker5.finance();
        faker2.finance = finance12;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker2.fakeValuesService;
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-GB" + "'", str9, "en-GB");
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(fakeValuesService14);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.setScript("");
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale1.getDisplayCountry(locale6);
        java.lang.Object obj8 = locale6.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.util.Set<java.lang.Character> charSet9 = locale5.getExtensionKeys();
        java.lang.String str10 = locale5.getVariant();
        java.lang.Object obj11 = locale5.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.util.Random random1 = new java.util.Random(1L);
        double double2 = random1.nextGaussian();
        long long3 = random1.nextLong();
        java.util.stream.LongStream longStream7 = random1.longs(100L, (long) (-1167796541), (-1L));
        java.util.stream.LongStream longStream8 = random1.longs();
        int int9 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.561581040188955d + "'", double2 == 1.561581040188955d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3831662765844904176L + "'", long3 == 3831662765844904176L);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1429008869 + "'", int9 == 1429008869);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1);
        java.lang.String str5 = locale1.getDisplayVariant();
        java.lang.String str6 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("chinese (taiwan) (FRA)");
        java.lang.String str9 = locale1.getDisplayScript(locale8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale8.toString(), "chinese (taiwan) (fra)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.util.Locale locale3 = new java.util.Locale("x-lvariant-eng", "", "");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str7 = locale3.getDisplayCountry(locale5);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale8, random9);
        java.util.stream.DoubleStream doubleStream11 = random9.doubles();
        boolean boolean12 = random9.nextBoolean();
        double double13 = random9.nextGaussian();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random9);
        int int16 = random9.nextInt(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale3, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: x-lvariant-eng could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "x-lvariant-eng");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr_fr" + "'", str6, "fr_fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.35194552735226237d) + "'", double13 == (-0.35194552735226237d));
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 90 + "'", int16 == 90);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("en-US", "en");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = new java.util.Locale("fr_FR");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_EN");
        org.junit.Assert.assertEquals(locale8.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_fr");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setLanguage("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fr_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number11 = faker10.number;
        faker1.number = number11;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker1.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker1.phoneNumber;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = faker1.resolve("italian");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(phoneNumber14);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Number number6 = faker1.number;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        java.lang.String str12 = faker8.numerify("hi!");
        com.github.javafaker.Lorem lorem13 = faker8.lorem;
        java.util.Random random14 = new java.util.Random();
        double double15 = random14.nextDouble();
        int int17 = random14.nextInt(1);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.service.RandomService randomService19 = faker18.randomService;
        faker8.randomService = randomService19;
        com.github.javafaker.Finance finance21 = faker8.finance();
        com.github.javafaker.Lorem lorem22 = faker8.lorem();
        com.github.javafaker.PhoneNumber phoneNumber23 = faker8.phoneNumber();
        com.github.javafaker.Company company24 = faker8.company();
        faker1.company = company24;
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(lorem13);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8515977108836166d + "'", double15 == 0.8515977108836166d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(randomService19);
        org.junit.Assert.assertNotNull(finance21);
        org.junit.Assert.assertNull(lorem22);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(company24);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        float float11 = random6.nextFloat();
        int int12 = random6.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random6.doubles();
        java.util.stream.LongStream longStream15 = random6.longs((long) 10);
        long long16 = random6.nextLong();
        java.util.stream.LongStream longStream18 = random6.longs((long) 33);
        java.util.stream.IntStream intStream20 = random6.ints((long) 'x');
        double double21 = random6.nextDouble();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3829191066424803d + "'", double7 == 0.3829191066424803d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.9426315f + "'", float11 == 0.9426315f);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 959194146 + "'", int12 == 959194146);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3947846206115229005L) + "'", long16 == (-3947846206115229005L));
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(intStream20);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9091213972473018d + "'", double21 == 0.9091213972473018d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("ja", "Italian");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Color color6 = faker1.color;
        com.github.javafaker.Business business7 = faker1.business();
        com.github.javafaker.DateAndTime dateAndTime8 = faker1.date();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.util.Locale locale3 = new java.util.Locale("fran\347ais", "", "japonais");
        java.lang.String str4 = locale3.getLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "fran\347ais__japonais");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais" + "'", str4, "fran\347ais");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.Locale locale2 = new java.util.Locale("hi!", "French");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_FRENCH");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_FRENCH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        java.lang.String str8 = faker0.bothify("Canada");
        com.github.javafaker.Book book9 = faker0.book;
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Lorem lorem12 = null;
        faker11.lorem = lorem12;
        java.util.Random random14 = new java.util.Random();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Lorem lorem16 = null;
        faker15.lorem = lorem16;
        java.lang.String str19 = faker15.numerify("");
        com.github.javafaker.Company company20 = faker15.company;
        com.github.javafaker.Number number21 = faker15.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker15.fakeValuesService;
        faker11.fakeValuesService = fakeValuesService22;
        java.util.Random random24 = new java.util.Random();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Lorem lorem26 = null;
        faker25.lorem = lorem26;
        java.util.Random random28 = new java.util.Random();
        double double29 = random28.nextDouble();
        java.util.stream.IntStream intStream32 = random28.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Code code34 = faker33.code();
        faker25.code = code34;
        com.github.javafaker.Lorem lorem36 = faker25.lorem();
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker();
        java.util.Random random38 = new java.util.Random();
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random38);
        com.github.javafaker.Lorem lorem40 = null;
        faker39.lorem = lorem40;
        com.github.javafaker.PhoneNumber phoneNumber42 = faker39.phoneNumber;
        faker37.phoneNumber = phoneNumber42;
        com.github.javafaker.Options options44 = faker37.options();
        java.util.Random random45 = new java.util.Random();
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker(random45);
        com.github.javafaker.Lorem lorem47 = null;
        faker46.lorem = lorem47;
        java.lang.String str50 = faker46.numerify("");
        com.github.javafaker.Company company51 = faker46.company;
        com.github.javafaker.Number number52 = faker46.number();
        com.github.javafaker.PhoneNumber phoneNumber53 = faker46.phoneNumber;
        com.github.javafaker.Color color54 = faker46.color;
        faker37.color = color54;
        com.github.javafaker.DateAndTime dateAndTime56 = faker37.dateAndTime;
        faker25.dateAndTime = dateAndTime56;
        com.github.javafaker.PhoneNumber phoneNumber58 = faker25.phoneNumber;
        faker11.phoneNumber = phoneNumber58;
        faker0.phoneNumber = phoneNumber58;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Canada" + "'", str8, "Canada");
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertNotNull(number21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
// flaky:         org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.47318959645491887d + "'", double29 == 0.47318959645491887d);
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNotNull(code34);
        org.junit.Assert.assertNull(lorem36);
        org.junit.Assert.assertNotNull(phoneNumber42);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(company51);
        org.junit.Assert.assertNotNull(number52);
        org.junit.Assert.assertNotNull(phoneNumber53);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(dateAndTime56);
        org.junit.Assert.assertNotNull(phoneNumber58);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 0, (long) (byte) 1);
        java.util.Random random6 = new java.util.Random((long) (byte) 1);
        byte[] byteArray8 = new byte[] { (byte) -1 };
        random6.nextBytes(byteArray8);
        random1.nextBytes(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random1.doubles((-4964420948893066024L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-46]");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FR");
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code3 = null;
        faker2.code = code3;
        com.github.javafaker.Lorem lorem5 = faker2.lorem();
        com.github.javafaker.service.RandomService randomService6 = faker2.randomService;
        com.github.javafaker.Lorem lorem7 = null;
        faker2.lorem = lorem7;
        boolean boolean9 = languageRange1.equals((java.lang.Object) faker2);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi! (EN-US,en-US)", 0.3318580795403048d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi! (en-us,en-us)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Name name6 = faker1.name;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.dateAndTime;
        com.github.javafaker.Options options8 = faker1.options;
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Code code5 = faker4.code;
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        com.github.javafaker.Finance finance11 = faker7.finance();
        com.github.javafaker.Address address12 = faker7.address;
        com.github.javafaker.Company company13 = faker7.company;
        faker4.company = company13;
        com.github.javafaker.Finance finance15 = faker4.finance();
        java.util.Random random16 = new java.util.Random();
        double double17 = random16.nextDouble();
        int int19 = random16.nextInt(1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.service.RandomService randomService21 = faker20.randomService;
        java.util.Random random22 = new java.util.Random();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Lorem lorem24 = null;
        faker23.lorem = lorem24;
        com.github.javafaker.Internet internet26 = null;
        faker23.internet = internet26;
        java.lang.String str29 = faker23.bothify("");
        com.github.javafaker.Code code30 = null;
        faker23.code = code30;
        com.github.javafaker.DateAndTime dateAndTime32 = faker23.date();
        faker20.dateAndTime = dateAndTime32;
        faker4.dateAndTime = dateAndTime32;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-GB" + "'", str1, "en-GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United Kingdom)" + "'", str2, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(finance15);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3684697903062606d + "'", double17 == 0.3684697903062606d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(randomService21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(dateAndTime32);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder9.setScript("");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.getISO3Language();
        java.lang.String str16 = locale3.getDisplayCountry(locale14);
        java.util.Locale locale19 = new java.util.Locale("hi!", "TW");
        java.lang.String str20 = locale3.getDisplayName(locale19);
        java.lang.String str21 = locale19.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale19.toString(), "hi!_TW");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "und-TW" + "'", str21, "und-TW");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.PhoneNumber phoneNumber10 = faker7.phoneNumber;
        com.github.javafaker.Color color11 = faker7.color();
        faker0.color = color11;
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Lorem lorem15 = null;
        faker14.lorem = lorem15;
        com.github.javafaker.Color color17 = faker14.color;
        com.github.javafaker.Finance finance18 = faker14.finance();
        com.github.javafaker.Address address19 = faker14.address;
        com.github.javafaker.Options options20 = faker14.options();
        faker0.options = options20;
        com.github.javafaker.Number number22 = faker0.number;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(finance18);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(number22);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("France", strMap17);
        java.util.Locale locale20 = new java.util.Locale("hi!");
        java.lang.String str21 = locale20.getVariant();
        java.util.Set<java.lang.String> strSet22 = locale20.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags(languageRangeList18, (java.util.Collection<java.lang.String>) strSet22);
        java.util.Locale.LanguageRange languageRange26 = new java.util.Locale.LanguageRange("en", 0.46560633866972545d);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] { languageRange26 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList37);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags(languageRangeList18, (java.util.Collection<java.lang.String>) strList37);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange languageRange44 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange46 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] { languageRange44, languageRange46 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList55);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strList63);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.lang.String>) strList71);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strList71);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList74, filteringMode75);
        java.lang.String str77 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap78 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList79 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strMap78);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap81 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList82 = java.util.Locale.LanguageRange.parse("France", strMap81);
        java.util.Locale locale84 = new java.util.Locale("hi!");
        java.lang.String str85 = locale84.getVariant();
        java.util.Set<java.lang.String> strSet86 = locale84.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags(languageRangeList82, (java.util.Collection<java.lang.String>) strSet86);
        java.util.Locale.FilteringMode filteringMode88 = null;
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList87, filteringMode88);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags(languageRangeList41, (java.util.Collection<java.lang.String>) strList87, filteringMode90);
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strList39, filteringMode90);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode75.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(languageRangeList79);
        org.junit.Assert.assertNotNull(languageRangeList82);
        org.junit.Assert.assertEquals(locale84.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode90.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNotNull(strList92);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList24);
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
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        com.github.javafaker.Options options15 = faker10.options;
        com.github.javafaker.Code code16 = faker10.code;
        com.github.javafaker.Lorem lorem17 = faker10.lorem();
        java.util.Locale locale21 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.lang.String str24 = locale23.getVariant();
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = locale23.getDisplayVariant(locale25);
        java.lang.String str27 = locale25.toLanguageTag();
        java.lang.String str28 = locale21.getDisplayLanguage(locale25);
        java.util.Set<java.lang.String> strSet29 = locale21.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale21);
        com.github.javafaker.Finance finance31 = faker30.finance();
        java.util.Random random32 = new java.util.Random();
        double double33 = random32.nextDouble();
        java.util.stream.IntStream intStream36 = random32.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random32);
        com.github.javafaker.Code code38 = faker37.code();
        java.util.Random random39 = new java.util.Random();
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random39);
        com.github.javafaker.Lorem lorem41 = null;
        faker40.lorem = lorem41;
        com.github.javafaker.Internet internet43 = null;
        faker40.internet = internet43;
        java.lang.String str46 = faker40.bothify("");
        com.github.javafaker.Code code47 = null;
        faker40.code = code47;
        com.github.javafaker.DateAndTime dateAndTime49 = faker40.date();
        faker37.dateAndTime = dateAndTime49;
        java.util.Random random51 = new java.util.Random();
        double double52 = random51.nextDouble();
        java.util.stream.IntStream intStream55 = random51.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker(random51);
        com.github.javafaker.Code code57 = faker56.code();
        com.github.javafaker.DateAndTime dateAndTime58 = faker56.date();
        faker37.dateAndTime = dateAndTime58;
        com.github.javafaker.Book book60 = faker37.book();
        java.util.Random random61 = new java.util.Random();
        com.github.javafaker.Faker faker62 = new com.github.javafaker.Faker(random61);
        com.github.javafaker.Lorem lorem63 = null;
        faker62.lorem = lorem63;
        com.github.javafaker.Internet internet65 = null;
        faker62.internet = internet65;
        java.lang.String str68 = faker62.bothify("");
        com.github.javafaker.Code code69 = null;
        faker62.code = code69;
        com.github.javafaker.DateAndTime dateAndTime71 = faker62.date();
        java.util.Random random72 = new java.util.Random();
        com.github.javafaker.Faker faker73 = new com.github.javafaker.Faker(random72);
        com.github.javafaker.DateAndTime dateAndTime74 = null;
        faker73.dateAndTime = dateAndTime74;
        com.github.javafaker.Business business76 = faker73.business;
        faker62.business = business76;
        com.github.javafaker.Code code78 = faker62.code();
        java.util.Random random79 = new java.util.Random();
        com.github.javafaker.Faker faker80 = new com.github.javafaker.Faker(random79);
        com.github.javafaker.Lorem lorem81 = null;
        faker80.lorem = lorem81;
        com.github.javafaker.Color color83 = faker80.color;
        com.github.javafaker.Finance finance84 = faker80.finance();
        com.github.javafaker.PhoneNumber phoneNumber85 = faker80.phoneNumber();
        com.github.javafaker.Options options86 = faker80.options();
        faker62.options = options86;
        faker37.options = options86;
        faker30.options = options86;
        com.github.javafaker.Finance finance90 = faker30.finance;
        faker10.finance = finance90;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.533737524175001d + "'", double7 == 0.533737524175001d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(code16);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fr-FR" + "'", str27, "fr-FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fran\347ais" + "'", str28, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(finance31);
// flaky:         org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.8464117346017908d + "'", double33 == 0.8464117346017908d);
        org.junit.Assert.assertNotNull(intStream36);
        org.junit.Assert.assertNotNull(code38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(dateAndTime49);
// flaky:         org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.013581077150277232d + "'", double52 == 0.013581077150277232d);
        org.junit.Assert.assertNotNull(intStream55);
        org.junit.Assert.assertNotNull(code57);
        org.junit.Assert.assertNotNull(dateAndTime58);
        org.junit.Assert.assertNotNull(book60);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(dateAndTime71);
        org.junit.Assert.assertNotNull(business76);
        org.junit.Assert.assertNull(code78);
        org.junit.Assert.assertNotNull(color83);
        org.junit.Assert.assertNotNull(finance84);
        org.junit.Assert.assertNotNull(phoneNumber85);
        org.junit.Assert.assertNotNull(options86);
        org.junit.Assert.assertNotNull(finance90);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale6.getDisplayLanguage();
        java.lang.String str9 = locale5.getDisplayName(locale6);
        java.lang.String str11 = locale6.getExtension('a');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "German" + "'", str8, "German");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        boolean boolean7 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles(0.07822005176942387d, 0.5991047796680377d);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream5 = random0.longs(7665646735745377215L);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9848327947420153d + "'", double2 == 0.9848327947420153d);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr_fr (HI!,eng)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_fr (hi!,eng)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr_fr", 0.9853107689652847d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_fr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker1.phoneNumber;
        java.util.Random random13 = new java.util.Random();
        double double14 = random13.nextDouble();
        java.util.stream.IntStream intStream17 = random13.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Code code19 = faker18.code();
        com.github.javafaker.Address address20 = faker18.address;
        com.github.javafaker.DateAndTime dateAndTime21 = faker18.date();
        java.lang.String str23 = faker18.bothify("fran\347ais");
        com.github.javafaker.DateAndTime dateAndTime24 = faker18.dateAndTime;
        faker1.dateAndTime = dateAndTime24;
        java.util.Random random26 = new java.util.Random();
        double double27 = random26.nextDouble();
        java.util.stream.IntStream intStream30 = random26.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Code code32 = faker31.code();
        java.util.Random random33 = new java.util.Random();
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random33);
        com.github.javafaker.Lorem lorem35 = null;
        faker34.lorem = lorem35;
        java.lang.String str38 = faker34.numerify("");
        com.github.javafaker.Company company39 = faker34.company;
        com.github.javafaker.Number number40 = faker34.number();
        com.github.javafaker.PhoneNumber phoneNumber41 = faker34.phoneNumber;
        com.github.javafaker.Color color42 = faker34.color;
        faker31.color = color42;
        faker1.color = color42;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(phoneNumber12);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6026340032068951d + "'", double14 == 0.6026340032068951d);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(dateAndTime21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fran\347ais" + "'", str23, "fran\347ais");
        org.junit.Assert.assertNotNull(dateAndTime24);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6553169302970575d + "'", double27 == 0.6553169302970575d);
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertNotNull(code32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(company39);
        org.junit.Assert.assertNotNull(number40);
        org.junit.Assert.assertNotNull(phoneNumber41);
        org.junit.Assert.assertNotNull(color42);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        byte[] byteArray3 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        random1.setSeed((long) 34);
        long long8 = random1.nextLong();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[115]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5012342983651742217L) + "'", long8 == (-5012342983651742217L));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker1.randomService = randomService12;
        com.github.javafaker.Finance finance14 = faker1.finance();
        com.github.javafaker.Lorem lorem15 = faker1.lorem();
        com.github.javafaker.service.RandomService randomService16 = faker1.randomService;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6042336703647946d + "'", double8 == 0.6042336703647946d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNull(lorem15);
        org.junit.Assert.assertNotNull(randomService16);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        java.lang.String str13 = faker1.bothify("fr_fr_HI!_eng");
        com.github.javafaker.Company company14 = faker1.company;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr_fr_HI!_eng" + "'", str13, "fr_fr_HI!_eng");
        org.junit.Assert.assertNotNull(company14);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.removeUnicodeLocaleAttribute("deu");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.setLanguageTag("fran\347ais (EN-GB)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: franc?ais (EN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.util.Random random1 = new java.util.Random(1L);
        double double2 = random1.nextGaussian();
        long long3 = random1.nextLong();
        java.util.stream.LongStream longStream4 = random1.longs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.561581040188955d + "'", double2 == 1.561581040188955d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3831662765844904176L + "'", long3 == 3831662765844904176L);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Business business8 = faker1.business;
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        com.github.javafaker.Internet internet13 = null;
        faker10.internet = internet13;
        java.lang.String str16 = faker10.bothify("");
        com.github.javafaker.Code code17 = null;
        faker10.code = code17;
        com.github.javafaker.DateAndTime dateAndTime19 = faker10.date();
        java.util.Random random20 = new java.util.Random();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.DateAndTime dateAndTime22 = null;
        faker21.dateAndTime = dateAndTime22;
        com.github.javafaker.Business business24 = faker21.business;
        faker10.business = business24;
        com.github.javafaker.Code code26 = faker10.code();
        com.github.javafaker.DateAndTime dateAndTime27 = faker10.date();
        faker1.dateAndTime = dateAndTime27;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(dateAndTime19);
        org.junit.Assert.assertNotNull(business24);
        org.junit.Assert.assertNull(code26);
        org.junit.Assert.assertNotNull(dateAndTime27);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fra_FR-FR");
        org.junit.Assert.assertEquals(locale5.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_fr_HI!_eng");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("en-us (ENGLISH (UNITED KINGDOM))");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("fr_FR_FR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: fr_FR_FR");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getDisplayScript();
        java.util.Locale.setDefault(locale5);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(lorem6);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        double double11 = random6.nextGaussian();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.DateAndTime dateAndTime13 = faker12.dateAndTime;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.048217096083284616d + "'", double7 == 0.048217096083284616d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-2.548927929896209d) + "'", double11 == (-2.548927929896209d));
        org.junit.Assert.assertNotNull(dateAndTime13);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Book book3 = faker0.book;
        com.github.javafaker.Company company4 = faker0.company;
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(company4);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream6 = random1.longs((long) 1, (long) 1, 100L);
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        double double9 = random7.nextGaussian();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        random7.nextBytes(byteArray15);
        random1.nextBytes(byteArray15);
        byte[] byteArray19 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray19);
        double double21 = random1.nextGaussian();
        java.util.Random random22 = new java.util.Random();
        double double23 = random22.nextDouble();
        int int25 = random22.nextInt(1);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random22);
        double double27 = random22.nextDouble();
        double double28 = random22.nextDouble();
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        random22.nextBytes(byteArray32);
        random1.nextBytes(byteArray32);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.13185195570733693d + "'", double9 == 0.13185195570733693d);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[115, -43, 26, -69, -40]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[111]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.09238554143767472d) + "'", double21 == (-0.09238554143767472d));
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.08417385862894888d + "'", double23 == 0.08417385862894888d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2591143347752516d + "'", double27 == 0.2591143347752516d);
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.37570057054750683d + "'", double28 == 0.37570057054750683d);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-35, -123, -85]");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number9 = faker8.number;
        com.github.javafaker.Business business10 = faker8.business();
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        com.github.javafaker.Color color15 = faker12.color;
        com.github.javafaker.Finance finance16 = faker12.finance();
        com.github.javafaker.Address address17 = faker12.address;
        faker8.address = address17;
        faker1.address = address17;
        com.github.javafaker.DateAndTime dateAndTime20 = faker1.dateAndTime;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(finance16);
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertNotNull(dateAndTime20);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fr");
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("x-lvariant-eng", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 0, (long) (byte) 1);
        java.util.Random random6 = new java.util.Random((long) (byte) 1);
        byte[] byteArray8 = new byte[] { (byte) -1 };
        random6.nextBytes(byteArray8);
        random1.nextBytes(byteArray8);
        java.util.stream.IntStream intStream11 = random1.ints();
        java.util.stream.LongStream longStream14 = random1.longs((long) (byte) 1, (long) 1429008869);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-46]");
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(longStream14);
    }
}
