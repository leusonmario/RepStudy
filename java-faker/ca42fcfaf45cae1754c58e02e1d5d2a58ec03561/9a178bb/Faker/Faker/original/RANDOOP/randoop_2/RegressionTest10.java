import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0.09030852367893838d, 0.9788051395650306d);
        java.util.stream.IntStream intStream18 = random0.ints((long) 1285360561, (-1155484576), (int) (byte) 100);
        java.util.stream.IntStream intStream19 = random0.ints();
        java.util.stream.DoubleStream doubleStream20 = random0.doubles();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-79, 118, 5, -101, -32, -88]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.1395483f + "'", float10 == 0.1395483f);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1584861631 + "'", int11 == 1584861631);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(doubleStream20);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("IT");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.lang.String str4 = locale2.getDisplayLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.lang.String str7 = faker5.numerify("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        java.lang.String str9 = faker5.numerify("allemand");
        com.github.javafaker.Address address10 = faker5.address();
        com.github.javafaker.Company company11 = faker5.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italiano" + "'", str4, "italiano");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str7, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "allemand" + "'", str9, "allemand");
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(company11);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        java.util.Locale.Builder builder11 = builder3.setLanguageTag("Chinese");
        java.util.Locale.Builder builder13 = builder3.setVariant("");
        java.util.Locale locale14 = builder3.build();
        java.lang.String str15 = locale14.getScript();
        java.lang.String str16 = locale14.getDisplayVariant();
        java.util.Locale locale19 = new java.util.Locale("en-GB", "giapponese");
        java.lang.String str20 = locale14.getDisplayLanguage(locale19);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale19.toString(), "en-gb_GIAPPONESE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chinese" + "'", str20, "chinese");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.numerify("fr_FR");
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker1.phoneNumber();
        com.github.javafaker.Finance finance10 = faker1.finance();
        com.github.javafaker.Internet internet11 = faker1.internet();
        java.lang.String str13 = faker1.letterify("zh");
        com.github.javafaker.Finance finance14 = faker1.finance();
        com.github.javafaker.Options options15 = faker1.options();
        com.github.javafaker.Finance finance16 = faker1.finance();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr_FR" + "'", str7, "fr_FR");
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(finance16);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((-1.3525503855396068d), (double) 0.0f);
        float float4 = random0.nextFloat();
        java.util.stream.LongStream longStream6 = random0.longs((long) 427836975);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream8 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.89432865f + "'", float4 == 0.89432865f);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str5 = locale1.getScript();
        java.lang.String str6 = locale1.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale1.getUnicodeLocaleType("\u7fa9\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale2.getDisplayName();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale2);
        java.lang.String str5 = locale0.getDisplayScript(locale2);
        java.lang.String str6 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tedesco (Germania)" + "'", str3, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        java.lang.String str4 = faker1.numerify("Italian");
        java.lang.String str6 = faker1.bothify("italiano");
        com.github.javafaker.Business business7 = faker1.business();
        com.github.javafaker.Lorem lorem8 = faker1.lorem();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italiano" + "'", str6, "italiano");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        java.lang.String str4 = faker1.letterify("CHN");
        com.github.javafaker.PhoneNumber phoneNumber5 = faker1.phoneNumber();
        com.github.javafaker.DateAndTime dateAndTime6 = faker1.date();
        com.github.javafaker.Number number7 = faker1.number();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category5, locale9);
        java.lang.String str11 = locale1.getDisplayCountry(locale9);
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale12.getVariant();
        boolean boolean15 = locale12.hasExtensions();
        java.lang.String str16 = locale9.getDisplayName(locale12);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale12);
        com.github.javafaker.Options options18 = faker17.options();
        com.github.javafaker.Code code19 = faker17.code();
        com.github.javafaker.Business business20 = faker17.business();
        com.github.javafaker.Color color21 = faker17.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it-IT" + "'", str4, "it-IT");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale9.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italy" + "'", str11, "Italy");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! (ITA)" + "'", str16, "hi! (ITA)");
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(business20);
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale0.getDisplayCountry(locale3);
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Locale locale12 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str13 = locale7.getDisplayLanguage(locale12);
        java.lang.String str14 = locale12.getScript();
        boolean boolean15 = locale12.hasExtensions();
        java.lang.String str17 = locale12.getUnicodeLocaleType("zh");
        java.lang.String str18 = locale12.getDisplayScript();
        java.lang.String str19 = locale0.getDisplayName(locale12);
        java.lang.String str20 = locale12.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str8, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean" + "'", str19, "Korean");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ITA" + "'", str20, "ITA");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.numerify("fr_FR");
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker1.phoneNumber();
        java.lang.String str11 = faker1.letterify("");
        com.github.javafaker.Book book12 = faker1.book();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr_FR" + "'", str7, "fr_FR");
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) (short) 10);
        java.util.stream.LongStream longStream13 = random0.longs();
        java.util.stream.DoubleStream doubleStream17 = random0.doubles(6448421598433570082L, (double) 0.28971082f, (double) 0.31204516f);
        random0.setSeed(0L);
        java.util.stream.LongStream longStream21 = random0.longs(6448421598433570082L);
        java.util.stream.IntStream intStream22 = random0.ints();
        int int23 = random0.nextInt();
        int int25 = random0.nextInt(109);
        long long26 = random0.nextLong();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-48, -7, 8, 17, -53, -61]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8073599f + "'", float10 == 0.8073599f);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1155484576) + "'", int23 == (-1155484576));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 56 + "'", int25 == 56);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 4437113781045784766L + "'", long26 == 4437113781045784766L);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        boolean boolean2 = random0.nextBoolean();
        random0.setSeed((long) (-890288509));
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((double) 0.5416809f, (double) 1769515046);
        float float8 = random0.nextFloat();
        double double9 = random0.nextGaussian();
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4101948f + "'", float8 == 0.4101948f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0512777879179966d + "'", double9 == 1.0512777879179966d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder7 = builder4.setLanguageTag("fr");
        java.util.Locale locale8 = builder7.build();
        java.lang.String str9 = locale8.getDisplayScript();
        java.lang.String str10 = locale8.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str10, "\ud504\ub791\uc2a4\uc5b4");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        boolean boolean2 = random0.nextBoolean();
        random0.setSeed((long) (-890288509));
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((double) 0.5416809f, (double) 1769515046);
        boolean boolean8 = random0.nextBoolean();
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayLanguage(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        java.lang.String str5 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Koreanisch" + "'", str3, "Koreanisch");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale4.toString(), "hi!__ITA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!__ITA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!__ITA");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Color color4 = faker1.color();
        com.github.javafaker.Internet internet5 = faker1.internet();
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Company company7 = faker1.company();
        java.lang.String str9 = faker1.numerify("\u7fa9\u5927\u5229\u6587");
        com.github.javafaker.Number number10 = faker1.number();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str9, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder12 = builder3.removeUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder13 = builder12.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet4 = faker3.internet();
        java.lang.String str6 = faker3.numerify("");
        com.github.javafaker.Number number7 = faker3.number();
        com.github.javafaker.Color color8 = faker3.color();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Set<java.lang.Character> charSet9 = locale1.getExtensionKeys();
        java.lang.String str10 = locale1.getISO3Country();
        java.lang.String str11 = locale1.getISO3Language();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale17.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.lang.String str23 = locale21.getDisplayName(locale22);
        java.lang.String str24 = locale17.getDisplayVariant(locale21);
        java.lang.String str25 = locale13.getDisplayScript(locale21);
        java.util.Locale locale28 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str29 = locale13.getDisplayScript(locale28);
        java.lang.String str30 = locale28.getDisplayName();
        boolean boolean31 = locale28.hasExtensions();
        java.lang.String str32 = locale1.getDisplayScript(locale28);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale1);
        java.lang.String str34 = locale1.getLanguage();
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.lang.String str36 = locale35.getVariant();
        java.util.Locale locale37 = java.util.Locale.GERMANY;
        java.lang.String str38 = locale35.getDisplayLanguage(locale37);
        java.util.Set<java.lang.String> strSet39 = locale37.getUnicodeLocaleKeys();
        java.util.Locale locale40 = java.util.Locale.ITALY;
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale41.getISO3Country();
        java.util.Set<java.lang.String> strSet43 = locale41.getUnicodeLocaleKeys();
        java.util.Locale locale47 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str48 = locale41.getDisplayCountry(locale47);
        java.lang.String str49 = locale41.toLanguageTag();
        java.lang.String str50 = locale37.getDisplayLanguage(locale41);
        java.lang.String str51 = locale1.getDisplayScript(locale41);
        java.util.Set<java.lang.String> strSet52 = locale1.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet53 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITA" + "'", str10, "ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ita" + "'", str11, "ita");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ITA" + "'", str18, "ITA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ITA" + "'", str19, "ITA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale28.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fr_fr (FR_FR)" + "'", str30, "fr_fr (FR_FR)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "it" + "'", str34, "it");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Koreanisch" + "'", str38, "Koreanisch");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ITA" + "'", str42, "ITA");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals(locale47.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Italy" + "'", str48, "Italy");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "it-IT" + "'", str49, "it-IT");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "tedesco" + "'", str50, "tedesco");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(charSet53);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.Random random3 = new java.util.Random();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random3.nextBytes(byteArray10);
        random0.nextBytes(byteArray10);
        double double13 = random0.nextGaussian();
        boolean boolean14 = random0.nextBoolean();
        float float15 = random0.nextFloat();
        double double16 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream19 = random0.doubles((double) 0.4734224f, (double) 0.74705017f);
        java.util.stream.IntStream intStream20 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream24 = random0.doubles(0L, (double) 30747171, (double) 0.6735316f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -108, -26, 2, -124, 60]");
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.11272180186191613d) + "'", double13 == (-0.11272180186191613d));
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.13871801f + "'", float15 == 0.13871801f);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.40634363525302336d) + "'", double16 == (-0.40634363525302336d));
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(intStream20);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.util.Locale locale2 = new java.util.Locale("fr", "\u82f1\u6587");
        java.lang.String str3 = locale2.getScript();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale5 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str6 = locale0.getDisplayLanguage(locale5);
        java.lang.String str7 = locale5.getScript();
        boolean boolean8 = locale5.hasExtensions();
        java.lang.String str9 = locale5.getISO3Language();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.util.Locale locale12 = new java.util.Locale("IT");
        java.lang.String str13 = locale10.getDisplayVariant(locale12);
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.util.Locale locale17 = java.util.Locale.ITALY;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.lang.String str19 = locale14.getDisplayCountry(locale17);
        java.util.Locale.setDefault(locale14);
        java.lang.String str21 = locale12.getDisplayCountry(locale14);
        java.lang.String str22 = locale5.getDisplayScript(locale12);
        java.lang.String str23 = locale12.getVariant();
        java.util.Locale locale24 = locale12.stripExtensions();
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.lang.String str26 = locale25.getVariant();
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.lang.String str28 = locale25.getDisplayLanguage(locale27);
        java.util.Set<java.lang.String> strSet29 = locale27.getUnicodeLocaleKeys();
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.util.Locale locale31 = locale30.stripExtensions();
        java.lang.String str32 = locale31.getISO3Country();
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleKeys();
        java.util.Locale locale37 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str38 = locale31.getDisplayCountry(locale37);
        java.lang.String str39 = locale31.toLanguageTag();
        java.lang.String str40 = locale27.getDisplayLanguage(locale31);
        java.lang.String str41 = locale24.getDisplayVariant(locale27);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italian" + "'", str6, "Italian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Koreanisch" + "'", str28, "Koreanisch");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ITA" + "'", str32, "ITA");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Italy" + "'", str38, "Italy");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "it-IT" + "'", str39, "it-IT");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "tedesco" + "'", str40, "tedesco");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str5 = locale1.getDisplayScript();
        java.lang.String str6 = locale1.getISO3Language();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale8.getDisplayScript(locale10);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.lang.String str14 = locale10.getDisplayLanguage(locale13);
        java.lang.String str15 = locale1.getDisplayVariant(locale10);
        java.util.Locale locale16 = locale1.stripExtensions();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ita" + "'", str6, "ita");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITA" + "'", str9, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese" + "'", str14, "Chinese");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.util.Random random1 = new java.util.Random((long) 446577872);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.util.Locale locale2 = new java.util.Locale("anglais (Canada)", "italien");
        org.junit.Assert.assertEquals(locale2.toString(), "anglais (canada)_ITALIEN");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.util.Locale locale3 = new java.util.Locale("italian (Italien,Italia)", "Germania", "English (Canada)");
        org.junit.Assert.assertEquals(locale3.toString(), "italian (italien,italia)_GERMANIA_English (Canada)");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str8 = locale1.getDisplayCountry(locale7);
        java.util.Locale.setDefault(locale1);
        java.util.Set<java.lang.String> strSet10 = locale1.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1);
        java.lang.String str12 = locale1.getISO3Language();
        java.lang.String str13 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italy" + "'", str8, "Italy");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ita" + "'", str12, "ita");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "it-IT" + "'", str13, "it-IT");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u610f\u5927\u5229", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("fr");
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder10.setRegion("");
        java.util.Locale.Builder builder13 = builder10.clearExtensions();
        java.util.Locale.Builder builder15 = builder10.setVariant("Italian");
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.lang.String str17 = locale16.getDisplayName();
        java.util.Locale.Builder builder18 = builder15.setLocale(locale16);
        java.util.Locale locale19 = builder18.build();
        java.util.Locale.Builder builder20 = builder3.setLocale(locale19);
        java.util.Locale.Category category21 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale22 = java.util.Locale.getDefault(category21);
        java.util.Locale locale23 = java.util.Locale.getDefault(category21);
        java.util.Locale locale24 = java.util.Locale.getDefault(category21);
        java.util.Locale locale25 = java.util.Locale.ITALY;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale26.getISO3Country();
        java.util.Set<java.lang.String> strSet28 = locale26.getUnicodeLocaleKeys();
        boolean boolean29 = locale26.hasExtensions();
        java.util.Locale.setDefault(category21, locale26);
        boolean boolean31 = locale26.hasExtensions();
        java.lang.String str32 = locale19.getDisplayCountry(locale26);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale19);
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale35.getISO3Country();
        java.lang.String str37 = locale35.getISO3Country();
        java.lang.String str38 = locale35.getLanguage();
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.lang.String str41 = locale40.getISO3Country();
        java.util.Locale locale42 = java.util.Locale.TAIWAN;
        java.lang.String str43 = locale40.getDisplayScript(locale42);
        java.lang.String str44 = locale35.getDisplayLanguage(locale40);
        java.lang.String str45 = locale35.getISO3Language();
        java.util.Set<java.lang.String> strSet46 = locale35.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet47 = locale35.getExtensionKeys();
        java.lang.String str48 = locale19.getDisplayLanguage(locale35);
        java.util.Locale locale49 = locale19.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = locale19.getUnicodeLocaleType("ITA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ITA");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tedesco (Germania)" + "'", str17, "tedesco (Germania)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category21.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ITA" + "'", str27, "ITA");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Germania" + "'", str32, "Germania");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ITA" + "'", str36, "ITA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ITA" + "'", str37, "ITA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "it" + "'", str38, "it");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ITA" + "'", str41, "ITA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "italiano" + "'", str44, "italiano");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ita" + "'", str45, "ita");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "tedesco" + "'", str48, "tedesco");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "de_DE");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.DateAndTime dateAndTime4 = faker1.date();
        com.github.javafaker.Address address5 = faker1.address();
        java.lang.String str7 = faker1.bothify("\uc911\uad6d\uc5b4\ub300\ub9cc)");
        com.github.javafaker.DateAndTime dateAndTime8 = faker1.date();
        java.lang.String str10 = faker1.letterify("\u5fb7\u6587\u5fb7\u570b)");
        com.github.javafaker.Finance finance11 = faker1.finance();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uc911\uad6d\uc5b4\ub300\ub9cc)" + "'", str7, "\uc911\uad6d\uc5b4\ub300\ub9cc)");
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u5fb7\u6587\u5fb7\u570b)" + "'", str10, "\u5fb7\u6587\u5fb7\u570b)");
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        double double15 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles();
        double double17 = random0.nextDouble();
        float float18 = random0.nextFloat();
        java.util.stream.IntStream intStream20 = random0.ints((long) 20);
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[29, -89, 87, -37, -93, -29]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.4812156484985569d) + "'", double14 == (-0.4812156484985569d));
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5304940412112966d + "'", double15 == 0.5304940412112966d);
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.573645108620352d + "'", double17 == 0.573645108620352d);
// flaky:         org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.7840042f + "'", float18 == 0.7840042f);
        org.junit.Assert.assertNotNull(intStream20);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        java.util.Locale.Builder builder11 = builder3.setLanguageTag("Chinese");
        java.util.Locale.Builder builder12 = builder3.clearExtensions();
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale16 = new java.util.Locale("IT", "fr_FR");
        java.lang.String str17 = locale13.getDisplayName(locale16);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.lang.String str20 = locale19.getISO3Country();
        java.lang.String str21 = locale19.getISO3Country();
        java.lang.String str22 = locale19.getLanguage();
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = locale24.getISO3Country();
        java.util.Locale locale26 = java.util.Locale.TAIWAN;
        java.lang.String str27 = locale24.getDisplayScript(locale26);
        java.lang.String str28 = locale19.getDisplayLanguage(locale24);
        java.lang.String str29 = locale16.getDisplayVariant(locale19);
        java.util.Locale locale30 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.Character> charSet31 = locale30.getExtensionKeys();
        java.lang.String str32 = locale30.getDisplayName();
        java.lang.String str33 = locale16.getDisplayName(locale30);
        java.util.Set<java.lang.String> strSet34 = locale30.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder35 = builder3.setLocale(locale30);
        java.lang.String str36 = locale30.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale16.toString(), "it_FR_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "cinese (Taiwan)" + "'", str17, "cinese (Taiwan)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ITA" + "'", str20, "ITA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ITA" + "'", str21, "ITA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "it" + "'", str22, "it");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ITA" + "'", str25, "ITA");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "italiano" + "'", str28, "italiano");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "cinese" + "'", str32, "cinese");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u610f\u5927\u5229\u6587 (FR_FR)" + "'", str33, "\u610f\u5927\u5229\u6587 (FR_FR)");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        java.util.Random random14 = new java.util.Random();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random14.nextBytes(byteArray21);
        java.util.stream.LongStream longStream25 = random14.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream27 = random14.doubles(1L);
        java.util.stream.IntStream intStream28 = random14.ints();
        java.util.stream.IntStream intStream32 = random14.ints((long) 351833871, 17, 1785693086);
        java.util.stream.IntStream intStream34 = random14.ints((long) 1490859811);
        java.util.Random random35 = new java.util.Random();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random35.nextBytes(byteArray42);
        java.util.Random random44 = new java.util.Random();
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random44.nextBytes(byteArray51);
        random35.nextBytes(byteArray51);
        random14.nextBytes(byteArray51);
        random0.nextBytes(byteArray51);
        java.lang.Class<?> wildcardClass56 = random0.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-19, -79, 58, 23, -27, -102]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(byteArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-110, -68, 43, 84, 64, 90]");
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(intStream28);
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNotNull(intStream34);
        org.junit.Assert.assertNotNull(byteArray42);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-80, 72, -4, 80, -50, 116]");
        org.junit.Assert.assertNotNull(byteArray51);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[37, -18, 119, -67, 7, -79]");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str5 = locale1.getDisplayScript();
        java.lang.String str6 = locale1.getISO3Language();
        java.util.Locale locale8 = new java.util.Locale("francese");
        java.lang.String str9 = locale8.getDisplayName();
        java.lang.String str10 = locale1.getDisplayScript(locale8);
        java.lang.String str11 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ita" + "'", str6, "ita");
        org.junit.Assert.assertEquals(locale8.toString(), "francese");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "francese" + "'", str9, "francese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italiano (Italia)" + "'", str11, "italiano (Italia)");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale7 = locale5.stripExtensions();
        java.util.Random random8 = new java.util.Random();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random8.nextBytes(byteArray15);
        java.util.stream.LongStream longStream19 = random8.longs((long) 10, (long) 'a');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale5, random8);
        java.lang.String str21 = locale5.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italia" + "'", str6, "Italia");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-33, 117, -37, -105, 126, 74]");
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ITA" + "'", str21, "ITA");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("und-a-it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getISO3Country();
        boolean boolean7 = locale4.hasExtensions();
        java.lang.String str9 = locale4.getExtension('a');
        java.util.Locale locale10 = locale4.stripExtensions();
        java.util.Locale.Builder builder11 = builder2.setLocale(locale10);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale13.getISO3Country();
        java.lang.String str15 = locale13.getISO3Country();
        java.lang.String str16 = locale13.getLanguage();
        java.util.Locale.Builder builder17 = builder2.setLocale(locale13);
        java.util.Locale.Builder builder19 = builder2.setLanguageTag("tedesco");
        java.util.Locale.Builder builder21 = builder2.setLanguageTag("italian");
        java.util.Locale.Builder builder22 = builder21.clearExtensions();
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = locale24.getISO3Country();
        java.util.Locale locale26 = java.util.Locale.TAIWAN;
        java.lang.String str27 = locale24.getDisplayScript(locale26);
        java.lang.String str28 = locale24.getDisplayScript();
        java.lang.String str29 = locale24.getISO3Language();
        java.util.Random random30 = new java.util.Random();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random30.nextBytes(byteArray37);
        java.util.stream.LongStream longStream41 = random30.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream43 = random30.doubles(1L);
        double double44 = random30.nextGaussian();
        double double45 = random30.nextDouble();
        java.util.stream.DoubleStream doubleStream48 = random30.doubles(0.8548341255517066d, (double) 0.9479531f);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale24, random30);
        java.util.Locale.Builder builder50 = builder21.setLocale(locale24);
        java.util.Locale.Builder builder51 = builder21.clear();
        java.util.Locale.Builder builder52 = builder51.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITA" + "'", str5, "ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ITA" + "'", str14, "ITA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it" + "'", str16, "it");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ITA" + "'", str25, "ITA");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ita" + "'", str29, "ita");
        org.junit.Assert.assertNotNull(byteArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-53, -30, -48, -79, -62, 84]");
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertNotNull(doubleStream43);
// flaky:         org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-0.3778697136185982d) + "'", double44 == (-0.3778697136185982d));
// flaky:         org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.8943484682754607d + "'", double45 == 0.8943484682754607d);
        org.junit.Assert.assertNotNull(doubleStream48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.setLanguage("ITALY");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder9.setLanguage("italiano");
        java.util.Locale.Builder builder14 = builder12.setLanguageTag("KOR");
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale16.getISO3Country();
        java.util.Locale locale20 = new java.util.Locale("fr_FR", "fr_FR");
        java.util.Locale locale23 = new java.util.Locale("hi!", "italiano");
        java.lang.String str24 = locale20.getDisplayScript(locale23);
        java.lang.String str25 = locale16.getDisplayName(locale23);
        boolean boolean26 = locale16.hasExtensions();
        java.util.Locale.Builder builder27 = builder14.setLocale(locale16);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ITA" + "'", str17, "ITA");
        org.junit.Assert.assertEquals(locale20.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals(locale23.toString(), "hi!_ITALIANO");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Italian (Italy)" + "'", str25, "Italian (Italy)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setLanguage("Italy");
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale7.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.lang.String str10 = locale7.getDisplayScript(locale9);
        java.lang.String str11 = locale7.getDisplayScript();
        java.lang.String str12 = locale7.getISO3Language();
        java.util.Locale.Builder builder13 = builder5.setLocale(locale7);
        java.util.Locale locale14 = builder13.build();
        java.lang.String str15 = locale14.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ita" + "'", str12, "ita");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "it_IT" + "'", str15, "it_IT");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str18 = locale2.getDisplayScript(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.lang.String str28 = locale26.toLanguageTag();
        java.util.Locale.setDefault(category0, locale26);
        java.util.Locale locale30 = java.util.Locale.getDefault(category0);
        java.util.Locale locale31 = java.util.Locale.GERMANY;
        java.lang.String str32 = locale31.getDisplayScript();
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.lang.String str34 = locale31.getDisplayScript(locale33);
        java.lang.String str35 = locale30.getDisplayVariant(locale31);
        java.util.Random random36 = new java.util.Random();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random36.nextBytes(byteArray43);
        java.util.stream.LongStream longStream45 = random36.longs();
        float float46 = random36.nextFloat();
        java.util.stream.DoubleStream doubleStream49 = random36.doubles((double) (-172665890), (double) 'a');
        random36.setSeed((long) (-1));
        boolean boolean52 = random36.nextBoolean();
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(locale30, random36);
        java.lang.String str55 = faker53.numerify("\u30a4\u30bf\u30ea\u30a2\u8a9e");
        com.github.javafaker.Internet internet56 = faker53.internet();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ko" + "'", str28, "ko");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(byteArray43);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[17, -124, 96, 74, -82, 34]");
        org.junit.Assert.assertNotNull(longStream45);
// flaky:         org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.6718474f + "'", float46 == 0.6718474f);
        org.junit.Assert.assertNotNull(doubleStream49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str55, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertNotNull(internet56);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale1.getScript();
        java.lang.String str4 = locale1.getDisplayScript();
        java.lang.String str5 = locale1.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random6.nextBytes(byteArray13);
        java.util.stream.LongStream longStream15 = random6.longs();
        float float16 = random6.nextFloat();
        float float17 = random6.nextFloat();
        java.util.stream.LongStream longStream19 = random6.longs((long) (byte) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random6);
        java.util.stream.DoubleStream doubleStream22 = random6.doubles();
        boolean boolean23 = locale1.equals((java.lang.Object) random6);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str2, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str5, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-27, -93, 84, 64, -118, 120]");
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.65912235f + "'", float16 == 0.65912235f);
// flaky:         org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.45797795f + "'", float17 == 0.45797795f);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setRegion("");
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder1.setLanguage("");
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale9.getISO3Country();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.util.Locale locale15 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str16 = locale9.getDisplayCountry(locale15);
        java.lang.String str17 = locale9.toLanguageTag();
        java.lang.String str18 = locale9.getDisplayCountry();
        java.util.Locale.Builder builder19 = builder7.setLocale(locale9);
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale locale22 = java.util.Locale.ITALY;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.lang.String str24 = locale23.getISO3Country();
        java.lang.String str25 = locale23.getISO3Country();
        java.lang.String str26 = locale23.toLanguageTag();
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.lang.String str28 = locale23.getDisplayName(locale27);
        java.lang.String str29 = locale23.toLanguageTag();
        java.lang.String str30 = locale23.getISO3Language();
        java.util.Set<java.lang.Character> charSet31 = locale23.getExtensionKeys();
        java.util.Random random32 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream34 = random32.doubles((long) 1);
        java.util.stream.IntStream intStream35 = random32.ints();
        java.util.stream.DoubleStream doubleStream36 = random32.doubles();
        java.util.stream.LongStream longStream37 = random32.longs();
        java.util.stream.DoubleStream doubleStream40 = random32.doubles((-0.4235051869499334d), (double) 1929786089);
        java.util.Random random41 = new java.util.Random();
        boolean boolean42 = random41.nextBoolean();
        java.util.stream.IntStream intStream44 = random41.ints((long) (short) 1);
        java.util.Random random45 = new java.util.Random();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random45.nextBytes(byteArray52);
        java.util.stream.LongStream longStream54 = random45.longs();
        float float55 = random45.nextFloat();
        java.util.stream.LongStream longStream57 = random45.longs((long) 0);
        java.util.stream.IntStream intStream60 = random45.ints((int) (short) 0, 303251316);
        java.util.Random random61 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream64 = random61.doubles((-1.3525503855396068d), (double) 0.0f);
        java.util.stream.IntStream intStream65 = random61.ints();
        java.util.Random random66 = new java.util.Random();
        byte[] byteArray73 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random66.nextBytes(byteArray73);
        java.util.stream.LongStream longStream77 = random66.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream79 = random66.doubles(1L);
        double double80 = random66.nextGaussian();
        java.util.stream.DoubleStream doubleStream82 = random66.doubles((long) 0);
        java.util.Random random83 = new java.util.Random();
        byte[] byteArray90 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random83.nextBytes(byteArray90);
        random66.nextBytes(byteArray90);
        random61.nextBytes(byteArray90);
        random45.nextBytes(byteArray90);
        random41.nextBytes(byteArray90);
        random32.nextBytes(byteArray90);
        com.github.javafaker.Faker faker97 = new com.github.javafaker.Faker(locale23, random32);
        java.util.Locale.setDefault(category0, locale23);
        java.util.Set<java.lang.String> strSet99 = locale23.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITA" + "'", str10, "ITA");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italy" + "'", str16, "Italy");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "it-IT" + "'", str17, "it-IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\uc774\ud0c8\ub9ac\uc544" + "'", str18, "\uc774\ud0c8\ub9ac\uc544");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ITA" + "'", str24, "ITA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ITA" + "'", str25, "ITA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "it-IT" + "'", str26, "it-IT");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Italienisch (Italien)" + "'", str28, "Italienisch (Italien)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "it-IT" + "'", str29, "it-IT");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ita" + "'", str30, "ita");
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertNotNull(doubleStream34);
        org.junit.Assert.assertNotNull(intStream35);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(longStream37);
        org.junit.Assert.assertNotNull(doubleStream40);
// flaky:         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intStream44);
        org.junit.Assert.assertNotNull(byteArray52);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[8, 84, -12, -29, -17, -120]");
        org.junit.Assert.assertNotNull(longStream54);
// flaky:         org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.939839f + "'", float55 == 0.939839f);
        org.junit.Assert.assertNotNull(longStream57);
        org.junit.Assert.assertNotNull(intStream60);
        org.junit.Assert.assertNotNull(doubleStream64);
        org.junit.Assert.assertNotNull(intStream65);
        org.junit.Assert.assertNotNull(byteArray73);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[-87, 24, -12, 83, 110, -80]");
        org.junit.Assert.assertNotNull(longStream77);
        org.junit.Assert.assertNotNull(doubleStream79);
// flaky:         org.junit.Assert.assertTrue("'" + double80 + "' != '" + 3.338359878211293d + "'", double80 == 3.338359878211293d);
        org.junit.Assert.assertNotNull(doubleStream82);
        org.junit.Assert.assertNotNull(byteArray90);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray90), "[115, 58, 86, -51, -65, 65]");
        org.junit.Assert.assertNotNull(strSet99);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayLanguage(locale2);
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale5 = locale2.stripExtensions();
        java.lang.String str6 = locale5.getISO3Language();
        java.lang.String str7 = locale5.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Koreanisch" + "'", str3, "Koreanisch");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "deu" + "'", str6, "deu");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str7, "\ub3c5\uc77c\uc5b4");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Company company2 = faker0.company();
        com.github.javafaker.Book book3 = faker0.book();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(company2);
        org.junit.Assert.assertNotNull(book3);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str18 = locale2.getDisplayScript(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.lang.String str28 = locale26.toLanguageTag();
        java.util.Locale.setDefault(category0, locale26);
        java.util.Locale locale30 = java.util.Locale.getDefault(category0);
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.lang.String str33 = locale32.getISO3Country();
        java.lang.String str34 = locale32.getISO3Country();
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.lang.String str38 = locale36.getDisplayName(locale37);
        java.lang.String str39 = locale32.getDisplayVariant(locale36);
        java.util.Set<java.lang.Character> charSet40 = locale32.getExtensionKeys();
        java.lang.String str41 = locale32.getISO3Country();
        java.lang.String str42 = locale32.getISO3Language();
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale45 = java.util.Locale.KOREAN;
        java.lang.String str46 = locale44.getDisplayName(locale45);
        java.util.Locale locale47 = java.util.Locale.ITALY;
        java.util.Locale locale48 = locale47.stripExtensions();
        java.lang.String str49 = locale48.getISO3Country();
        java.lang.String str50 = locale48.getISO3Country();
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.lang.String str54 = locale52.getDisplayName(locale53);
        java.lang.String str55 = locale48.getDisplayVariant(locale52);
        java.lang.String str56 = locale44.getDisplayScript(locale52);
        java.util.Locale locale59 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str60 = locale44.getDisplayScript(locale59);
        java.lang.String str61 = locale59.getDisplayName();
        boolean boolean62 = locale59.hasExtensions();
        java.lang.String str63 = locale32.getDisplayScript(locale59);
        java.util.Locale.setDefault(locale32);
        java.util.Locale.setDefault(category0, locale32);
        java.lang.String str66 = locale32.getDisplayName();
        java.lang.String str67 = locale32.getDisplayName();
        java.lang.String str68 = locale32.getISO3Country();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ko" + "'", str28, "ko");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ITA" + "'", str33, "ITA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ITA" + "'", str34, "ITA");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ITA" + "'", str41, "ITA");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ita" + "'", str42, "ita");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ITA" + "'", str49, "ITA");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ITA" + "'", str50, "ITA");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals(locale59.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "fr_fr (FR_FR)" + "'", str61, "fr_fr (FR_FR)");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "italiano (Italia)" + "'", str66, "italiano (Italia)");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "italiano (Italia)" + "'", str67, "italiano (Italia)");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "ITA" + "'", str68, "ITA");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        java.lang.String str4 = faker1.numerify("Italian");
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        com.github.javafaker.Number number6 = faker1.number();
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.Company company8 = faker1.company();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category5, locale9);
        java.lang.String str11 = locale1.getDisplayCountry(locale9);
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale12.getVariant();
        boolean boolean15 = locale12.hasExtensions();
        java.lang.String str16 = locale9.getDisplayName(locale12);
        java.util.Locale locale17 = java.util.Locale.ITALY;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale22 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str23 = locale17.getDisplayLanguage(locale22);
        java.lang.String str24 = locale22.getScript();
        boolean boolean25 = locale22.hasExtensions();
        java.lang.String str27 = locale22.getUnicodeLocaleType("zh");
        java.lang.String str28 = locale22.getDisplayScript();
        java.util.Locale locale32 = new java.util.Locale("hi!__ITA", "fr", "hi!");
        java.lang.String str33 = locale22.getDisplayCountry(locale32);
        java.util.Locale locale34 = locale32.stripExtensions();
        java.util.Set<java.lang.Character> charSet35 = locale34.getExtensionKeys();
        java.lang.String str36 = locale12.getDisplayCountry(locale34);
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.lang.String str39 = locale38.getISO3Country();
        java.util.Locale locale40 = java.util.Locale.TAIWAN;
        java.lang.String str41 = locale38.getDisplayScript(locale40);
        java.lang.String str42 = locale38.getDisplayScript();
        java.lang.String str43 = locale38.getISO3Language();
        java.util.Locale locale44 = java.util.Locale.ITALY;
        java.util.Locale locale45 = locale44.stripExtensions();
        java.lang.String str46 = locale45.getISO3Country();
        java.util.Locale locale47 = java.util.Locale.TAIWAN;
        java.lang.String str48 = locale45.getDisplayScript(locale47);
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("");
        java.lang.String str51 = locale47.getDisplayLanguage(locale50);
        java.lang.String str52 = locale38.getDisplayVariant(locale47);
        java.util.Set<java.lang.String> strSet53 = locale47.getUnicodeLocaleAttributes();
        java.lang.String str54 = locale47.toLanguageTag();
        java.util.Locale locale55 = java.util.Locale.ITALY;
        java.lang.String str56 = locale47.getDisplayVariant(locale55);
        java.lang.String str57 = locale12.getDisplayScript(locale47);
        java.lang.String str58 = locale12.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it-IT" + "'", str4, "it-IT");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale9.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italy" + "'", str11, "Italy");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! (ITA)" + "'", str16, "hi! (ITA)");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italian" + "'", str18, "Italian");
        org.junit.Assert.assertEquals(locale22.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Italian" + "'", str23, "Italian");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals(locale32.toString(), "hi!__ita_FR_hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!__ita_FR_hi!");
        org.junit.Assert.assertNotNull(charSet35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ITA" + "'", str39, "ITA");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ita" + "'", str43, "ita");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ITA" + "'", str46, "ITA");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Chinese" + "'", str51, "Chinese");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "zh-TW" + "'", str54, "zh-TW");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "kor" + "'", str58, "kor");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((double) (-172665890), (double) 'a');
        int int14 = random0.nextInt();
        java.util.Random random15 = new java.util.Random();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random15.nextBytes(byteArray22);
        java.util.stream.LongStream longStream26 = random15.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream28 = random15.doubles(1L);
        java.util.stream.IntStream intStream29 = random15.ints();
        java.util.stream.IntStream intStream33 = random15.ints((long) 351833871, 17, 1785693086);
        java.util.stream.IntStream intStream35 = random15.ints((long) 1490859811);
        java.util.Random random36 = new java.util.Random();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random36.nextBytes(byteArray43);
        java.util.Random random45 = new java.util.Random();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random45.nextBytes(byteArray52);
        random36.nextBytes(byteArray52);
        random15.nextBytes(byteArray52);
        random0.nextBytes(byteArray52);
        boolean boolean57 = random0.nextBoolean();
        float float58 = random0.nextFloat();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-66, 41, 79, -117, -11, 113]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.9360513f + "'", float10 == 0.9360513f);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-216922844) + "'", int14 == (-216922844));
        org.junit.Assert.assertNotNull(byteArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-64, 53, 92, -25, -105, -112]");
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertNotNull(intStream35);
        org.junit.Assert.assertNotNull(byteArray43);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[87, 51, 10, -99, 78, 118]");
        org.junit.Assert.assertNotNull(byteArray52);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[3, 14, -64, 50, 5, -65]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.15706903f + "'", float58 == 0.15706903f);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.util.Locale locale2 = new java.util.Locale("", "fr_fr_FR_FR");
        org.junit.Assert.assertEquals(locale2.toString(), "_FR_FR_FR_FR");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.util.Locale locale2 = new java.util.Locale("zh-TW", "Deutschland");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("ITA");
        java.lang.String str5 = locale2.getDisplayScript(locale4);
        java.lang.String str6 = locale4.getDisplayScript();
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale4.getUnicodeLocaleType("\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "zh-tw_DEUTSCHLAND");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Company company5 = faker1.company();
        java.lang.String str7 = faker1.bothify("it");
        com.github.javafaker.Book book8 = faker1.book();
        com.github.javafaker.Finance finance9 = faker1.finance();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale7.getISO3Country();
        java.lang.String str9 = locale7.getISO3Country();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.lang.String str14 = locale7.getDisplayVariant(locale11);
        java.lang.String str15 = locale3.getDisplayScript(locale11);
        java.util.Locale locale18 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str19 = locale3.getDisplayScript(locale18);
        java.lang.String str20 = locale18.toLanguageTag();
        java.lang.String str21 = locale18.toLanguageTag();
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder22.setRegion("");
        java.util.Locale.Builder builder26 = builder24.setRegion("");
        java.util.Locale locale27 = builder26.build();
        java.lang.String str28 = locale18.getDisplayName(locale27);
        java.lang.String str29 = locale0.getDisplayCountry(locale18);
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.util.Locale locale31 = locale30.stripExtensions();
        java.lang.String str32 = locale31.getISO3Country();
        java.lang.String str33 = locale31.getISO3Country();
        java.lang.String str34 = locale31.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.lang.String str36 = locale31.getDisplayName(locale35);
        boolean boolean37 = locale35.hasExtensions();
        java.lang.String str38 = locale35.getDisplayName();
        java.lang.String str39 = locale0.getDisplayLanguage(locale35);
        java.util.Random random40 = new java.util.Random();
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random40.nextBytes(byteArray47);
        java.util.stream.IntStream intStream50 = random40.ints(0L);
        double double51 = random40.nextGaussian();
        java.util.stream.IntStream intStream52 = random40.ints();
        java.util.stream.IntStream intStream53 = random40.ints();
        float float54 = random40.nextFloat();
        random40.setSeed((long) 927652996);
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker(locale0, random40);
        com.github.javafaker.PhoneNumber phoneNumber58 = faker57.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITA" + "'", str9, "ITA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale18.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "und" + "'", str20, "und");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "und" + "'", str21, "und");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr_fr (FR_FR)" + "'", str28, "fr_fr (FR_FR)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ITA" + "'", str32, "ITA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ITA" + "'", str33, "ITA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "it-IT" + "'", str34, "it-IT");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Italienisch (Italien)" + "'", str36, "Italienisch (Italien)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "German (Germany)" + "'", str38, "German (Germany)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Italienisch" + "'", str39, "Italienisch");
        org.junit.Assert.assertNotNull(byteArray47);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-118, 47, 44, 51, -38, 55]");
        org.junit.Assert.assertNotNull(intStream50);
// flaky:         org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-0.1724210919897754d) + "'", double51 == (-0.1724210919897754d));
        org.junit.Assert.assertNotNull(intStream52);
        org.junit.Assert.assertNotNull(intStream53);
// flaky:         org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.9792605f + "'", float54 == 0.9792605f);
        org.junit.Assert.assertNotNull(phoneNumber58);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        java.lang.String str6 = faker1.bothify("\uc911\uad6d\uc5b4\uc911\uad6d)");
        com.github.javafaker.Business business7 = faker1.business();
        com.github.javafaker.Code code8 = faker1.code();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker1.phoneNumber();
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        com.github.javafaker.DateAndTime dateAndTime11 = faker1.date();
        com.github.javafaker.Color color12 = faker1.color();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str6, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str8 = locale1.getDisplayCountry(locale7);
        java.util.Locale.setDefault(locale1);
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale12.getDisplayName();
        java.lang.String str14 = locale12.getDisplayName();
        java.lang.String str15 = locale12.getDisplayVariant();
        java.lang.String str16 = locale1.getDisplayCountry(locale12);
        java.lang.String str17 = locale12.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italy" + "'", str8, "Italy");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "cinese (Cina)" + "'", str13, "cinese (Cina)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "cinese (Cina)" + "'", str14, "cinese (Cina)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u610f\u5927\u5229" + "'", str16, "\u610f\u5927\u5229");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CN" + "'", str17, "CN");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.getLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        boolean boolean6 = locale1.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale1.getDisplayScript(locale7);
        java.util.Random random10 = new java.util.Random();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random10.nextBytes(byteArray17);
        java.util.stream.IntStream intStream20 = random10.ints(0L);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale1, random10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-124, -90, 123, 6, -17, 16]");
        org.junit.Assert.assertNotNull(intStream20);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        int int2 = random0.nextInt();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        java.lang.String str5 = faker3.bothify("ja");
        com.github.javafaker.Company company6 = faker3.company();
        com.github.javafaker.Company company7 = faker3.company();
        com.github.javafaker.Lorem lorem8 = faker3.lorem();
        com.github.javafaker.Lorem lorem9 = faker3.lorem();
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 561194437 + "'", int2 == 561194437);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ja" + "'", str5, "ja");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder7 = builder0.setLanguage("Englisch");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setExtension('a', "zh-tw (DEUTSCHLAND)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: tw (DEUTSCHLAND) [at index 3]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Code code4 = faker1.code();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Color color7 = faker1.color();
        com.github.javafaker.Book book8 = faker1.book();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale1.toLanguageTag();
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.lang.String str5 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko" + "'", str3, "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coreano" + "'", str4, "coreano");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ko" + "'", str5, "ko");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        java.lang.String str4 = faker1.numerify("Italian");
        java.lang.String str6 = faker1.bothify("italiano");
        com.github.javafaker.Business business7 = faker1.business();
        com.github.javafaker.Company company8 = faker1.company();
        com.github.javafaker.DateAndTime dateAndTime9 = faker1.date();
        com.github.javafaker.Address address10 = faker1.address();
        com.github.javafaker.Number number11 = faker1.number();
        com.github.javafaker.Color color12 = faker1.color();
        java.lang.String str14 = faker1.bothify("TWN");
        com.github.javafaker.Business business15 = faker1.business();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italiano" + "'", str6, "italiano");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "TWN" + "'", str14, "TWN");
        org.junit.Assert.assertNotNull(business15);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('a', "IT");
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = locale7.getLanguage();
        java.lang.String str10 = locale7.getISO3Language();
        java.lang.String str11 = locale7.getDisplayVariant();
        java.util.Locale.Builder builder12 = builder3.setLocale(locale7);
        java.util.Locale.Builder builder14 = builder3.removeUnicodeLocaleAttribute("Italia");
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = locale15.getVariant();
        java.util.Set<java.lang.Character> charSet17 = locale15.getExtensionKeys();
        java.lang.String str18 = locale15.getDisplayVariant();
        java.util.Locale.Builder builder19 = builder3.setLocale(locale15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra" + "'", str10, "fra");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.setLanguage("Chinese");
        java.util.Locale.Builder builder15 = builder10.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder18 = builder15.setExtension('a', "allemand");
        java.util.Locale.Builder builder20 = builder15.setRegion("");
        java.util.Locale.Builder builder23 = builder20.setExtension('a', "ITALY");
        java.util.Locale locale26 = new java.util.Locale("ita", "hi!");
        java.util.Locale locale29 = new java.util.Locale("", "ko");
        java.lang.String str30 = locale26.getDisplayCountry(locale29);
        java.util.Locale.Builder builder31 = builder23.setLocale(locale29);
        java.util.Locale.Builder builder32 = builder23.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertEquals(locale26.toString(), "ita_HI!");
        org.junit.Assert.assertEquals(locale29.toString(), "_KO");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HI!" + "'", str30, "HI!");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) (short) 10);
        double double13 = random0.nextDouble();
        java.util.Random random14 = new java.util.Random();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random14.nextBytes(byteArray21);
        double double23 = random14.nextGaussian();
        java.util.stream.DoubleStream doubleStream24 = random14.doubles();
        int int25 = random14.nextInt();
        java.util.stream.DoubleStream doubleStream27 = random14.doubles((long) (byte) 10);
        double double28 = random14.nextGaussian();
        java.util.Random random29 = new java.util.Random();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random29.nextBytes(byteArray36);
        random14.nextBytes(byteArray36);
        random0.nextBytes(byteArray36);
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream43 = random0.doubles((double) (-1796677045), (-1.0864281094261108d));
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-98, -84, 39, 22, -24, -51]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.70911944f + "'", float10 == 0.70911944f);
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.24346789248499312d + "'", double13 == 0.24346789248499312d);
        org.junit.Assert.assertNotNull(byteArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-38, -6, -41, 24, -24, -57]");
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.2667076225163456d + "'", double23 == 1.2667076225163456d);
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-568327857) + "'", int25 == (-568327857));
        org.junit.Assert.assertNotNull(doubleStream27);
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.8479554138454777d + "'", double28 == 0.8479554138454777d);
        org.junit.Assert.assertNotNull(byteArray36);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[41, -3, -126, -38, -40, -76]");
        org.junit.Assert.assertNotNull(doubleStream43);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str6 = locale4.getScript();
        boolean boolean7 = locale4.hasExtensions();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale8.getDisplayVariant(locale9);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale8.getDisplayName(locale12);
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.lang.String str15 = locale8.getDisplayName(locale14);
        java.lang.String str16 = locale4.getDisplayLanguage(locale8);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale4.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str13, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str15, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        java.util.stream.IntStream intStream3 = random0.ints((long) (short) 1);
        java.util.Random random4 = new java.util.Random();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random4.nextBytes(byteArray11);
        java.util.stream.LongStream longStream13 = random4.longs();
        float float14 = random4.nextFloat();
        java.util.stream.LongStream longStream16 = random4.longs((long) 0);
        java.util.stream.IntStream intStream19 = random4.ints((int) (short) 0, 303251316);
        java.util.Random random20 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream23 = random20.doubles((-1.3525503855396068d), (double) 0.0f);
        java.util.stream.IntStream intStream24 = random20.ints();
        java.util.Random random25 = new java.util.Random();
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random25.nextBytes(byteArray32);
        java.util.stream.LongStream longStream36 = random25.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream38 = random25.doubles(1L);
        double double39 = random25.nextGaussian();
        java.util.stream.DoubleStream doubleStream41 = random25.doubles((long) 0);
        java.util.Random random42 = new java.util.Random();
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random42.nextBytes(byteArray49);
        random25.nextBytes(byteArray49);
        random20.nextBytes(byteArray49);
        random4.nextBytes(byteArray49);
        random0.nextBytes(byteArray49);
        int int55 = random0.nextInt();
        java.util.stream.LongStream longStream56 = random0.longs();
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[24, -57, 34, 87, 62, 41]");
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.687492f + "'", float14 == 0.687492f);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(byteArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-115, 28, -104, -77, 117, -6]");
        org.junit.Assert.assertNotNull(longStream36);
        org.junit.Assert.assertNotNull(doubleStream38);
// flaky:         org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.381778529325787d + "'", double39 == 1.381778529325787d);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertNotNull(byteArray49);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-76, 37, 119, 35, 94, 59]");
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1520902202) + "'", int55 == (-1520902202));
        org.junit.Assert.assertNotNull(longStream56);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.util.Locale locale3 = new java.util.Locale("Italian", "IT", "Italia");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: italian_IT_Italia could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "italian_IT_Italia");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((-1.3525503855396068d), (double) 0.0f);
        java.util.stream.IntStream intStream4 = random0.ints();
        java.util.stream.LongStream longStream5 = random0.longs();
        float float6 = random0.nextFloat();
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(7844145195198406752L, (-0.8120215032774234d), (double) 0.77973783f);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.2658373f + "'", float6 == 0.2658373f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        java.util.stream.LongStream longStream5 = random0.longs((long) 'a', (long) 'a', (long) 'u');
        double double6 = random0.nextGaussian();
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5821117114389085d) + "'", double6 == (-0.5821117114389085d));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.getLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Number number6 = faker5.number();
        com.github.javafaker.Finance finance7 = faker5.finance();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker5.phoneNumber();
        java.lang.String str10 = faker5.letterify("hi!");
        com.github.javafaker.Internet internet11 = faker5.internet();
        com.github.javafaker.Business business12 = faker5.business();
        com.github.javafaker.Number number13 = faker5.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(number13);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.DoubleStream doubleStream11 = random0.doubles((long) 494295214);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream15 = random0.ints((int) '4', 707361935);
        java.util.stream.IntStream intStream16 = random0.ints();
        java.util.stream.LongStream longStream19 = random0.longs((long) 10, (long) 345804602);
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -48, 96, -39, -36, -38]");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(longStream19);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.util.Locale locale2 = new java.util.Locale("giapponese", "zh_TW");
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "giapponese_ZH_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "giapponese" + "'", str3, "giapponese");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale1.getScript();
        java.lang.String str4 = locale1.getDisplayScript();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setRegion("");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        java.util.Locale.Builder builder11 = builder8.setExtension('a', "IT");
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale12.getLanguage();
        java.lang.String str15 = locale12.getISO3Language();
        java.lang.String str16 = locale12.getDisplayVariant();
        java.util.Locale.Builder builder17 = builder8.setLocale(locale12);
        java.lang.String str18 = locale1.getDisplayLanguage(locale12);
        java.lang.String str19 = locale12.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr" + "'", str14, "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chinois" + "'", str18, "chinois");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FRA" + "'", str19, "FRA");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("");
        java.lang.String str7 = locale3.getDisplayLanguage(locale6);
        java.util.Random random8 = new java.util.Random();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random8.nextBytes(byteArray15);
        java.util.stream.LongStream longStream19 = random8.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream21 = random8.doubles(1L);
        double double22 = random8.nextGaussian();
        double double23 = random8.nextDouble();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale3, random8);
        java.lang.String str25 = locale3.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 37, 109, -71, -122, -124]");
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(doubleStream21);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.05738870021702544d + "'", double22 == 0.05738870021702544d);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.942575682095095d + "'", double23 == 0.942575682095095d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zho" + "'", str25, "zho");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder9 = builder3.setExtension('x', "allemand");
        java.util.Locale.Builder builder11 = builder3.addUnicodeLocaleAttribute("francese");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale14.getVariant();
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.lang.String str17 = locale14.getDisplayLanguage(locale16);
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.util.Locale locale19 = locale16.stripExtensions();
        java.lang.String str20 = locale19.getVariant();
        java.util.Locale.Builder builder21 = builder12.setLocale(locale19);
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.lang.String str26 = locale24.getDisplayName(locale25);
        java.util.Locale locale27 = java.util.Locale.ITALY;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = locale28.getISO3Country();
        java.lang.String str30 = locale28.getISO3Country();
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.lang.String str34 = locale32.getDisplayName(locale33);
        java.lang.String str35 = locale28.getDisplayVariant(locale32);
        java.lang.String str36 = locale24.getDisplayScript(locale32);
        java.util.Locale locale39 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str40 = locale24.getDisplayScript(locale39);
        java.util.Locale.setDefault(category22, locale39);
        java.util.Locale locale42 = java.util.Locale.PRC;
        java.util.Locale locale43 = java.util.Locale.ITALY;
        java.lang.String str44 = locale43.getDisplayLanguage();
        java.lang.String str45 = locale42.getDisplayVariant(locale43);
        java.util.Locale.setDefault(category22, locale43);
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.lang.String str49 = locale47.getDisplayCountry(locale48);
        java.lang.String str50 = locale48.toLanguageTag();
        java.util.Locale.setDefault(category22, locale48);
        java.util.Locale locale52 = java.util.Locale.getDefault(category22);
        java.util.Locale locale53 = java.util.Locale.ITALY;
        java.util.Locale locale54 = locale53.stripExtensions();
        java.lang.String str55 = locale54.getISO3Country();
        java.lang.String str56 = locale54.getISO3Country();
        java.util.Locale locale58 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale59 = java.util.Locale.KOREAN;
        java.lang.String str60 = locale58.getDisplayName(locale59);
        java.lang.String str61 = locale54.getDisplayVariant(locale58);
        java.util.Set<java.lang.Character> charSet62 = locale54.getExtensionKeys();
        java.lang.String str63 = locale54.getISO3Country();
        java.lang.String str64 = locale54.getISO3Language();
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale67 = java.util.Locale.KOREAN;
        java.lang.String str68 = locale66.getDisplayName(locale67);
        java.util.Locale locale69 = java.util.Locale.ITALY;
        java.util.Locale locale70 = locale69.stripExtensions();
        java.lang.String str71 = locale70.getISO3Country();
        java.lang.String str72 = locale70.getISO3Country();
        java.util.Locale locale74 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale75 = java.util.Locale.KOREAN;
        java.lang.String str76 = locale74.getDisplayName(locale75);
        java.lang.String str77 = locale70.getDisplayVariant(locale74);
        java.lang.String str78 = locale66.getDisplayScript(locale74);
        java.util.Locale locale81 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str82 = locale66.getDisplayScript(locale81);
        java.lang.String str83 = locale81.getDisplayName();
        boolean boolean84 = locale81.hasExtensions();
        java.lang.String str85 = locale54.getDisplayScript(locale81);
        java.util.Locale.setDefault(locale54);
        java.util.Locale.setDefault(category22, locale54);
        java.lang.String str88 = locale54.getVariant();
        java.util.Locale.Builder builder89 = builder12.setLocale(locale54);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "italian");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Koreanisch" + "'", str17, "Koreanisch");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ITA" + "'", str29, "ITA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ITA" + "'", str30, "ITA");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale39.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Italian" + "'", str44, "Italian");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ko" + "'", str50, "ko");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ITA" + "'", str55, "ITA");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ITA" + "'", str56, "ITA");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(charSet62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ITA" + "'", str63, "ITA");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ita" + "'", str64, "ita");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ITA" + "'", str71, "ITA");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ITA" + "'", str72, "ITA");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals(locale81.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "fr_fr (FR_FR)" + "'", str83, "fr_fr (FR_FR)");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Random random5 = new java.util.Random();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random5.nextBytes(byteArray12);
        java.util.stream.LongStream longStream14 = random5.longs();
        float float15 = random5.nextFloat();
        float float16 = random5.nextFloat();
        java.util.stream.DoubleStream doubleStream18 = random5.doubles(100L);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale3, random5);
        com.github.javafaker.Internet internet20 = faker19.internet();
        com.github.javafaker.Finance finance21 = faker19.finance();
        java.lang.String str23 = faker19.bothify("Chinese");
        com.github.javafaker.Company company24 = faker19.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[103, -24, 48, 66, -1, 49]");
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.16849977f + "'", float15 == 0.16849977f);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.55813277f + "'", float16 == 0.55813277f);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(finance21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chinese" + "'", str23, "Chinese");
        org.junit.Assert.assertNotNull(company24);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.util.Locale locale2 = new java.util.Locale("fr_FR", "it");
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale2.getDisplayLanguage(locale3);
        java.lang.String str5 = locale2.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi! (ITALIANO)");
        boolean boolean8 = locale2.equals((java.lang.Object) "hi! (ITALIANO)");
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_IT");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr_fr" + "'", str4, "fr_fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr_fr (Italia)" + "'", str5, "fr_fr (Italia)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Business business4 = faker1.business();
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Name name6 = faker1.name();
        java.lang.String str8 = faker1.numerify("Italiano");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italiano" + "'", str8, "Italiano");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        int int12 = random0.nextInt();
        int int13 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream14 = random0.doubles();
        java.util.stream.LongStream longStream17 = random0.longs((long) (-1155484576), (long) (-130403900));
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-57, -95, -103, -5, -115, 89]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.312799892201845d + "'", double9 == 1.312799892201845d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 549078631 + "'", int11 == 549078631);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 916390768 + "'", int12 == 916390768);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-134675402) + "'", int13 == (-134675402));
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(longStream17);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale7.getISO3Country();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.lang.String str10 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet9);
        java.lang.String str11 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale13.getISO3Country();
        java.lang.String str15 = locale13.getISO3Country();
        java.lang.String str16 = locale13.toLanguageTag();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale13.getDisplayName(locale17);
        java.lang.String str19 = locale13.toLanguageTag();
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = locale20.getDisplayCountry(locale23);
        java.lang.String str26 = locale23.getCountry();
        java.lang.String str27 = locale13.getDisplayScript(locale23);
        java.util.Set<java.lang.String> strSet28 = locale13.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet28);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ITA" + "'", str14, "ITA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it-IT" + "'", str16, "it-IT");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italienisch (Italien)" + "'", str18, "Italienisch (Italien)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "it-IT" + "'", str19, "it-IT");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IT" + "'", str26, "IT");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        int int12 = random0.nextInt();
        int int13 = random0.nextInt();
        java.util.stream.LongStream longStream14 = random0.longs();
        int int16 = random0.nextInt(522952910);
        boolean boolean17 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[36, -57, 16, -115, -48, -119]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-2.084177495205961d) + "'", double9 == (-2.084177495205961d));
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 654000168 + "'", int11 == 654000168);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1065807112 + "'", int12 == 1065807112);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1779648666 + "'", int13 == 1779648666);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 473809918 + "'", int16 == 473809918);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale7 = locale5.stripExtensions();
        java.util.Random random8 = new java.util.Random();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random8.nextBytes(byteArray15);
        java.util.stream.LongStream longStream19 = random8.longs((long) 10, (long) 'a');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale5, random8);
        java.util.Random random21 = new java.util.Random();
        java.util.stream.LongStream longStream25 = random21.longs((long) 348768006, (long) (byte) 10, (long) '4');
        float float26 = random21.nextFloat();
        java.util.stream.LongStream longStream28 = random21.longs((long) 5);
        float float29 = random21.nextFloat();
        int int31 = random21.nextInt(1929786089);
        int int33 = random21.nextInt(1799417324);
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(locale5, random21);
        com.github.javafaker.Finance finance35 = faker34.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italia" + "'", str6, "Italia");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-82, 59, -101, -93, -52, 92]");
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(longStream25);
// flaky:         org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.91835654f + "'", float26 == 0.91835654f);
        org.junit.Assert.assertNotNull(longStream28);
// flaky:         org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.007982194f + "'", float29 == 0.007982194f);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 727914308 + "'", int31 == 727914308);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1559673209 + "'", int33 == 1559673209);
        org.junit.Assert.assertNotNull(finance35);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.DateAndTime dateAndTime4 = faker1.date();
        com.github.javafaker.Address address5 = faker1.address();
        com.github.javafaker.Number number6 = faker1.number();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.util.Locale locale2 = new java.util.Locale("IT", "Koreanisch");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for KOREANISCH");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "it_KOREANISCH");
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.DateAndTime dateAndTime4 = faker1.date();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Options options7 = faker1.options();
        java.lang.String str9 = faker1.numerify("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = faker1.resolve("ZHO");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eng" + "'", str9, "eng");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.util.Locale locale2 = new java.util.Locale("it", "CHN");
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale6 = new java.util.Locale("IT", "fr_FR");
        java.lang.String str7 = locale3.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = locale10.getISO3Country();
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.lang.String str13 = locale10.getDisplayScript(locale12);
        java.lang.String str14 = locale10.getDisplayScript();
        java.lang.String str15 = locale10.getISO3Language();
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale17.getISO3Country();
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.lang.String str20 = locale17.getDisplayScript(locale19);
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("");
        java.lang.String str23 = locale19.getDisplayLanguage(locale22);
        java.lang.String str24 = locale10.getDisplayVariant(locale19);
        java.util.Locale locale25 = locale19.stripExtensions();
        java.lang.String str26 = locale8.getDisplayName(locale19);
        java.util.Set<java.lang.Character> charSet27 = locale8.getExtensionKeys();
        java.lang.String str28 = locale3.getDisplayLanguage(locale8);
        java.lang.String str29 = locale2.getDisplayCountry(locale8);
        org.junit.Assert.assertEquals(locale2.toString(), "it_CHN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale6.toString(), "it_FR_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cinese (Taiwan)" + "'", str7, "cinese (Taiwan)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITA" + "'", str11, "ITA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ita" + "'", str15, "ita");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ITA" + "'", str18, "ITA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chinese" + "'", str23, "Chinese");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str26, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CHN" + "'", str29, "CHN");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str18 = locale2.getDisplayScript(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.lang.String str28 = locale26.toLanguageTag();
        java.util.Locale.setDefault(category0, locale26);
        java.lang.String str30 = locale26.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ko" + "'", str28, "ko");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Options options4 = faker3.options();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker3.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        java.util.stream.IntStream intStream3 = random0.ints((long) (short) 1);
        int int5 = random0.nextInt(835576485);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 132075556 + "'", int5 == 132075556);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder10 = builder5.removeUnicodeLocaleAttribute("ita");
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.lang.String str16 = locale14.getDisplayName(locale15);
        java.util.Locale locale17 = java.util.Locale.ITALY;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.lang.String str19 = locale18.getISO3Country();
        java.lang.String str20 = locale18.getISO3Country();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.lang.String str24 = locale22.getDisplayName(locale23);
        java.lang.String str25 = locale18.getDisplayVariant(locale22);
        java.lang.String str26 = locale14.getDisplayScript(locale22);
        java.util.Locale locale29 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str30 = locale14.getDisplayScript(locale29);
        java.lang.String str31 = locale29.toLanguageTag();
        java.lang.String str32 = locale29.toLanguageTag();
        java.util.Locale.Builder builder33 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder33.setRegion("");
        java.util.Locale.Builder builder37 = builder35.setRegion("");
        java.util.Locale locale38 = builder37.build();
        java.lang.String str39 = locale29.getDisplayName(locale38);
        java.lang.String str40 = locale11.getDisplayCountry(locale29);
        java.lang.String str42 = locale29.getExtension('x');
        java.util.Locale locale43 = java.util.Locale.JAPANESE;
        java.util.Locale locale46 = new java.util.Locale("Chinese", "fr");
        java.util.Locale locale47 = java.util.Locale.ITALY;
        java.util.Locale locale48 = locale47.stripExtensions();
        java.lang.String str49 = locale48.getISO3Country();
        java.lang.String str50 = locale48.getISO3Country();
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.lang.String str54 = locale52.getDisplayName(locale53);
        java.lang.String str55 = locale48.getDisplayVariant(locale52);
        java.util.Set<java.lang.Character> charSet56 = locale48.getExtensionKeys();
        java.lang.String str57 = locale48.getISO3Country();
        java.lang.String str58 = locale48.getISO3Language();
        java.lang.String str59 = locale46.getDisplayCountry(locale48);
        java.lang.String str60 = locale43.getDisplayLanguage(locale48);
        com.github.javafaker.Faker faker61 = new com.github.javafaker.Faker(locale43);
        java.lang.String str62 = locale29.getDisplayCountry(locale43);
        java.util.Locale.Builder builder63 = builder5.setLocale(locale43);
        java.util.Locale locale64 = builder63.build();
        java.util.Locale.Builder builder65 = builder63.clearExtensions();
        java.util.Locale.Builder builder67 = builder65.removeUnicodeLocaleAttribute("KOR");
        java.util.Locale.Builder builder68 = builder65.clear();
        java.util.Locale.Builder builder69 = builder68.clear();
        java.util.Locale locale70 = builder68.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str7, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str12, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ITA" + "'", str19, "ITA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ITA" + "'", str20, "ITA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals(locale29.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "und" + "'", str31, "und");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "und" + "'", str32, "und");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "fr_fr (FR_FR)" + "'", str39, "fr_fr (FR_FR)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ja");
        org.junit.Assert.assertEquals(locale46.toString(), "chinese_FR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ITA" + "'", str49, "ITA");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ITA" + "'", str50, "ITA");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(charSet56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ITA" + "'", str57, "ITA");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ita" + "'", str58, "ita");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Francia" + "'", str59, "Francia");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "giapponese" + "'", str60, "giapponese");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "FR_FR" + "'", str62, "FR_FR");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ja");
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        int int2 = random0.nextInt();
        boolean boolean3 = random0.nextBoolean();
        boolean boolean4 = random0.nextBoolean();
        random0.setSeed((long) 560171919);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1256820068 + "'", int2 == 1256820068);
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.lang.String str13 = locale1.getDisplayScript(locale9);
        java.lang.String str14 = locale1.getLanguage();
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale16.getISO3Country();
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.lang.String str19 = locale16.getDisplayScript(locale18);
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("");
        java.lang.String str22 = locale18.getDisplayLanguage(locale21);
        java.lang.String str23 = locale18.getISO3Language();
        java.lang.String str24 = locale1.getDisplayCountry(locale18);
        java.lang.String str25 = locale1.getISO3Language();
        java.util.Locale locale26 = locale1.stripExtensions();
        java.util.Locale locale27 = java.util.Locale.ITALY;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = locale28.getISO3Country();
        java.lang.String str30 = locale28.getISO3Country();
        boolean boolean31 = locale28.hasExtensions();
        java.lang.String str32 = locale1.getDisplayLanguage(locale28);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ITA" + "'", str17, "ITA");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chinese" + "'", str22, "Chinese");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zho" + "'", str23, "zho");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ITA" + "'", str29, "ITA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ITA" + "'", str30, "ITA");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("usa", 0.10684275436520865d);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        int int10 = random0.nextInt();
        float float11 = random0.nextFloat();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-24, -63, -89, 35, -37, 15]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.5554354818964266d) + "'", double9 == (-0.5554354818964266d));
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1866951011 + "'", int10 == 1866951011);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.06964517f + "'", float11 == 0.06964517f);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayName(locale5);
        java.lang.String str7 = locale1.toLanguageTag();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.lang.String str10 = locale8.getDisplayCountry(locale9);
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale8.getDisplayCountry(locale11);
        java.lang.String str14 = locale11.getCountry();
        java.lang.String str15 = locale1.getDisplayScript(locale11);
        java.util.Random random16 = new java.util.Random();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random16.nextBytes(byteArray23);
        double double25 = random16.nextGaussian();
        java.util.stream.DoubleStream doubleStream26 = random16.doubles();
        int int27 = random16.nextInt();
        java.util.stream.DoubleStream doubleStream29 = random16.doubles(0L);
        long long30 = random16.nextLong();
        java.util.stream.DoubleStream doubleStream32 = random16.doubles((long) (short) 10);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale1, random16);
        int int35 = random16.nextInt((int) (short) 1);
        boolean boolean36 = random16.nextBoolean();
        java.util.stream.LongStream longStream37 = random16.longs();
        java.util.stream.LongStream longStream39 = random16.longs((long) 772868751);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it-IT" + "'", str4, "it-IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch (Italien)" + "'", str6, "Italienisch (Italien)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it-IT" + "'", str7, "it-IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IT" + "'", str14, "IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(byteArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[108, -85, 95, 24, -81, 32]");
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.06409434764274885d) + "'", double25 == (-0.06409434764274885d));
        org.junit.Assert.assertNotNull(doubleStream26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1335215833) + "'", int27 == (-1335215833));
        org.junit.Assert.assertNotNull(doubleStream29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1069716243763044331L + "'", long30 == 1069716243763044331L);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(longStream37);
        org.junit.Assert.assertNotNull(longStream39);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "ITA", "Italian", "fr_FR", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList27);
        java.util.Collection<java.lang.String> strCollection30 = null;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strCollection30);
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection30, filteringMode32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap34);
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.lang.String str37 = locale36.getVariant();
        java.util.Set<java.lang.String> strSet38 = locale36.getUnicodeLocaleAttributes();
        java.lang.String str39 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet38);
        java.util.Locale locale40 = java.util.Locale.ITALY;
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale41.getISO3Country();
        java.util.Locale locale43 = java.util.Locale.TAIWAN;
        java.lang.String str44 = locale41.getDisplayScript(locale43);
        java.lang.String str45 = locale41.getDisplayScript();
        java.lang.String str46 = locale41.getDisplayName();
        java.lang.String str48 = locale41.getExtension('a');
        java.lang.String str49 = locale41.getCountry();
        java.util.Set<java.lang.String> strSet50 = locale41.getUnicodeLocaleAttributes();
        java.lang.String str51 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet50);
        java.util.Locale locale52 = java.util.Locale.ITALY;
        java.util.Locale locale53 = locale52.stripExtensions();
        java.lang.String str54 = locale53.getISO3Country();
        java.util.Locale locale55 = java.util.Locale.TAIWAN;
        java.lang.String str56 = locale53.getDisplayScript(locale55);
        java.util.Locale locale58 = java.util.Locale.forLanguageTag("");
        java.lang.String str59 = locale55.getDisplayLanguage(locale58);
        java.lang.String str60 = locale55.getDisplayScript();
        java.util.Set<java.lang.String> strSet61 = locale55.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet61);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode32.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ITA" + "'", str42, "ITA");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4\uc774\ud0c8\ub9ac\uc544)" + "'", str46, "\uc774\ud0c8\ub9ac\uc544\uc5b4\uc774\ud0c8\ub9ac\uc544)");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "IT" + "'", str49, "IT");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ITA" + "'", str54, "ITA");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Chinese" + "'", str59, "Chinese");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(strList62);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        int int6 = random0.nextInt(351833871);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        java.util.Random random8 = new java.util.Random();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random8.nextBytes(byteArray15);
        java.util.stream.LongStream longStream17 = random8.longs();
        float float18 = random8.nextFloat();
        java.util.stream.DoubleStream doubleStream20 = random8.doubles((long) (short) 10);
        java.util.stream.LongStream longStream21 = random8.longs();
        java.util.stream.DoubleStream doubleStream25 = random8.doubles(6448421598433570082L, (double) 0.28971082f, (double) 0.31204516f);
        double double26 = random8.nextGaussian();
        java.util.stream.IntStream intStream27 = random8.ints();
        java.util.Random random28 = new java.util.Random();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random28.nextBytes(byteArray35);
        java.util.stream.LongStream longStream37 = random28.longs();
        float float38 = random28.nextFloat();
        java.util.stream.DoubleStream doubleStream41 = random28.doubles((double) (-172665890), (double) 'a');
        int int42 = random28.nextInt();
        java.util.Random random43 = new java.util.Random();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random43.nextBytes(byteArray50);
        java.util.stream.LongStream longStream54 = random43.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream56 = random43.doubles(1L);
        java.util.stream.IntStream intStream57 = random43.ints();
        java.util.stream.IntStream intStream61 = random43.ints((long) 351833871, 17, 1785693086);
        java.util.stream.IntStream intStream63 = random43.ints((long) 1490859811);
        java.util.Random random64 = new java.util.Random();
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random64.nextBytes(byteArray71);
        java.util.Random random73 = new java.util.Random();
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random73.nextBytes(byteArray80);
        random64.nextBytes(byteArray80);
        random43.nextBytes(byteArray80);
        random28.nextBytes(byteArray80);
        random8.nextBytes(byteArray80);
        random0.nextBytes(byteArray80);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 300533599 + "'", int6 == 300533599);
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 69, 4, 29, -105, 89]");
        org.junit.Assert.assertNotNull(longStream17);
// flaky:         org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8345705f + "'", float18 == 0.8345705f);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(doubleStream25);
// flaky:         org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.3343387189357548d + "'", double26 == 0.3343387189357548d);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertNotNull(byteArray35);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[35, 35, 85, 88, -79, -96]");
        org.junit.Assert.assertNotNull(longStream37);
// flaky:         org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.7126397f + "'", float38 == 0.7126397f);
        org.junit.Assert.assertNotNull(doubleStream41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1195803120 + "'", int42 == 1195803120);
        org.junit.Assert.assertNotNull(byteArray50);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-53, -85, -10, -23, 36, -119]");
        org.junit.Assert.assertNotNull(longStream54);
        org.junit.Assert.assertNotNull(doubleStream56);
        org.junit.Assert.assertNotNull(intStream57);
        org.junit.Assert.assertNotNull(intStream61);
        org.junit.Assert.assertNotNull(intStream63);
        org.junit.Assert.assertNotNull(byteArray71);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[28, -81, 97, -32, -95, 28]");
        org.junit.Assert.assertNotNull(byteArray80);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[19, -20, -1, 106, -86, 27]");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("IT");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale4.getDisplayCountry(locale7);
        java.util.Locale.setDefault(locale4);
        java.lang.String str11 = locale2.getDisplayCountry(locale4);
        java.lang.String str12 = locale2.getDisplayScript();
        java.lang.String str13 = locale2.getISO3Country();
        java.lang.String str15 = locale2.getUnicodeLocaleType("IT");
        java.lang.String str16 = locale2.getCountry();
        java.lang.String str17 = locale2.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ita" + "'", str17, "ita");
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale3.getDisplayName();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category8);
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale14 = new java.util.Locale("IT", "fr_FR");
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        boolean boolean17 = locale14.hasExtensions();
        java.util.Locale.setDefault(category0, locale14);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str4, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals(locale14.toString(), "it_FR_FR");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder0.setLanguage("");
        java.util.Locale locale7 = builder0.build();
        java.util.Locale.Builder builder9 = builder0.setLanguage("taiwan");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        long long14 = random0.nextLong();
        boolean boolean15 = random0.nextBoolean();
        boolean boolean16 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream18 = random0.longs((long) (-1598593222));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-67, -24, 25, 53, 26, -39]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.094968437111311d + "'", double9 == 1.094968437111311d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1226750391 + "'", int11 == 1226750391);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 8291247154592455512L + "'", long14 == 8291247154592455512L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str5 = locale1.getScript();
        java.lang.String str6 = locale1.getISO3Country();
        java.util.Locale locale7 = locale1.stripExtensions();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Finance finance9 = faker8.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream4 = random0.longs((long) 348768006, (long) (byte) 10, (long) '4');
        java.util.stream.IntStream intStream8 = random0.ints((long) 5, 1, 1785693086);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        random0.setSeed(0L);
        boolean boolean12 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        java.util.stream.IntStream intStream14 = random0.ints();
        java.util.stream.IntStream intStream18 = random0.ints((long) 351833871, 17, 1785693086);
        java.util.stream.LongStream longStream19 = random0.longs();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-86, -102, -106, 22, -15, 83]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(longStream19);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        boolean boolean2 = random0.nextBoolean();
        random0.setSeed((long) (-890288509));
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random0.longs((long) (-906838747), (long) 28819237, (long) 2104060322);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        java.util.stream.DoubleStream doubleStream15 = random0.doubles((double) 0.59870124f, (double) 4407342282996398343L);
        double double16 = random0.nextDouble();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-115, 106, 101, -26, 84, 76]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.9634061907206481d + "'", double9 == 1.9634061907206481d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 539447776 + "'", int11 == 539447776);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.8071105221299136d + "'", double16 == 0.8071105221299136d);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder9 = builder3.setExtension('x', "allemand");
        java.util.Locale.Builder builder11 = builder3.addUnicodeLocaleAttribute("francese");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale14.getVariant();
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.lang.String str17 = locale14.getDisplayLanguage(locale16);
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.util.Locale locale19 = locale16.stripExtensions();
        java.lang.String str20 = locale19.getVariant();
        java.util.Locale.Builder builder21 = builder12.setLocale(locale19);
        java.util.Random random23 = new java.util.Random(100L);
        java.util.Random random24 = new java.util.Random();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random24.nextBytes(byteArray31);
        java.util.stream.LongStream longStream35 = random24.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream37 = random24.doubles(1L);
        double double38 = random24.nextGaussian();
        java.util.stream.DoubleStream doubleStream40 = random24.doubles((long) 0);
        float float41 = random24.nextFloat();
        double double42 = random24.nextDouble();
        java.util.stream.LongStream longStream44 = random24.longs(0L);
        java.util.Random random45 = new java.util.Random();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random45.nextBytes(byteArray52);
        java.util.stream.DoubleStream doubleStream54 = random45.doubles();
        java.util.Random random55 = new java.util.Random();
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random55.nextBytes(byteArray62);
        double double64 = random55.nextGaussian();
        java.util.stream.DoubleStream doubleStream65 = random55.doubles();
        int int66 = random55.nextInt();
        java.util.stream.DoubleStream doubleStream68 = random55.doubles(0L);
        java.util.stream.DoubleStream doubleStream71 = random55.doubles(0.4582760166551051d, (double) 100);
        byte[] byteArray74 = new byte[] { (byte) -1, (byte) 0 };
        random55.nextBytes(byteArray74);
        random45.nextBytes(byteArray74);
        random24.nextBytes(byteArray74);
        random23.nextBytes(byteArray74);
        double double79 = random23.nextGaussian();
        com.github.javafaker.Faker faker80 = new com.github.javafaker.Faker(locale19, random23);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "italian");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Koreanisch" + "'", str17, "Koreanisch");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(byteArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[9, 116, 116, -61, 49, 77]");
        org.junit.Assert.assertNotNull(longStream35);
        org.junit.Assert.assertNotNull(doubleStream37);
// flaky:         org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.434957509894158d) + "'", double38 == (-1.434957509894158d));
        org.junit.Assert.assertNotNull(doubleStream40);
// flaky:         org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.5359748f + "'", float41 == 0.5359748f);
// flaky:         org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.9342878636797561d + "'", double42 == 0.9342878636797561d);
        org.junit.Assert.assertNotNull(longStream44);
        org.junit.Assert.assertNotNull(byteArray52);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[82, 19, -75, 38, -17, 80]");
        org.junit.Assert.assertNotNull(doubleStream54);
        org.junit.Assert.assertNotNull(byteArray62);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[104, -42, -47, -19, 47, 14]");
// flaky:         org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-0.06153905889512521d) + "'", double64 == (-0.06153905889512521d));
        org.junit.Assert.assertNotNull(doubleStream65);
// flaky:         org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1510498570 + "'", int66 == 1510498570);
        org.junit.Assert.assertNotNull(doubleStream68);
        org.junit.Assert.assertNotNull(doubleStream71);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-42, -97]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.9875616649976979d + "'", double79 == 0.9875616649976979d);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.numerify("fr_FR");
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber();
        java.lang.String str10 = faker1.bothify("italian_IT_Italia");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr_FR" + "'", str7, "fr_FR");
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italian_IT_Italia" + "'", str10, "italian_IT_Italia");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str5 = locale1.getDisplayScript();
        java.lang.String str6 = locale1.getISO3Language();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale8.getDisplayScript(locale10);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.lang.String str14 = locale10.getDisplayLanguage(locale13);
        java.lang.String str15 = locale1.getDisplayVariant(locale10);
        java.util.Set<java.lang.String> strSet16 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str17 = locale10.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.lang.String str19 = locale10.getDisplayVariant(locale18);
        java.lang.String str20 = locale18.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ita" + "'", str6, "ita");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITA" + "'", str9, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese" + "'", str14, "Chinese");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-TW" + "'", str17, "zh-TW");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "it-IT" + "'", str20, "it-IT");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("");
        java.lang.String str7 = locale3.getDisplayLanguage(locale6);
        java.lang.String str8 = locale3.getISO3Language();
        java.util.Locale locale12 = new java.util.Locale("cinese (Taiwan)", "", "fr");
        java.lang.String str13 = locale3.getDisplayVariant(locale12);
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleAttributes();
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale19 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category15, locale19);
        java.lang.String str21 = locale19.getScript();
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.util.Locale locale25 = java.util.Locale.ITALY;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale22.getDisplayCountry(locale25);
        java.lang.String str28 = locale19.getDisplayLanguage(locale22);
        java.lang.String str29 = locale12.getDisplayName(locale19);
        boolean boolean30 = locale19.hasExtensions();
        java.lang.String str31 = locale19.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
        org.junit.Assert.assertEquals(locale12.toString(), "cinese (taiwan)__fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category15.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale19.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "cinese (taiwan) (fr)" + "'", str29, "cinese (taiwan) (fr)");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.LongStream longStream12 = random0.longs((long) 0);
        java.util.stream.LongStream longStream13 = random0.longs();
        java.util.stream.LongStream longStream15 = random0.longs((long) 1005825242);
        float float16 = random0.nextFloat();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-73, -94, -64, 49, -71, 39]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.4635089f + "'", float10 == 0.4635089f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.63719195f + "'", float16 == 0.63719195f);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.Random random3 = new java.util.Random();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random3.nextBytes(byteArray10);
        random0.nextBytes(byteArray10);
        float float13 = random0.nextFloat();
        double double14 = random0.nextDouble();
        double double15 = random0.nextGaussian();
        int int17 = random0.nextInt(787097194);
        java.util.Random random18 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream20 = random18.doubles((long) 1);
        java.util.stream.IntStream intStream21 = random18.ints();
        java.util.stream.DoubleStream doubleStream22 = random18.doubles();
        java.util.stream.LongStream longStream23 = random18.longs();
        java.util.stream.DoubleStream doubleStream26 = random18.doubles((-0.4235051869499334d), (double) 1929786089);
        java.util.Random random27 = new java.util.Random();
        boolean boolean28 = random27.nextBoolean();
        java.util.stream.IntStream intStream30 = random27.ints((long) (short) 1);
        java.util.Random random31 = new java.util.Random();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random31.nextBytes(byteArray38);
        java.util.stream.LongStream longStream40 = random31.longs();
        float float41 = random31.nextFloat();
        java.util.stream.LongStream longStream43 = random31.longs((long) 0);
        java.util.stream.IntStream intStream46 = random31.ints((int) (short) 0, 303251316);
        java.util.Random random47 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream50 = random47.doubles((-1.3525503855396068d), (double) 0.0f);
        java.util.stream.IntStream intStream51 = random47.ints();
        java.util.Random random52 = new java.util.Random();
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random52.nextBytes(byteArray59);
        java.util.stream.LongStream longStream63 = random52.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream65 = random52.doubles(1L);
        double double66 = random52.nextGaussian();
        java.util.stream.DoubleStream doubleStream68 = random52.doubles((long) 0);
        java.util.Random random69 = new java.util.Random();
        byte[] byteArray76 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random69.nextBytes(byteArray76);
        random52.nextBytes(byteArray76);
        random47.nextBytes(byteArray76);
        random31.nextBytes(byteArray76);
        random27.nextBytes(byteArray76);
        random18.nextBytes(byteArray76);
        random0.nextBytes(byteArray76);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-81, 59, -52, -67, 76, 25]");
// flaky:         org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.7914251f + "'", float13 == 0.7914251f);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6194883511435993d + "'", double14 == 0.6194883511435993d);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.44096079963717405d) + "'", double15 == (-0.44096079963717405d));
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 621066829 + "'", int17 == 621066829);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(doubleStream26);
// flaky:         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertNotNull(byteArray38);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-52, -49, -34, -76, 96, -16]");
        org.junit.Assert.assertNotNull(longStream40);
// flaky:         org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.07074833f + "'", float41 == 0.07074833f);
        org.junit.Assert.assertNotNull(longStream43);
        org.junit.Assert.assertNotNull(intStream46);
        org.junit.Assert.assertNotNull(doubleStream50);
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertNotNull(byteArray59);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-88, 99, -32, 97, -123, -127]");
        org.junit.Assert.assertNotNull(longStream63);
        org.junit.Assert.assertNotNull(doubleStream65);
// flaky:         org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.2173932484140453d + "'", double66 == 1.2173932484140453d);
        org.junit.Assert.assertNotNull(doubleStream68);
        org.junit.Assert.assertNotNull(byteArray76);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-70, 127, -17, 115, 17, 18]");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "ITA", "Italian", "fr_FR", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList20, strMap21);
        java.util.Locale.Category category23 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale24 = java.util.Locale.getDefault(category23);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.util.Locale locale27 = new java.util.Locale("IT");
        java.lang.String str28 = locale25.getDisplayVariant(locale27);
        java.util.Locale.setDefault(category23, locale25);
        java.util.Locale locale31 = new java.util.Locale("IT");
        java.util.Locale.setDefault(category23, locale31);
        java.util.Locale locale35 = new java.util.Locale("hi!", "italiano");
        java.lang.String str36 = locale31.getDisplayVariant(locale35);
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strSet37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.parse("English", strMap40);
        java.util.Locale locale42 = java.util.Locale.PRC;
        java.util.Locale locale43 = java.util.Locale.ITALY;
        java.lang.String str44 = locale43.getDisplayLanguage();
        java.lang.String str45 = locale42.getDisplayVariant(locale43);
        java.util.Set<java.lang.String> strSet46 = locale42.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags(languageRangeList41, (java.util.Collection<java.lang.String>) strSet46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList56);
        java.lang.String[] strArray63 = new java.lang.String[] { "ITA", "Italian", "fr_FR", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList64);
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList75);
        java.util.Collection<java.lang.String> strCollection78 = null;
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, strCollection78);
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strCollection78, filteringMode80);
        java.lang.String str82 = java.util.Locale.lookupTag(languageRangeList41, (java.util.Collection<java.lang.String>) strList81);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strList81);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category23.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "hi!__ITA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals(locale31.toString(), "it");
        org.junit.Assert.assertEquals(locale35.toString(), "hi!_ITALIANO");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "italiano" + "'", str44, "italiano");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode80.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(strList83);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Company company3 = faker1.company();
        com.github.javafaker.Lorem lorem4 = faker1.lorem();
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Color color4 = faker1.color();
        com.github.javafaker.Internet internet5 = faker1.internet();
        com.github.javafaker.Address address6 = faker1.address();
        com.github.javafaker.Book book7 = faker1.book();
        java.lang.String str9 = faker1.letterify("x-lvariant-ITA");
        com.github.javafaker.Lorem lorem10 = faker1.lorem();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "x-lvariant-ITA" + "'", str9, "x-lvariant-ITA");
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder10 = builder5.addUnicodeLocaleAttribute("ITA");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale.Builder builder14 = builder10.removeUnicodeLocaleAttribute("Italiano");
        java.util.Locale.Builder builder15 = builder10.clearExtensions();
        java.util.Locale.Builder builder17 = builder15.setLanguage("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tedesco (Germania)" + "'", str7, "tedesco (Germania)");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE_#u-ita");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        java.util.Locale locale1 = new java.util.Locale("IT");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getLanguage();
        java.util.Random random4 = new java.util.Random();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random4.nextBytes(byteArray11);
        java.util.stream.DoubleStream doubleStream13 = random4.doubles();
        java.util.Random random14 = new java.util.Random();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random14.nextBytes(byteArray21);
        double double23 = random14.nextGaussian();
        java.util.stream.DoubleStream doubleStream24 = random14.doubles();
        int int25 = random14.nextInt();
        java.util.stream.DoubleStream doubleStream27 = random14.doubles(0L);
        java.util.stream.DoubleStream doubleStream30 = random14.doubles(0.4582760166551051d, (double) 100);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 0 };
        random14.nextBytes(byteArray33);
        random4.nextBytes(byteArray33);
        double double36 = random4.nextGaussian();
        int int37 = random4.nextInt();
        java.util.stream.LongStream longStream39 = random4.longs(0L);
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(locale1, random4);
        java.util.Random random42 = new java.util.Random((long) (-720507519));
        java.util.stream.IntStream intStream45 = random42.ints(0, 282464450);
        java.util.stream.LongStream longStream46 = random42.longs();
        java.util.stream.LongStream longStream48 = random42.longs((long) 273070545);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale1, random42);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-93, -80, -38, 27, 102, 122]");
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(byteArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[110, 81, 13, 124, 74, 98]");
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.6477847523095704d) + "'", double23 == (-0.6477847523095704d));
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-202771150) + "'", int25 == (-202771150));
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[110, 44]");
// flaky:         org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.69696555712314d) + "'", double36 == (-1.69696555712314d));
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2056856438) + "'", int37 == (-2056856438));
        org.junit.Assert.assertNotNull(longStream39);
        org.junit.Assert.assertNotNull(intStream45);
        org.junit.Assert.assertNotNull(longStream46);
        org.junit.Assert.assertNotNull(longStream48);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList19);
        java.util.Collection<java.lang.String> strCollection22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strCollection22);
        java.lang.String str24 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection22);
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Random random26 = new java.util.Random();
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random26.nextBytes(byteArray33);
        java.util.stream.LongStream longStream35 = random26.longs();
        float float36 = random26.nextFloat();
        java.util.stream.DoubleStream doubleStream39 = random26.doubles((double) (-172665890), (double) 'a');
        int int40 = random26.nextInt();
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale25, random26);
        java.util.Set<java.lang.String> strSet42 = locale25.getUnicodeLocaleKeys();
        java.lang.String str43 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet42);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[54, 70, -67, 1, -100, 13]");
        org.junit.Assert.assertNotNull(longStream35);
// flaky:         org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.03096497f + "'", float36 == 0.03096497f);
        org.junit.Assert.assertNotNull(doubleStream39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-619271443) + "'", int40 == (-619271443));
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ko", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("Korean");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("x-lvariant-ITA", strMap8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList9, strMap10);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.parse("Italia");
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList22);
        java.util.Collection<java.lang.String> strCollection25 = null;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strCollection25);
        java.util.Collection<java.util.Locale> localeCollection27 = null;
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList36);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList47);
        java.util.Collection<java.lang.String> strCollection50 = null;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, strCollection50);
        java.lang.String str52 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strCollection50);
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, (java.util.Collection<java.lang.String>) strList61);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList61, filteringMode64);
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, localeCollection27, filteringMode64);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter(languageRangeList13, (java.util.Collection<java.util.Locale>) localeList66, filteringMode67);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter(languageRangeList11, (java.util.Collection<java.util.Locale>) localeList68, filteringMode69);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList68);
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList81);
        java.lang.String str84 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList81);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode64.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode67.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList68);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.util.Locale locale3 = new java.util.Locale("giapponese", "Italian (Italy)", "kor");
        java.lang.String str4 = locale3.getCountry();
        java.lang.String str6 = locale3.getExtension('u');
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.String str10 = locale3.getDisplayVariant(locale8);
        org.junit.Assert.assertEquals(locale3.toString(), "giapponese_ITALIAN (ITALY)_kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITALIAN (ITALY)" + "'", str4, "ITALIAN (ITALY)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "kor" + "'", str10, "kor");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setRegion("");
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder1.setLanguage("");
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale9.getISO3Country();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.util.Locale locale15 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str16 = locale9.getDisplayCountry(locale15);
        java.lang.String str17 = locale9.toLanguageTag();
        java.lang.String str18 = locale9.getDisplayCountry();
        java.util.Locale.Builder builder19 = builder7.setLocale(locale9);
        java.util.Locale.setDefault(category0, locale9);
        java.lang.String str21 = locale9.getDisplayScript();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = locale22.getDisplayScript();
        java.lang.String str24 = locale9.getDisplayVariant(locale22);
        java.lang.String str25 = locale9.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITA" + "'", str10, "ITA");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italy" + "'", str16, "Italy");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "it-IT" + "'", str17, "it-IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italia" + "'", str18, "Italia");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "it" + "'", str25, "it");
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("deu");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList10);
        java.util.Collection<java.lang.String> strCollection13 = null;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strCollection13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList25, filteringMode26);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList27);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode26.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        java.util.Locale locale3 = new java.util.Locale("\u30a4\u30bf\u30ea\u30a2", "FRANCESE", "zh_CN");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale4.getDisplayName(locale8);
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.lang.String str11 = locale4.getDisplayName(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale4);
        java.lang.String str13 = locale3.getCountry();
        java.util.Locale locale15 = new java.util.Locale("Deutschland");
        java.lang.String str16 = locale3.getDisplayLanguage(locale15);
        org.junit.Assert.assertEquals(locale3.toString(), "\u30a4\u30bf\u30ea\u30a2_FRANCESE_zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italiano" + "'", str6, "italiano");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str9, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str11, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u30a4\u30bf\u30ea\u30a2" + "'", str12, "\u30a4\u30bf\u30ea\u30a2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRANCESE" + "'", str13, "FRANCESE");
        org.junit.Assert.assertEquals(locale15.toString(), "deutschland");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u30a4\u30bf\u30ea\u30a2" + "'", str16, "\u30a4\u30bf\u30ea\u30a2");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getISO3Country();
        java.util.Locale locale6 = new java.util.Locale("fr_FR", "fr_FR");
        java.util.Locale locale9 = new java.util.Locale("hi!", "italiano");
        java.lang.String str10 = locale6.getDisplayScript(locale9);
        java.lang.String str11 = locale2.getDisplayName(locale9);
        boolean boolean12 = locale2.hasExtensions();
        java.util.Set<java.lang.Character> charSet13 = locale2.getExtensionKeys();
        java.util.Locale locale14 = locale2.stripExtensions();
        java.util.Locale.setDefault(category0, locale14);
        java.util.Locale locale19 = new java.util.Locale("USA", "twn", "KOR");
        java.util.Locale.setDefault(category0, locale19);
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder21.setRegion("");
        java.util.Locale.Builder builder24 = builder21.clearExtensions();
        java.util.Locale.Builder builder26 = builder21.setVariant("Italian");
        java.util.Locale.Builder builder28 = builder21.setLanguage("Englisch");
        java.util.Locale locale29 = builder28.build();
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale29);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals(locale6.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_ITALIANO");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italian (Italy)" + "'", str11, "Italian (Italy)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale19.toString(), "usa_TWN_KOR");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "englisch__Italian");
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.util.Random random1 = new java.util.Random((long) (-720507519));
        java.util.stream.IntStream intStream4 = random1.ints(0, 282464450);
        java.util.stream.LongStream longStream5 = random1.longs();
        int int6 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles(100L);
        java.util.stream.LongStream longStream11 = random1.longs(0L, (long) 1130084575);
        java.util.stream.LongStream longStream15 = random1.longs(0L, 0L, 2411378824708896685L);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-74652392) + "'", int6 == (-74652392));
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayLanguage(locale2);
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale locale12 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str13 = locale6.getDisplayCountry(locale12);
        java.lang.String str14 = locale6.toLanguageTag();
        java.lang.String str15 = locale2.getDisplayLanguage(locale6);
        java.lang.String str16 = locale2.getDisplayCountry();
        java.util.Locale locale18 = new java.util.Locale("\uc601\uc5b4");
        java.lang.String str19 = locale2.getDisplayName(locale18);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Koreanisch" + "'", str3, "Koreanisch");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italy" + "'", str13, "Italy");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "it-IT" + "'", str14, "it-IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "tedesco" + "'", str15, "tedesco");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Germany" + "'", str16, "Germany");
        org.junit.Assert.assertEquals(locale18.toString(), "\uc601\uc5b4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "German (Germany)" + "'", str19, "German (Germany)");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder10 = builder5.addUnicodeLocaleAttribute("ITA");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale.Builder builder14 = builder10.removeUnicodeLocaleAttribute("Italiano");
        java.util.Locale.Builder builder15 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder10.removeUnicodeLocaleAttribute("\uc774\ud0c8\ub9ac\uc544");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "German (Germany)" + "'", str7, "German (Germany)");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE_#u-ita");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale7.getISO3Country();
        java.lang.String str9 = locale7.getISO3Country();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.lang.String str14 = locale7.getDisplayVariant(locale11);
        java.lang.String str15 = locale3.getDisplayScript(locale11);
        java.util.Locale locale18 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str19 = locale3.getDisplayScript(locale18);
        java.lang.String str20 = locale18.toLanguageTag();
        java.lang.String str21 = locale18.toLanguageTag();
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder22.setRegion("");
        java.util.Locale.Builder builder26 = builder24.setRegion("");
        java.util.Locale locale27 = builder26.build();
        java.lang.String str28 = locale18.getDisplayName(locale27);
        java.lang.String str29 = locale0.getDisplayCountry(locale18);
        java.lang.String str31 = locale18.getExtension('x');
        java.util.Locale locale32 = locale18.stripExtensions();
        java.lang.String str33 = locale18.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITA" + "'", str9, "ITA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale18.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "und" + "'", str20, "und");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "und" + "'", str21, "und");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr_fr (FR_FR)" + "'", str28, "fr_fr (FR_FR)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "fr_fr" + "'", str33, "fr_fr");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayLanguage(locale2);
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale locale12 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str13 = locale6.getDisplayCountry(locale12);
        java.lang.String str14 = locale6.toLanguageTag();
        java.lang.String str15 = locale2.getDisplayLanguage(locale6);
        java.lang.String str17 = locale6.getExtension('x');
        java.util.Locale locale18 = locale6.stripExtensions();
        java.lang.String str19 = locale6.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Koreanisch" + "'", str3, "Koreanisch");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italy" + "'", str13, "Italy");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "it-IT" + "'", str14, "it-IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "tedesco" + "'", str15, "tedesco");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IT" + "'", str19, "IT");
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) (short) 10);
        java.util.stream.LongStream longStream13 = random0.longs();
        java.util.stream.LongStream longStream15 = random0.longs(8783292564207623477L);
        java.util.stream.LongStream longStream18 = random0.longs((long) (-1043233907), 5679743667668332909L);
        java.util.stream.IntStream intStream21 = random0.ints((-47076306), 427836975);
        java.util.Random random22 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream25 = random22.doubles((-1.3525503855396068d), (double) 0.0f);
        java.util.stream.IntStream intStream26 = random22.ints();
        java.util.stream.DoubleStream doubleStream28 = random22.doubles(100L);
        java.util.Random random29 = new java.util.Random();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random29.nextBytes(byteArray36);
        int int39 = random29.nextInt((int) 'u');
        double double40 = random29.nextDouble();
        float float41 = random29.nextFloat();
        java.util.stream.DoubleStream doubleStream45 = random29.doubles(0L, (double) 0.73533946f, (double) 303251316);
        byte[] byteArray46 = new byte[] {};
        random29.nextBytes(byteArray46);
        random22.nextBytes(byteArray46);
        random0.nextBytes(byteArray46);
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, -127, 121, 97, 6, 44]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.53786355f + "'", float10 == 0.53786355f);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(byteArray36);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-98, -74, 69, -39, 115, 68]");
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 40 + "'", int39 == 40);
// flaky:         org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.422797243326394d + "'", double40 == 0.422797243326394d);
// flaky:         org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.6054424f + "'", float41 == 0.6054424f);
        org.junit.Assert.assertNotNull(doubleStream45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        boolean boolean17 = locale16.hasExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("");
        java.lang.String str7 = locale3.getDisplayLanguage(locale6);
        java.lang.String str8 = locale3.getISO3Language();
        java.util.Locale locale12 = new java.util.Locale("cinese (Taiwan)", "", "fr");
        java.lang.String str13 = locale3.getDisplayVariant(locale12);
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleAttributes();
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale16.getISO3Country();
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.lang.String str19 = locale16.getDisplayScript(locale18);
        java.lang.String str20 = locale16.getDisplayScript();
        java.lang.String str21 = locale16.getLanguage();
        java.lang.String str22 = locale12.getDisplayVariant(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = locale16.getUnicodeLocaleType("ITA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ITA");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
        org.junit.Assert.assertEquals(locale12.toString(), "cinese (taiwan)__fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ITA" + "'", str17, "ITA");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr" + "'", str22, "fr");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.LongStream longStream12 = random0.longs((long) 0);
        java.util.stream.LongStream longStream13 = random0.longs();
        java.util.stream.LongStream longStream15 = random0.longs((long) 1005825242);
        int int16 = random0.nextInt();
        java.util.stream.IntStream intStream20 = random0.ints(7844145195198406752L, (-307816200), 11986013);
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[42, 98, 12, 53, 21, 88]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.20392203f + "'", float10 == 0.20392203f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1016432557 + "'", int16 == 1016432557);
        org.junit.Assert.assertNotNull(intStream20);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.util.Locale locale3 = new java.util.Locale("DEUTSCHLAND", "\u4e2d\u6587", "ita");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for deutschland");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587_ita");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Set<java.lang.Character> charSet9 = locale1.getExtensionKeys();
        java.lang.String str10 = locale1.getISO3Country();
        java.lang.String str11 = locale1.getISO3Language();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale17.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.lang.String str23 = locale21.getDisplayName(locale22);
        java.lang.String str24 = locale17.getDisplayVariant(locale21);
        java.lang.String str25 = locale13.getDisplayScript(locale21);
        java.util.Locale locale28 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str29 = locale13.getDisplayScript(locale28);
        java.lang.String str30 = locale28.getDisplayName();
        boolean boolean31 = locale28.hasExtensions();
        java.lang.String str32 = locale1.getDisplayScript(locale28);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale1);
        java.lang.String str34 = locale1.getLanguage();
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.lang.String str36 = locale35.getVariant();
        java.util.Locale locale37 = java.util.Locale.GERMANY;
        java.lang.String str38 = locale35.getDisplayLanguage(locale37);
        java.util.Set<java.lang.String> strSet39 = locale37.getUnicodeLocaleKeys();
        java.util.Locale locale40 = java.util.Locale.ITALY;
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale41.getISO3Country();
        java.util.Set<java.lang.String> strSet43 = locale41.getUnicodeLocaleKeys();
        java.util.Locale locale47 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str48 = locale41.getDisplayCountry(locale47);
        java.lang.String str49 = locale41.toLanguageTag();
        java.lang.String str50 = locale37.getDisplayLanguage(locale41);
        java.lang.String str51 = locale1.getDisplayScript(locale41);
        java.util.Set<java.lang.String> strSet52 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str53 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITA" + "'", str10, "ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ita" + "'", str11, "ita");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ITA" + "'", str18, "ITA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ITA" + "'", str19, "ITA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale28.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fr_fr (FR_FR)" + "'", str30, "fr_fr (FR_FR)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "it" + "'", str34, "it");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Koreanisch" + "'", str38, "Koreanisch");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ITA" + "'", str42, "ITA");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals(locale47.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Italy" + "'", str48, "Italy");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "it-IT" + "'", str49, "it-IT");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "tedesco" + "'", str50, "tedesco");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Italian (Italy)" + "'", str53, "Italian (Italy)");
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        java.util.stream.LongStream longStream5 = random1.longs(5220315840914706967L, (-5687018651894451761L), (long) (-2013612937));
        java.util.stream.LongStream longStream9 = random1.longs((long) 338305525, 0L, (long) 1989017876);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random1.longs(0L, (long) (-1870871500));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale4 = new java.util.Locale("IT");
        java.lang.String str5 = locale2.getDisplayVariant(locale4);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.util.Random random9 = new java.util.Random();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random9.nextBytes(byteArray16);
        java.util.stream.DoubleStream doubleStream18 = random9.doubles();
        java.util.stream.DoubleStream doubleStream20 = random9.doubles((long) 494295214);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random9);
        double double22 = random9.nextGaussian();
        java.util.stream.DoubleStream doubleStream23 = random9.doubles();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale7, random9);
        com.github.javafaker.Options options25 = faker24.options();
        com.github.javafaker.PhoneNumber phoneNumber26 = faker24.phoneNumber();
        com.github.javafaker.DateAndTime dateAndTime27 = faker24.date();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(byteArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[7, -66, -47, -128, 48, -49]");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.20222262614480938d) + "'", double22 == (-0.20222262614480938d));
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(phoneNumber26);
        org.junit.Assert.assertNotNull(dateAndTime27);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ITALY");
        java.util.Locale locale2 = java.util.Locale.ITALY;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Country();
        java.lang.String str6 = locale3.getLanguage();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale3);
        boolean boolean8 = locale3.hasExtensions();
        java.lang.String str9 = locale3.getScript();
        java.util.Locale.setDefault(locale3);
        java.lang.String str11 = locale3.getCountry();
        boolean boolean12 = languageRange1.equals((java.lang.Object) str11);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITA" + "'", str5, "ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IT" + "'", str11, "IT");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("\u7fa9\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.getLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Number number6 = faker5.number();
        com.github.javafaker.Internet internet7 = faker5.internet();
        com.github.javafaker.Code code8 = faker5.code();
        com.github.javafaker.Book book9 = faker5.book();
        java.lang.String str11 = faker5.numerify("italian (Italien,Italia)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italian (Italien,Italia)" + "'", str11, "italian (Italien,Italia)");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getVariant();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getCountry();
        java.lang.String str7 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CN" + "'", str6, "CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CN" + "'", str7, "CN");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        java.util.stream.LongStream longStream5 = random0.longs((long) 'a', (long) 'a', (long) 'u');
        double double6 = random0.nextDouble();
        int int8 = random0.nextInt(74);
        java.util.stream.IntStream intStream9 = random0.ints();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem11 = faker10.lorem();
        com.github.javafaker.Options options12 = faker10.options();
        com.github.javafaker.Lorem lorem13 = faker10.lorem();
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.38776543999686974d + "'", double6 == 0.38776543999686974d);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 66 + "'", int8 == 66);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(lorem13);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.setLanguage("TWN");
        java.util.Locale locale7 = builder0.build();
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale9.getCountry();
        java.lang.String str12 = locale9.getDisplayVariant();
        java.lang.String str13 = locale7.getDisplayCountry(locale9);
        java.lang.String str14 = locale9.getVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "twn" + "'", str8, "twn");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italiano" + "'", str10, "italiano");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IT" + "'", str11, "IT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getISO3Country();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.toLanguageTag();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.lang.String str9 = locale6.getLanguage();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = locale11.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale11.getDisplayScript(locale13);
        java.lang.String str15 = locale6.getDisplayLanguage(locale11);
        java.lang.String str16 = locale11.getISO3Language();
        java.lang.String str17 = locale11.getScript();
        java.util.Locale locale19 = new java.util.Locale("\u97d3\u6587");
        java.lang.String str20 = locale11.getDisplayScript(locale19);
        java.lang.String str21 = locale0.getDisplayName(locale19);
        boolean boolean22 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it" + "'", str9, "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ITA" + "'", str12, "ITA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italiano" + "'", str15, "italiano");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ita" + "'", str16, "ita");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale19.toString(), "\u97d3\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "French" + "'", str21, "French");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english(unitedkingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.util.Locale locale2 = new java.util.Locale("eng", "\ud504\ub791\uc2a4,hi!)");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\ud504\ub791\uc2a4,HI!)");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("fr");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str12 = locale11.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale14.getISO3Country();
        boolean boolean17 = locale14.hasExtensions();
        java.lang.String str18 = locale11.getDisplayVariant(locale14);
        java.util.Locale.Builder builder19 = builder3.setLocale(locale11);
        java.util.Locale.Builder builder20 = builder3.clearExtensions();
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("Francia");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ITA" + "'", str16, "ITA");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zho", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("ko");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("italiano");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.parse("Italia");
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList19);
        java.util.Collection<java.lang.String> strCollection22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strCollection22);
        java.util.Collection<java.util.Locale> localeCollection24 = null;
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList44);
        java.util.Collection<java.lang.String> strCollection47 = null;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strCollection47);
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strCollection47);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList58);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList58, filteringMode61);
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, localeCollection24, filteringMode61);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter(languageRangeList10, (java.util.Collection<java.util.Locale>) localeList63, filteringMode64);
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.List<java.util.Locale> localeList67 = java.util.Locale.filter(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList67);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + filteringMode61 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode61.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(localeList63);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNotNull(localeList67);
        org.junit.Assert.assertNotNull(localeList68);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = new java.util.Locale("Italian", "IT", "Italia");
        java.util.Locale.setDefault(locale4);
        java.util.Locale.setDefault(category0, locale4);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale4.toString(), "italian_IT_Italia");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        double double15 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles();
        int int18 = random0.nextInt(1038659894);
        float float19 = random0.nextFloat();
        random0.setSeed((long) 25326595);
        double double22 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[2, 88, 63, -65, -113, 79]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.6831290333768536d + "'", double14 == 1.6831290333768536d);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.12889168551583596d + "'", double15 == 0.12889168551583596d);
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 506684370 + "'", int18 == 506684370);
// flaky:         org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8040235f + "'", float19 == 0.8040235f);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0408758634445006d) + "'", double22 == (-1.0408758634445006d));
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Address address7 = faker1.address();
        com.github.javafaker.Internet internet8 = faker1.internet();
        com.github.javafaker.Options options9 = faker1.options();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker1.phoneNumber();
        com.github.javafaker.Book book11 = faker1.book();
        com.github.javafaker.Business business12 = faker1.business();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(business12);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str18 = locale2.getDisplayScript(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Locale.setDefault(category0, locale21);
        java.lang.String str25 = locale21.getISO3Country();
        java.util.Locale locale26 = java.util.Locale.PRC;
        java.util.Locale locale27 = java.util.Locale.ITALY;
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.lang.String str29 = locale26.getDisplayVariant(locale27);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale26);
        java.lang.String str31 = locale26.getISO3Language();
        java.util.Set<java.lang.String> strSet32 = locale26.getUnicodeLocaleAttributes();
        boolean boolean33 = locale21.equals((java.lang.Object) strSet32);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ITA" + "'", str25, "ITA");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "italiano" + "'", str28, "italiano");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zho" + "'", str31, "zho");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) (short) 10);
        double double13 = random0.nextDouble();
        java.util.Random random14 = new java.util.Random();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random14.nextBytes(byteArray21);
        double double23 = random14.nextGaussian();
        java.util.stream.DoubleStream doubleStream24 = random14.doubles();
        int int25 = random14.nextInt();
        java.util.stream.DoubleStream doubleStream27 = random14.doubles((long) (byte) 10);
        double double28 = random14.nextGaussian();
        java.util.Random random29 = new java.util.Random();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random29.nextBytes(byteArray36);
        random14.nextBytes(byteArray36);
        random0.nextBytes(byteArray36);
        java.util.stream.DoubleStream doubleStream40 = random0.doubles();
        java.util.Random random41 = new java.util.Random();
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random41.nextBytes(byteArray48);
        java.util.stream.LongStream longStream52 = random41.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream54 = random41.doubles(1L);
        double double55 = random41.nextGaussian();
        java.util.stream.DoubleStream doubleStream57 = random41.doubles((long) 0);
        java.util.Random random58 = new java.util.Random();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random58.nextBytes(byteArray65);
        random41.nextBytes(byteArray65);
        random0.nextBytes(byteArray65);
        long long69 = random0.nextLong();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-100, -127, 25, -58, -58, 4]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5018838f + "'", float10 == 0.5018838f);
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5673023302906595d + "'", double13 == 0.5673023302906595d);
        org.junit.Assert.assertNotNull(byteArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-72, -35, 40, -21, -128, -69]");
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.19428028295586472d) + "'", double23 == (-0.19428028295586472d));
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2036611302) + "'", int25 == (-2036611302));
        org.junit.Assert.assertNotNull(doubleStream27);
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.409384384087329d) + "'", double28 == (-1.409384384087329d));
        org.junit.Assert.assertNotNull(byteArray36);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[87, -68, -84, 20, -92, 100]");
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertNotNull(byteArray48);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-12, 113, -124, -114, -117, 59]");
        org.junit.Assert.assertNotNull(longStream52);
        org.junit.Assert.assertNotNull(doubleStream54);
// flaky:         org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0796123957900898d) + "'", double55 == (-1.0796123957900898d));
        org.junit.Assert.assertNotNull(doubleStream57);
        org.junit.Assert.assertNotNull(byteArray65);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[8, -92, -120, 64, 1, 67]");
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-6102055999237506702L) + "'", long69 == (-6102055999237506702L));
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        java.util.Locale.Builder builder11 = builder3.setLanguageTag("Chinese");
        java.util.Locale.Builder builder12 = builder3.clearExtensions();
        java.util.Locale.Builder builder15 = builder3.setExtension('x', "Italia");
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.lang.String str19 = locale17.getDisplayName(locale18);
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale21.getISO3Country();
        java.lang.String str23 = locale21.getISO3Country();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.lang.String str27 = locale25.getDisplayName(locale26);
        java.lang.String str28 = locale21.getDisplayVariant(locale25);
        java.lang.String str29 = locale17.getDisplayScript(locale25);
        java.lang.String str30 = locale17.getLanguage();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.lang.String str33 = locale32.getISO3Country();
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        java.lang.String str35 = locale32.getDisplayScript(locale34);
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("");
        java.lang.String str38 = locale34.getDisplayLanguage(locale37);
        java.lang.String str39 = locale34.getISO3Language();
        java.lang.String str40 = locale17.getDisplayCountry(locale34);
        java.util.Locale.Builder builder41 = builder15.setLocale(locale17);
        java.util.Locale locale42 = builder41.build();
        java.util.Locale.Builder builder43 = builder41.clear();
        java.util.Locale.Builder builder45 = builder41.setLanguage("twn");
        java.util.Locale.Builder builder47 = builder41.removeUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder48 = builder41.clearExtensions();
        java.util.Locale locale49 = java.util.Locale.ITALY;
        java.util.Locale locale50 = locale49.stripExtensions();
        java.lang.String str51 = locale50.getISO3Country();
        java.util.Locale locale52 = java.util.Locale.TAIWAN;
        java.lang.String str53 = locale50.getDisplayScript(locale52);
        java.lang.String str54 = locale50.getDisplayScript();
        java.lang.String str55 = locale50.getISO3Language();
        java.util.Random random56 = new java.util.Random();
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random56.nextBytes(byteArray63);
        java.util.stream.LongStream longStream67 = random56.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream69 = random56.doubles(1L);
        double double70 = random56.nextGaussian();
        double double71 = random56.nextDouble();
        java.util.stream.DoubleStream doubleStream74 = random56.doubles(0.8548341255517066d, (double) 0.9479531f);
        com.github.javafaker.Faker faker75 = new com.github.javafaker.Faker(locale50, random56);
        java.util.Locale.Builder builder76 = builder41.setLocale(locale50);
        java.util.Locale.Builder builder78 = builder41.setVariant("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ITA" + "'", str22, "ITA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ITA" + "'", str23, "ITA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ITA" + "'", str33, "ITA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Chinese" + "'", str38, "Chinese");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zho" + "'", str39, "zho");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ITA" + "'", str51, "ITA");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ita" + "'", str55, "ita");
        org.junit.Assert.assertNotNull(byteArray63);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[13, 25, -48, 92, -90, 60]");
        org.junit.Assert.assertNotNull(longStream67);
        org.junit.Assert.assertNotNull(doubleStream69);
// flaky:         org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.3347992066287042d) + "'", double70 == (-1.3347992066287042d));
// flaky:         org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.9236828666859043d + "'", double71 == 0.9236828666859043d);
        org.junit.Assert.assertNotNull(doubleStream74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream5 = random0.longs((long) 874102345);
        java.util.stream.LongStream longStream9 = random0.longs((long) 1860279296, (long) 257103200, (long) 1256779919);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str3 = locale1.getISO3Language();
        java.lang.String str4 = locale1.getDisplayName();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.util.Locale locale6 = locale5.stripExtensions();
        boolean boolean7 = locale5.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cinese (Cina)" + "'", str2, "cinese (Cina)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinese (Cina)" + "'", str4, "cinese (Cina)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        java.lang.String str6 = faker1.bothify("\uc911\uad6d\uc5b4\uc911\uad6d)");
        com.github.javafaker.Address address7 = faker1.address();
        com.github.javafaker.Options options8 = faker1.options();
        com.github.javafaker.Code code9 = faker1.code();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str6, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Company company5 = faker1.company();
        java.lang.String str7 = faker1.bothify("it");
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker1.phoneNumber();
        com.github.javafaker.Internet internet10 = faker1.internet();
        com.github.javafaker.Internet internet11 = faker1.internet();
        com.github.javafaker.Lorem lorem12 = faker1.lorem();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(lorem12);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("ITALIANO");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ITALIANO [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = new java.util.Locale("IT", "fr_FR");
        java.lang.String str4 = locale0.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.lang.String str9 = locale6.getLanguage();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = locale11.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale11.getDisplayScript(locale13);
        java.lang.String str15 = locale6.getDisplayLanguage(locale11);
        java.lang.String str16 = locale3.getDisplayVariant(locale6);
        java.util.Set<java.lang.String> strSet17 = locale3.getUnicodeLocaleAttributes();
        boolean boolean18 = locale3.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale3.toString(), "it_FR_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinese (Taiwan)" + "'", str4, "cinese (Taiwan)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it" + "'", str9, "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ITA" + "'", str12, "ITA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italiano" + "'", str15, "italiano");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("IT");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.lang.String str4 = locale2.getDisplayLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.lang.String str7 = faker5.numerify("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        java.lang.String str9 = faker5.numerify("allemand");
        com.github.javafaker.Address address10 = faker5.address();
        com.github.javafaker.Address address11 = faker5.address();
        com.github.javafaker.Address address12 = faker5.address();
        com.github.javafaker.Code code13 = faker5.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italiano" + "'", str4, "italiano");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str7, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "allemand" + "'", str9, "allemand");
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertNotNull(code13);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.Book book8 = faker1.book();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker1.phoneNumber();
        com.github.javafaker.Address address10 = faker1.address();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.setLanguage("IT");
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("ITA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setRegion("\u5fb7\u6587\u5fb7\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "italian_IT_Italia");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian_IT_Italia");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.setLanguage("ITALY");
        java.util.Locale locale10 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder5.setScript("Italia");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Italia [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "italy");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.util.Random random1 = new java.util.Random((long) 68);
        java.util.stream.IntStream intStream5 = random1.ints((long) 726944373, (-1292953490), 284576310);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.stream.LongStream longStream6 = random0.longs((long) 427836975, 4407342282996398343L, 7371221834332919704L);
        double double7 = random0.nextGaussian();
        java.util.stream.LongStream longStream11 = random0.longs((long) 57, (long) 930378188, 3898810322306202675L);
        java.util.stream.LongStream longStream12 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.3171036373894607d) + "'", double7 == (-1.3171036373894607d));
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("IT");
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category7, locale11);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.util.Locale.setDefault(category7, locale13);
        java.util.Locale locale17 = java.util.Locale.getDefault(category7);
        java.lang.String str18 = locale17.getDisplayCountry();
        java.util.Locale.Builder builder19 = builder2.setLocale(locale17);
        java.util.Locale.Builder builder21 = builder19.setScript("");
        java.util.Locale.Builder builder22 = builder19.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder22.setRegion("und-FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: und-FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale11.toString(), "hi!__ITA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinois" + "'", str15, "chinois");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u53f0\u7063" + "'", str18, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getVariant();
        boolean boolean5 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str2, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Code code4 = faker1.code();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Options options6 = faker1.options();
        com.github.javafaker.Company company7 = faker1.company();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        java.util.stream.LongStream longStream15 = random0.longs((long) 156989434);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream19 = random0.doubles((long) (-1434341728), (-0.5915392823872743d), (-0.17084355624847622d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-78, 17, -128, 65, 52, 107]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.11630640257215942d + "'", double9 == 0.11630640257215942d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1160128967 + "'", int11 == 1160128967);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.DateAndTime dateAndTime4 = faker1.date();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Options options7 = faker1.options();
        com.github.javafaker.Number number8 = faker1.number();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Code code4 = faker1.code();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Color color7 = faker1.color();
        com.github.javafaker.Company company8 = faker1.company();
        com.github.javafaker.Color color9 = faker1.color();
        com.github.javafaker.Address address10 = faker1.address();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(phoneNumber11);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.getLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale6.getDisplayScript(locale8);
        java.lang.String str10 = locale1.getDisplayLanguage(locale6);
        java.util.Random random11 = new java.util.Random();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random11.nextBytes(byteArray18);
        java.util.stream.LongStream longStream22 = random11.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream24 = random11.doubles(1L);
        double double25 = random11.nextGaussian();
        java.util.stream.DoubleStream doubleStream27 = random11.doubles((long) 0);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale6, random11);
        java.util.Locale locale30 = new java.util.Locale("Stati Uniti");
        java.lang.String str31 = locale6.getDisplayName(locale30);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italiano" + "'", str10, "italiano");
        org.junit.Assert.assertNotNull(byteArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[20, 44, -2, 121, -82, 104]");
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.2706968127726042d + "'", double25 == 1.2706968127726042d);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertEquals(locale30.toString(), "stati uniti");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Italian (Italy)" + "'", str31, "Italian (Italy)");
    }
}
