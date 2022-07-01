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
        com.github.javafaker.Company company49 = faker1.company;
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
        org.junit.Assert.assertNotNull(company49);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.Locale locale1 = new java.util.Locale("United States");
        java.util.Locale locale2 = java.util.Locale.UK;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale1.getDisplayCountry(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "united states");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Lorem lorem8 = faker7.lorem();
        com.github.javafaker.Address address9 = faker7.address;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(address9);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.Locale locale2 = new java.util.Locale("Chinese", "eng");
        java.lang.String str3 = locale2.getCountry();
        java.lang.String str5 = locale2.getExtension('x');
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale6.getDisplayName();
        java.lang.String str9 = locale6.getDisplayName();
        java.lang.String str10 = locale2.getDisplayScript(locale6);
        java.lang.String str11 = locale2.getDisplayScript();
        boolean boolean12 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_ENG");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ENG" + "'", str3, "ENG");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u7f8e\u570b" + "'", str7, "\u7f8e\u570b");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str8, "\u82f1\u6587\u7f8e\u570b)");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str9, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Finance finance7 = faker1.finance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        faker3.color = color6;
        com.github.javafaker.Lorem lorem8 = faker3.lorem;
        com.github.javafaker.Address address9 = faker3.address;
        com.github.javafaker.Address address10 = faker3.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.DoubleStream doubleStream8 = random0.doubles();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.Business business5 = faker1.business();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Color color10 = faker9.color;
        faker1.color = color10;
        com.github.javafaker.Internet internet12 = faker1.internet();
        java.util.Random random13 = new java.util.Random();
        int int15 = random13.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Color color17 = faker16.color;
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        java.lang.String str21 = faker19.numerify("");
        com.github.javafaker.Book book22 = null;
        faker19.book = book22;
        com.github.javafaker.Internet internet24 = faker19.internet();
        com.github.javafaker.PhoneNumber phoneNumber25 = faker19.phoneNumber();
        faker16.phoneNumber = phoneNumber25;
        faker1.phoneNumber = phoneNumber25;
        com.github.javafaker.Finance finance28 = faker1.finance();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Color color31 = faker30.color;
        com.github.javafaker.Lorem lorem32 = faker30.lorem();
        java.util.Random random33 = null;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random33);
        java.lang.String str36 = faker34.numerify("");
        com.github.javafaker.Book book37 = null;
        faker34.book = book37;
        com.github.javafaker.Internet internet39 = faker34.internet();
        com.github.javafaker.PhoneNumber phoneNumber40 = faker34.phoneNumber();
        faker30.phoneNumber = phoneNumber40;
        com.github.javafaker.DateAndTime dateAndTime42 = faker30.dateAndTime;
        java.util.Random random43 = null;
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        java.lang.String str46 = faker44.numerify("");
        com.github.javafaker.Book book47 = null;
        faker44.book = book47;
        com.github.javafaker.Internet internet49 = faker44.internet();
        com.github.javafaker.Lorem lorem50 = faker44.lorem;
        java.util.Random random51 = null;
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(random51);
        com.github.javafaker.DateAndTime dateAndTime53 = null;
        faker52.dateAndTime = dateAndTime53;
        com.github.javafaker.Lorem lorem55 = faker52.lorem;
        faker44.lorem = lorem55;
        java.util.Random random57 = null;
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        com.github.javafaker.Color color59 = faker58.color;
        java.util.Random random60 = null;
        com.github.javafaker.Faker faker61 = new com.github.javafaker.Faker(random60);
        java.lang.String str63 = faker61.numerify("");
        com.github.javafaker.Number number64 = faker61.number();
        faker58.number = number64;
        com.github.javafaker.Company company66 = null;
        faker58.company = company66;
        com.github.javafaker.Options options68 = faker58.options;
        com.github.javafaker.Code code69 = faker58.code;
        faker44.code = code69;
        faker30.code = code69;
        com.github.javafaker.Name name72 = faker30.name();
        faker1.name = name72;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(internet24);
        org.junit.Assert.assertNotNull(phoneNumber25);
        org.junit.Assert.assertNotNull(finance28);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(lorem32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(internet39);
        org.junit.Assert.assertNotNull(phoneNumber40);
        org.junit.Assert.assertNotNull(dateAndTime42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(internet49);
        org.junit.Assert.assertNotNull(lorem50);
        org.junit.Assert.assertNotNull(lorem55);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(number64);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(code69);
        org.junit.Assert.assertNotNull(name72);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        java.lang.String str31 = locale7.getVariant();
        java.util.Locale locale32 = java.util.Locale.US;
        java.util.Locale.setDefault(locale32);
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.lang.String str37 = locale35.getDisplayScript(locale36);
        java.lang.String str38 = locale36.toLanguageTag();
        java.lang.String str39 = locale32.getDisplayName(locale36);
        java.lang.String str40 = locale7.getDisplayScript(locale36);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Taiwan" + "'", str28, "Taiwan");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zh-TW" + "'", str38, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str39, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Color color4 = faker1.color();
        com.github.javafaker.Options options5 = faker1.options();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Code code8 = faker7.code;
        com.github.javafaker.Address address9 = faker7.address;
        com.github.javafaker.Color color10 = faker7.color();
        faker1.color = color10;
        com.github.javafaker.Book book12 = faker1.book;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US" + "'", str1, "US");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayScript();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean7 = locale6.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale10.toLanguageTag();
        java.lang.String str13 = locale6.getDisplayCountry(locale10);
        java.util.Locale.setDefault(locale6);
        java.lang.String str15 = locale6.getLanguage();
        java.lang.String str16 = locale1.getDisplayLanguage(locale6);
        boolean boolean17 = locale1.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = locale1.getUnicodeLocaleType("Germany");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Germany");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Taiwan" + "'", str3, "Taiwan");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-TW" + "'", str12, "zh-TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Japanese" + "'", str3, "Japanese");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        double double2 = languageRange1.getWeight();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale3.getISO3Country();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
        boolean boolean6 = languageRange1.equals((java.lang.Object) locale3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TWN" + "'", str4, "TWN");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Code code4 = faker1.code();
        java.lang.String str6 = faker1.letterify("\u82f1\u6587\u7f8e\u570b)");
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str6, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.util.Locale locale4 = locale1.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("English (United Kingdom)", "zh_CN");
        java.lang.String str8 = locale4.getDisplayName(locale7);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "english (united kingdom)_ZH_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        long long2 = random0.nextLong();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2644133912552240042L) + "'", long2 == (-2644133912552240042L));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Business business6 = faker1.business;
        com.github.javafaker.Company company7 = faker1.company();
        com.github.javafaker.Name name8 = faker1.name();
        com.github.javafaker.Book book9 = faker1.book();
        java.lang.String str11 = faker1.numerify("\ub300\ub9cc");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ub300\ub9cc" + "'", str11, "\ub300\ub9cc");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        java.util.stream.IntStream intStream15 = random6.ints((long) (short) 10);
        java.util.stream.DoubleStream doubleStream16 = random6.doubles();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1850728168 + "'", int11 == 1850728168);
// flaky:         org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.89772654f + "'", float12 == 0.89772654f);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9578033026387649d + "'", double13 == 0.9578033026387649d);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        com.github.javafaker.service.RandomService randomService5 = faker1.randomService;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(randomService5);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        com.github.javafaker.Business business7 = faker1.business();
        java.lang.String str9 = faker1.numerify("\u4e2d\u6587");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale12.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayLanguage();
        java.util.Random random16 = new java.util.Random();
        int int18 = random16.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale12, random16);
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale23.toLanguageTag();
        java.lang.String str26 = locale23.getDisplayLanguage();
        java.util.Random random27 = new java.util.Random();
        int int29 = random27.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(locale23, random27);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale12, random27);
        com.github.javafaker.Company company33 = faker32.company;
        com.github.javafaker.PhoneNumber phoneNumber34 = faker32.phoneNumber();
        com.github.javafaker.Internet internet35 = faker32.internet;
        faker1.internet = internet35;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-TW" + "'", str14, "zh-TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese" + "'", str15, "Chinese");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-TW" + "'", str25, "zh-TW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chinese" + "'", str26, "Chinese");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(phoneNumber34);
        org.junit.Assert.assertNotNull(internet35);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        com.github.javafaker.Finance finance29 = faker1.finance();
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
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Book book6 = faker1.book();
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Code code8 = faker1.code;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        com.github.javafaker.Code code11 = faker10.code;
        com.github.javafaker.DateAndTime dateAndTime12 = faker10.dateAndTime;
        faker1.dateAndTime = dateAndTime12;
        com.github.javafaker.PhoneNumber phoneNumber14 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(phoneNumber14);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getISO3Country();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("English");
        java.lang.String str7 = locale0.getDisplayLanguage(locale6);
        java.lang.String str8 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "USA" + "'", str4, "USA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "english");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "USA" + "'", str8, "USA");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        boolean boolean28 = random17.nextBoolean();
        java.util.stream.IntStream intStream29 = random17.ints();
        long long30 = random17.nextLong();
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
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-5179893854559643473L) + "'", long23 == (-5179893854559643473L));
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(doubleStream26);
// flaky:         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intStream29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 505739551188545652L + "'", long30 == 505739551188545652L);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clear();
        java.util.Locale.Builder builder8 = builder0.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder11 = builder0.setExtension('a', "TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder0.setRegion("English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: English (Canada) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale locale11 = builder8.build();
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("Chinese");
        java.util.Locale.Builder builder15 = builder8.removeUnicodeLocaleAttribute("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.setUnicodeLocaleKeyword("Canada", "GBR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Canada [at index 0]");
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
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        com.github.javafaker.Finance finance7 = faker1.finance;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.DateAndTime dateAndTime10 = null;
        faker9.dateAndTime = dateAndTime10;
        com.github.javafaker.Lorem lorem12 = faker9.lorem;
        com.github.javafaker.Address address13 = faker9.address;
        com.github.javafaker.Code code14 = faker9.code();
        faker1.code = code14;
        com.github.javafaker.Code code16 = faker1.code;
        com.github.javafaker.Name name17 = faker1.name();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(address13);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(code16);
        org.junit.Assert.assertNotNull(name17);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        float float8 = random0.nextFloat();
        int int9 = random0.nextInt();
        int int10 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random0.longs((long) 10, (long) (-1653753823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.29959244f + "'", float8 == 0.29959244f);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1197889068) + "'", int9 == (-1197889068));
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 533056036 + "'", int10 == 533056036);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TWN" + "'", str1, "TWN");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese (Taiwan)" + "'", str3, "Chinese (Taiwan)");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = null;
        faker1.company = company2;
        com.github.javafaker.Internet internet4 = faker1.internet();
        com.github.javafaker.Name name5 = faker1.name;
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(name5);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getDisplayVariant();
        java.lang.String str5 = locale1.getScript();
        java.lang.String str6 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        com.github.javafaker.Lorem lorem19 = faker1.lorem();
        com.github.javafaker.Color color20 = faker1.color;
        com.github.javafaker.Company company21 = faker1.company();
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Color color24 = faker23.color;
        com.github.javafaker.Address address25 = faker23.address;
        com.github.javafaker.Options options26 = faker23.options;
        com.github.javafaker.Business business27 = faker23.business();
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale30 = java.util.Locale.TAIWAN;
        java.lang.String str31 = locale29.getDisplayScript(locale30);
        java.lang.String str32 = locale30.toLanguageTag();
        java.lang.String str33 = locale30.getDisplayLanguage();
        java.util.Random random34 = null;
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale30, random34);
        java.util.Random random36 = null;
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.Color color38 = faker37.color;
        com.github.javafaker.Lorem lorem39 = faker37.lorem();
        com.github.javafaker.Finance finance40 = faker37.finance;
        com.github.javafaker.Number number41 = faker37.number();
        com.github.javafaker.PhoneNumber phoneNumber42 = null;
        faker37.phoneNumber = phoneNumber42;
        com.github.javafaker.service.FakeValuesService fakeValuesService44 = faker37.fakeValuesService;
        faker35.fakeValuesService = fakeValuesService44;
        faker23.fakeValuesService = fakeValuesService44;
        com.github.javafaker.Internet internet47 = faker23.internet;
        faker1.internet = internet47;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(randomService16);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertNotNull(lorem19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(company21);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(address25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(business27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh-TW" + "'", str32, "zh-TW");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Chinese" + "'", str33, "Chinese");
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(lorem39);
        org.junit.Assert.assertNotNull(finance40);
        org.junit.Assert.assertNotNull(number41);
        org.junit.Assert.assertNotNull(fakeValuesService44);
        org.junit.Assert.assertNotNull(internet47);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chinese");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        java.util.Locale locale50 = java.util.Locale.US;
        java.util.Locale.setDefault(locale50);
        java.lang.String str52 = locale50.getVariant();
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(locale50);
        com.github.javafaker.Options options54 = faker53.options();
        faker37.options = options54;
        java.util.Random random56 = null;
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker(random56);
        com.github.javafaker.DateAndTime dateAndTime58 = null;
        faker57.dateAndTime = dateAndTime58;
        com.github.javafaker.Lorem lorem60 = faker57.lorem;
        com.github.javafaker.Address address61 = faker57.address;
        com.github.javafaker.Code code62 = faker57.code();
        com.github.javafaker.Company company63 = faker57.company();
        com.github.javafaker.Book book64 = faker57.book();
        faker37.book = book64;
        faker1.book = book64;
        com.github.javafaker.Book book67 = faker1.book;
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(lorem46);
        org.junit.Assert.assertNotNull(address47);
        org.junit.Assert.assertNotNull(finance48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(lorem60);
        org.junit.Assert.assertNotNull(address61);
        org.junit.Assert.assertNotNull(code62);
        org.junit.Assert.assertNotNull(company63);
        org.junit.Assert.assertNotNull(book64);
        org.junit.Assert.assertNotNull(book67);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.util.Locale locale0 = java.util.Locale.PRC;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(internet2);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Color color7 = faker6.color;
        com.github.javafaker.Address address8 = faker6.address;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business10 = faker9.business;
        faker6.business = business10;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        java.lang.String str18 = faker16.numerify("");
        com.github.javafaker.Number number19 = faker16.number();
        faker13.number = number19;
        faker6.number = number19;
        faker1.number = number19;
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean25 = locale24.hasExtensions();
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        java.lang.String str29 = locale27.getDisplayScript(locale28);
        java.lang.String str30 = locale28.toLanguageTag();
        java.lang.String str31 = locale24.getDisplayCountry(locale28);
        java.lang.String str32 = locale28.getISO3Country();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale28);
        java.util.Random random34 = null;
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.Color color36 = faker35.color;
        com.github.javafaker.Lorem lorem37 = faker35.lorem();
        java.util.Random random38 = null;
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random38);
        java.lang.String str41 = faker39.numerify("");
        com.github.javafaker.Book book42 = null;
        faker39.book = book42;
        com.github.javafaker.Internet internet44 = faker39.internet();
        com.github.javafaker.PhoneNumber phoneNumber45 = faker39.phoneNumber();
        faker35.phoneNumber = phoneNumber45;
        com.github.javafaker.DateAndTime dateAndTime47 = faker35.dateAndTime;
        java.util.Random random48 = null;
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(random48);
        java.lang.String str51 = faker49.numerify("");
        com.github.javafaker.Book book52 = null;
        faker49.book = book52;
        com.github.javafaker.Internet internet54 = faker49.internet();
        com.github.javafaker.Lorem lorem55 = faker49.lorem;
        java.util.Random random56 = null;
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker(random56);
        com.github.javafaker.DateAndTime dateAndTime58 = null;
        faker57.dateAndTime = dateAndTime58;
        com.github.javafaker.Lorem lorem60 = faker57.lorem;
        faker49.lorem = lorem60;
        java.util.Random random62 = null;
        com.github.javafaker.Faker faker63 = new com.github.javafaker.Faker(random62);
        com.github.javafaker.Color color64 = faker63.color;
        java.util.Random random65 = null;
        com.github.javafaker.Faker faker66 = new com.github.javafaker.Faker(random65);
        java.lang.String str68 = faker66.numerify("");
        com.github.javafaker.Number number69 = faker66.number();
        faker63.number = number69;
        com.github.javafaker.Company company71 = null;
        faker63.company = company71;
        com.github.javafaker.Options options73 = faker63.options;
        com.github.javafaker.Code code74 = faker63.code;
        faker49.code = code74;
        faker35.code = code74;
        com.github.javafaker.Name name77 = faker35.name();
        faker33.name = name77;
        com.github.javafaker.Finance finance79 = faker33.finance;
        faker1.finance = finance79;
        java.util.Random random81 = null;
        com.github.javafaker.Faker faker82 = new com.github.javafaker.Faker(random81);
        com.github.javafaker.DateAndTime dateAndTime83 = null;
        faker82.dateAndTime = dateAndTime83;
        com.github.javafaker.Lorem lorem85 = faker82.lorem;
        com.github.javafaker.Address address86 = faker82.address;
        com.github.javafaker.Finance finance87 = faker82.finance();
        com.github.javafaker.Number number88 = faker82.number();
        java.util.Random random89 = null;
        com.github.javafaker.Faker faker90 = new com.github.javafaker.Faker(random89);
        java.lang.String str92 = faker90.numerify("");
        com.github.javafaker.Number number93 = faker90.number();
        com.github.javafaker.Name name94 = faker90.name();
        faker82.name = name94;
        com.github.javafaker.Lorem lorem96 = faker82.lorem();
        faker1.lorem = lorem96;
        com.github.javafaker.DateAndTime dateAndTime98 = faker1.dateAndTime;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-TW" + "'", str30, "zh-TW");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "TWN" + "'", str32, "TWN");
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(lorem37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(internet44);
        org.junit.Assert.assertNotNull(phoneNumber45);
        org.junit.Assert.assertNotNull(dateAndTime47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(internet54);
        org.junit.Assert.assertNotNull(lorem55);
        org.junit.Assert.assertNotNull(lorem60);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(number69);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(code74);
        org.junit.Assert.assertNotNull(name77);
        org.junit.Assert.assertNotNull(finance79);
        org.junit.Assert.assertNotNull(lorem85);
        org.junit.Assert.assertNotNull(address86);
        org.junit.Assert.assertNotNull(finance87);
        org.junit.Assert.assertNotNull(number88);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(number93);
        org.junit.Assert.assertNotNull(name94);
        org.junit.Assert.assertNotNull(lorem96);
        org.junit.Assert.assertNotNull(dateAndTime98);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.lang.String str3 = locale0.getDisplayLanguage();
        java.lang.String str5 = locale0.getExtension('u');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        com.github.javafaker.Internet internet31 = faker1.internet();
        java.lang.String str33 = faker1.letterify("\ub3c5\uc77c");
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
        org.junit.Assert.assertNotNull(internet31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\ub3c5\uc77c" + "'", str33, "\ub3c5\uc77c");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        java.util.stream.DoubleStream doubleStream26 = random17.doubles(7959307406216468554L);
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
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-355291820488765788L) + "'", long23 == (-355291820488765788L));
// flaky:         org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.16915965f + "'", float24 == 0.16915965f);
        org.junit.Assert.assertNotNull(doubleStream26);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.lang.String str7 = locale0.getDisplayScript(locale3);
        java.util.Locale locale8 = java.util.Locale.UK;
        java.lang.String str9 = locale3.getDisplayVariant(locale8);
        java.lang.String str10 = locale3.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-TW" + "'", str5, "zh-TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese" + "'", str6, "Chinese");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TW" + "'", str10, "TW");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        boolean boolean4 = locale3.hasExtensions();
        java.lang.String str5 = locale3.getDisplayScript();
        java.lang.String str6 = locale3.getCountry();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale3.getDisplayCountry(locale7);
        java.util.Locale.setDefault(category0, locale7);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.Locale locale2 = new java.util.Locale("Taiwan", "zho");
        java.util.Locale locale3 = java.util.Locale.UK;
        java.lang.String str4 = locale3.getISO3Country();
        boolean boolean5 = locale3.hasExtensions();
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        java.lang.Class<?> wildcardClass7 = locale3.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "taiwan_ZHO");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GBR" + "'", str4, "GBR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "taiwan" + "'", str6, "taiwan");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        com.github.javafaker.Company company25 = faker1.company;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(internet22);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertNotNull(company25);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        com.github.javafaker.Internet internet31 = faker1.internet();
        com.github.javafaker.DateAndTime dateAndTime32 = faker1.dateAndTime;
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
        org.junit.Assert.assertNotNull(internet31);
        org.junit.Assert.assertNull(dateAndTime32);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.lang.String str17 = locale0.getUnicodeLocaleType("ko");
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("GBR");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("und", 0.7346627443280227d);
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str16 = languageRange15.getRange();
        java.lang.String str17 = languageRange15.getRange();
        java.lang.String str18 = languageRange15.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] { languageRange13, languageRange15 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale locale31 = new java.util.Locale("");
        java.util.Locale locale33 = new java.util.Locale("");
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale31, locale33, locale34, locale35, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList38);
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
        java.util.Locale locale60 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.Locale.FilteringMode filteringMode61 = null;
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList57, filteringMode61);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList68);
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList68, filteringMode71);
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList72);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "gbr" + "'", str16, "gbr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "gbr" + "'", str17, "gbr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "gbr" + "'", str18, "gbr");
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
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
        org.junit.Assert.assertNull(locale60);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertTrue("'" + filteringMode71 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode71.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        float float8 = random0.nextFloat();
        int int9 = random0.nextInt();
        int int10 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random0.longs((long) (byte) 100, 2241767268063067838L, (long) (-1653753823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4855078f + "'", float8 == 0.4855078f);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-615825278) + "'", int9 == (-615825278));
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1736527977 + "'", int10 == 1736527977);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.util.Random random1 = new java.util.Random((-4894608278020295867L));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(928651391);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 298756870 + "'", int4 == 298756870);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
            java.util.Locale.Builder builder15 = builder13.setRegion("\uc601\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ????? [at index 0]");
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        java.lang.String str8 = locale5.getDisplayCountry();
        java.util.Set<java.lang.String> strSet9 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale5.getISO3Language();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United States" + "'", str8, "United States");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "eng" + "'", str10, "eng");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.Class<?> wildcardClass2 = category0.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.util.Locale locale2 = new java.util.Locale("English (United Kingdom)", "zh_CN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ZH_CN");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "english (united kingdom)_ZH_CN");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str3 = locale1.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ko", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        int int8 = random0.nextInt((int) '#');
        float float9 = random0.nextFloat();
        double double10 = random0.nextGaussian();
        java.util.stream.IntStream intStream11 = random0.ints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
// flaky:         org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.9802674f + "'", float9 == 0.9802674f);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.22849594824668254d) + "'", double10 == (-0.22849594824668254d));
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        java.lang.String str11 = locale7.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) 10);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((double) (-7066843796264617845L), (double) (-553780171));
        java.util.stream.IntStream intStream14 = random0.ints((long) 'u');
        int int15 = random0.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1139614796) + "'", int15 == (-1139614796));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company4 = faker3.company;
        com.github.javafaker.DateAndTime dateAndTime5 = faker3.dateAndTime;
        com.github.javafaker.Business business6 = faker3.business;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        com.github.javafaker.service.FakeValuesService fakeValuesService45 = faker1.fakeValuesService;
        com.github.javafaker.Lorem lorem46 = faker1.lorem();
        com.github.javafaker.Business business47 = faker1.business;
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
        org.junit.Assert.assertNotNull(fakeValuesService45);
        org.junit.Assert.assertNotNull(lorem46);
        org.junit.Assert.assertNotNull(business47);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("GBR");
        double double4 = languageRange3.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList13);
        java.lang.String str16 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList22);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.Locale.FilteringMode filteringMode30 = null;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList28, filteringMode30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap32);
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        java.lang.String str35 = locale34.getISO3Country();
        java.util.Set<java.lang.String> strSet36 = locale34.getUnicodeLocaleAttributes();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleAttributes();
        java.lang.String str39 = locale37.getDisplayLanguage();
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.lang.String str41 = locale37.getDisplayCountry(locale40);
        java.lang.String str42 = locale34.getDisplayName(locale37);
        java.util.Set<java.lang.String> strSet43 = locale37.getUnicodeLocaleAttributes();
        java.lang.String str44 = java.util.Locale.lookupTag(languageRangeList33, (java.util.Collection<java.lang.String>) strSet43);
        java.lang.String str45 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet43);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "TWN" + "'", str35, "TWN");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "English" + "'", str39, "English");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Etats-Unis" + "'", str41, "Etats-Unis");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Chinese (Taiwan)" + "'", str42, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayScript();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean7 = locale6.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale10.toLanguageTag();
        java.lang.String str13 = locale6.getDisplayCountry(locale10);
        java.util.Locale.setDefault(locale6);
        java.lang.String str15 = locale6.getLanguage();
        java.lang.String str16 = locale1.getDisplayLanguage(locale6);
        java.util.Set<java.lang.Character> charSet17 = locale6.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Taiwan" + "'", str3, "Taiwan");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-TW" + "'", str12, "zh-TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertNotNull(charSet17);
    }
}
